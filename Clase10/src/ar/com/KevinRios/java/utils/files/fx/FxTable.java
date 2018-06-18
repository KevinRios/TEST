package ar.com.KevinRios.java.utils.files.fx;

import java.lang.reflect.Field;
import java.util.List;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class FxTable <E>{
    
    public void cargar(TableView tbl, List<E> list){
        if(tbl==null)  return;
        tbl.getItems().clear();
        tbl.getColumns().clear();
        
        if(list==null || list.isEmpty()) return;        
        E e= list.get(0);
        
        // recorro la lista de campos
        for (Field f : e.getClass().getDeclaredFields()) {
            // lo construyo
            TableColumn t = new TableColumn(f.getName());
            //obtengo los nombres(datos)
            t.setCellValueFactory(new PropertyValueFactory(f.getName()));
            tbl.getColumns().add(t);
        }
        //
        //System.out.println(list.size());
        tbl.getItems().addAll(list);
    }
            
    
}


package ar.com.KevinRios.vehiculo.ventanas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


public class VentanaMaestraController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }  

    @FXML
    private void salir(ActionEvent event) {
        
        System.exit(0);
    }
    
    
    
    
}

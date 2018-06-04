package ar.com.KevinRios.vehiculo.ventanas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class VentanaMaestra extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("VentanaMaestra.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("Proyecto Integrador");
        
       
        stage.setScene(scene);
        stage.show();
    }

   
    public static void main(String[] args) {
        launch(args);
    }
    
}

package ar.com.KevinRios.java.notepad;

import ar.com.KevinRios.java.utils.files.FileText;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class NotepadController implements Initializable {

    @FXML
    private TextArea txaText;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    // VENTANA ARCHIVOS
    @FXML
    private void nuevo(ActionEvent event) {
        txaText.setText("");
    }

    @FXML
    private void abrir(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.setTitle("Abrir un archivo de texto");
        // restriccion en el tipo de archivo (solo txt)
        fc.getExtensionFilters().add(new ExtensionFilter("Archivo de Texto", "*.txt"));
        // seteo la ruta en la que arranca el file chooser
        fc.setInitialDirectory(new File(System.getProperty("user.home")));

        File file = fc.showOpenDialog(null);
        if (file == null) {
            return;
        }
        txaText.setText(new FileText(file).getText());
    }

    @FXML
    private void guardar(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.setTitle("Guardar un archivo de texto");
        // restriccion en el tipo de archivo (solo txt)
        fc.getExtensionFilters().add(new ExtensionFilter("Archivo de Texto", "*.txt"));
        // seteo la ruta en la que arranca el file chooser
        fc.setInitialDirectory(new File(System.getProperty("user.home")));

        File file = fc.showSaveDialog(null);
        if (file == null) {
            return;
        }
        new FileText(file).setText(txaText.getText());
    }

    // PESTAÑA OPCIONES
    @FXML
    private void acerca(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Bloc de Notas");
        alert.setContentText("Java 8.xx");
        alert.show();
    }

    @FXML
    private void salir(ActionEvent event) {
        System.exit(0);
    }

}

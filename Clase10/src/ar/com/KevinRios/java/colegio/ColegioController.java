package ar.com.KevinRios.java.colegio;

import ar.com.KevinRios.java.connector.Connector;
import ar.com.KevinRios.java.entities.Curso;
import ar.com.KevinRios.java.repositories.CursoR;
import ar.com.KevinRios.java.utils.files.fx.FxTable;
import ar.com.KevinRios.java.utils.validator.ValidatorGui;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ColegioController implements Initializable {

    private CursoR cr = new CursoR(Connector.getConnection());

    @FXML
    private TextField txtTitulo;
    @FXML
    private TextField txtProfesor;
    @FXML
    private ComboBox<String> cmbDia;
    @FXML
    private ComboBox<String> cmbTurno;
    @FXML
    private Label lblInfoCursos;
    @FXML
    private TableView<Curso> tblCursos;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cargarCmb();
        cargarTblCursos();
    }

    private void cargarTblCursos() {
         FxTable<Curso> table = new FxTable();
         table.cargar(tblCursos, cr.getAll());
    }

    private void cargarCmb() {
        cmbDia.getItems().clear();
        cmbDia.getItems().addAll("Lunes", "Martes", "Miercoles", "Jueves", "Viernes");
        cmbDia.getSelectionModel().selectFirst();

        cmbTurno.getItems().clear();
        cmbTurno.getItems().addAll("Mañana", "Tarde", "Noche");
        cmbTurno.getSelectionModel().selectFirst();
    }

    @FXML
    private void agregarCurso(ActionEvent event) {
        if (validarCurso()) {
            Curso curso = new Curso(
                    txtTitulo.getText(),
                    txtProfesor.getText(),
                    cmbDia.getValue(),
                    cmbTurno.getValue()
            );
            cr.save(curso);
            lblInfoCursos.setText("Se dio de alta un curso. Id: " + curso.getId());
            limpiarCurso();
            cargarTblCursos();
        }

    }

    private boolean validarCurso() {
        // validar txtTitulo longitud entre 2 y 20 caracteres
        if (!new ValidatorGui(txtTitulo, lblInfoCursos).length(2, 20)) {
            return false;
        }
        // validar txtTitulo longitud entre 2 y 20 caracteres
        if (!new ValidatorGui(txtProfesor, lblInfoCursos).length(2, 20)) {
            return false;
        }

        return true;

    }

    private void limpiarCurso() {
        txtTitulo.setText("");
        txtProfesor.setText("");
        cmbDia.getSelectionModel().selectFirst();
        cmbTurno.getSelectionModel().selectFirst();
        txtTitulo.requestFocus();
    }

}

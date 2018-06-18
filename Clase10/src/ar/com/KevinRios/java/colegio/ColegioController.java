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
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class ColegioController implements Initializable {
    
    
    private CursoR cr=new CursoR(Connector.getConnection());
    
    
    @FXML private TextField         txtTitulo;
    @FXML private TextField         txtProfesor;
    @FXML private ComboBox<String>  cmbDia;
    @FXML private ComboBox<String>  cmbTurno;
    @FXML private Label             lblInfoCursos;
    @FXML private TableView<Curso>  tblCursos;
    @FXML private TextField         txtBuscarTitulo;
    @FXML private TextField         txtBuscarProfesor;
    @FXML private TextField         txtBuscarDia;
    @FXML private TextField         txtBuscarTurno;
    @Override public void initialize(URL url, ResourceBundle rb) {
        cargarCmbs();
        cargarTblCursos();
    }    
    private void cargarTblCursos(){
        FxTable<Curso>table= new FxTable();
        table.cargar(tblCursos, cr.getAll());
    }    
    private void cargarCmbs() {
        //cmbDia
        cmbDia.getItems().clear();
        cmbDia.getItems().addAll("Lunes","Martes","Miercoles","Jueves","Viernes");
        cmbDia.getSelectionModel().selectFirst();
        //cmbTurno
        cmbTurno.getItems().clear();
        cmbTurno.getItems().addAll("Mañana","Tarde","Noche");
        cmbTurno.getSelectionModel().selectFirst();
    }    
    @FXML
    private void agregarCurso(ActionEvent event) {
        if(validarCurso()){
            Curso curso=new Curso(
                txtTitulo.getText(),
                txtProfesor.getText(),
                cmbDia.getValue(),
                cmbTurno.getValue()
            );
            cr.save(curso);
            lblInfoCursos.setText("Se dio de alta un curso id: "+curso.getId());
            limpiarCurso();
            cargarTblCursos();
        }
    }
    private boolean validarCurso(){
        //validar txtTitulo longitud entre 2 y 20 caracteres
        if(!new ValidatorGui(txtTitulo,lblInfoCursos).length(2, 20))    return false;
        //validar txtProfesor longitud entre 2 y 20 caracteres
        if(!new ValidatorGui(txtProfesor,lblInfoCursos).length(2, 20))  return false;
        return true;
    }
    private void limpiarCurso(){
        txtTitulo.setText("");
        txtProfesor.setText("");
        cmbDia.getSelectionModel().selectFirst();
        cmbTurno.getSelectionModel().selectFirst();
        txtTitulo.requestFocus();
    }
    @FXML
    private void buscarCurso(KeyEvent event) {
        FxTable<Curso>table= new FxTable();
        table.cargar(
                tblCursos,
                cr.getLikeTituloProfesorDiaTurno(
                        txtBuscarTitulo.getText(),
                        txtBuscarProfesor.getText(),
                        txtBuscarDia.getText(),
                        txtBuscarTurno.getText())
        );
        
    }
    
    @FXML
    private void LimpiarBusquedaCurso(ActionEvent event) {
        txtBuscarTitulo.setText("");
        txtBuscarProfesor.setText("");
        txtBuscarDia.setText("");
        txtBuscarTurno.setText("");
        cargarTblCursos();
    }
    
    @FXML
    private void borrarCurso(ActionEvent event) {
        Curso curso = tblCursos.getSelectionModel().getSelectedItem();
        if(curso==null){
            return;
        }
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setHeaderText("Se va a borrar un curso");
        alerta.setContentText("¿Esta seguro de borrar el curso?");
        if(alerta.showAndWait().get()==ButtonType.OK){
            cr.remove(curso);
        }
        cargarTblCursos();

    }
}
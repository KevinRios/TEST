package ar.com.KevinRios.java.utils.validator;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ValidatorGUI extends Validator{
    
    JTextField   swingTxt   = null;
    JLabel       swingLbl = null;
    TextField    fxTxt      = null;
    Label        fxLbl      = null;

    public ValidatorGUI(JTextField swingTxt, JLabel swingLbl) {
        super(swingTxt.getText());
        this.swingTxt = swingTxt;
        this.swingLbl = swingLbl;    
    }
    
    public ValidatorGUI(TextField fxTxt, Label fxLbl) {
        super(fxTxt.getText());
        this.fxTxt = fxTxt;
        this.fxLbl = fxLbl;    
    }

    public void setText(String text){
        if(swingLbl!=null) swingLbl.setText(text);
        if(fxLbl!=null)    fxLbl.setText(text);
    }
    
    private void requestFocus(){
        if(swingTxt!=null) swingTxt.setText(text);
        if(fxTxt!=null)    fxTxt.setText(text);
    }
          
    private void selectAll(){
        if(swingTxt!=null) swingTxt.selectAll();
        if(fxTxt!=null)    fxTxt.selectAll();
    }

    @Override
    public boolean isInteger(int min, int max) {
        if(super.isInteger(min, max)) return true;
        setText("debe ser un numero entero entre "+ min +" y "+max);
        
        selectAll();
        requestFocus();
        return false;    
    }

    @Override
    public boolean isInteger() {
        if(super.isInteger()) return true;
        setText("debe ser un numero entero ");
        
        selectAll();
        requestFocus();
        return false;
    }

    @Override
    public boolean length(int min, int max) {
        if(super.length(min, max)) return true;
        setText("El texto debe tener entre entre "+ min +" y "+max+ " caracteres.");
        
        selectAll();
        requestFocus();
        return false;   
    }

    @Override
    public boolean length(int lenght) {
        if(super.length(lenght)) return true;
        setText("El texto debe tener"+ lenght +"caracteres.");
                        
        selectAll();
        requestFocus();
        return false;   
    }
    
    
        
}

package ar.com.KevinRios.vehiculo.entities;

import ar.com.KevinRios.entities.Persona;

public class Comprador extends Persona{
    
    
    private double presupuesto;

    public Comprador(double presupuesto, String nombre, String apellido, String nroDocumento) {
        super(nombre, apellido, nroDocumento);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return "Comprador{" 
                + "nombre=" + Comprador.super.getNombre() + ", apellido=" + Comprador.super.getApellido()
                + ", documento=" + Comprador.super.getNroDocumento() + ", presupuesto=" + presupuesto + '}';
    }
    
     
    
}

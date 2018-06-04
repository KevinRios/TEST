package ar.com.KevinRios.vehiculo.entities;

import ar.com.KevinRios.entities.Persona;

public class Vendedor extends Persona{

    private int cantAutosVendidos;

    public Vendedor(int cantAutosVendidos, String nombre, String apellido, String nroDocumento) {
        super(nombre, apellido, nroDocumento);
        this.cantAutosVendidos = cantAutosVendidos;
    }

    public int getCantAutosVendidos() {
        return cantAutosVendidos;
    }

    public void setCantAutosVendidos(int cantAutosVendidos) {
        this.cantAutosVendidos = cantAutosVendidos;
    }

    @Override
    public String toString() {
        return "Vendedor{" 
                + "nombre=" + Vendedor.super.getNombre() + ", apellido=" + Vendedor.super.getApellido()
                + ", documento=" + Vendedor.super.getNroDocumento() +  ", cantAutosVendidos=" + cantAutosVendidos + '}';
    }

    
}

package ar.com.KevinRios.vehiculo.entities;

import ar.com.KevinRios.entities.Vehiculo;

public class Auto extends Vehiculo {

    private String marca;
    private String modelo;
    private String color;

    public Auto(String marca, String modelo, String color, int alto, int ancho, int largo) {        
        super(alto, ancho, largo);
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public String toString() {
       return "Auto{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color 
              +", alto=" + Auto.super.getAlto()+ ", ancho=" + Auto.super.getAncho()+  ", largo=" + Auto.super.getLargo()+ '}';
     
    }

   

   
    
    
        
    
    
}

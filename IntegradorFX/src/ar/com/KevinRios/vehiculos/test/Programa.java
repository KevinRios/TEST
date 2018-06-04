package ar.com.KevinRios.vehiculos.test;

import ar.com.KevinRios.vehiculo.entities.Auto;
import ar.com.KevinRios.vehiculo.entities.Comprador;
import ar.com.KevinRios.vehiculo.entities.Vendedor;


public class Programa {

    public static void main(String[] args) {
        
        Auto auto1 = new Auto("Ford", "Falcon", "Verde", 100, 110, 120);
        System.out.println(auto1);
       
        System.out.println("-----------");
        
        Comprador comprador1 = new Comprador(15444, "qwerty", "asdf", "11444123");
        System.out.println(comprador1);
        
        System.out.println("-----------");
        
        Vendedor vendedor1 = new Vendedor(15, "zxcv", "jkl", "36544478");
        System.out.println(vendedor1);
        
    }
    
}

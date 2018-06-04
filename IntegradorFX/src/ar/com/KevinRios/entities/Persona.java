package ar.com.KevinRios.entities;

public abstract class Persona {
    
    private String nombre;
    private String apellido;
    private String nroDocumento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    
    
    public Persona(String nombre, String apellido, String nroDocumento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroDocumento = nroDocumento;
    }

   
    
    
    
    
    
}

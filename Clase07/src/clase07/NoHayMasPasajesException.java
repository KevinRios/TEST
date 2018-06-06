package clase07;

public class NoHayMasPasajesException extends Exception {

    private String nombre;
    private int cantidad;

    public NoHayMasPasajesException(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "El vuelo " + nombre + ", no tiene " + cantidad + " pasajes";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}

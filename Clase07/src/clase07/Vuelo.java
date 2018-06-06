package clase07;

public class Vuelo {
    private String nombre;
    private int cantidadPasajes;

    public Vuelo(String nombre, int cantidadPasajes) {
        this.nombre = nombre;
        this.cantidadPasajes = cantidadPasajes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadPasajes() {
        return cantidadPasajes;
    }

    public void setCantidadPasajes(int cantidadPasajes) {
        this.cantidadPasajes = cantidadPasajes;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "nombre=" + nombre + ", cantidadPasajes=" + cantidadPasajes + '}';
    }
    
    public synchronized void venderPasajes(int cantidad) throws NoHayMasPasajesException{
        /* synchronized  hace un bloqueo del objeto
            en  este caso tarda en hacerse la venta del pasaje por la consulta a la bd, 
            pero mientras se consulta se encuentra disponible
            eso se evita con el synchronized 
        */
        if(cantidad>cantidadPasajes){
            throw new NoHayMasPasajesException(nombre,cantidad);
        }
        cantidadPasajes-=cantidad;
    }
    
}

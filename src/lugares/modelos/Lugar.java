
package lugares.modelos;


public class Lugar {
    private String nombre;

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String toString() {
        return "Lugar: " + nombre;
    }

    public Lugar(String nombre) {
        this.nombre = nombre;
    }
    
    
}

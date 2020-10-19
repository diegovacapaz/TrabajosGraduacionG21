
package tipos.modelos;


public class Tipo {
    private String nombre;

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String toString() {
        return "Tipo: " + nombre;
    }

    public Tipo(String nombre) {
        this.nombre = nombre;
    }
    
    
}

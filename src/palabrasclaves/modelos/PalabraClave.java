
package palabrasclaves.modelos;


public class PalabraClave {
    private String nombre;

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String toString() {
        return "Palabra Clave: " + nombre;
    }

    public PalabraClave(String nombre) {
        this.nombre = nombre;
    }
    
    
}

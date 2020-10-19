
package grupos.modelos;

import java.util.ArrayList;


public class Grupo {
    private String nombre;
    private String descripcion;
    
    private ArrayList<MiembroEnGrupo> miembrosEnGrupo;

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String verDescripcion() {
        return descripcion;
    }

    public void asignarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void mostrar(){
        System.out.println("Grupo:");
        System.out.println("Nombre: "+nombre);
        System.out.println("Descripcion: "+descripcion);
    }

    public Grupo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    
}

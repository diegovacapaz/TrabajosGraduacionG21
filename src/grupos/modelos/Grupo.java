
package grupos.modelos;

import autores.modelos.Autor;
import java.util.ArrayList;
import java.util.Objects;


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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Grupo other = (Grupo) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    public ArrayList<MiembroEnGrupo> verMiembros() {
        return miembrosEnGrupo;
    }

    public void agregarMiembro(Autor autor, Rol rol) {
        MiembroEnGrupo miembro = new MiembroEnGrupo(autor,this, rol);
        if(!this.miembrosEnGrupo.contains(miembro)){
            this.miembrosEnGrupo.add(miembro);
        }            
    }//Falta lo de agregarGrupo()
    
    public void quitarMiembro(Autor miembro) {
        for(MiembroEnGrupo p : this.miembrosEnGrupo){
            if(p.verAutor().equals(miembro))
                miembrosEnGrupo.remove(p);
        }
        
    } //Falta lo de quitarle el grupo al autor
    
    public boolean esSuperAdministradores(){
        for(MiembroEnGrupo p : miembrosEnGrupo){
            if(p.verRol()==Rol.COLABORADOR)
                return false;
        }
        return true;
    }
    
}

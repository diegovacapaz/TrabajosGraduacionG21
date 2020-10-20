
package autores.modelos;

import grupos.modelos.Grupo;
import grupos.modelos.MiembroEnGrupo;
import grupos.modelos.Rol;
import java.util.ArrayList;


public abstract class Autor {
    private int dni;
    private String apellidos;
    private String nombres;
    private String clave;
    
    private ArrayList<MiembroEnGrupo> miembrosEnGrupo;

    public ArrayList<MiembroEnGrupo> verGrupos() {
        return miembrosEnGrupo;
    }

    public void agregarGrupo(Grupo grupo, Rol rol) {
        MiembroEnGrupo miembro = new MiembroEnGrupo(this,grupo,rol);
        if(!this.miembrosEnGrupo.contains(miembro)){
            this.miembrosEnGrupo.add(miembro);
            grupo.agregarMiembro(this, rol);
        }
    }
    
    public void quitarGrupo(Grupo grupo){
        for(MiembroEnGrupo p : miembrosEnGrupo){
            if(p.verGrupo().equals(grupo)){
                this.miembrosEnGrupo.remove(p);
                p.verGrupo().quitarMiembro(this);
            }
        }
    }
    
    public boolean esSuperAdministrador(){
        for(MiembroEnGrupo p : miembrosEnGrupo){
            if(p.verGrupo().esSuperAdministradores())
                return true;
        }
        return false;
    }
        
    public int verDni() {
        return dni;
    }

    public void asignarDni(int dni) {
        this.dni = dni;
    }

    public String verApellidos() {
        return apellidos;
    }

    public void asignarApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String verNombres() {
        return nombres;
    }

    public void asignarNombres(String nombres) {
        this.nombres = nombres;
    }

    public String verClave() {
        return clave;
    }

    public void asignarClave(String clave) {
        this.clave = clave;
    }
    
    public void mostrar(){
        System.out.println("Datos Autor: ");
        System.out.println("["+dni+"]"+apellidos+", "+nombres);
        System.out.println("--Grupos a los que pertenece--");
        for(MiembroEnGrupo p : miembrosEnGrupo){
            System.out.println("Grupo: "+p.verGrupo().verNombre());
            System.out.println("Descripcion: "+p.verGrupo().verDescripcion());
            if(p.verRol()==Rol.ADMINISTRADOR)
                System.out.println("Rol: Administrador");
            else
                System.out.println("Rol: Colaborador");
        }
    }

    public Autor(int dni, String apellidos, String nombres, String clave) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.clave = clave;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.dni;
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
        if (this.getClass().getSuperclass() != obj.getClass().getSuperclass()) {
            return false;
        }
        final Autor other = (Autor) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }
    
    
}

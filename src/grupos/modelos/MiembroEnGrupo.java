
package grupos.modelos;

import autores.modelos.Profesor;


public class MiembroEnGrupo {
    private Profesor profesor;
    private Rol rol;
    private Grupo grupo;

    public MiembroEnGrupo(Profesor profesor,Grupo grupo, Rol rol) {
        this.profesor = profesor;
        this.rol = rol;
        this.grupo = grupo;
    }

    public Profesor verProfesor() {
        return profesor;
    }

    public void asignarProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Grupo verGrupo() {
        return grupo;
    }

    public void asignarGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Rol verRol() {
        return rol;
    }

    public void asignarRol(Rol rol) {
        this.rol = rol;
    }
    
    
}

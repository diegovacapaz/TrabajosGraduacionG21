
package grupos.modelos;

import autores.modelos.Autor;
import autores.modelos.Profesor;


public class MiembroEnGrupo {
    private Autor autor;
    private Rol rol;
    private Grupo grupo;

    public MiembroEnGrupo(Autor autor,Grupo grupo, Rol rol) {
        this.autor = autor;
        this.rol = rol;
        this.grupo = grupo;
    }

    public Autor verAutor() {
        return autor;
    }

    public void asignarAutor(Autor autor) {
        this.autor = autor;
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

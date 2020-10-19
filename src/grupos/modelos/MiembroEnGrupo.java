
package grupos.modelos;

import autores.modelos.Autor;
import java.util.Objects;


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
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.autor);
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
        final MiembroEnGrupo other = (MiembroEnGrupo) obj;
        if (!this.autor.equals(other.autor)) {
            return false;
        }
        return true;
    }
    
    
}

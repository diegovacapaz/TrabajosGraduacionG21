
package publicaciones.modelos;

import grupos.modelos.MiembroEnGrupo;
import idiomas.modelos.Idioma;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Objects;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;


public class Publicacion {
    private String titulo;
    private LocalDate fechaPublicacion;
    private String enlace;
    private String resumen;
    
    private MiembroEnGrupo miembroengrupo;
    private Tipo tipo;
    private Idioma idioma;
    private Lugar lugar;
    private ArrayList<PalabraClave> palabrasClaves;

    public Publicacion(String titulo, MiembroEnGrupo miembroengrupo, LocalDate fechaPublicacion, Tipo tipo, Idioma idioma, Lugar lugar, ArrayList<PalabraClave> palabrasClaves, String enlace, String resumen) {
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.enlace = enlace;
        this.resumen = resumen;
        this.miembroengrupo = miembroengrupo;
        this.tipo = tipo;
        this.idioma = idioma;
        this.lugar = lugar;
        this.palabrasClaves = palabrasClaves;
    }

    public String verTitulo() {
        return titulo;
    }

    public void asignarTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate verFechaPublicacion() {
        return fechaPublicacion;
    }

    public void asignarFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String verEnlace() {
        return enlace;
    }

    public void asignarEnlace(String enlace) {
        this.enlace = enlace;
    }

    public String verResumen() {
        return resumen;
    }

    public void asignarResumen(String resumen) {
        this.resumen = resumen;
    }
    
    public void mostrar(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+miembroengrupo.verProfesor().verApellidos()+", "+miembroengrupo.verProfesor().verNombres());
        System.out.println("Grupo: "+miembroengrupo.verGrupo().verNombre());
        System.out.println("Rol: "+miembroengrupo.verRol());
        System.out.println("Fecha de Publicacion: "+ fechaPublicacion.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Tipo: "+ tipo);
        System.out.println("Idioma: "+idioma);
        System.out.println("Lugar: "+lugar);
        System.out.println("Palabras Claves");
        System.out.println("---------------");
        for(PalabraClave a:palabrasClaves){
            System.out.println(a);
        }
        System.out.println("---------------");
        System.out.println("Enlace: "+enlace);
        System.out.println("Resumen: "+resumen);
    }  

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.titulo);
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
        final Publicacion other = (Publicacion) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return true;
    }
    
    
}

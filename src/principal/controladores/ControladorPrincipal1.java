
package principal.controladores;

import autores.modelos.Alumno;
import autores.modelos.Cargo;
import autores.modelos.Profesor;
import autores.vistas.VentanaAMAlumno;
import autores.vistas.VentanaAMProfesor;
import grupos.modelos.Grupo;
import grupos.vistas.VentanaAMGrupo;
import idiomas.modelos.Idioma;
import idiomas.vistas.VentanaAIdioma;
import java.time.LocalDate;
import java.util.ArrayList;
import lugares.modelos.Lugar;
import lugares.vistas.VentanaALugar;
import palabrasclaves.modelos.PalabraClave;
import palabrasclaves.vistas.VentanaAPalabraClave;
import tipos.modelos.Tipo;
import tipos.vistas.VentanaATipo;
import publicaciones.modelos.Publicacion;
import grupos.modelos.MiembroEnGrupo;
import grupos.modelos.Rol;

//Clase hecha por alumno, al final se utiliza la subida al classroom
//Esta no esta terminada 
public class ControladorPrincipal1 {
    public static void main(String[] args) {
        /*ArrayList<Alumno> alumnos = new ArrayList<>();
        ArrayList<Profesor> profesores = new ArrayList<>();
        ArrayList<Idioma> idiomas = new ArrayList<>();
        ArrayList<Lugar> lugares = new ArrayList<>();
        ArrayList<PalabraClave> palabrasclaves = new ArrayList<>();
        ArrayList<Tipo> tipos = new ArrayList<>();
        ArrayList<Grupo> grupos = new ArrayList<>();
        ArrayList<Publicacion> publicaciones = new ArrayList<>();
    
        Alumno alumno1 = new Alumno(123,"Garcia","Mariela","1321asd","13as");
        Alumno alumno2 = new Alumno(1233,"Garciasdfd","Marielfga","1321aadassd","13aafas");
        Alumno alumno3 = new Alumno(12433,"Garcadfadfia","Marfetiela","132sfs1asd","13aa4ts");
        Alumno alumno4 = new Alumno(1343423,"Gabghfrcia","Marafawiela","13sfs21asd","13a4tas");
        Alumno alumno5 = new Alumno(13433,"Gargwre5cia","Maritwrtela","132sfsa1asd","13b4tas");
        Profesor profesor1 = new Profesor(1231234,"Mra","sadas","asdashfghs",Cargo.ADJUNTO);
        Profesor profesor2 = new Profesor(123125234,"Mfsara","sadhas","ahsfgsdas",Cargo.TITULAR);
        Profesor profesor3 = new Profesor(1231224534,"Mera","sadfgas","asdhsfgas",Cargo.ASOCIADO);
        Profesor profesor4 = new Profesor(123122234,"Madfra","saadfsdas","asdas",Cargo.TITULAR);
        Profesor profesor5 = new Profesor(123231234,"Mrasdfa","sadfadas","asdshgas",Cargo.ADG);
        Grupo grupo1 = new Grupo("asd","Asd");
        Grupo grupo2 = new Grupo("asdasd","Asssd");
        Grupo grupo3 = new Grupo("asasdasdd","Aasdsd");
        Grupo grupo4 = new Grupo("aasdasdsd","Asssssd");
        Grupo grupo5 = new Grupo("asasdasdasdd","Assssd");
        Idioma idioma1 = new Idioma("asd");
        Idioma idioma2 = new Idioma("aasdd");
        Idioma idioma3 = new Idioma("asfdgd");
        Idioma idioma4 = new Idioma("agfgsd");
        Idioma idioma5 = new Idioma("akksd");
        Lugar lugar1 = new Lugar("asdfas");
        Lugar lugar2 = new Lugar("asdfasdas");
        Lugar lugar3 = new Lugar("asdf453as");
        Lugar lugar4 = new Lugar("asdf45634as");
        Lugar lugar5 = new Lugar("asd656fas");
        PalabraClave palabraclave1 = new PalabraClave("asfdasd555");
        PalabraClave palabraclave2 = new PalabraClave("asfdsadasd555");
        PalabraClave palabraclave3 = new PalabraClave("asfd4asd555");
        PalabraClave palabraclave4 = new PalabraClave("asfdas767d555");
        PalabraClave palabraclave5 = new PalabraClave("asfdas56d555");
        Tipo tipo1 = new Tipo("asdas");
        Tipo tipo2 = new Tipo("asdasdas");
        Tipo tipo3 = new Tipo("asdsdas");
        Tipo tipo4 = new Tipo("asdsdaas");
        Tipo tipo5 = new Tipo("asdads");
        Publicacion publicacion1 = new Publicacion("bigols",LocalDate.MAX,"asdasd",new MiembroEnGrupo(profesor1,Rol.ADMINISTRADOR,grupo1),tipo1,idioma1,lugar1,palabrasclaves);
    
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        alumnos.add(alumno5);
        profesores.add(profesor1);
        profesores.add(profesor2);
        profesores.add(profesor3);
        profesores.add(profesor4);
        profesores.add(profesor5);
        idiomas.add(idioma1);
        idiomas.add(idioma2);
        idiomas.add(idioma3);
        idiomas.add(idioma4);
        idiomas.add(idioma5);
        lugares.add(lugar1);
        lugares.add(lugar2);
        lugares.add(lugar3);
        lugares.add(lugar4);
        lugares.add(lugar5);
        palabrasclaves.add(palabraclave1);
        palabrasclaves.add(palabraclave2);
        palabrasclaves.add(palabraclave3);
        palabrasclaves.add(palabraclave4);
        palabrasclaves.add(palabraclave5);
        tipos.add(tipo1);
        tipos.add(tipo2);
        tipos.add(tipo3);
        tipos.add(tipo4);
        tipos.add(tipo5);
        grupos.add(grupo1);
        grupos.add(grupo2);
        grupos.add(grupo3);
        grupos.add(grupo4);
        grupos.add(grupo5);
        for(Alumno a:alumnos){
            a.mostrar();
        }
        for(Profesor a:profesores){
            a.mostrar();
        }
        for(Idioma a:idiomas){
            System.out.println(a);
        }
        for(Lugar a:lugares){
            System.out.println(a);
        }
        for(PalabraClave a:palabrasclaves){
            System.out.println(a);
        }
        for(Tipo a:tipos){
            System.out.println(a);
        }
        for(Grupo a:grupos){
            System.out.println(a);
        }*/
        
        VentanaAMAlumno ventana1 = new VentanaAMAlumno(null);
        ventana1.setVisible(true);
        VentanaAMProfesor ventana2 = new VentanaAMProfesor(null);
        ventana2.setVisible(true);
        VentanaAMGrupo ventana3 = new VentanaAMGrupo(null);
        ventana3.setVisible(true);
        VentanaAIdioma ventana4 = new VentanaAIdioma(null);
        ventana4.setVisible(true);
        VentanaALugar ventana5 = new VentanaALugar(null);
        ventana5.setVisible(true);
        VentanaAPalabraClave ventana6 = new VentanaAPalabraClave(null);
        ventana6.setVisible(true);
        VentanaATipo ventana7 = new VentanaATipo(null);
        ventana7.setVisible(true);
        
    }
}


package autores.modelos;

import grupos.modelos.MiembroEnGrupo;
import java.util.Objects;


public class Alumno extends Autor {
    private String cx;

    public String verCx() {
        return cx;
    }

    public void asignarCx(String cx) {
        this.cx = cx;
    }
    
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("--------");
        System.out.println("Libreta: "+cx);
        System.out.println("--------");
    }

    public Alumno(int dni, String apellidos, String nombres, String clave, String cx) {
        super(dni,apellidos,nombres,clave);
        this.cx = cx;
    }

    @Override
    public int hashCode() {
        
        return super.hashCode() + Objects.hashCode(this.cx);
    }

    @Override
    public boolean equals(Object obj) {
        /*El hecho de querer re-escribir este método trajo mucho problemas
        Por alguna razón cuando comparaba el profesor con mismo dni que el alumno,
        al ejecutar el primer equals, se procesaba y deberia dar true pero sin embargo el metodo seguia
        y saltaba un error al querer castear un Profesor a un Alumno, lo quise solucionar con solo el primer if
        pero no funciono asi que la solución que encontre fue la de  dentro del else revisar otra vez las clases
        y asi se soluciono el filtrado de clases, no se si es la mejor opción o no ya que no fui capaz de encontrar
        la verdadera fuente de error. */
        if(super.equals(obj))
            return true;
        
        else{
            if(this.getClass()!=obj.getClass())
                return false;
            
            final Alumno other = (Alumno) obj;
            
            if (!Objects.equals(this.cx, other.cx)) {
                return false;
            }
            return true;
        }
    }
    
    
}

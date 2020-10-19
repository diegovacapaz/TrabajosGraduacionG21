
package autores.modelos;

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
        System.out.println("Libreta: "+cx);
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
        
        super.equals(obj);
        
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.cx, other.cx)) {
            return false;
        }
        return true;
    }
    
    
}


package autores.modelos;


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
        System.out.println("CX: "+cx);
    }

    public Alumno(int dni, String apellidos, String nombres, String clave, String cx) {
        super(dni,apellidos,nombres,clave);
        this.cx = cx;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.verDni();
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
        final Alumno other = (Alumno) obj;
        if (this.verDni() != other.verDni()) {
            return false;
        }
        return true;
    }
    
    
    
}

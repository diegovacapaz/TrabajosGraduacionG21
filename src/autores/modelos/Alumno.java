
package autores.modelos;


public class Alumno {
    private int dni;
    private String apellidos;
    private String nombres;
    private String clave;
    private String cx;

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

    public String verCx() {
        return cx;
    }

    public void asignarCx(String cx) {
        this.cx = cx;
    }
    
    public void mostrar(){
        System.out.println("Datos Alumno: ");
        System.out.println("Nombre: "+nombres);
        System.out.println("Apellido: "+apellidos);
        System.out.println("DNI: "+dni);
        System.out.println("Clave: "+clave);
        System.out.println("CX: "+cx);
    }

    public Alumno(int dni, String apellidos, String nombres, String clave, String cx) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.clave = clave;
        this.cx = cx;
    }
    
    
}

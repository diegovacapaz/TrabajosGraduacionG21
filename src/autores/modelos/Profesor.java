
package autores.modelos;


public class Profesor extends Autor{
    private Cargo cargo;
    

    /*public String verCargo() {
        return cargo;
    }

    public void asignarCargo(String cargo) {
        this.cargo = cargo;
    }*/
    
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("--------");
        System.out.println("Cargo: "+cargo);
        System.out.println("--------");
    }

    public Profesor(int dni, String apellidos, String nombres, String clave, Cargo cargo) {
        super(dni,apellidos,nombres,clave);
        this.cargo = cargo;
    }
    
}

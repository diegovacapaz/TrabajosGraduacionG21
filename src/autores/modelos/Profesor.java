
package autores.modelos;

import grupos.modelos.MiembroEnGrupo;
import java.util.ArrayList;


public class Profesor extends Autor{
    private Cargo cargo;
    private ArrayList<MiembroEnGrupo> miembrosEnGrupo;


    /*public String verCargo() {
        return cargo;
    }

    public void asignarCargo(String cargo) {
        this.cargo = cargo;
    }*/
    
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Cargo: "+cargo);
    }

    public Profesor(int dni, String apellidos, String nombres, String clave, Cargo cargo) {
        super(dni,apellidos,nombres,clave);
        this.cargo = cargo;
    }
    
}

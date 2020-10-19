/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

/**
 *
 * @author Gisella Del Frari
 */
public abstract class Autor {
    private String nombre;
    private String apellido;
    private int dni;
    private String clave;
    
    public Autor (String nombre, String apellido, int dni,String clave){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni){
        this.dni = dni;
    }
    
     @Override
    public String toString(){
        return ("[" + dni + "] " + apellido + ", " + nombre); 
    }
    
    public void mostrar(){
        System.out.println("[" + dni + "] " + apellido + ", " + nombre);
    }
}

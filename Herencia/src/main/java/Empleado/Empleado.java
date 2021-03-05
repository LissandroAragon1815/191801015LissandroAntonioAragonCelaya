
package Empleado;

/**
 *
 * @author ntnrc
 */
public class Empleado {
    private String nombre, apellidoMaterno, apellidoPaterno;
    private int dni;
    
    public Empleado(){
        this.apellidoMaterno = "";
        this.apellidoPaterno = "";
        this.dni = 0;
        this.nombre = "";
    }
    public Empleado(String nombre, String apellidoMaterno, String apellidoPaterno, int dni){
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
        this.dni = dni;
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellidoP(){
        return this.apellidoPaterno;
    }
    public void setApellidoP(String apellidoPaterno){
        this.apellidoPaterno = apellidoPaterno;
    }
    public String getApellidoM(){
        return this.apellidoMaterno;
    }
    public void setApellidoM(String apellidoMaterno){
        this.apellidoMaterno = apellidoMaterno;
    }
    public int getDni(){
        return this.dni;
    }
    public void setDni(int dni){
        this.dni = dni;
    }
    
    @Override
    public String toString(){
        return "Apellido Paterno: "+apellidoPaterno+"\nApellido Materno: "+apellidoMaterno+"\nNombre: "+nombre+"\nDNI: "+dni;
    }
}
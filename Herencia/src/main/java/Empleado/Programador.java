
package Empleado;

/**
 *
 * @author ntnrc
 */
public class Programador extends Empleado{
    private double sueldo;
    
    public Programador(){
        super();
        this.sueldo = 0;
    }
    public Programador(double sueldo, String nombre, String apellidoPaterno, String apellidoMaterno, int dni){
        super(nombre, apellidoMaterno, apellidoPaterno, dni);
        this.sueldo = sueldo;
    }
    
}
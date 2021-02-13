

/**
 *
 * @author ntnrc
 */
public class Cliente {
    public int dni, telefono;
    public String nombre, historialCrediticio;
    Coche coche;
    public Cliente(){
        this.coche = null;
        this.dni = 0;
        this.nombre = "";
        this.telefono = 0;
        this.historialCrediticio = "";
    }
    public Cliente(int dni, int telefono, String nombre, Coche coche, String historialCrediticio){
        this.coche = coche;
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.historialCrediticio = historialCrediticio;
    }
    public String toString(){
        return "Nombre: "+nombre+"\ndni: "+dni+"\nTelefono: "+telefono+"\nHistorial Crediticio: "+historialCrediticio+ "\ncoche:"+coche;
    }
}

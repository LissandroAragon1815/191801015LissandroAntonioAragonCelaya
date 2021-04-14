
package Clases;

/**
 *
 * @author ntnrc
 */
public class Prestamista {
    private int id;
    private String nombre;
    private double monto;

    public Prestamista() {
        this.id = 0;
        this.monto = 0;
        this.nombre = "";
    }

    public Prestamista(int id, String nombre, double monto) {
        this.id = id;
        this.nombre = nombre;
        this.monto = monto;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getMonto() {
        return monto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Prestamista{" + "id=" + id + ", nombre=" + nombre + ", monto=" + monto + '}';
    }
    
}
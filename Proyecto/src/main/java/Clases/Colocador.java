
package Clases;

/**
 *
 * @author ntnrc
 */
public class Colocador {
    private int id;
    private String nombre, fecha;
    private double pagos, totalEntregado, comision, colocacion, estimacion;

    public Colocador() {
        this.colocacion = 0;
        this.comision = 0;
        this.estimacion = 0;
        this.fecha = "";
        this.id = 0;
        this.nombre = "";
        this.pagos = 0;
        this.totalEntregado = 0;
    }

    public Colocador(int id, String nombre, String fecha, double pagos, double totalEntregado, double comision, double colocacion, double estimacion) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.pagos = pagos;
        this.totalEntregado = totalEntregado;
        this.comision = comision;
        this.colocacion = colocacion;
        this.estimacion = estimacion;
    }

    public Colocador(String nombre, double pagos, double totalEntregado, double estimacion) {
        this.nombre = nombre;
        this.pagos = pagos;
        this.totalEntregado = totalEntregado;
        this.estimacion = estimacion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public double getPagos() {
        return pagos;
    }

    public double getTotalEntregado() {
        return totalEntregado;
    }

    public double getComision() {
        return comision;
    }

    public double getColocacion() {
        return colocacion;
    }

    public double getEstimacion() {
        return estimacion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setPagos(double pagos) {
        this.pagos = pagos;
    }

    public void setTotalEntregado(double totalEntregado) {
        this.totalEntregado = totalEntregado;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public void setColocacion(double colocacion) {
        this.colocacion = colocacion;
    }

    public void setEstimacion(double estimacion) {
        this.estimacion = estimacion;
    }

    @Override
    public String toString() {
        return "Colocador{" + "id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + ", pagos=" + pagos + ", totalEntregado=" + totalEntregado + ", comision=" + comision + ", colocacion=" + colocacion + ", estimacion=" + estimacion + '}';
    }
    
    
}
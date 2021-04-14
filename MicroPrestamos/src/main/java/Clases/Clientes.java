
package Clases;

/**
 *
 * @author ntnrc
 */
public class Clientes {
    private int id, semanas;
    private String nombreCliente, dir, aval, direA, garantias, fechaIni;
    private double pays, prest;

    public Clientes() {
        this.aval = "";
        this.dir = "";
        this.direA = "";
        this.fechaIni = "";
        this.garantias = "";
        this.id = 0;
        this.nombreCliente = "";
        this.pays = 0;
        this.prest = 0;
        this.semanas = 0;
    }

    public Clientes(int id, int semanas, String nombreCliente, String dir, String aval, String direA, String garantias, String fechaIni, double pays, double prest) {
        this.id = id;
        this.semanas = semanas;
        this.nombreCliente = nombreCliente;
        this.dir = dir;
        this.aval = aval;
        this.direA = direA;
        this.garantias = garantias;
        this.fechaIni = fechaIni;
        this.pays = pays;
        this.prest = prest;
    }

    public Clientes(int semanas, String nombreCliente, String dir, String aval, String direA, String garantias, double pays, double prest) {
        this.semanas = semanas;
        this.nombreCliente = nombreCliente;
        this.dir = dir;
        this.aval = aval;
        this.direA = direA;
        this.garantias = garantias;
        this.pays = pays;
        this.prest = prest;
    }

    public Clientes(int id, int semanas) {
        this.id = id;
        this.semanas = semanas;
    }

    public Clientes(int id, int semanas, String nombreCliente, String dir, String aval, String direA, String garantias, double pays, double prest) {
        this.id = id;
        this.semanas = semanas;
        this.nombreCliente = nombreCliente;
        this.dir = dir;
        this.aval = aval;
        this.direA = direA;
        this.garantias = garantias;
        this.pays = pays;
        this.prest = prest;
    }
    
    public int getId() {
        return id;
    }

    public int getSemanas() {
        return semanas;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getDir() {
        return dir;
    }

    public String getAval() {
        return aval;
    }

    public String getDireA() {
        return direA;
    }

    public String getGarantias() {
        return garantias;
    }

    public String getFechaIni() {
        return fechaIni;
    }

    public double getPays() {
        return pays;
    }

    public double getPrest() {
        return prest;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSemanas(int semanas) {
        this.semanas = semanas;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public void setAval(String aval) {
        this.aval = aval;
    }

    public void setDireA(String direA) {
        this.direA = direA;
    }

    public void setGarantias(String garantias) {
        this.garantias = garantias;
    }

    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    public void setPays(double pays) {
        this.pays = pays;
    }

    public void setPrest(double prest) {
        this.prest = prest;
    }

    @Override
    public String toString() {
        return nombreCliente ;
    }
    
    public String imprimir() {
        return nombreCliente + ", Pagos: "+ semanas +", Cantidad: "+pays;
    }
}

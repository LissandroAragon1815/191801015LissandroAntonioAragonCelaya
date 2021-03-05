/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ntnrc
 */
public class Mago extends Personajes{
    private String poder;
    private int daño;

    public Mago(String poder, int daño, String nombre, String raza, int id, int vida) {
        super(nombre, raza, id, vida);
        this.poder = poder;
        this.daño = daño;
    }

    public Mago() {
        super("","",0,0);
        this.poder = "";
        this.daño = 0;
    }

    public String getPoder() {
        return poder;
    }

    public int getDaño() {
        return daño;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    @Override
    public String toString() {
        return "Mago{" + "poder=" + poder + ", da\u00f1o=" + daño +'}'+ super.toString();
    }        
}

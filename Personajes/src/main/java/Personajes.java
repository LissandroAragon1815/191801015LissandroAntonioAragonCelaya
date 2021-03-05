/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ntnrc
 */
public abstract class Personajes {
    private String nombre, raza;
    private int id, vida;

    public Personajes(String nombre, String raza, int id, int vida) {
        this.nombre = nombre;
        this.raza = raza;
        this.id = id;
        this.vida = vida;
    }
    public Personajes() {
        this.nombre = "";
        this.raza = "";
        this.id = 0;
        this.vida = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getId() {
        return id;
    }

    public int getVida() {
        return vida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    @Override
    public String toString() {
        return "Personajes{" + "nombre=" + nombre + ", raza=" + raza + ", id=" + id + ", vida=" + vida + '}';
    }
}

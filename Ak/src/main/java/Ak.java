/**
 *
 * @author ntnrc
 */

public class Ak {
    //Atributos
    public String material, disponibilidad;
    public int municion;
    public double daño,precio,velocidadDisparo;
    
    //metodos
    @Override
    public String toString(){
        return "el maerial del arma es de " +material+ "\ncon una disponibilidad " +disponibilidad+ "\ncon una municion de: " +municion+"\ncon una velocidad de disparo: "+velocidadDisparo+"\ncon un daño: "+daño+"\ncon un precio de "+ precio;
    }
}

/**
 *
 * @author ntnrc
 */
public class Taza {
    //Atributos
    public String color,tamaño,modelo,material;
    public double  precio;
    
    //metodos
    //Constructores
    public Taza(String color, String tamaño, String modelo,String material,double precio){
        this.color = color;
        this.material = material;
        this.modelo = modelo;
        this.precio = precio;
        this.tamaño = tamaño;
    }
    public Taza(){
        this.color = "";
        this.material = "";
        this.modelo = "";
        this.precio = 0;
        this.tamaño = "";
    }
    //toString
    @Override
    public String toString(){
        return "La taza mide: "+tamaño+"\ncuesta: "+precio+"\nsu color es: "+color+"\nes del modelo: "+modelo+"\ny esta hecha con: "+material;
    }
}

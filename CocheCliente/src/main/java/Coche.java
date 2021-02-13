

/**
 *
 * @author ntnrc
 */
public class Coche {
    public String marca, color,estado;
    public double precio;
    public int matricula;
    public Coche(){
        this.color = "";
        this.marca = "";
        this.matricula = 0;
        this.precio = 0;
        this.estado = "";
    }
    public Coche(String marca, String color, double precio, int matricula, String estado){
        this.color = color;
        this.marca = marca;
        this.matricula = matricula;
        this.precio = precio;
        this.estado = estado;
    }
    @Override
    public String toString(){
        return "marca: "+marca+"\ncolor:"+color+"\nmatricula:"+matricula+"\nprecio:"+precio+"\nEstado: "+estado;
    }
}

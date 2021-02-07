
/**
 *
 * @author ntnrc
 */
public class Cigarros {
    public String marca, saborizante,tipoFiltro;
    public int cantidad, precio, peso;
    
    public Cigarros (){
        this.cantidad = 0;
        this.marca = "";
        this.peso = 0;
        this.precio = 0;
        this.saborizante = "";
        this.tipoFiltro = "";
    }
    public Cigarros(String marca, String saborizante, String tipoFiltro, int cantidad, int precio, int peso){
        this.cantidad = cantidad;
        this.marca = marca;
        this.peso = peso;
        this.precio = precio;
        this.saborizante = saborizante;
        this.tipoFiltro = tipoFiltro;
    }
    
    @Override
    public String toString(){
        return "Marca: "+marca+"\nCantidad: "+cantidad+"\nPeso: "+peso+"\nSaborizante: "+saborizante+"\nTipo de filtro: "+tipoFiltro+"\nPrecio: "+precio;
    }
}

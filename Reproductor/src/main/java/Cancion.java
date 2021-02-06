

/**
 *
 * @author ntnrc
 */
public class Cancion {
    public int orden;
    public String titulo;
    public double duracion;
    
    public Cancion(int orden, String titulo, double duracion){
        this.duracion = duracion;
        this.orden = orden;
        this.titulo = titulo;
    }
    public Cancion(){
        this.duracion = 0;
        this.orden = 0;
        this.titulo = "";
    }
    @Override
    public String toString(){
        return "\nOrden: "+orden+ "\nduracion: "+duracion+"\ntitulo: "+titulo;
    }
}

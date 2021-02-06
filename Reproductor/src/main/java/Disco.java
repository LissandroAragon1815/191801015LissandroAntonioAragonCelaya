import java.util.ArrayList;

/**
 *
 * @author ntnrc
 */
public class Disco {
    public String nombre,artista;
    public int año;
    public ArrayList <Cancion> canciones;
    
    public Disco(){
        
    }
    public Disco(String nombre, String artista, int año, ArrayList <Cancion>canciones){
        this.año = año;
        this.artista = artista;
        this.canciones = canciones;
        this.nombre = nombre;
    }
    @Override
    public String toString(){
        return "Año: "+año+"\nArtista: "+artista+"\nnombre: "+nombre+"\ncanciones: "+ canciones;
    }
}
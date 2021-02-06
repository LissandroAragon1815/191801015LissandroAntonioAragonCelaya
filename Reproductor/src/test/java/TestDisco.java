import java.util.ArrayList;
/**
 *
 * @author ntnrc
 */
public class TestDisco {
    public static void main(String args[]){
        ArrayList <Cancion> canciones = new ArrayList();
        Cancion cancion1 = new Cancion(1, "como una novela", 3.46);
        Cancion cancion2 = new Cancion(2, "contra el dragon", 3.48);
        Cancion cancion3 = new Cancion(3, "viri viri bambam",3.50);
        
        canciones.add(cancion1);
        canciones.add(cancion2);
        canciones.add(cancion3);
        
        String nombre = "lo mas romanticas";
        Disco losAcosta = new Disco(nombre, "los acosta", 2005, canciones);
        System.out.println(losAcosta);
        
    }
}

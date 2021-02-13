import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ntnrc
 */
public class TestCine {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String titulo;
        int n = 0,horaIn,horaOut;
        
        Cine cine = new Cine("Love", 9, 11);
        
        while(n==0){
            scan.nextLine();
            System.out.println("Ingresa el titulo de la pelicula: ");
            titulo = scan.nextLine();
            Pelicula nueva = new Pelicula(titulo);
            cine.agregarPelicula(nueva);
            System.out.println("Si desea continuar ingrese 0");
            n = scan.nextInt();
        }
        System.out.println(cine.imprimirPeliculas());
        System.out.println(cine.menu());
        System.out.println("Tamaño:"+cine.tamaño());
        System.out.println("Ingrese la hora que quiere entrar: ");
        horaIn = scan.nextInt();
        System.out.println(cine.abierto(horaIn));
        
    }
}
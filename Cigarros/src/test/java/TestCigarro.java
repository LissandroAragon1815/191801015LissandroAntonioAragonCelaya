/*
    @author ntnrc
*/
import java.util.Scanner;
public class TestCigarro {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la marca de cigarros: ");
        String marca = scan.nextLine();
        System.out.println("Ingrese la cantidad de cigarros: ");
        int cantidad = scan.nextInt();
        System.out.println("Ingrese peso de los cigarros: ");
        int peso = scan.nextInt();
        System.out.println("Ingrese el sabor de los cigarros: ");
        String saborizante = scan.nextLine();
        System.out.println("Ingrese el tipo de filtro de los cigarros: ");
        String tipoFiltro = scan.nextLine();
        System.out.println("Ingrese el precio de los cigarros: ");
        int precio = scan.nextInt();
        Cigarros cigarro = new Cigarros(marca, saborizante, tipoFiltro, cantidad, precio, peso);
        System.out.println(cigarro);
    }
}

/*
Se requiere un programa que convierta los terabytes a gigabytes 
 */

/**
 *
 * @author ntnrc
 */
import java.util.Scanner;
public class TerasAGigas {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        double giga;
        System.out.println("Programa para convertir la cantidad que ingrese en terabytes a gigabytes");
        System.out.println("Ingresa el valor en Terabytes: ");
        giga = scanner.nextDouble();
        System.out.println("Equivale a " + giga*1024 +" gigas");
    }
}

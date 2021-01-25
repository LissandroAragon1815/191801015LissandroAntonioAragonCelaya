/*
    Se requiere un program que solicite al usuario 3 numeros double
    y que imprima el promedio de esos tres numero
 */

/**
 *
 * @author ntnrc
 */
import java.util.Scanner;
public class Promedio {
    public static void main(String ars[]){
        double dobleUno, dobleDos, dobleTres ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la primer calificacion: ");
        dobleUno = sc.nextDouble();
        System.out.println("Ingresa la segunda calificacion: ");
        dobleDos = sc.nextDouble();
        System.out.println("Ingresa la tercera calificacion: ");
        dobleTres = sc.nextDouble();
        System.out.println((dobleUno + dobleDos + dobleTres) / 3);
    }
}

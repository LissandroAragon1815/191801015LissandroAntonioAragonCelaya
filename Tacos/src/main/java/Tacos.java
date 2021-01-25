/*
Se requiere un programa para la taqueria de doña pelos que pregunte cuantos tacos comio 
y cuantos refrescos solicito teniendo en cuenta que todos los tacos tienen un costo de 17 
pesos y los refrescos de 10. Sacar el total a pagar.
 */

/**
 *
 * @author ntnrc
 */
import java.util.Scanner;
public class Tacos {
    public static void main(String args[]){
        int numeroTaco, numeroRefresco;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos tacos te comiste? ");
        numeroTaco = sc.nextInt();
        System.out.println("Cuantos refrescos pediste? ");
        numeroRefresco = sc.nextInt();
        System.out.println("Total a pagar: ");
        System.out.println(numeroTaco * 17 + numeroRefresco * 10);
    }
}

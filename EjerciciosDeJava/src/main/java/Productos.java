/*
Un programa que solicite el precio  de una serie de productos 
hasta que el usuario ya no desee ingresar más e imprima el 
subtotal(la sumatoria del precio de los productos), el iva 
(es el subtotal por 0.16) y el total (la suma del subtotal y el iva)
 */

/**
 *
 * @author ntnrc
 */
import java.util.Scanner;
public class Productos {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in); 
        int subtotal = 0, seguir = 0, i = 1;
        while(seguir == 0){
            System.out.println("Ingresa el valor del producto numero " +i);
            subtotal += scanner.nextInt();
            i++;
            System.out.println("Desea seguir? \ningrese 0 si desea continuar\n si no cualquier otro numero");
            seguir = scanner.nextInt();
        }
        System.out.println("El subtotal es: "+ subtotal + "\nEl iva es: "+ 0.16 * subtotal+"\nEl total es: "+ (0.16*subtotal +subtotal));
    }
}
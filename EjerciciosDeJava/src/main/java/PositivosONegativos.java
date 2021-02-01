/*
Escriba un programa que pida al usuario que ingrese varios 
valores enteros, que pueden ser positivos o negativos. 
Cuando se ingrese un cero, el programa debe terminar y 
mostrar un gráfico de cuántos valores positivos y negativos 
fueron ingresados
 */

/**
 *
 * @author ntnrc
 */
import java.util.Scanner;
public class PositivosONegativos {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in); 
        int numero;
        System.out.println("Ingresa un numero: ");
        numero = scanner.nextInt();
        if (numero>0)
            System.out.println(numero + " es positivo");
        else if(numero == 0)
            System.out.println(numero + " es cero ni positivo ni negativo");
        else
            System.out.println(numero + " es negativo");
    }
}
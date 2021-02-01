/*
Escribir un programa para una empresa que tiene salas de 
juegos para todas las edades y quiere calcular de forma 
automática el precio que debe cobrar a sus clientes por 
entrar. El programa debe preguntar al usuario la edad del
cliente y mostrar el precio de la entrada. Si el cliente es 
menor de 4 años puede entrar gratis, si tiene entre 4 y 18
años debe pagar $5 y si es mayor de 18 años, $10.
 */

/**
 *
 * @author ntnrc
 */
import java.util.Scanner;
public class SalonDeJuegos {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int edad;
        System.out.println("Ingresa la edad del cliente");
        edad = scanner.nextInt();
        if (edad <4)
            System.out.println("Entrada Gratis");
        else if(edad >4 || edad<18)
            System.out.println("La entrega cuesta $5");
        else
            System.out.println("La entrada cuesta $10");
    }    
}

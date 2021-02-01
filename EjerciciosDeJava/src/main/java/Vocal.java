/*
Un programa que determine si el caracter es una vocal o no 
 */

/**
 *
 * @author ntnrc
 */
import java.util.Scanner;
public class Vocal {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        char letra;
        System.out.println("Ingresa una letra: ");
        letra = scanner.next().charAt(0);
        letra = Character.toLowerCase(letra);
        if(letra == 'a'|| letra == 'e'|| letra == 'i'|| letra == 'o'||letra == 'u'){
            System.out .println(letra + " es una vocal");
        }
        else{
            System.out .println(letra + " NO es una vocal");
        }
    }
}
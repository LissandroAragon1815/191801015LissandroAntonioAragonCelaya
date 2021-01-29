/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ntnrc
 */
import java.util.Scanner;
public class Opciones {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2;
        System.out.print("Ingresa el primer numero: ");
        numero1 = scanner.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        numero2 = scanner.nextInt();
        System.out.println("Opcion 1. Suma \n Opcion 2. Resta");
        int num = scanner.nextInt();
        switch(num){
            case 1:
                System.out.print(numero1 + numero2);
                break;
            case 2:
                System.out.print(numero1 - numero2);
                break;
            default:
                System.out.print("Esa opcion no existe");
        }
    }
}

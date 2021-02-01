/*
Un programa que determine tu horoscopo ingresando el día y mes (validado) 
 */

/**
 *
 * @author ntnrc
 */
import java.util.Scanner;
public class Horosocopo {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in); 
        int mes, dia;
        System.out.println("Ingresa el dia de nacimiento: ");
        dia = scanner.nextInt();
        System.out.println("Ingresa el mes de nacimiento: ");
        mes = scanner.nextInt();
        switch(mes) {
      case 1:
        if (dia < 21) {
          System.out.print("Su horóscopo es capricornio");
        } else {
          System.out.print("Su horóscopo es acuario");
        }
        break;
      case 2:
        if (dia < 20) {
          System.out.print("Su horóscopo es acuario");
        } else {
          System.out.print("Su horóscopo es piscis");
        }
        break;
      case 3:
        if (dia < 21) {
          System.out.print("Su horóscopo es piscis");
        } else {
          System.out.print("Su horóscopo es aries");
        }
        break;
      case 4:
        if (dia < 21) {
          System.out.print("Su horóscopo es aries");
        } else {
          System.out.print("Su horóscopo es tauro");
        }
        break;
      case 5:
        if (dia < 20) {
          System.out.print("Su horóscopo es tauro");
        } else {
          System.out.print("Su horóscopo es géminis");
        }
        break;
      case 6:
        if (dia < 22) {
          System.out.print("Su horóscopo es géminis");
        } else {
          System.out.print("Su horóscopo es cáncer");
        }
        break;
      case 7:
        if (dia < 22) {
          System.out.print("Su horóscopo es cáncer");
        } else {
          System.out.print("Su horóscopo es leo");
        }
        break;
      case 8:
        if (dia < 24) {
          System.out.print("Su horóscopo es leo");
        } else {
          System.out.print("Su horóscopo es virgo");
        }
        break;
      case 9:
        if (dia < 23) {
          System.out.print("Su horóscopo es virgo");
        } else {
          System.out.print("Su horóscopo es libra");
        }
        break;
      case 10:
        if (dia < 23) {
          System.out.print("Su horóscopo es libra");
        } else {
          System.out.print("Su horóscopo es escorpio");
        }
        break;
      case 11:
        if (dia < 23) {
          System.out.print("Su horóscopo es escorpio");
        } else {
          System.out.print("Su horóscopo es sagitario");
        }
        break;
      case 12:
        if (dia < 21) {
          System.out.print("Su horóscopo es sagitario");
        } else {
          System.out.print("Su horóscopo es capricornio");
        }
        break;
      default:
          System.out.println("Ingresaste los datos de manera erronea");
     }
    }
}

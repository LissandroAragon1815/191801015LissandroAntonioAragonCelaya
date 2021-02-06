import java.util.Scanner;

/**
 *
 * @author ntnrc
 */
public class TestMateria {
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa el nombre de la materia: ");
        String nombre = scan.nextLine();
        System.out.println("Ingresa el nombre de la carrera: ");
        String carrera = scan.nextLine();
        System.out.println("Ingresa el numero de creditos: ");
        int creditos = scan.nextInt();
        System.out.println("Ingresa el codigo de la materia: ");
        String codigo = scan.nextLine();
        System.out.println("Ingresa el cuatrimestre: ");
        int cuatrimestre = scan.nextInt();
        Materia matematicas = new Materia("Matematicas", "Tecnologias", 30, 1,"MAT0918");
        Materia programacion = new Materia("Programacion", "Tecnologias", 45, 3,"PRO8574");
        Materia fundamentosPOO = new Materia("Fundamentos POO", "Tecnologias", 30, 5,"FUN55775");
        Materia materia = new Materia(nombre, carrera, creditos, cuatrimestre, codigo);
        System.out.println(matematicas+"\n"+programacion+"\n"+fundamentosPOO+"\n"+materia); 
    }
}
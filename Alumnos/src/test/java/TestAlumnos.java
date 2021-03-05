
/**
 *
 * @author ntnrc
 */
public class TestAlumnos {
    public static void main(String args[]){
        
        Alumnos alumno = new Alumnos("Lissandro", "191801015", "regular", 5);
        System.out.println(alumno);
        alumno.setEstado("Iregular");
        System.out.println(alumno);
    }
}

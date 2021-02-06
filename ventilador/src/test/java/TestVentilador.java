
/**
 *
 * @author ntnrc
 */
public class TestVentilador {
    public static void main(String args[]){
       Ventilador negro = new Ventilador();
        negro.color = "negro";
        negro.potencia= 3;
        negro.tipoAspa = "estandar";
        System.out.println(negro);
    }
}
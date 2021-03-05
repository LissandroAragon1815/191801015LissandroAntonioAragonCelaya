/**
 *
 * @author ntnrc
 */
import hardware.Ram;
public class TestRam {
    public static void main(String[] args) {
        Ram ram = new Ram (4, 3600, "Corsair");
        
        System.out.println(ram);
        ram.setAlmacenamiento(16);
        ram.setVelocidad(4200);
        ram.setMarca("Aorus");
        System.out.println(ram);
        
    }
}
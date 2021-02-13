

/**
 *
 * @author ntnrc
 */
public class Test {
    public static void main(String args[]){
        Coche coche = new Coche("bmw", "negro", 520.00, 5748131, "nuevo");
        Cliente cliente = new Cliente(8475921, 97120711, "pepe", coche,"Si");
        
        System.out.println(cliente);
    }
}

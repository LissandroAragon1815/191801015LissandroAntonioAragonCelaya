/**
 *
 * @author ntnrc
 */
public class TestAk {
    public static void main(String args[]){
        //Crear un objeto (instancear una clase)
        Ak cobre = new Ak();
        cobre.material = "cobre";
        cobre.disponibilidad = "alta";
        cobre.municion = 5;
        cobre.precio = 10;
        cobre.velocidadDisparo = 10.5;
        cobre.daño = 5;
        System.out.println(cobre);
        Ak diamante = new Ak();
        diamante.material = "diamante";
        diamante.disponibilidad = "baja";
        diamante.municion = 20;
        diamante.precio = 12000;
        diamante.velocidadDisparo = 13;
        diamante.daño = 15;
        System.out.println(diamante);
    }
}

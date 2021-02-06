
/**
 *
 * @author ntnrc
 */
public class TestTaza {
    public static void main(String args[]){
        Taza tazaRoja = new Taza();
        tazaRoja.color = "roja";
        tazaRoja.material = "plastico";
        tazaRoja.modelo = "navideña 2020";
        tazaRoja.precio = 350.90;
        tazaRoja.tamaño = "mediano";
        System.out.println(tazaRoja);
        Taza tazaNaranja = new Taza("naranja", "Grande", "Industrial", "Plata",119.5);
        System.out.println(tazaNaranja);
    }
}

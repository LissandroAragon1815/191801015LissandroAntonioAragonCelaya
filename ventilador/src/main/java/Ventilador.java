
/**
 *
 * @author ntnrc
 */
public class Ventilador {
    public String color, tipoAspa;
    public int potencia;
    
    //metodos
    @Override
    public String toString(){
        return "El color del ventilador es: "+color+"\nel tipo de aspa es: "+tipoAspa+"\nla potencia es de: "+potencia;
    }
}

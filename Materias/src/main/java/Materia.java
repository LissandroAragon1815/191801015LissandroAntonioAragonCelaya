
/**
 *
 * @author ntnrc
 */
public class Materia {
    public String nombre, carrera, clave;
    public int creditos, cuatrimestre;
    
    public Materia(){
        this.nombre = "";
        this.carrera = "";
        this.clave = "";
        this.creditos = 0;
        this.cuatrimestre = 0;
    }
    
    public Materia(String nombre, String carrera, int creditos, int cuatrimestre, String clave){
        this.nombre = nombre;
        this.carrera = carrera;
        this.clave = clave;
        this.creditos = creditos;
        this.cuatrimestre = cuatrimestre;
    }
    
    @Override
    public String toString(){
        return "materia: "+nombre+"\ncarrera: "+carrera+"\nclave: "+clave+"\ncreditos: "+creditos+"\ncuatrimestre: "+cuatrimestre;
    }   
}

/**
 *
 * @author ntnrc
 */
public class Alumnos {
    private String nombre, matricula,estado;
    private int cuatrimestre;
    
    public Alumnos(){
        this.cuatrimestre = 0;
        this.estado = "";
        this.matricula = "";
        this.nombre = "";
    }
    public Alumnos(String nombre, String matricula, String estado, int cuatrimestre){
        this.cuatrimestre = cuatrimestre;
        this.estado = estado;
        this.matricula = matricula;
        this.nombre = nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public String getEstado(){
        return this.estado;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public void setCuatrimestre(int cuatrimestre){
        this.cuatrimestre = cuatrimestre;
    }
    public int getCuatrimestre(){
        return this.cuatrimestre;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+nombre+"\nMatricula: "+matricula+"\nCuatrimestre: "+ cuatrimestre+"\nEstado: "+estado;
    }
}

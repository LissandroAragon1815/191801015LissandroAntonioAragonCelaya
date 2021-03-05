package hardware;

/**
 *
 * @author ntnrc
 */
public class Ram {
    private int almacenamiento, velocidad;
    private String marca;
    
    public int getAlmacenamiento (){
        return this.almacenamiento;
    }
    public int getVelocidad (){
        return this.velocidad;
    }
    public String getMarca (){
        return this.marca;
    }
    public void setAlmacenamiento (int almacenamiento){
        this.almacenamiento = almacenamiento;
    }
    public void setVelocidad (int velocidad){
        this.velocidad = velocidad;
    }
    public void setMarca (String marca){
        this.marca = marca;
    }
    
    public Ram (){
        this.almacenamiento = 0;
        this.velocidad = 0;
        this.marca = "";
    }
    
    public Ram (int almacenamiento, int velocidad, String marca){
        this.almacenamiento = almacenamiento;
        this.velocidad = velocidad;
        this.marca = marca;
                
    }
    
    @Override
    public String toString(){
        return  "Almacenamiento: "+ almacenamiento+ " Gb"+"\nMarca: "+ marca+"\nVelocidad: "+ velocidad+" Mz";
    }
}
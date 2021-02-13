import java.util.ArrayList;

/**
 *
 * @author ntnrc
 */
public class Cine {
    public String nombre;
    public int horaIn,horaOut;
    public ArrayList<Pelicula> peliculas;
    public Cine(){
        this.nombre = "";
        this.horaIn = 0;
        this.horaOut = 0;
        this.peliculas = new ArrayList();
    }
    public Cine(String nombre, int horaIn, int horaOut, ArrayList <Pelicula> peliculas){
        this.nombre = nombre;
        this.horaIn = horaIn;
        this.horaOut = horaOut;
        this.peliculas = peliculas;
    }
    public Cine(String nombre, int horaIn, int horaOut){
        this.nombre = nombre;
        this.horaIn = horaIn;
        this.horaOut = horaOut;
        this.peliculas = new ArrayList();
    }
    public String imprimirPeliculas(){
        String cartelera = "";
        for(Pelicula pelicula:peliculas){
            cartelera += pelicula.titulo+"\n";
        }
        return cartelera;
    }
    public void agregarPelicula(Pelicula nueva){
        peliculas.add(nueva);
    }
    //Metodo que regrese el tamaño cuantas peliculas tengo
    public int tamaño(){
        return peliculas.size();
    }
    //Metodo que te mande un String como menu el system out no debe de estar en el metodo
    public String menu(){
        String carteleraMenu = "";
        int i = 0;
        for(Pelicula pelicula:peliculas){
            i ++;
            
            carteleraMenu += i+"."+pelicula.titulo+"\n";
        }
        return carteleraMenu;
    }
    //Metodo donde ingrese una hora y diga si el cine esta habierto o no
    public String abierto(int hora){
        this.horaIn = hora;
        if(horaIn >=9 && horaIn <= 20){
            return "Abierto";
        }else{
            return "Cerrado";
        }
    }
}
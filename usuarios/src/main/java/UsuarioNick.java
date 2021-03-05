
/**
 *
 * @author ntnrc
 */
public class UsuarioNick {
    private int id, idUsuarios;
    private String nickViejo, nickNuevo, fechaCambio;

    public UsuarioNick() {
        this.id = 0;
        this.idUsuarios = 0;
        this.nickViejo = "";
        this.nickNuevo = "";
        this.fechaCambio = "";
    }

    public UsuarioNick(int id, int idUsuarios, String nickViejo, String nickNuevo, String fechaCambio) {
        this.id = id;
        this.idUsuarios = idUsuarios;
        this.nickViejo = nickViejo;
        this.nickNuevo = nickNuevo;
        this.fechaCambio = fechaCambio;
    }

    public int getId() {
        return id;
    }

    public int getIdUsuarios() {
        return idUsuarios;
    }

    public String getNickViejo() {
        return nickViejo;
    }

    public String getNickNuevo() {
        return nickNuevo;
    }

    public String getFechaCambio() {
        return fechaCambio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public void setNickViejo(String nickViejo) {
        this.nickViejo = nickViejo;
    }

    public void setNickNuevo(String nickNuevo) {
        this.nickNuevo = nickNuevo;
    }

    public void setFechaCambio(String fechaCambio) {
        this.fechaCambio = fechaCambio;
    }

    @Override
    public String toString() {
        return "UsuarioNick{" + "id=" + id + ", idUsuarios=" + idUsuarios + ", nickViejo=" + nickViejo + ", nickNuevo=" + nickNuevo + ", fechaCambio=" + fechaCambio + '}';
    }
    
    
}

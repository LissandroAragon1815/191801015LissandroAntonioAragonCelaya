
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ntnrc
 */
public class DaoClientes {
    private static String SQL;
    
    public static List<Clientes> listaClientes() throws SQLException{
        List<Clientes> lista = new ArrayList<>();
        Connection conexion = Conexion.getConnection();
        Statement declaracion = conexion.createStatement();
        SQL = "SELECT * FROM cliente";
        ResultSet resultado = declaracion.executeQuery(SQL);
        while(resultado.next()){            
            Clientes cliente = new Clientes(resultado.getInt("id"), resultado.getInt("semanas"), resultado.getString("nombreCliente"), 
                    resultado.getString("dir"), resultado.getString("aval"), resultado.getString("direA"), resultado.getString("garantias"), 
                    resultado.getString("fechaIni"), resultado.getDouble("pays"), resultado.getDouble("prest"), resultado.getInt("multas"));
            lista.add(cliente);
        }
        Conexion.close(conexion, declaracion, resultado);
        return lista;
    }
    public static void insertar(Clientes cliente) throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL = "INSERT INTO cliente(semanas, nombreCliente, dir, aval, direA, garantias, pays, prest, multas) VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setInt(1, cliente.getSemanas());
        declaracion.setString(2, cliente.getNombreCliente());
        declaracion.setString(3,cliente.getDir());
        declaracion.setString(4,cliente.getAval());
        declaracion.setString(5,cliente.getDireA());
        declaracion.setString(6,cliente.getGarantias());
        declaracion.setDouble(7,cliente.getPays());
        declaracion.setDouble(8,cliente.getPrest());
        declaracion.setDouble(9,cliente.getMultas());
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }        
    public static void delete(Clientes cliente) throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL = "DELETE FROM cliente WHERE id = ?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        declaracion.setInt(1, cliente.getId());
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }
    public static void update (Clientes cliente) throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL = "UPDATE cliente SET nombreCliente = ?, dir = ?, direA = ?, aval = ?, garantias = ?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setString(1,cliente.getNombreCliente());
        declaracion.setString(2,cliente.getDir());
        declaracion.setString(3,cliente.getDireA());
        declaracion.setString(4,cliente.getAval());
        declaracion.setString(5,cliente.getGarantias());
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }
    public static void pago(Clientes cliente) throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL = "UPDATE cliente SET semanasFechas = ?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setInt(1,cliente.getSemanas());
        
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }
}
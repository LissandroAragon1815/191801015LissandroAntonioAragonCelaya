
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ntnrc
 */
public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/proyecto?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String USUARIO = "root", PASSWORD = "";
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USUARIO, PASSWORD);
    }

    public static void close(Connection conexion) throws SQLException{
        conexion.close();
    }

    public static void close(Connection conexion, Statement declaracion, ResultSet resultado ) throws SQLException{
        conexion.close();
        declaracion.close();
        resultado.close();
    }

    public static void close( Connection conexion, Statement declaracion) throws SQLException{
        declaracion.close();
        conexion.close();
    }
    
}
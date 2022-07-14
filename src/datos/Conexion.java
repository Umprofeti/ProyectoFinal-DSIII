package datos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {// esta clase solo se encarga de hacer conexión con la base de datos
    private static final String JDBC_URL = "jdbc:mysql://localhost/semestral";
    private static final String JDBC_USER = "root";//si no les deja entrar, ingresen aquí su usuario de su DB
    private static final String JDBC_PASSWORD = "admin";//si no les deja entrar, ingresen aquí su contraseña de su DB
    
    public static Connection getConnection() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }
    
    public static void close(Connection conn){
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println("ex = " + ex.getMessage());
        }
    }
    
    public static void close(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Error = " + ex.getMessage());
        }
    }
    
    public static void close(PreparedStatement ps){
        try {
            ps.close();
        } catch (SQLException ex) {
            System.out.println("error = " + ex.getMessage());
        }
    }
}

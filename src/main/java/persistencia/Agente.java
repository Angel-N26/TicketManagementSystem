package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Angel
 **/
public class Agente {
    static String driver = "com.mysql.cj.jdbc.Driver";
    static String DB_username = "angeluser"; 
    static String DB_password = "K#H56jzd2SgaAyJ";
    static String DB_URL = "jdbc:mysql://85.10.205.173/ticketms_db";     

    public static Connection getConexion() {
        Connection con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(DB_URL, DB_username, DB_password);
                        
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getMessage());
        }
        return con;
    }
    
    /*public static Connection getConexion() {
        Connection con = null;
        try {
            Class.forName(driver);
            String user = "root";
            String pass = "1234";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tms?user="+user+"&password="+pass+"&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getMessage());
        }
        return con;
    }*/
    
    public static void closeConexion(Connection con){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Agente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
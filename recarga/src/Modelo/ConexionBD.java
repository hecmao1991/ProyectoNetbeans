
package Modelo;
import java.sql.*;
/**
 *
 * @author 1088973525
 */
public class ConexionBD {
    static String bd= "recarga";
    static String login ="root";
    static String pasword ="mysql";
    static String url ="jdbc:mysql://localhost/"+bd;     
    
    Connection con = null;
    
    
    public ConexionBD(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection(url,login,pasword);
                    if(con != null){
                        System.out.println("Conexion Establecida");
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        catch (ClassNotFoundException e){
            System.out.println(e.toString());
        }
    }
        public Connection getConnection(){
            return con;
        }
        public void desconectar(){
            con=null;
        }
        
        public static void main (String[] args){
            ConexionBD cBD= new ConexionBD();
            cBD.getConnection();
        }
        
}

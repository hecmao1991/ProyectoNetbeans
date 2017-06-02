/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.*;

public class Persistencia {
    
    ConexionBD cBD= null;
    
    public boolean ejecutarDML(String sql){
        boolean ejecuto= false;
        cBD= new ConexionBD();
        try {
            PreparedStatement ps= cBD.getConnection().prepareStatement(sql);
            int recibe = ps.executeUpdate();
            if (recibe>0) {
                ejecuto= true;
            }
        } catch (Exception e) {
            System.out.println("Error:"+e.toString());
        }
        cBD.desconectar();
        return ejecuto;
    }
    
  
    
    public ResultSet ejecutarConsulta(String sql){
        ResultSet datos=null;
        cBD=new ConexionBD();
        
        try {
            PreparedStatement ps=cBD.getConnection().prepareStatement(sql);
            datos=ps.executeQuery();
        } catch (SQLException e) {
            System.out.println("Error :"+e.toString());
        }
        return datos;
    }
    
    
      public static void main (String args[]){
            Persistencia p= new Persistencia();
            String sql=null;
//            sql = "Insert into persona values ('123','hec','Bol','318','mao2_@hotmail.com')"; //insercion
//            //sql="update regions set region_name='nuevo' where region_id='777'"; //actualizacion
//            //sql="delete from persona where cedula='777'";//eliminacion
//            boolean inserto= p.ejecutarDML(sql);
//            if (inserto) {
//                System.out.println("Insertado correctamente!!!");
//                //System.out.println("Actualizado correctamente!!!");
//                //System.out.println("Eliminado correctamente!!!");
//        }
            
            //consulta e impresion de resultados
            sql="select * from persona";
            
            //sql="select *from regions  natural join countries ";
            //ResultSet data=p.ejecutarConsulta(sql);
            
//            try{
//            while (data.next()) {              
//                System.out.println("Nombre region :"+""+data.getString(4));//para traer la columna numero 2
//                
//          }
//            } catch (SQLException ex) {
//            java.util.logging.Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null, ex);
//        }
            
        }
    
}

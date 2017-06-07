/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Persistencia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author 1061792939
 */
public class ControlVendedor {
    Persistencia p=new Persistencia();
    
    
    public  boolean insertarVendedor(String codigoVendedor,String Cedula, String usuario, String Password){
        boolean inserto=false;
        String sql="insert into vendedor(CODIGO_VENDEDOR,CEDULA,USUARIO,PASSWORD)"+"values ('"+codigoVendedor+"','"+Cedula+"','"+usuario+"','"+Password+"')";
        
        inserto=p.ejecutarDML(sql);
        return inserto;
    }
    public String generarCodigo(){
        String sql= "call Procedimiento_codigoVendedor(?);";
        String dato=p.GenerarCodigo(sql);
        return dato;
    }
    
    public boolean eliminar(int codigo){
        boolean elimino=false;
        String sql="delete from vendedor where CODIGO_VENDEDOR="+codigo;
        elimino=p.ejecutarDML(sql);
        return elimino;
    }
    
    public boolean actualizarVendedor (int codigoregion, String nombreRegion){
        ControlVendedor cr = new ControlVendedor();
        boolean actualizo = false;
        String sql = "Update regions set region_name= "+
                "'"+nombreRegion +"'"+ " where region_id = "
                + codigoregion;
        actualizo = p.ejecutarDML(sql);
        return actualizo;
    }
    
    public Object [][]consultarVendedor(){
    Object data [][] = new Object [contarVendedores()][4];
            ResultSet datos = null;
            String sql ="Select CODIGO_VENDEDOR,CEDULA,USUARIO,PASSWORD from vendedor ";
            datos = p.ejecutarConsulta(sql);
        try {
           int i=0;
            while(datos.next()){
                      data [i][0]= datos.getString("CODIGO_VENDEDOR");
                      data [i][1]= datos.getString("CEDULA");
                      data [i][2]= datos.getString("USUARIO");
                      data [i][3]= datos.getString("PASSWORD");
            i++;          
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
            return data;
        
    }
    public Object [][]consultarVendedorCodigo(String Cedula){
    Object data [][] = new Object [contarVendedores()][4];
            ResultSet datos = null;
            String sql ="Select CODIGO_VENDEDOR,CEDULA,USUARIO,PASSWORD from vendedor "
                    +"where CEDULA = "+Cedula;
            datos = p.ejecutarConsulta(sql);
        try {
               int i=0;
            while(datos.next()){
                      data [i][0]= datos.getString("CODIGO_VENDEDOR");
                      data [i][1]= datos.getString("CEDULA");
                      data [i][2]= datos.getString("USUARIO");
                      data [i][3]= datos.getString("PASSWORD");
                      i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
            return data;
        
    }
    
    public Object[][] consultarVendedorUsuario(String usuario){
        Object[][] data= new Object[contarVendedores()][4];
        ResultSet datos = null;
        String sql= "Select * from vendedor "+
                "where USUARIO = '"+usuario+"'";
        datos=p.ejecutarConsulta(sql);
        try {
            int i=0;
            while(datos.next()){
                data [i][0]= datos.getString("CODIGO_VENDEDOR");
                      data [i][1]= datos.getString("CEDULA");
                      data [i][2]= datos.getString("USUARIO");
                      data [i][3]= datos.getString("PASSWORD");
                      i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
        public Object[][] consultarVendedorNombre(String nombre){
        Object[][] data= new Object[ContarVendedorxNombre(nombre)][5];
        ResultSet datos = null;
        String sql= "select p.NOMBRES, v.CODIGO_VENDEDOR, p.CEDULA, v.USUARIO, PASSWORD"
                + " from vendedor v inner join persona p on (v.cedula=p.cedula) where p.NOMBRES= '"+nombre+"'";
        datos=p.ejecutarConsulta(sql);
        try {
            int i=0;
            while(datos.next()){
                      data [i][0]= datos.getString("NOMBRES");
                      data [i][1]= datos.getString("CODIGO_VENDEDOR");
                      data [i][2]= datos.getString("CEDULA");
                      data [i][3]= datos.getString("USUARIO");
                      data [i][4]= datos.getString("PASSWORD");
                      i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
        public Object[][] consultarVendedorCorreo(String correo){
        Object[][] data= new Object[contarVendedorxUsuario(correo)][5];
        ResultSet datos = null;
        String sql= "select p.NOMBRES,p.APELLIDOS from vendedor ve inner join persona p on (ve.CEDULA=p.CEDULA) where ve.USUARIO='"+correo+"'";
        datos=p.ejecutarConsulta(sql);
        try {
            int i=0;
            while(datos.next()){
                      data [i][0]= datos.getString("NOMBRES");
                      data [i][1]= datos.getString("APELLIDOS");
                      i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
    public int contarVendedores(){
        int numero = 0;
            String sql= "Select count(CODIGO_VENDEDOR)num from vendedor";
            ResultSet res = p.ejecutarConsulta(sql);               
        try {
            while(res.next()){
                numero =res.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numero;
    }
    public int contarVendedorxUsuario(String usuario) {
        int numero = 0;
        
        String sql = "select count(USUARIO)num from vendedor  where USUARIO = '"+ usuario +"'";
        ResultSet res = p.ejecutarConsulta(sql);
        try {
            while (res.next()) {
                numero = res.getInt(1);

            }
        } catch (SQLException ex) { 
            Logger.getLogger(ControlPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numero;

    }
    
    public int ContarVendedorxNombre(String nombre) {
        int numero = 0;
        
        String sql = "select count(Nombres)num from (select NOMBRES, CODIGO_VENDEDOR, p.CEDULA, USUARIO, PASSWORD from vendedor v " +
                     "inner join persona p on (v.cedula=p.cedula) where NOMBRES= '"+nombre+"')t1";
        ResultSet res = p.ejecutarConsulta(sql);
        
        try {
            while (res.next()) {
                numero = res.getInt(1);

            }
        } catch (SQLException ex) { 
            Logger.getLogger(ControlPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return numero;

    }
         public void CargarJCBoxCodVend(JComboBox JCBoxCodVend ){
        
        try {
            String sql= "Select CODIGO_VENDEDOR from VENDEDOR";
            ResultSet rs = p.ejecutarConsulta(sql);
            JCBoxCodVend.removeAllItems();
            while(rs.next()){
                JCBoxCodVend.addItem(rs.getString(1));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ControlVenta.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
            
    
    public static void main (String [] args){
        ControlVendedor cv = new ControlVendedor();
        //boolean ejecuto = cr.actualizarVendedor("1","777","prueba","1234");
      //´boolean ejecuto = cv.insertarVendedor("3","555","fer1","fer555");
    //      boolean ejecuto = cv.eliminar(2);
       
        
//        if (ejecuto) {
//            System.out.println("Ejecuto Correctamente!!!");
//        }
        //consultar todos los vendedores
        Object data[][]=new Object[cv.contarVendedores()][4];
        data=cv.consultarVendedor();
//        
//        for (int i = 0; i < cv.contarVendedores(); i++) {
//            System.out.println("CODIGO: "+data[i][0].toString()+
//                                "  CEDULA: "+data[i][1].toString()+
//                                "  USUARIO: "+data[i][2].toString()+
//                                "  PASSWORD: "+data[i][3].toString());
//        }
        
//        
        //Consultar por codigo
//        int codigo= 2;
//        int i=0;
//        data=cv.consultarVendedorCodigo(codigo);
//        System.out.println("CODIGO: "+data[i][0].toString()+
//                "  CEDULA: "+data[i][1].toString()+
//                "  USUARIO: "+data[i][2].toString()+
//                "  PASSWORD: "+data[i][3].toString());
//        i++;
        
        //consultar por usuario
//        String usuario= "fer1";
//        data=cv.consultarVendedorUsuario(usuario);
//        for (int i = 0; i < cv.contarVendedorxUsuario(usuario); i++) {
//        System.out.println("CODIGO: "+data[i][0].toString()+
//                "  CEDULA: "+data[i][1].toString()+
//                "  USUARIO: "+data[i][2].toString()+
//                "  PASSWORD: "+data[i][3].toString());
//        }

            
          //consultar por nombre          
//        String nombre= "mao";
//        data=cv.consultarVendedorNombre(nombre);
//        for (int i = 0; i < cv.ContarVendedorxNombre(nombre); i++) {
//        System.out.println("NOMBRE: "+data[i][0].toString()+
//                "  CODIGO: "+data[i][1].toString()+
//                "  CEDULA: "+data[i][2].toString()+
//                "  USUARIO: "+data[i][3].toString()+
//                "  PASSWORD: "+data[i][4].toString());
//        }

        //consulta por correo
        String nombre= "mao1";
        data=cv.consultarVendedorCorreo(nombre);
        for (int i = 0; i < cv.contarVendedorxUsuario(nombre); i++) {
        System.out.println("NOMBRE: "+data[i][0].toString()+
                "  AAPELLIDO: "+data[i][1].toString());
                
        }
        
        
        
    }   
}

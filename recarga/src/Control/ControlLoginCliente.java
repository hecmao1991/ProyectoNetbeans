/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Modelo.Persistencia;
import org.omg.CORBA.OBJECT_NOT_EXIST;

public class ControlLoginCliente {
    
    Persistencia p = new Persistencia();
    
     public boolean insertarLogin(String usuario,String password, String codigoPlataforma,String  codigoCliente) {
        boolean inserto = false;
        String sql = "insert into login_cliente(USUARIO, PASSWORD,  CODIGO_PLATAFORMA,  CODIGO_CLIENTE)"
                + "values ('" + usuario + "', '" + password + "', '" + codigoPlataforma + "','" + codigoCliente + "')";

        inserto = p.ejecutarDML(sql);
        return inserto;
    }

    public boolean actualizarLogin(String usuario,String password, String codigoPlataforma,String  codigoCliente) {
        boolean actualizo = false;
        String sql = "Update login_cliente set PASSWORD =" + "'" + password + "',CODIGO_PLATAFORMA =" + "'" + codigoPlataforma + "',"
                + "CODIGO_CLIENTE =" + "'" + codigoCliente + "'where USUARIO =" + "'" + usuario + "' ";
        actualizo = p.ejecutarDML(sql);
        return actualizo;
    }

    public boolean eliminarLogin(String usuario) {
        boolean elimino = false;
        String sql = "Delete from login_cliente where USUARIO =" + "'" + usuario + "' ";
        elimino = p.ejecutarDML(sql);
        return elimino;
    }
    public int contarLogin() {
        int numero = 0;
        String sql = "select count(USUARIO)num from login_cliente";
        ResultSet res = p.ejecutarConsulta(sql);
        try {
            while (res.next()) {
                numero = res.getInt(1);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numero;

    }
    
    public int contarLoginCodCliente(String codigoCliete) {
        int numero = 0;
        
        String sql = "select count(CODIGO_CLIENTE)num from login_cliente  where CODIGO_CLIENTE = '"+ codigoCliete +"'";
        ResultSet res = p.ejecutarConsulta(sql);
        try {
            while (res.next()) {
                numero = res.getInt(1);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numero;

    }
    
    public Object[][] consultarLogin() {
        Object data[][] = new Object[contarLogin()][4];
        ResultSet datos = null;
        String sql = "Select * from login_cliente";
        datos = p.ejecutarConsulta(sql);

        try {
            int i = 0;
            while (datos.next()) {
                data[i][0] = datos.getString(1);
                data[i][1] = datos.getString(2);
                data[i][2] = datos.getString(3);
                data[i][3] = datos.getString(4);
                
                i++;

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
    
    public Object[][] consultarLoginxUsuario(String usuario) {
        Object data[][] = new Object[1][4];
        ResultSet res = null;
                
        String sql = "select * from login_cliente where USUARIO ='" + usuario + "'";
        res=p.ejecutarConsulta(sql);
        
        try {
            while (res.next()) {
                data[0][0] = res.getString(1);
                data[0][1] = res.getString(2);
                data[0][2] = res.getString(3);
                data[0][3] = res.getString(4);
                
                
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
    
    public Object[][] consultarLoginCodCliente(String codigoCliente) {
        Object data[][] = new Object[contarLoginCodCliente(codigoCliente)][4];
        ResultSet datos = null;
        String sql = "Select * from login_cliente "
                + "where CODIGO_CLIENTE =" + "'" + codigoCliente + "' ";
        datos = p.ejecutarConsulta(sql);
        int i=0;
        try {
            
            while (datos.next()) {
                data[i][0] = datos.getString(1);
                data[i][1] = datos.getString(2);
                data[i][2] = datos.getString(3);
                data[i][3] = datos.getString(4);
                
               i++;
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
    
    
    public static void main(String[] args) {

        ControlLoginCliente clc = new ControlLoginCliente();
//     boolean ejecuto = clc.insertarLogin("userprueba","123","cr","111");

//       boolean ejecuto = clc.actualizarLogin("userprueba","1234","cr","111");
//        boolean ejecuto = clc.eliminarLogin("aaa");

//        if (ejecuto) {
//            System.out.println("Ejecutado correctamente");
//        }
//        
//        //LISTAR CLIENTES
        Object data[][] = new Object[clc.contarLogin()][4];
        data = clc.consultarLogin();
        System.out.println("registros: "+ clc.contarLogin());
        for (int i = 0; i < clc.contarLogin(); i++) {
            System.out.println("USUARIO: " + data[i][0].toString() 
                             + " PASSWORD: " + data[i][1].toString()
                             + " CODIGO PLATAFORMA: " + data[i][2].toString()
                             + " CODIGO CLIENTE: " + data[i][3].toString());
        }
//        
//        
//        //CONSULTAR PERSONAS POR USUARIO
//        
//        data = clc.consultarLoginxUsuario("darwin");
//        System.out.println("CEDULA : " + data[0][0] 
//                        + "  PASSWORD: " + data[0][1]
//                        + "   CODIGO PLATAFORMA: " + data[0][2]
//                        + "   CODIGO CLIENTE: " + data[0][3]);
//        
//        //CONSULTAR PERSONAS POR CODIGO CLIENTE
//        
        String codigoCliente ="111";
        data = clc.consultarLoginCodCliente(codigoCliente);
        
        
        for (int i = 0; i < clc.contarLoginCodCliente(codigoCliente); i++){
        System.out.println("CEDULA : " + data[i][0] 
                        + "  PASSWORD: " + data[i][1]
                        + "   CODIGO PLATAFORMA: " + data[i][2]
                        + "   CODIGO CLIENTE: " + data[i][3]);
                        
        
        }

    }
}

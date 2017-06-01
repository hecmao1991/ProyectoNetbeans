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
import javax.swing.JComboBox;
import org.omg.CORBA.OBJECT_NOT_EXIST;

/**
 *
 * @author DARWIN
 */
public class ControlPlataforma {
    
     Persistencia p = new Persistencia();   
     public boolean insertarPlataforma(String codigoPlataforma,String nombrePlataforma) {
        boolean inserto = false;
        String sql = "insert into plataforma(CODIGO_PLATAFORMA, NOMBRE_PLATAFORMA)"
                + "values ('" + codigoPlataforma + "', '" + nombrePlataforma + "')";

        inserto = p.ejecutarDML(sql);
        return inserto;
    }

    public boolean actualizarPlataforma(String codigoPlataforma,String nombrePlataforma) {
        boolean actualizo = false;
        String sql = "Update plataforma set CODIGO_PLATAFORMA =" + "'" + codigoPlataforma + "',"
                + "NOMBRE_PLATAFORMA =" + "'" + nombrePlataforma + "'"
                + "where CODIGO_PLATAFORMA =" + "'" + codigoPlataforma + "' ";
        actualizo = p.ejecutarDML(sql);
        return actualizo;
    }

    public boolean eliminarPlataforma(String codigoPlataforma) {
        boolean elimino = false;
        String sql = "Delete from plataforma where CODIGO_PLATAFORMA =" + "'" + codigoPlataforma + "' ";
        elimino = p.ejecutarDML(sql);
        return elimino;
    }
    
    public int contarPlataforma() {
        int numero = 0;
        String sql = "select count(CODIGO_PLATAFORMA)num from plataforma";
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

    public Object[][] consultarPlataforma() {
        Object data[][] = new Object[contarPlataforma()][2];
        ResultSet datos = null;
        String sql = "Select * from plataforma";
        datos = p.ejecutarConsulta(sql);

        try {
            int i = 0;
            while (datos.next()) {
                data[i][0] = datos.getString(1);
                data[i][1] = datos.getString(2);
                
                i++;

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    
    
    public Object[][] consultarPlataforma(String codigo) {
        Object data[][] = new Object[1][2];
        ResultSet datos = null;
        String sql = "Select * from plataforma "
                + "where CODIGO_PLATAFORMA =" + "'" + codigo + "' ";
        datos = p.ejecutarConsulta(sql);
        
        try {
            
            while (datos.next()) {
                data[0][0] = datos.getString(1);
                data[0][1] = datos.getString(2);
               
               
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
    
    public Object[][] consultarPlataformaNombre(String nombre) {
        Object data[][] = new Object[1][2];
        ResultSet datos = null;
        
        String sql = "Select * from plataforma "
                + "where NOMBRE_PLATAFORMA =" + "'" + nombre + "' ";
        datos = p.ejecutarConsulta(sql);
        
        try {
            
            while (datos.next()) {
                data[0][0] = datos.getString(1);
                data[0][1] = datos.getString(2);
               
               
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
    
    
    public static void main(String[] args) {

        ControlPlataforma cpl = new ControlPlataforma();
//     boolean ejecuto = cpl.insertarPlataforma("cr","conexred");

//       boolean ejecuto = cpl.actualizarPlataforma("cr","conexred2");
//        boolean ejecuto = cpl.eliminarPlataforma("fc");
//
//        if (ejecuto) {
//            System.out.println("Ejecutado correctamente");
//        }
        
        //LISTAR PLATAFORMAS
        Object data[][] = new Object[cpl.contarPlataforma()][2];
        data = cpl.consultarPlataforma();
        System.out.println("registros: "+ cpl.contarPlataforma());
        for (int i = 0; i < cpl.contarPlataforma(); i++) {
            System.out.println("CODIGO: " + data[i][0].toString() 
                             + "   NOMBRE: " + data[i][1].toString());                             ;
        }
//        
//        
//        //CONSULTAR PLATAFORMA  POR CODIGO
        String codigo="cr" ;
        data = cpl.consultarPlataforma(codigo);
        System.out.println("    CODIGO: " + data[0][0] 
                        + "  PLATAFORMA: " + data[0][1]);
//        
//        //CONSULTAR PERSONAS POR NOMBRE
        
        String nombre="fullmovil" ;
        data = cpl.consultarPlataformaNombre(nombre);
        System.out.println("    CODIGO: " + data[0][0] 
                        + "  PLATAFORMA: " + data[0][1]);


    }
}

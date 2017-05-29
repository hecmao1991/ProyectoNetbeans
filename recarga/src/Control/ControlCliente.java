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


public class ControlCliente {
    
    Persistencia p = new Persistencia();

    public boolean insertarCliente(String cedula, String direccion) {
        boolean inserto = false;
        String sql = "insert into cliente(cedula,direccion)" + "values (" + cedula + ",'" + direccion + "')";

        inserto = p.ejecutarDML(sql);
        return inserto;
    }

    public boolean actualizarCiente(String cedula, String direccion) {
        boolean actualizo = false;
        String sql = "Update cliente set direccion =" + "'" + direccion + "' where cedula =" + "'" + cedula + "' ";
        actualizo = p.ejecutarDML(sql);
        return actualizo;
    }

    public boolean eliminarCliente(String cedula) {
        boolean elimino = false;
        String sql = "Delete from cliente where cedula =" + "'" + cedula + "' ";
        elimino = p.ejecutarDML(sql);
        return elimino;
    }

    public int contarClientes() {
        int numero = 0;
        String sql = "select count(cedula)num from cliente";
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
    
    public int contarclientesxNombre(String nombre) {
        int numero = 0;
        

          String sql ="select count(nombres)num "
                  + "from (select c.cedula,  p.nombres, p.apellidos, c.direccion, p.telefono, p.correo "
                  + "from cliente c inner join persona p on(c.cedula=p.cedula) "
                  + "where p.nombres = '"+ nombre +"')t1";
                  

        
        
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
    public Object[][] consultarClientes() {
        Object data[][] = new Object[contarClientes()][6];
        ResultSet datos = null;
        String sql = "select c.cedula,  p.nombres, p.apellidos, c.direccion, p.telefono, p.correo "
                + "from cliente c inner join persona p on(c.cedula=p.cedula);";
        datos = p.ejecutarConsulta(sql);

        try {
            int i = 0;
            while (datos.next()) {
                data[i][0] = datos.getString(1);
                data[i][1] = datos.getString(2);
                data[i][2] = datos.getString(3);
                data[i][3] = datos.getString(4);
                data[i][4] = datos.getString(5);
                data[i][5] = datos.getString(6);
                
                i++;

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    

    public Object[][] consultarClientesCedula(String cedula) {
        Object data[][] = new Object[contarClientes()][6];
        ResultSet datos = null;
        String sql = "select c.cedula,  p.nombres, p.apellidos, c.direccion, p.telefono, p.correo "
                + "from cliente c inner join persona p on(c.cedula=p.cedula) "
                + "where c.cedula=" + "'" + cedula + "' ";
        datos = p.ejecutarConsulta(sql);

        try {
            while (datos.next()) {
                data[0][0] = datos.getString(1);
                data[0][1] = datos.getString(2);
                data[0][2] = datos.getString(3);
                data[0][3] = datos.getString(4);
                data[0][4] = datos.getString(5);
                data[0][5] = datos.getString(6);
                

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
    
     public Object[][] consultarClienteNombre(String nombre) {
        Object data[][] = new Object[contarclientesxNombre(nombre)][6];
        ResultSet res = null;
               
        
        String sql = "select c.cedula,  p.nombres, p.apellidos, c.direccion, p.telefono, p.correo "
                + "from cliente c inner join persona p on(c.cedula=p.cedula) "
                + "where p.nombres ='" + nombre + "'";
        
        res=p.ejecutarConsulta(sql);
        int i = 0;
        try {
            while (res.next()) {
                data[i][0] = res.getString(1);
                data[i][1] = res.getString(2);
                data[i][2] = res.getString(3);
                data[i][3] = res.getString(4);
                data[i][4] = res.getString(5);
                data[i][5] = res.getString(6);
                
                
                
                
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
     public void CargarJCBoxCodCli(JComboBox JCBoxCodCli ){
        
        try {
            String sql= "Select CEDULA from CLIENTE;";
            ResultSet rs = p.ejecutarConsulta(sql);
            JCBoxCodCli.removeAllItems();
            while(rs.next()){
                JCBoxCodCli.addItem(rs.getString(1));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
    }

    public static void main(String[] args) {

        ControlCliente cc = new ControlCliente();
      // boolean ejecuto = cc.insertarCliente("556","calle9");
//       boolean ejecuto = cc.actualizarCiente("111", "prueba2");
//        boolean ejecuto = cc.eliminarCliente("222");
//
//        if (ejecuto) {
//            System.out.println("Ejecutado correctamente");
//        }

//        //LISTAR CLIENTES
//      
       
        Object data[][] = new Object[cc.contarClientes()][6];
        data = cc.consultarClientes();
       
         System.out.println("LISTAR CLIENTES");
        for (int i = 0; i <cc.contarClientes(); i++) {
            System.out.println("CEDULA: " + data[i][0].toString() 
                             + " NOMBRES: " + data[i][1].toString()
                             + " APELLIDOS: " + data[i][2].toString()
                             + " DIRECCION: " + data[i][3].toString()
                             + " TELEFONO : " + data[i][4].toString()
                             + "  CORREO: " + data[i][5].toString());
        }

        
        //CONSULTAR PERSONAS POR CEDULA
        
        data = cc.consultarClientesCedula("123");
        System.out.println("CEDULA : " + data[0][0] 
                        + "  NOMBRES: " + data[0][1]
                        + "   APELLIDOS: " + data[0][2]
                        + "   DIRECCION: " + data[0][3]
                        + "   TELEFONO: " + data[0][4]
                        + "   CORREO: " + data[0][5]);
        
        //CONSULTAR PERSONAS POR NOMBRE
        
        String nombre ="mao";
        data = cc.consultarClienteNombre(nombre);
        
        
        for (int i = 0; i < cc.contarclientesxNombre(nombre); i++){
        System.out.println("CEDULA : " + data[i][0] 
                        + "  NOMBRES: " + data[i][1]
                        + "   APELLIDOS: " + data[i][2]
                        + "   DIRECCION: " + data[i][3]
                        + "   TELEFONO: " + data[i][4]
                        + "   CORREO: " + data[i][5]);
        
        }

    }

}

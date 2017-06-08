/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Persistencia;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author Mauricio
 */
public class ControlVenta {
    Persistencia p = new Persistencia();

    public boolean insertarVenta(String CODIGO_VNT, String fecha,double Valor,String Codigo_VEND, String Codigo_CLI,String Codigo_PLA) {
        boolean inserto = false;
        String sql = "insert into venta(CODIGO_VENTA,FECHA,VALOR,CODIGO_VENDEDOR,CODIGO_CLIENTE,CODIGO_PLATAFORMA)"
                + "values('" + CODIGO_VNT +"','"+ fecha+"',"+ Valor+",'"+Codigo_VEND+"','"+Codigo_CLI+"','"+Codigo_PLA + "')";

        inserto = p.ejecutarDML(sql);
        return inserto;
    }

    public boolean actualizarVenta(String CODIGO_VNT, String fecha,double Valor,String Codigo_VEND, String Codigo_CLI,String Codigo_PLA) {
        boolean actualizo = false;
        String sql = "Update venta set CODIGO_VENTA= '" + CODIGO_VNT +"',FECHA='"+ fecha+"',VALOR="+ Valor+",CODIGO_VENDEDOR='"+Codigo_VEND+"',CODIGO_CLIENTE='"+Codigo_CLI+"',CODIGO_PLATAFORMA='"+Codigo_PLA + "'"+
                       " Where CODIGO_VENTA= '"+CODIGO_VNT+"'";
        actualizo = p.ejecutarDML(sql);
        return actualizo;
    }
    public String GenerarCodigoVenta() {
        String sql = "select Funcion_codigo_Venta();";
        String codigo = p.GenerarCodigo(sql);
        return codigo;
    }

    public boolean eliminarVenta(String codigo) {
        boolean elimino = false;
        String sql = "Delete from venta where CODIGO_VENTA =" + "'" + codigo + "' ";
        elimino = p.ejecutarDML(sql);
        return elimino;
    }

    public int contarClientes() {
        int numero = 0;
        String sql = "select count(CODIGO_VENTA)num from venta";
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
    
    public int contarVentasxNombreVendedor(String nombre) {
        int numero = 0;       

          String sql ="select count(nombres)num from(select p.NOMBRES,CODIGO_VENTA,FECHA,VALOR,v.CODIGO_VENDEDOR,CODIGO_CLIENTE,CODIGO_PLATAFORMA " +
                        "from venta v inner join vendedor ve on(v.CODIGO_VENDEDOR=ve.CODIGO_VENDEDOR) " +
                        "inner join persona p on (ve.CEDULA=p.CEDULA) where p.nombres= '"+ nombre +"')t1";
                  

        
        
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
//    public String generarCodigo(){
//        String dato="";
//        String sql= "select Funcion_codigo_Venta('0');";
//        ResultSet codigo=p.GenerarCodigo(sql);
//        try {
//            String dato= codigo.getString('0');
//        } catch (SQLException ex) {
//            Logger.getLogger(ControlVenta.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return dato;
//    }
    
    public Object[][] consultarVentas() {
        Object data[][] = new Object[contarClientes()][6];
        ResultSet datos = null;
        String sql = "select * from venta;";
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

    

    public Object[][] consultarVentaCodigo(String CODIGO) {
        Object data[][] = new Object[contarClientes()][6];
        ResultSet datos = null;
        String sql = "select CODIGO_VENTA,FECHA,VALOR,CODIGO_VENDEDOR,CODIGO_CLIENTE,CODIGO_PLATAFORMA from venta "
                + "where CODIGO_VENTA=" + "'" + CODIGO + "' ";
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
        } catch (SQLException ex_consulta_venta_codigo) {
            Logger.getLogger(ControlVenta.class.getName()).log(Level.SEVERE, null, ex_consulta_venta_codigo);
        }
         
        return data;
    }
    
     public Object[][] consultarVentaNombreVendedor(String nombre) {
        Object data[][] = new Object[contarVentasxNombreVendedor(nombre)][7];
        ResultSet res = null;
               
        
        String sql = "select p.NOMBRES,CODIGO_VENTA,FECHA,VALOR,v.CODIGO_VENDEDOR,CODIGO_CLIENTE,CODIGO_PLATAFORMA " +
                "from venta v inner join vendedor ve on(v.CODIGO_VENDEDOR=ve.CODIGO_VENDEDOR) " +
            "inner join persona p on (ve.CEDULA=p.CEDULA) where p.nombres='" + nombre + "'";
        
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
                data[i][6] = res.getString(7);
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
     
  
      

    public static void main(String[] args) {

        ControlVenta cv = new ControlVenta();
//      boolean ejecuto = cv.insertarVenta("4","21/05/2017",3000,"1","777","1");
      boolean ejecuto = cv.actualizarVenta("4","20170525",2000,"2","777","1");
//       boolean ejecuto = cv.eliminarVenta("1");
//
//        if (ejecuto) {
//            System.out.println("Ejecutado correctamente");
//        }

//        //LISTAR VENTAS 
       
        Object data[][] = new Object[cv.contarClientes()][7];
        data = cv.consultarVentas();
//       
         System.out.println("LISTAR VENTAS");        
        for (int i = 0; i <cv.contarClientes(); i++) {
            System.out.println("CODIGO: " + data[i][0].toString() 
                             + " FECHA: " + data[i][1].toString()
                             + " VALOR: " + data[i][2].toString()
                             + " CODIGO VENDEDOR: " + data[i][3].toString()
                             + " CODIGO CLIENTE: " + data[i][4].toString()
                             + " CODIGO PLATAFORMA: " + data[i][5].toString());
        }
//
//        
//        //CONSULTAR PERSONAS POR CODIGO
//        
//        data = cv.consultarVentaCodigo("4");
//        System.out.println("CODIGO: " + data[0][0]
//                             + " FECHA: " + data[0][1]
//                             + " VALOR: " + data[0][2]
//                             + " CODIGO VENDEDOR: " + data[0][3]
//                             + " CODIGO CLIENTE: " + data[0][4]
//                             + " CODIGO PLATAFORMA: " + data[0][5]);

//CONSULTAR PERSONAS POR NOMBRE
//        
//        String nombre ="mao";
//        data = cv.consultarVentaNombreVendedor(nombre);        
//        for (int i = 0; i < cv.contarVentasxNombreVendedor(nombre); i++){
//        System.out.println("NOMBRE: " + data[i][0]
//                             + " CODIGO: " + data[i][1]
//                             + " FECHA: " + data[i][2]
//                             + " VALOR: " + data[i][3]
//                             + " CODIGO_VENDEDOR: " + data[i][4]
//                             + " CODIGO_CLIENTE: " + data[i][5]
//                             + " CODIGO_PLATAFORMA: " + data[i][6]);
//      
//        }

    }

}

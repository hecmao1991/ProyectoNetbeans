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


class ControlDetalleVenta {
    
     Persistencia p = new Persistencia();
    
    public boolean insertarDetalleVenta(String codigo_det_venta, double abono, double saldo, String codigo_venta) {
        boolean inserto = false;
        String sql = "insert into detalle_venta(CODIGO_DETALLE_VENTA, ABONO,SALDO,CODIGO_VENTA )" 
                + "values ('" + codigo_det_venta + "',"+ abono +", "+ saldo +", '" + codigo_venta + "')";

        inserto = p.ejecutarDML(sql);
        return inserto;
    }
    
    public boolean eliminarDetalleVenta(String codigoDetalleVenta) {
        boolean elimino = false;
        String sql = "Delete from detalle_venta where CODIGO_DETALLE_VENTA =" + "'" + codigoDetalleVenta + "' ";
        elimino = p.ejecutarDML(sql);
        return elimino;
    }
    public double valor_venta(String codigo_venta) {
        int numero = 0;
        
        String sql ="select v.valor from venta v where v.codigo_venta=" + "'" + codigo_venta + "' " ;
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
    
    public double saldo(double valor_venta,double abono){
        double saldo=0;
        saldo=valor_venta-abono;
        return saldo;
        
    }
    public int contarDetalleVenta() {
        int numero = 0;
        String sql = "select count(CODIGO_DETALLE_VENTA)num from detalle_venta";
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
    public Object[][] consultarDetalleVenta() {
        Object data[][] = new Object[contarDetalleVenta()][4];
        ResultSet datos = null;
        String sql = "Select * from detalle_venta";
        datos = p.ejecutarConsulta(sql);

        try {
            int i = 0;
            while (datos.next()) {
                data[i][0] = datos.getString(1);
                data[i][1] = datos.getDouble(2);
                data[i][2] = datos.getDouble(3);
                data[i][3] = datos.getString(4);
                
                i++;

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
    
    public static void main(String[] args) {

        ControlDetalleVenta cdv = new ControlDetalleVenta();
        double saldo=0;
        double abono=4000;
        double abono2=6000;
        String codigo_venta="codv1";
        String codigo_det_venta="cdetv1";
        
        
        
        
        //ABONO 1
//        boolean ejecuto = cdv.insertarDetalleVenta("cdetv1",abono,cdv.saldo(cdv.valor_venta(codigo_venta), abono),"codv1");
        
        //ABONO 2
//        boolean ejecuto = cdv.insertarDetalleVenta("cdetv1",abono2,cdv.saldo(cdv.valor_venta(codigo_venta), abono2),"codv1");
//        boolean ejecuto = cc.actualizarCiente("111", "prueba2");
        //boolean ejecuto = cdv.eliminarDetalleVenta(codigo_det_venta);
//
//        if (ejecuto) {
//            System.out.println("Ejecutado correctamente");
//        }

//        //LISTAR DETALLE VENTA
//      
//       
        Object data[][] = new Object[cdv.contarDetalleVenta()][4];
        data = cdv.consultarDetalleVenta();
       
         System.out.println("LISTAR DETALLE VENTAS");
        for (int i = 0; i <cdv.contarDetalleVenta(); i++) {
            System.out.println("COD DETALLE VENTA: " + data[i][0].toString() 
                             + " ABONO: " + data[i][1].toString()
                             + " SALDO: " + data[i][2].toString()
                             + " COD VENTA: " + data[i][3].toString());
        }
//
//        
//        //CONSULTAR PERSONAS POR CEDULA
//        
//        data = cc.consultarClientes("111");
//        System.out.println("CEDULA : " + data[0][0] 
//                        + "  NOMBRES: " + data[0][1]
//                        + "   APELLIDOS: " + data[0][2]
//                        + "   DIRECCION: " + data[0][3]
//                        + "   TELEFONO: " + data[0][4]
//                        + "   CORREO: " + data[0][5]);
//        
//        //CONSULTAR PERSONAS POR NOMBRE
//        
//        String nombre ="P2";
//        data = cc.consultarClienteNombre(nombre);
//        
//        
//        for (int i = 0; i < cc.contarclientesxNombre(nombre); i++){
//        System.out.println("CEDULA : " + data[i][0] 
//                        + "  NOMBRES: " + data[i][1]
//                        + "   APELLIDOS: " + data[i][2]
//                        + "   DIRECCION: " + data[i][3]
//                        + "   TELEFONO: " + data[i][4]
//                        + "   CORREO: " + data[i][5]);
//        
//        }

    }
    
}

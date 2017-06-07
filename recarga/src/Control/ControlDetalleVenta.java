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

/**
 *
 * @author DARWIN
 */
public class ControlDetalleVenta {
    
    Persistencia p = new Persistencia();

//        String sql = "select CODIGO_VENTA from venta "
//                + "where CODIGO_VENTA=" + "'" + codigo_venta + "'";
    public Object[][] consultarDetalleVentaCodigo(String CODIGO_DET_VENTA){
        String respuesta;
        Object data[][] = new Object[contarDetalleVenta()][4];
        ResultSet datos = null;
        String sql = "select * from Detalle_venta "
                + "where CODIGO_DETALLE_VENTA=" + "'" + CODIGO_DET_VENTA + "' ";
        datos = p.ejecutarConsulta(sql);

        try {
            while (datos.next()) {
                data[0][0] = datos.getString(1);
                data[0][1] = datos.getDouble(2);
                data[0][2] = datos.getDouble(3);
                data[0][3] = datos.getString(4);
                
               

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlVenta.class.getName()).log(Level.SEVERE, null, ex);
            
            respuesta=ex.getMessage() ;
        }

        return data;
    }

//    public boolean consultar_cod_det_venta(String codigo_venta){
//        boolean consulta = true;
//        String sql = "select CODIGO_DET_VENTA from venta "
//                + "where CODIGO_VENTA=" + "'" + codigo_venta + "'";
//
//        consulta = p.ejecutarDML(sql);
//        return consulta;
//    } 
    public boolean insertarDetalleVenta(String codigo_det_venta, double abono, double saldo, String codigo_venta) {
        boolean inserto = false;
        String sql = "insert into detalle_venta(CODIGO_DETALLE_VENTA, ABONO,SALDO,CODIGO_VENTA )"
                + "values ('" + codigo_det_venta + "'," + abono + ", " + saldo + ", '" + codigo_venta + "')";

        inserto = p.ejecutarDML(sql);
        return inserto;
    }

    public boolean actualizarDetalleVenta(String codigo_det_venta, double abono, double saldo, String codigo_venta) {
        boolean actualizo = false;

        String sql = "Update detalle_venta set ABONO =" + abono + ", SALDO= " + saldo + " "
                + "where CODIGO_VENTA =" + "'" + codigo_venta + "' ";
        actualizo = p.ejecutarDML(sql);
        return actualizo;
    }

    public boolean eliminarDetalleVenta(String codigoDetalleVenta) {
        boolean elimino = false;
        String sql = "Delete from detalle_venta where CODIGO_DETALLE_VENTA =" + "'" + codigoDetalleVenta + "' ";
        elimino = p.ejecutarDML(sql);
        return elimino;
    }

    public double valor_venta(String codigo_venta) {
        int numero = 0;

        String sql = "select v.valor from venta v where v.codigo_venta=" + "'" + codigo_venta + "' ";
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

    public double valor_saldo(String codigo_venta) {
        int numero = 0;

        String sql = "select saldo from detalle_venta  where codigo_venta=" + "'" + codigo_venta + "' ";
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

    public double valor_abono(String codigo_venta) {
        int numero = 0;

        String sql = "select abono from detalle_venta  where codigo_venta=" + "'" + codigo_venta + "' ";
        ResultSet res = p.ejecutarConsulta(sql);

        try {
            while (res.next()) {
                numero = res.getInt(1);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlDetalleVenta.class.getName()).log(Level.SEVERE, null, ex);
        }

        return numero;

    }

    public double abono(double abono) {

        double sumatoria = 0;
        sumatoria = sumatoria + abono;
        return sumatoria;
    }

    public double abonoaux(double valor_abono, double abono) {

        double sumatoria = 0;
        sumatoria = valor_abono + abono;
        return sumatoria;
    }

    public double saldo(double valor_venta, double abono) {
        double saldo = 0;
        saldo = valor_venta - abono;
        return saldo;
    }

    public double saldoaux(double valor_saldo, double abono) {
        double saldo = 0;
        saldo = valor_saldo - abono;
        return saldo;
    }

//    public double saldoaux(double valor_saldo,double abono){
//        
//        double saldo=0;
//        int count=0;
//        
//        while(count<2){
//            count=count+1;
//            saldo=valor_saldo-abono;
//        }
//        return saldo;
//    }
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
        ControlVenta cv = new ControlVenta();
//        double saldo = 0;
        double abono = 10000;

        String codigo_venta = "vtn1";
        String codigo_det_venta = "dv1";

        System.out.println(abono);

        Object data[][] = new Object[0][0];
        Object datac[][] = new Object[0][0];

        data = cv.consultarVentaCodigo(codigo_venta);
        datac = cdv.consultarDetalleVentaCodigo(codigo_det_venta);
        System.out.println("CODIGO_VENTA: " + data[0][0]);
//        System.out.println("CODIGO_DETALLE_VENTA: " + datac[0][0]);

        try {
          if( data[0][0].toString().equals(codigo_venta) & datac[0][0].toString().equals(null)){
          boolean ejecuto = cdv.insertarDetalleVenta(codigo_det_venta, abono, cdv.saldo(cdv.valor_venta(codigo_venta), abono), codigo_venta);
//          System.out.println("CODIGO_VENTA: " + data[0][0]);
      
            }
            if (data[0][0].toString().equals(codigo_venta) & datac[0][0].toString().equals(codigo_det_venta)) {
                boolean ejecuto2 = cdv.actualizarDetalleVenta(codigo_det_venta, cdv.abonoaux(cdv.valor_abono(codigo_venta), abono),
                        cdv.saldoaux(cdv.valor_saldo(codigo_venta), abono), codigo_venta);
//                    System.out.println("CODIGO: " + data[0][0]);

            }

        } catch (Exception e) {
            System.out.println("NO EXISTE VENTA");
            boolean ejecuto = cdv.insertarDetalleVenta(codigo_det_venta, abono, cdv.saldo(cdv.valor_venta(codigo_venta), abono), codigo_venta);
//          System.out.println("CODIGO_VENTA: " + data[0][0]);
        }
//        boolean ejecuto = cdv.insertarDetalleVenta(codigo_det_venta, abono, cdv.saldo(cdv.valor_venta(codigo_venta), abono), codigo_venta);
//               System.out.println("CODIGO: " + data[0][0]);

//        if (cdv.consultar_cod_venta(codigo_venta)==1 || cdv.consultar_cod_det_venta(codigo_venta)==false) {
//        } 
//        if(saldo==0){
//            System.out.println("PAGO COMLETO");
//        }
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
//        Object data[][] = new Object[cdv.contarDetalleVenta()][4];
        data = cdv.consultarDetalleVenta();
//
        System.out.println("LISTAR DETALLE VENTAS");
        for (int i = 0; i < cdv.contarDetalleVenta(); i++) {
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

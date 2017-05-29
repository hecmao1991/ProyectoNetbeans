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

/**
 *
 * @author 1061751297
 */
public class ControlPersona {

    Persistencia p = new Persistencia();

    public boolean insertarPersona(String cedula,String nombres, String apellidos,String  telefono, String correo) {
        boolean inserto = false;
        String sql = "insert into persona(cedula, nombres, apellidos, telefono, correo)"
                + "values ('" + cedula + "', '" + nombres + "', '" + apellidos + "','" + telefono + "','" + correo + "')";

        inserto = p.ejecutarDML(sql);
        return inserto;
    }

    public boolean actualizarPersona(String cedula,String nombres, String apellidos,String  telefono, String correo) {
        boolean actualizo = false;
        String sql = "Update persona set nombres =" + "'" + nombres + "',apellidos =" + "'" + apellidos + "',"
                + "telefono =" + "'" + telefono + "',correo =" + "'" + correo + "'"
                + "where cedula =" + "'" + cedula + "' ";
        actualizo = p.ejecutarDML(sql);
        return actualizo;
    }

    public boolean eliminarPersona(String cedulaPersona) {
        boolean elimino = false;
        String sql = "Delete from persona where cedula =" + cedulaPersona;
        elimino = p.ejecutarDML(sql);
        return elimino;
    }
    

    public int contarPersonas() {
        int numero = 0;
        String sql = "select count(cedula)num from persona";
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
public int contarPersonasxNombre(String nombre) {
        int numero = 0;
        
        String sql = "select count(nombres)num from persona  where nombres = '"+ nombre +"'";
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
    public Object[][] consultarPersona() {
        Object data[][] = new Object[contarPersonas()][5];
        ResultSet datos = null;
        String sql = "Select cedula, nombres, apellidos, telefono, correo  from persona";
        datos = p.ejecutarConsulta(sql);

        try {
            int i = 0;
            while (datos.next()) {
                data[i][0] = datos.getString("cedula");
                data[i][1] = datos.getString("nombres");
                data[i][2] = datos.getString("apellidos");
                data[i][3] = datos.getString("telefono");
                data[i][4] = datos.getString("correo");
                i++;

            }
        } catch (SQLException ex) { 
            Logger.getLogger(ControlPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    public Object[][] consultarPersonaNombre(String nombre) {
        Object data[][] = new Object[contarPersonas()][5];
        ResultSet res = null;
                
        String sql = "select * from persona where nombres ='" + nombre + "'";
        res=p.ejecutarConsulta(sql);
        int i = 0;
        try {
            while (res.next()) {
                data[i][0] = res.getString("cedula");
                data[i][1] = res.getString("nombres");
                data[i][2] = res.getString("apellidos");
                data[i][3] = res.getString("telefono");
                data[i][4] = res.getString("correo");
                
                
                i++;
            }
        } catch (SQLException ex) { 
            Logger.getLogger(ControlPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
    
    public Object[][] consultarPersona(String cedula) {
        Object data[][] = new Object[contarPersonas()][5];
        ResultSet datos = null;
        String sql = "Select * from persona "
                + "where cedula =" + "'" + cedula + "' ";
        datos = p.ejecutarConsulta(sql);

        try {
            while (datos.next()) {
                data[0][0] = datos.getString("cedula");
                data[0][1] = datos.getString("nombres");
                data[0][2] = datos.getString("apellidos");
                data[0][3] = datos.getString("telefono");
                data[0][4] = datos.getString("correo");
               

            }
        } catch (SQLException ex) { 
            Logger.getLogger(ControlPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
    
    public static void main(String[] args) {

        ControlPersona cd = new ControlPersona();
//     boolean ejecuto = cd.insertarPersona("556","FER","GOM","311","saWQW213sa");

//       boolean ejecuto = cd.actualizarPersona("002","p2","a2","1232","actualizado");
 //       boolean ejecuto = cd.eliminarPersona("123");

//        if (ejecuto) {
//            System.out.println("Ejecutado correctamente");
//        }
        
        //LISTAR PERSONAS
        Object data[][] = new Object[cd.contarPersonas()][5];
        data = cd.consultarPersona();
        System.out.println("registros: "+ cd.contarPersonas());
        for (int i = 0; i < cd.contarPersonas(); i++) {
            System.out.println("CEDULA: " + data[i][0].toString() 
                             + " NOMBRES: " + data[i][1].toString()
                             + " APELLIDOS: " + data[i][2].toString()
                             + " TELEFONO : " + data[i][3].toString()
                             + " CORREO : " + data[i][4].toString());
        }
        
        
        //CONSULTAR PERSONAS POR CEDULA
        
        data = cd.consultarPersona("777");
        System.out.println("CEDULA : " + data[0][0] 
                        + "  NOMBRES: " + data[0][1]
                        + "   APELLIDOS: " + data[0][2]
                        + "   TELEFONO: " + data[0][3]
                        + "   CORREO: " + data[0][4]);
        
        //CONSULTAR PERSONAS POR NOMBRE
        
        String nombre ="FER";
        data = cd.consultarPersonaNombre(nombre);
        
        for (int i = 0; i < cd.contarPersonasxNombre(nombre); i++){
        System.out.println("CEDULA : " + data[i][0] 
                        + "  NOMBRES: " + data[i][1]
                        + "   APELLIDOS: " + data[i][2]
                        + "   TELEFONO: " + data[i][3]
                        + "   CORREO: " + data[i][3]);
        
        
        }
        
        
        

    }

}

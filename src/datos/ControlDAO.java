package datos;

import controlador.*;
import java.util.ArrayList;
import java.sql.*;

public class ControlDAO {


    public ArrayList<Usuario> seleccionarUsuarios() { // permite extraer la información de todos lo usuarios de la base de datos en un array list
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Usuario usuario = null;
        ArrayList<Usuario> usuarios = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareCall("CALL sp_select_tblusuario");
            rs = ps.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String cedula = rs.getString("cedula");
                String direccion = rs.getString("direccion");
                String userName = rs.getString("usuario");
                String password = rs.getString("password");
                String fechaIngreso = rs.getString("fechaingreso");

                usuario = new Usuario(nombre, apellido, cedula, direccion, userName, password, fechaIngreso);
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            System.out.println("Error= " + ex.getMessage());
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(conn);
        }
        return usuarios;
    }

    public ArrayList<Empleado> seleccionarEmpleados() {// permite extraer la información de todos lo usuarios de la base de datos en un array list
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Empleado empleado = null;
        ArrayList<Empleado> empleados = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareCall("CALL sp_select_empleado");
            rs = ps.executeQuery();
            while (rs.next()) {

                String cedula = rs.getString("cedula");
                String primerNombre = rs.getString("nombre1");
                String segundoNombre = rs.getString("nombre2");
                String primerApellido = rs.getString("apellido1");
                String segundoApellido = rs.getString("apellido2");
                String fechaNacimiento = rs.getString("fechanacimiento");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");

                empleado = new Empleado(cedula, primerNombre, segundoNombre, primerApellido,
                        segundoApellido, fechaNacimiento, direccion, telefono);
                empleados.add(empleado);
            }
        } catch (SQLException ex) {
            System.out.println("Error= " + ex.getMessage());
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(conn);
        }
        return empleados;
    }
    
    public Empleado seleccionarEmpleadoID(String cedulaP) {// permite extraer la información de todos lo usuarios de la base de datos en un array list
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Empleado empleado = null;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareCall("CALL sp_select_empleado_por_id(\'"+cedulaP+"\')");
            rs = ps.executeQuery();
            while (rs.next()) {
                String cedula = rs.getString("cedula");
                String primerNombre = rs.getString("nombre1");
                String segundoNombre = rs.getString("nombre2");
                String primerApellido = rs.getString("apellido1");
                String segundoApellido = rs.getString("apellido2");
                String fechaNacimiento = rs.getString("fechanacimiento");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");

                empleado = new Empleado(cedula, primerNombre, segundoNombre, primerApellido,
                        segundoApellido, fechaNacimiento, direccion, telefono);
                
            }
        } catch (SQLException ex) {
            System.out.println("Error= " + ex.getMessage());
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(conn);
        }
        return empleado;
    }

    public String insertarUsuario(Usuario usuario) {//Permite insertar un nuevo usuario dentro de la base de datos, para esto se debe 
                                                  //ingresar como parametro del tipo de objeto que estas usando
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String mensaje="";
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareCall("CALL sp_insert_usuarios(?, ?,?, ?, ?,?,?)");
            ps.setString(1, usuario.getCedula());
            ps.setString(2, usuario.getUsuario());
            ps.setString(3, usuario.getPassword());
            ps.setString(4, usuario.getNombre());
            ps.setString(5, usuario.getApellido());
            ps.setString(6, usuario.getDireccion());
            ps.setString(7, usuario.getFechaIngreso());
            rs = ps.executeQuery();
            if (rs.next()) {
                mensaje = rs.getString("cedula");
            }
        } catch (SQLException ex) {
            System.out.println("ex = " + ex);
            mensaje = "error";
        } finally {
            Conexion.close(ps);
            Conexion.close(conn);
        }
        return mensaje;
    }

    public String insertarEmpleado(Empleado empleado) {//Permite insertar un empleado usuario dentro de la base de datos, para esto se debe 
                                                  //ingresar como parametro del tipo de objeto que estas usando
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String mensaje = "";
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareCall("CALL sp_insert_empleado(?,?,?,?,?,?,?,?)");
            ps.setString(1, empleado.getCedula());
            ps.setString(2, empleado.getPrimerNombre());
            ps.setString(3, empleado.getSegundoNombre());
            ps.setString(4, empleado.getPrimerApellido());
            ps.setString(5, empleado.getSegundoApellido());
            ps.setString(6, empleado.getFecha_nacimiento());
            ps.setString(7, empleado.getDireccion());
            ps.setString(8, empleado.getTelefono());
            rs = ps.executeQuery();
            if (rs.next()) {
                mensaje = rs.getString("cedula");
            }
        } catch (SQLException ex) {
            System.out.println("ex = " + ex);
            mensaje = "error";
        } finally {
            Conexion.close(ps);
            Conexion.close(conn);
        }
        return mensaje;
    }

    public void insertarPlanillaDetalle(Planilla planillaD) {//Permite insertar un nuevo usuario dentro de la base de datos, para esto se debe 
                                                  //ingresar como parametro del tipo de objeto que estas usando
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs;
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareCall("CALL sp_insert_detalle_planilla(?,?,?,?,?,?,?,?)");
            ps.setString(1, String.valueOf(planillaD.getId_planilla()));
            ps.setString(2, planillaD.getCedula());
            ps.setString(3, String.valueOf(planillaD.getHoratrabjada()));
            ps.setString(4, String.valueOf(planillaD.getSphora()));
            ps.setString(5, String.valueOf(planillaD.getSbruto()));
            ps.setString(6, String.valueOf(planillaD.getSegsocial()));
            ps.setString(7, String.valueOf(planillaD.getSegeducativo()));
            ps.setString(8, String.valueOf(planillaD.getSNETO()));
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            System.out.println("ex = " + ex);
        } finally {
            Conexion.close(ps);
            Conexion.close(conn);
        }
    }

    public void insertarPlanilla(String planilla) {//Permite agregar más planilla solo es necesario pasar un parametro para la fecha
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs;
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareCall("CALL sp_insert_planilla(?)");
            ps.setString(1, planilla);
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            System.out.println("ex = " + ex);
        } finally {
            Conexion.close(ps);
            Conexion.close(conn);
        }
    }

    public String actualizarEmpleado(Empleado empleado) {//Permite actualizar la informacion dentro de la base de datos, para esto se debe 
                                                  //ingresar como parametro del tipo de objeto que estas usando
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs;
        String mensaje = "";
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareCall("CALL sp_update_empleado(?,?,?,?,?,?,?,?)");
            ps.setString(1, empleado.getCedula());
            ps.setString(2, empleado.getPrimerNombre());
            ps.setString(3, empleado.getSegundoNombre());
            ps.setString(4, empleado.getPrimerApellido());
            ps.setString(5, empleado.getSegundoApellido());
            ps.setString(6, empleado.getFecha_nacimiento());
            ps.setString(7, empleado.getDireccion());
            ps.setString(8, empleado.getTelefono());
            rs = ps.executeQuery();
            if (rs.next()) {
                mensaje = rs.getString("cedula");
            }
        } catch (SQLException ex) {
            System.out.println("ex = " + ex);
            mensaje = "error";
        } finally {
            Conexion.close(ps);
            Conexion.close(conn);
        }
        return mensaje;
    }
}

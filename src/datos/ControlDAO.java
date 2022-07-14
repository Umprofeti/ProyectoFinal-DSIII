package datos;

import controlador.*;
import java.util.ArrayList;
import java.sql.*;

public class ControlDAO {

    public ArrayList<Usuario> seleccionarUsuarios() {
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

    public ArrayList<Empleado> seleccionarEmpleados() {
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

    public int selectMaxPlanilla() {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int empleadosPlanilla = 0;

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareCall("CALL sp_select_MAX_planilla");
            rs = ps.executeQuery();
            if (rs.next()) {
                empleadosPlanilla = rs.getInt("MAX(id_planilla)");
            }
        } catch (SQLException ex) {
            System.out.println("Error= " + ex.getMessage());
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(conn);
        }
        return empleadosPlanilla;
    }

    public ArrayList<String> Planilla() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Empleado empleado = null;
        ArrayList<String> planilla = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareCall("CALL sp_select_planilla");
            rs = ps.executeQuery();
            while (rs.next()) {

                String idPlanilla = String.valueOf(rs.getString("id_planilla"));
                String fecha = rs.getString("fecha");

                planilla.add(idPlanilla);
            }
        } catch (SQLException ex) {
            System.out.println("Error= " + ex.getMessage());
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(conn);
        }
        return planilla;
    }

    public ArrayList<Planilla> SelectCalculoPlanilla(int numero) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Planilla planillas = null;
        ArrayList<Planilla> planilla = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareCall("CALL sp_select_planilla_por_id(" + numero + ")");
            rs = ps.executeQuery();
            while (rs.next()) {

                int idPlanilla = rs.getInt("id_planilla");
                String fecha = rs.getString("fecha");
                String cedula = rs.getString("cedula");
                String nombre1 = rs.getString("nombre1");
                String nombre2 = rs.getString("nombre2");
                String apellido1 = rs.getString("apellido1");
                String apellido2 = rs.getString("apellido2");
                int ht = rs.getInt("horas_trabajadas");
                double sph = rs.getDouble("sph");
                double sb = rs.getDouble("sb");
                double ss = rs.getDouble("ss");
                double se = rs.getDouble("se");
                double sn = rs.getDouble("sn");
                planillas = new Planilla(idPlanilla, fecha, cedula, nombre1, nombre2, apellido1, apellido2, ht, sph, sb, ss, se, sn);
                planilla.add(planillas);
            }
        } catch (SQLException ex) {
            System.out.println("Error= " + ex.getMessage());
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(conn);
        }
        return planilla;
    }

    public void insertarUsuario(Usuario usuario) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
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
                System.out.println("El id de usuario nuevo es " + rs.getString("cedula"));
            }
        } catch (SQLException ex) {
            System.out.println("ex = " + ex);
        } finally {
            Conexion.close(ps);
            Conexion.close(conn);
        }
    }

    public void insertarEmpleado(Empleado empleado) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
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
                System.out.println("El id de usuario nuevo es " + rs.getString("cedula"));
            }
        } catch (SQLException ex) {
            System.out.println("ex = " + ex);
        } finally {
            Conexion.close(ps);
            Conexion.close(conn);
        }
    }

    public String insertarPlanillaDetalle(Planilla planillaD) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs;
        String mensaje = "";
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareCall("CALL sp_insert_detalle_planilla(?,?,?,?,?,?,?,?)");
            ps.setString(1, String.valueOf(planillaD.getIdplanilla()));
            ps.setString(2, planillaD.getCedula());
            ps.setString(3, String.valueOf(planillaD.getHoratrabjada()));
            ps.setString(4, String.valueOf(planillaD.getSphora()));
            ps.setString(5, String.valueOf(planillaD.getSbruto()));
            ps.setString(6, String.valueOf("9.75"));
            ps.setString(7, String.valueOf("1.25"));
            ps.setString(8, String.valueOf(planillaD.getSNETO()));
            rs = ps.executeQuery();
            if (rs.next()) {
                mensaje = rs.getString("cedula_empleado");
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

    public String insertarPlanilla(String planilla) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs;
        String mensaje = "";
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareCall("CALL sp_insert_planilla(?)");
            ps.setString(1, planilla);
            rs = ps.executeQuery();
            if (rs.next()) {
                mensaje = String.valueOf(rs.getInt("ultimo_id"));
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

    public void actualizarEmpleado(Empleado empleado) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs;
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
        } catch (SQLException ex) {
            System.out.println("ex = " + ex);
        } finally {
            Conexion.close(ps);
            Conexion.close(conn);
        }
    }

    public ArrayList<Planilla> seleccionarPlanillaTotales() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Planilla planilla = null;
        ArrayList<Planilla> planillaTotal = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            ps = conn.prepareCall("CALL sp_select_totales_planilla");
            rs = ps.executeQuery();
            while (rs.next()) {

                int idPlanilla = rs.getInt("id_planilla");
                String fecha = rs.getString("fecha");
                double totalsb = rs.getDouble("total_sb");
                double totalss = rs.getDouble("total_ss");
                double totalse = rs.getDouble("total_se");
                double totalsn = rs.getDouble("total_sn");

                planilla = new Planilla(idPlanilla, fecha, totalsb, totalss, totalse, totalsn);
                planillaTotal.add(planilla);
            }
        } catch (SQLException ex) {
            System.out.println("Error= " + ex.getMessage());
        } finally {
            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(conn);
        }
        return planillaTotal;
    }

     public boolean verificarDatosLogin(String user, String Password){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs;
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareCall("CALL sp_select_validar_usuario(?,?)");
            ps.setString(1, user);
            ps.setString(2, Password);
            rs = ps.executeQuery();
            while(rs.next()){
                if(rs.getString("numero").equals("1")){
                    return true;
                }else {
                    return false;
                }
            }
        } catch (SQLException ex) {
            System.out.println("ex = " + ex);
        } finally {
            Conexion.close(ps);
            Conexion.close(conn);
        }
        return false;
    }
}

package controlador;

import java.util.Base64;

public class Usuario {
    private String nombre;
    private String apellido;
    private String cedula;
    private String direccion;
    private String usuario;
    private String password;
    private String fechaIngreso;
    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String cedula, 
            String direccion, String usuario, String password, String fechaIngreso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.usuario = usuario;
        this.password = password;
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
    public String getEncodedPassword(String password) {
        String pass = Base64.getEncoder().encodeToString(password.getBytes());
        return pass;
    }
    
    public void createUserAdmin(){
        Usuario usr = new Usuario();
        datos.ControlDAO control = new datos.ControlDAO();
        
        usr.setCedula("0-000-0000");
        usr.setUsuario("admin");
        usr.setPassword("123456");
        usr.setNombre("-----");
        usr.setApellido("-------");
        usr.setDireccion("------");
        usr.setFechaIngreso("2022-07-11");
        
        control.insertarUsuario(usr);
    }
}

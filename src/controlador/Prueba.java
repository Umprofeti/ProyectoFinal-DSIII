package controlador;

import datos.ControlDAO;
import java.util.ArrayList;

public class Prueba {

    public static void main(String[] args) {
        ControlDAO control = new ControlDAO();
//        Empleado empleado = new Empleado();
//        empleado.setCedula("8-734-2161");
//        empleado.setPrimerNombre("Eric");
//        empleado.setSegundoNombre("Alfnos");
//        empleado.setPrimerApellido("Soto");
//        empleado.setSegundoApellido("Tenorio");
//        empleado.setFecha_nacimiento("2002-02-01");
//        empleado.setDireccion("Bique");
//        empleado.setTelefono("12132424");
//        control.insertarEmpleado(empleado);
           
            Usuario usuarios = new Usuario();
            usuarios.setCedula("2-532");
            usuarios.setUsuario("SSSSSS");
            usuarios.setPassword("1213231");
            usuarios.setNombre("Erick");
            usuarios.setApellido("perez");
            usuarios.setDireccion("Paaaaa");
            usuarios.setFechaIngreso("2022-11-21");
            control.insertarUsuario(usuarios);
    }
}

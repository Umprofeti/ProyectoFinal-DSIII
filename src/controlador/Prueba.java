package controlador;

import datos.ControlDAO;

public class Prueba {

    public static void main(String[] args) {
        datos.ControlDAO control = new datos.ControlDAO();
        controlador.Usuario userAdminRegister = new controlador.Usuario();
        
        userAdminRegister.createUserAdmin();
        vista.frmLoggin frm = new vista.frmLoggin();
        frm.setTitle("Inicio de sesión");
        frm.setVisible(true);
            
           
    }
}

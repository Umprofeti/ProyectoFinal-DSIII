package controlador;

import datos.ControlDAO;
import java.util.ArrayList;

public class Prueba {

    public static void main(String[] args) {
        ControlDAO control = new ControlDAO();
        controlador.Usuario usr = new controlador.Usuario();
        
        try{
            if(!control.verificarAdmin()){
                usr.createUserAdmin();
            }
            
        }catch(Exception e){
            
        }
        
        vista.frmLoggin obj_p=new vista.frmLoggin();
        obj_p.setVisible(true);
 
    }
}

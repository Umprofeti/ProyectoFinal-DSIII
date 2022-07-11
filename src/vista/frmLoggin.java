/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package vista;
import javax.swing.JOptionPane;
/**
 *
 * @author Rasheth Javier -_-
 */
public class frmLoggin extends javax.swing.JFrame {

    /** Creates new form log */
    public frmLoggin() {
        initComponents();
    }
    
   

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        nomempresa_fondo = new javax.swing.JLabel();
        logofondo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        nom_empresalogo = new javax.swing.JLabel();
        iniciodesesionlabl = new javax.swing.JLabel();
        usuariolabl = new javax.swing.JLabel();
        nomusuariotxtf = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        usuariolabl1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        tfUserPass = new javax.swing.JPasswordField();
        salirbtn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ingresarbtn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nomempresa_fondo.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        nomempresa_fondo.setText("SAFE CIBERSECURITY");
        background.add(nomempresa_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 210, -1));

        logofondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/logo_2.png"))); // NOI18N
        logofondo.setText("jLabel1");
        background.add(logofondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 140, 140));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/city.png"))); // NOI18N
        fondo.setText("jLabel2");
        background.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 250, 500));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/favicon.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 70, 50));

        nom_empresalogo.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        nom_empresalogo.setText("SAFE CIBERSECURITY");
        background.add(nom_empresalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        iniciodesesionlabl.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        iniciodesesionlabl.setText("INICIO DE SESIÓN");
        background.add(iniciodesesionlabl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        usuariolabl.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        usuariolabl.setText("USUARIO");
        background.add(usuariolabl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        nomusuariotxtf.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        nomusuariotxtf.setForeground(new java.awt.Color(204, 204, 204));
        nomusuariotxtf.setToolTipText("");
        nomusuariotxtf.setBorder(null);
        nomusuariotxtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomusuariotxtfActionPerformed(evt);
            }
        });
        background.add(nomusuariotxtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 330, -1));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 232, 330, 10));

        usuariolabl1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        usuariolabl1.setText("CONTRASEÑA");
        background.add(usuariolabl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 330, 10));

        tfUserPass.setToolTipText("");
        tfUserPass.setBorder(null);
        background.add(tfUserPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 330, -1));

        salirbtn.setBackground(new java.awt.Color(0, 134, 190));
        salirbtn.setForeground(new java.awt.Color(0, 134, 190));
        salirbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salirbtnMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SALIR");

        javax.swing.GroupLayout salirbtnLayout = new javax.swing.GroupLayout(salirbtn);
        salirbtn.setLayout(salirbtnLayout);
        salirbtnLayout.setHorizontalGroup(
            salirbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salirbtnLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        salirbtnLayout.setVerticalGroup(
            salirbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salirbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        background.add(salirbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 130, 40));

        ingresarbtn.setBackground(new java.awt.Color(0, 134, 190));
        ingresarbtn.setForeground(new java.awt.Color(0, 134, 190));
        ingresarbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingresarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ingresarbtnMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INGRESAR");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout ingresarbtnLayout = new javax.swing.GroupLayout(ingresarbtn);
        ingresarbtn.setLayout(ingresarbtnLayout);
        ingresarbtnLayout.setHorizontalGroup(
            ingresarbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        ingresarbtnLayout.setVerticalGroup(
            ingresarbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        background.add(ingresarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomusuariotxtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomusuariotxtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomusuariotxtfActionPerformed

    private void salirbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirbtnMousePressed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_salirbtnMousePressed

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseReleased

    private void ingresarbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarbtnMousePressed
//Codigo aquí        
    }//GEN-LAST:event_ingresarbtnMousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        datos.ControlDAO control = new datos.ControlDAO();
            controlador.Login lg = new controlador.Login();
            controlador.Usuario usrEncondedPass = new controlador.Usuario();
            lg.setUserID(nomusuariotxtf.getText().trim());
            lg.setPassword(usrEncondedPass.getEncodedPassword(new String(tfUserPass.getPassword())));
            
           if(control.verificarDatosLogin(lg.getUserID(), lg.getPassword())){
                frmLobby lobby = new frmLobby(nomusuariotxtf.getText().trim());
                lobby.setVisible(true);
                lobby.setTitle("Panel principal");
                setVisible(false);
           }else{
               JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto");
           } 
            
//        if(main.Proyecto01.usrLogin.findUserID(nomusuariotxtf.getText())){
//            if(main.Proyecto01.usrLogin.isUserRoot(nomusuariotxtf.getText())){
//               
//                if(main.Proyecto01.usrLogin.isValidPassword(nomusuariotxtf.getText(), new String(tfUserPass.getPassword()))){
//                    
//                }
//            }else{
//                if(main.Proyecto01.usrLogin.isValidPassword(nomusuariotxtf.getText(), new String(tfUserPass.getPassword()))){
//                    frmLobby lobby = new frmLobby(nomusuariotxtf.getText().trim());
//                    lobby.setVisible(true);
//                    lobby.setTitle("Panel principal");
//                    setVisible(false);
//                }
//            }
//        }
    }//GEN-LAST:event_jLabel2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmLoggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLoggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLoggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLoggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLoggin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel ingresarbtn;
    private javax.swing.JLabel iniciodesesionlabl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logofondo;
    private javax.swing.JLabel nom_empresalogo;
    private javax.swing.JLabel nomempresa_fondo;
    private javax.swing.JTextField nomusuariotxtf;
    private javax.swing.JPanel salirbtn;
    private javax.swing.JPasswordField tfUserPass;
    private javax.swing.JLabel usuariolabl;
    private javax.swing.JLabel usuariolabl1;
    // End of variables declaration//GEN-END:variables

}

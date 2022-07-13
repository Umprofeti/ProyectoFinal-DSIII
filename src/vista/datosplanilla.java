/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;
 
import datos.ControlDAO;
import java.util.Calendar;

/**
 *
 * @author Yonathan
 */
public class datosplanilla extends javax.swing.JFrame {

    /**
     * Creates new form datosplanilla
     */
    public datosplanilla() {
        initComponents();
          this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jadicionempleado = new javax.swing.JButton();
        año = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jdt = new com.toedter.calendar.JDateChooser();
        btnregresa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de la Planilla", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Seleccione la Fecha");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Crear Planilla");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 150, 50));

        jadicionempleado.setBackground(new java.awt.Color(255, 255, 255));
        jadicionempleado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jadicionempleado.setForeground(new java.awt.Color(0, 0, 0));
        jadicionempleado.setText("Adicionar Empleados");
        jadicionempleado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jadicionempleado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jadicionempleado.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jadicionempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jadicionempleadoActionPerformed(evt);
            }
        });
        jPanel1.add(jadicionempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 150, 50));

        año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añoActionPerformed(evt);
            }
        });
        jPanel1.add(año, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 60, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        jdt.setBackground(new java.awt.Color(51, 255, 255));
        jdt.setForeground(new java.awt.Color(255, 255, 255));
        jdt.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jdtAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.add(jdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 100, 30));

        btnregresa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnregresa.setText("Regresar >>");
        btnregresa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnregresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresaActionPerformed(evt);
            }
        });
        jPanel1.add(btnregresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 20, 410, 290));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/city_1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 230, 330));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/city_1.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jadicionempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jadicionempleadoActionPerformed
        // TODO add your handling code here:
        agregarempleado obj_agregar = new  agregarempleado();
        obj_agregar.setVisible(true);
    }//GEN-LAST:event_jadicionempleadoActionPerformed

    private void añoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añoActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_añoActionPerformed

    private void btnregresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresaActionPerformed
        // TODO add your handling code here:
        Planillaprincipal obj_datos = new Planillaprincipal();
        obj_datos.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnregresaActionPerformed

    private void jdtAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jdtAncestorAdded
        // TODO add your handling code here:
        
/*        
String dia = Integer.toString(jdt.getCalendar().get(Calendar.DAY_OF_MONTH));
String mes = Integer.toString(jdt.getCalendar().get(Calendar.MONTH) + 1);
String year = Integer.toString(jdt.getCalendar().get(Calendar.YEAR));
String fecha = (year + "-" + mes+ "-" + dia);
//txtfecha.setText(fecha)
    */    
    }//GEN-LAST:event_jdtAncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
String dia = Integer.toString(jdt.getCalendar().get(Calendar.DAY_OF_MONTH));
String mes = Integer.toString(jdt.getCalendar().get(Calendar.MONTH) + 1);
String year = Integer.toString(jdt.getCalendar().get(Calendar.YEAR));
String fecha = (year + "-" + mes+ "-" + dia);
        
           ControlDAO obj_control=new   ControlDAO();
           
           obj_control.insertarPlanilla(fecha);
           
           
    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(datosplanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datosplanilla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> año;
    private javax.swing.JButton btnregresa;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jadicionempleado;
    private com.toedter.calendar.JDateChooser jdt;
    // End of variables declaration//GEN-END:variables
}
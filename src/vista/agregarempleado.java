/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.Planilla;
import controlador.*;
import datos.ControlDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Yonathan
 */
public class agregarempleado extends javax.swing.JFrame {

    /**
     * Creates new form agregarempleado
     */
    ControlDAO control;

    public agregarempleado() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.MaxPlanilla();
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
        cedulaPlanilla = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JTextField();
        nombre2 = new javax.swing.JTextField();
        apellido1 = new javax.swing.JTextField();
        apellido2 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        horaTrabajadas = new javax.swing.JTextField();
        horasalario = new javax.swing.JTextField();
        btnregresa = new javax.swing.JButton();
        btnagrega = new javax.swing.JButton();
        labelNumPlanilla = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda"));
        jPanel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Cédula");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 33, -1, -1));
        jPanel1.add(cedulaPlanilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 31, 170, -1));

        btnbuscar.setBackground(java.awt.SystemColor.textHighlight);
        btnbuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnbuscar.setText("Búscar");
        btnbuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 29, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 301, 70));

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Empleado"));
        jPanel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Primer Nombre");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 31, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Segundo Nombre");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 62, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Primer Apellido");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 93, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Segundo Apellido");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 118, -1, -1));

        nombre1.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        nombre1.setEnabled(false);
        jPanel3.add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 29, 159, -1));

        nombre2.setEnabled(false);
        jPanel3.add(nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 60, 161, -1));

        apellido1.setEnabled(false);
        jPanel3.add(apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 91, 161, -1));

        apellido2.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        apellido2.setEnabled(false);
        apellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellido2ActionPerformed(evt);
            }
        });
        jPanel3.add(apellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 116, 161, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 300, 150));

        jPanel4.setBackground(new java.awt.Color(102, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Salario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Horas Trabajadas");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 30, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Salario por Hora");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 61, -1, -1));

        horaTrabajadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaTrabajadasActionPerformed(evt);
            }
        });
        jPanel4.add(horaTrabajadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 28, 154, -1));
        jPanel4.add(horasalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 59, 154, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 300, 90));

        btnregresa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnregresa.setText("Regresar >>");
        btnregresa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnregresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresaActionPerformed(evt);
            }
        });
        getContentPane().add(btnregresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 90, 30));

        btnagrega.setBackground(java.awt.Color.green);
        btnagrega.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnagrega.setText(" + Agregar");
        btnagrega.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnagrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregaActionPerformed(evt);
            }
        });
        getContentPane().add(btnagrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 80, 30));

        labelNumPlanilla.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelNumPlanilla.setText("XXX");
        getContentPane().add(labelNumPlanilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 70, 40));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        jLabel10.setText("PLANILLA NÚMERO:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/city.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 300, 470));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/city.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 230, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnagregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregaActionPerformed
        // TODO add your handling code here:
        boolean guardar = true;
        ArrayList<Planilla> verificarP = new ArrayList<>();
        verificarP = control.SelectCalculoPlanilla(Integer.parseInt(labelNumPlanilla.getText()));
        for (int i = 0; i < verificarP.size(); i++) {
            if(verificarP.get(i).getCedula().equals(cedulaPlanilla.getText())){
            guardar = false;
        }
        }
        if(guardar){
        if (!labelNumPlanilla.equals("0")) {
            if (!cedulaPlanilla.getText().isEmpty() && !horaTrabajadas.getText().isEmpty() && !horasalario.getText().isEmpty()) {
                //Aquí va el código que almacenará la información

                Planilla planilla = new Planilla();
                planilla.setHoratrabjada(Integer.parseInt(horaTrabajadas.getText()));
                planilla.setSphora(Double.parseDouble(horasalario.getText()));
                if (planilla.validarhorastr() && planilla.validarsalario()) {

                    planilla.setIdplanilla(Integer.parseInt(labelNumPlanilla.getText()));
                    planilla.setCedula(String.valueOf(cedulaPlanilla.getText()));
                    planilla.Salirobruto();

                    String mensaje = control.insertarPlanillaDetalle(planilla);
                    if (!mensaje.equals("")) {
                        JOptionPane.showMessageDialog(null, "Se agrego el empleado de la cedula " + mensaje + " a la planilla\ncorrectamente");
                        cedulaPlanilla.setText("");
                        nombre1.setText("");
                        nombre2.setText("");
                        apellido1.setText("");
                        apellido2.setText("");
                        horaTrabajadas.setText("");
                        horasalario.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error, verifique los datos introducidos.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El empleado no cumple con los requisitos.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Hay campos vacíos.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha podido ingresar el empleado debido a que no se ha creado una\nplanilla");
        }
        }else{
        JOptionPane.showMessageDialog(null, "Este empleado ya fue agregado a esta planilla.");}
    }//GEN-LAST:event_btnagregaActionPerformed

    private void btnregresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresaActionPerformed
        // TODO add your handling code here:
        vista.datosplanilla jrm = new vista.datosplanilla();
        jrm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnregresaActionPerformed

    private void horaTrabajadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaTrabajadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaTrabajadasActionPerformed

    private void apellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellido2ActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        ControlDAO obj_control = new ControlDAO();
        ArrayList<Empleado> empleado = new ArrayList<>();
        empleado = obj_control.seleccionarEmpleados();
        Empleado obj_empleado = new Empleado();

        if (!cedulaPlanilla.getText().equals("")) {
            if (obj_empleado.buscarempleado(cedulaPlanilla.getText())) {
                for (int i = 0; i < empleado.size(); i++) {
                    if (empleado.get(i).getCedula().equals(cedulaPlanilla.getText())) {
                        nombre1.setText(empleado.get(i).getPrimerNombre());
                        nombre2.setText(empleado.get(i).getSegundoNombre());
                        apellido1.setText(empleado.get(i).getPrimerApellido());
                        apellido2.setText(empleado.get(i).getSegundoApellido());
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existe el empleado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El campo cédula esta vacío.");
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void MaxPlanilla() {
        control = new ControlDAO();
        int planillaE = control.selectMaxPlanilla();
        labelNumPlanilla.setText(String.valueOf(planillaE));
    }

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
            java.util.logging.Logger.getLogger(agregarempleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregarempleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregarempleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregarempleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregarempleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido1;
    private javax.swing.JTextField apellido2;
    private javax.swing.JButton btnagrega;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnregresa;
    private javax.swing.JTextField cedulaPlanilla;
    private javax.swing.JTextField horaTrabajadas;
    private javax.swing.JTextField horasalario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelNumPlanilla;
    private javax.swing.JTextField nombre1;
    private javax.swing.JTextField nombre2;
    // End of variables declaration//GEN-END:variables
}

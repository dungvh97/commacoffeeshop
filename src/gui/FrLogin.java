/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entities.*;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import model.*;
/**
 *
 * @author Administrator
 */
public class FrLogin extends javax.swing.JFrame {

    /**
     * Creates new form FrLogin
     */
    public FrLogin() {
        initComponents();
        
        this.setLocationRelativeTo(this);
        
        this.setFrameIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblogin = new javax.swing.JLabel();
        lbUsername = new javax.swing.JLabel();
        lbPass = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        btnSubmit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lbUsername_warn = new javax.swing.JLabel();
        lbPass_warn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("C-System");

        lblogin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblogin.setText("Login Form");

        lbUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbUsername.setText("Username:");

        lbPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbPass.setText("Password:");

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel1.setOpaque(false);

        btnSubmit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSubmit.setText("Login");
        btnSubmit.setSelected(true);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit);

        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel);

        lbUsername_warn.setForeground(new java.awt.Color(255, 0, 0));

        lbPass_warn.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(lblogin))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPass)
                            .addComponent(lbUsername))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbUsername_warn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUsername)
                            .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(lbPass_warn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblogin)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbUsername_warn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPass)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPass_warn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        this.lbUsername_warn.setText("");
        this.lbPass_warn.setText("");
        
        String username = this.txtUsername.getText().trim();
        String pass = new String(this.txtPass.getPassword());
        if(username.isEmpty() || username.length() > 50){
            this.lbUsername_warn.setText("Username is not match the pattern!");
            this.txtUsername.requestFocus();
            return;
        }
        
        if(pass.isEmpty() || pass.length() > 50){
            this.lbPass_warn.setText("Password is not match the pattern!");
            this.txtPass.requestFocus();
            return;
        }
        
        Admin ad = AdminDAO.check(username, pass);              // tiến hành đăng nhập cho admin trước nếu có
        if(ad != null)
        {
            JFrame jf = new FrAdminWorkspace(ad);
            jf.setVisible(true);
            jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
            this.dispose();
            return;
        }
        
        Employee emp = EmployeeDAO.check(username, pass);       // sau đó tiến hành đăng nhập cho nhân viên
        if(emp != null)
        {
            JFrame jf = new FrEmployeeWorkspace(emp);
            jf.setVisible(true);
            jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
            this.dispose();
            return;
        }
        
        JOptionPane.showConfirmDialog(null, "Login fail! Please check your Username and Password!", "LOGIN WARNING", JOptionPane.CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        this.txtUsername.requestFocus();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(FrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbPass_warn;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JLabel lbUsername_warn;
    private javax.swing.JLabel lblogin;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void setFrameIcon() {
        Image scaled = null;
        try{
            scaled = ImageIO.read(new File("src/image/login_icon.png")).getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        }catch(IOException io_ex){
            io_ex.printStackTrace();
        }
        this.setIconImage(scaled);
    }
}

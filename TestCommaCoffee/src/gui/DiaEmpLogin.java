/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entities.EmpSchedule;
import entities.Employee;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import model.EmployeeDAO;
import model.SalaryNoteDAO;

/**
 *
 * @author DELL
 */
public class DiaEmpLogin extends javax.swing.JDialog {

    /**
     * Creates new form DiaEmpLogin
     */
    public DiaEmpLogin(FrEmployeeWorkspace parent, boolean modal) {
        super(parent, modal);
        this.parent = parent;
        this.setLocationRelativeTo(this.parent);
        this.setLocation(500, 260);
        this.setModal(true);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnControl = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        pnInput = new javax.swing.JPanel();
        lbPass_warn = new javax.swing.JLabel();
        lbPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        lbUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lbUsername_warn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Employee Login");
        setBackground(new java.awt.Color(22, 23, 66));

        pnControl.setBackground(new java.awt.Color(0, 0, 0));
        pnControl.setLayout(new java.awt.GridLayout(1, 0));

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLoginKeyPressed(evt);
            }
        });
        pnControl.add(btnLogin);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        pnControl.add(btnCancel);

        getContentPane().add(pnControl, java.awt.BorderLayout.CENTER);

        pnInput.setBackground(new java.awt.Color(204, 204, 204));

        lbPass_warn.setForeground(new java.awt.Color(255, 0, 0));

        lbPass.setForeground(new java.awt.Color(0, 51, 102));
        lbPass.setText("Password");

        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        lbUsername.setForeground(new java.awt.Color(0, 51, 102));
        lbUsername.setText("Username:");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        lbUsername_warn.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout pnInputLayout = new javax.swing.GroupLayout(pnInput);
        pnInput.setLayout(pnInputLayout);
        pnInputLayout.setHorizontalGroup(
            pnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInputLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPass)
                    .addComponent(lbUsername))
                .addGap(41, 41, 41)
                .addGroup(pnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnInputLayout.createSequentialGroup()
                        .addComponent(lbPass_warn, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(56, Short.MAX_VALUE))
                    .addGroup(pnInputLayout.createSequentialGroup()
                        .addGroup(pnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbUsername_warn, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnInputLayout.setVerticalGroup(
            pnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInputLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbUsername_warn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(pnInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPass_warn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        getContentPane().add(pnInput, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
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
        
        Employee emp = EmployeeDAO.check(username, pass);
        if(emp != null)
        {
            for(Employee iter : this.parent.working_emp){
                if(iter.getEm_id().equals(emp.getEm_id())){
                    JOptionPane.showConfirmDialog(null, "This employee is already login!", "LOGIN WARNING", JOptionPane.CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                    this.txtUsername.requestFocus();
                    return;
                }
            }
            
            this.parent.working_emp.add(emp);                       // add new login employee with his/her schedule
            String salaryid = SalaryNoteDAO.insert(emp);
            if(salaryid == null){                        // tạo và lưu bảng lương trong tháng/năm cho nhân viên vào database
                // thất bại
                JOptionPane.showConfirmDialog(null, "Some problem cause! Can not create the new SalaryNote for Employee", "DATABASE WARNING", JOptionPane.CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                this.dispose();
                return;
            }else{
                // tạo mới thành công hoặc đã có sẵn
                EmpSchedule emschedule = new EmpSchedule();             // tạo lịch cho nv trong ngày hiện tại
                emschedule.setEm_id(emp.getEm_id());
                this.parent.setScheduleDate(emschedule);
                this.parent.setScheduleTime(emschedule, true);
                emschedule.setResult_salary(salaryid);
                this.parent.working_schedule.add(emschedule);
            }
            
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            this.dispose();
            return;
        }
        
        JOptionPane.showConfirmDialog(null, "Login fail! Please check your Username and Password!", "LOGIN WARNING", JOptionPane.CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        this.txtUsername.requestFocus();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
        this.txtPass.requestFocus();
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
        this.btnLogin.requestFocus();
    }//GEN-LAST:event_txtPassActionPerformed

    private void btnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLoginKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
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

            Employee emp = EmployeeDAO.check(username, pass);
            if(emp != null)
            {
                for(Employee iter : this.parent.working_emp){
                    if(iter.getEm_id().equals(emp.getEm_id())){
                        JOptionPane.showConfirmDialog(null, "This employee is already login!", "LOGIN WARNING", JOptionPane.CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                        this.txtUsername.requestFocus();
                        return;
                    }
                }

                this.parent.working_emp.add(emp);                       // add new login employee with his/her schedule
                String salaryid = SalaryNoteDAO.insert(emp);
                if(salaryid == null){                        // tạo và lưu bảng lương trong tháng/năm cho nhân viên vào database
                    // thất bại
                    JOptionPane.showConfirmDialog(null, "Some problem cause! Can not create the new SalaryNote for Employee", "DATABASE WARNING", JOptionPane.CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    this.dispose();
                    return;
                }else{
                    // tạo mới thành công hoặc đã có sẵn
                    EmpSchedule emschedule = new EmpSchedule();             // tạo lịch cho nv trong ngày hiện tại
                    emschedule.setEm_id(emp.getEm_id());
                    this.parent.setScheduleDate(emschedule);
                    this.parent.setScheduleTime(emschedule, true);
                    emschedule.setResult_salary(salaryid);
                    this.parent.working_schedule.add(emschedule);
                }

                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                this.dispose();
                return;
            }

            JOptionPane.showConfirmDialog(null, "Login fail! Please check your Username and Password!", "LOGIN WARNING", JOptionPane.CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
            this.txtUsername.requestFocus();
        }
    }//GEN-LAST:event_btnLoginKeyPressed

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
            java.util.logging.Logger.getLogger(DiaEmpLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiaEmpLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiaEmpLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiaEmpLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DiaEmpLogin dialog = new DiaEmpLogin(new FrEmployeeWorkspace(null), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbPass_warn;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JLabel lbUsername_warn;
    private javax.swing.JPanel pnControl;
    private javax.swing.JPanel pnInput;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    
    
//  CUSTOM DECLARATION
    FrEmployeeWorkspace parent;
//  END CUSTOM DECLARATION
}

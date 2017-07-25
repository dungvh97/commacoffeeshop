/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.employee;
import entities.EmpSchedule;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import model.EmpScheduleDAO;

/**
 *
 * @author DELL
 */
public class DiaEmpLogout extends javax.swing.JDialog {

    /**
     * Creates new form DiaEmpLogout
     */
    public DiaEmpLogout(FrEmployeeWorkspace parent, boolean modal) {
        super(parent, modal);
        this.parent = parent;
        this.setLocationRelativeTo(this.parent);
        this.setLocation(450, 200);
        this.setModal(true);
        
        initComponents();
        this.setLabelTextRoll_performed();
        
        this.initTableData();
        this.initTableModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMain = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEmployee = new javax.swing.JTable();
        pnControl = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        lbMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Employee Logout");

        pnMain.setBackground(new java.awt.Color(22, 23, 66));
        pnMain.setPreferredSize(new java.awt.Dimension(400, 300));
        pnMain.setLayout(new java.awt.BorderLayout());

        tbEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Work hour (h)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbEmployee);
        this.tbEmployee.setRowHeight(30);

        pnMain.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pnControl.setBackground(new java.awt.Color(0, 153, 153));
        pnControl.setLayout(new java.awt.GridLayout(1, 0));

        btnLogout.setBackground(new java.awt.Color(22, 23, 66));
        btnLogout.setForeground(new java.awt.Color(102, 102, 255));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        pnControl.add(btnLogout);

        btnClose.setBackground(new java.awt.Color(22, 23, 66));
        btnClose.setForeground(new java.awt.Color(102, 102, 255));
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        pnControl.add(btnClose);

        pnMain.add(pnControl, java.awt.BorderLayout.PAGE_START);

        lbMessage.setForeground(new java.awt.Color(0, 153, 153));
        lbMessage.setText("select the employee that you want to logout in the table and hit the logout button");
        lbMessage.setPreferredSize(new java.awt.Dimension(0, 20));
        pnMain.add(lbMessage, java.awt.BorderLayout.PAGE_END);
        this.str_labeltext = this.lbMessage.getText();

        getContentPane().add(pnMain, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        int[] slrows = this.tbEmployee.getSelectedRows();
        
        boolean ishave_workingtable = false;
        for(int iter : this.parent.tablestate_list){    // kiểm tra tất cả bàn xem có trạng thái bàn nào khác trống không?
            if(iter != 0)
                ishave_workingtable = true;
        }
        
        if(slrows.length >= this.parent.working_emp.size() && ishave_workingtable){
            int r = JOptionPane.showConfirmDialog(null, "There still have working table! Are you sure to logout?");
            if(r == JOptionPane.NO_OPTION){
                return;
            }else{
                this.parent.saveCurrentInfo(true);
            }
        }
        
        int decrease_index = 0;
        for(int index : slrows){
            this.parent.setScheduleTime(this.parent.working_schedule.get(index - decrease_index), false);        // lấy giờ kết thúc làm việc
            if(EmpScheduleDAO.insert(this.parent.working_schedule.get(index - decrease_index)) == 0){            // thêm schedule vào database
                // thêm thất bại
                JOptionPane.showConfirmDialog(null, "Some problem cause! Can not create the new SalaryNote for Employee", "DATABASE WARNING", JOptionPane.CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                this.dispose();
                return;
            }
            this.tbmodel.removeRow(index - decrease_index);                                                     // xoá khỏi bảng
            this.parent.working_emp.remove(index - decrease_index);                                              // xoá khỏi danh sách login
            this.parent.working_schedule.remove(index - decrease_index);
            ++decrease_index;
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

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
            java.util.logging.Logger.getLogger(DiaEmpLogout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiaEmpLogout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiaEmpLogout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiaEmpLogout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DiaEmpLogout dialog = new DiaEmpLogout(new FrEmployeeWorkspace(null), true);
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
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnLogout;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbMessage;
    private javax.swing.JPanel pnControl;
    private javax.swing.JPanel pnMain;
    private javax.swing.JTable tbEmployee;
    // End of variables declaration//GEN-END:variables


// CUSTOM DECLARATION
    FrEmployeeWorkspace parent;
// END CUSTOM DECLARATION


//  CUSTOM CODE
    ArrayList<Float> workhour_list = new ArrayList<>();
    private void initTableData(){
        Calendar calendar = Calendar.getInstance();
        int current_hours = calendar.get(Calendar.HOUR_OF_DAY);
        int current_minutes = calendar.get(Calendar.MINUTE);
        
        for(EmpSchedule iter : this.parent.working_schedule){
            int start_hours = iter.getStarthour();
            int start_minutes = iter.getStartminute();
            
            float workhour = new Float((current_hours - start_hours) + ((current_minutes - start_minutes)/60.0F));
            this.workhour_list.add(workhour);
        }
    }
    
    
    DefaultTableModel tbmodel;
    private void initTableModel(){
        this.tbmodel = (DefaultTableModel) this.tbEmployee.getModel();
        this.tbmodel.setRowCount(this.parent.working_emp.size());
        this.tbmodel.setColumnCount(2);
        
        for(int i = 0; i < this.parent.working_emp.size(); i++){
            this.tbmodel.setValueAt(this.parent.working_emp.get(i).getName(), i, 0);
            this.tbmodel.setValueAt(this.workhour_list.get(i), i, 1);
        }
    }
//  END CUSTOM CODE







/*
    *AUTHOR: Luu Duc Trung
    *WARNING:
        - Add setLabelTextRoll() method in JFrame constructor after create the GUI components
        - the JLabel size always smaller than the text size
        - You can modify the str_space's length, Timer delay if you need
        - JLabel lbShow is the components you want to roll the text
        - You must add code: get the text and assign to str_labeltext after lbShow.setText()
*/
private Timer tm;

// Method set timer and add actionlistener
private void setLabelTextRoll_performed() {
    this.tm = new Timer(100, new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            TimerActionPerformed(e);
        }
    });
    this.tm.start();
}


private String str_labeltext; // str_labeltext == this.lbShow.getText().trim()
private int ibegintext = 0;

private String str_space = "                                                                                                                                     ";
private int ibeginspace = 0;

boolean istextroll = true;
boolean isspaceroll = false;
// The Jlabel text roll action
private void TimerActionPerformed(ActionEvent e){
    
    if(((int)this.ibegintext) == this.str_labeltext.length()){
        this.ibegintext = 0;
        this.isspaceroll = true;
        this.istextroll = false;
    }
    if(((int)this.ibeginspace) == this.str_space.length()){
        this.ibeginspace = 0;
        istextroll = true;
        isspaceroll = false;
    }
    
    if(this.istextroll){
        String subtext = this.str_labeltext.substring((int) this.ibegintext);
        this.lbMessage.setText(subtext);
        this.ibegintext+=1;
    }else{
        if(this.isspaceroll){
            String subtext = this.str_space.substring((int) this.ibeginspace);
            this.lbMessage.setText(subtext+this.str_labeltext);
            this.ibeginspace+=1;
        }
    }
}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.admin;

import entities.EmpSchedule;
import entities.Employee;
import entities.SalaryNote;
import gui.employee.DiaEndofdayreport;
import gui.employee.FrShowReport;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import model.EmpScheduleDAO;
import model.SalaryNoteDAO;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author DELL
 */
public class DiaSalaryNoteReport extends javax.swing.JDialog {

    /**
     * Creates new form DiaSalaryNoteReport
     */
    public DiaSalaryNoteReport(FrAdminWorkspace parent, boolean modal) {
        super(parent, modal);
        this.parent = parent;
        this.setLocationRelativeTo(this.parent);
        this.setLocation(300, 150);
        this.setModal(true);
        
        initComponents();
        
        initDefaultConfig();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngStyle = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnGenerate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtDayReport = new javax.swing.JTextField();
        cbDayReport = new javax.swing.JCheckBox();
        txtMonthReport = new javax.swing.JTextField();
        cbMonthReport = new javax.swing.JCheckBox();
        txtYearReport = new javax.swing.JTextField();
        cbYearReport = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new java.awt.GridLayout());

        btnGenerate.setBackground(new java.awt.Color(0, 153, 0));
        btnGenerate.setText("Generate");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });
        jPanel2.add(btnGenerate);

        btnCancel.setBackground(new java.awt.Color(153, 153, 0));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancel);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Option", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 153, 0))); // NOI18N

        cbDayReport.setText("Day");
        cbDayReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDayReportActionPerformed(evt);
            }
        });

        cbMonthReport.setText("Month");
        cbMonthReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMonthReportActionPerformed(evt);
            }
        });

        cbYearReport.setText("Year");
        cbYearReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbYearReportActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Date report:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtYearReport, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbYearReport, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMonthReport, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMonthReport, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDayReport, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDayReport, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDayReport)
                    .addComponent(cbMonthReport)
                    .addComponent(cbYearReport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDayReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMonthReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYearReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Salary Report");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        // TODO add your handling code here:
        int day, month, year;
        try{
            try{
                day = Integer.parseInt(this.txtDayReport.getText());
            }catch(NumberFormatException ex){
                ex.getStackTrace();
                JOptionPane.showMessageDialog(null, "The day is not correct!", "INPUT WARNING", JOptionPane.WARNING_MESSAGE);
                this.txtDayReport.requestFocus();
                return;
            }
            
            try{
                month = Integer.parseInt(this.txtMonthReport.getText());
            }catch(NumberFormatException ex){
                ex.getStackTrace();
                JOptionPane.showMessageDialog(null, "The month is not correct!", "INPUT WARNING", JOptionPane.WARNING_MESSAGE);
                this.txtMonthReport.requestFocus();
                return;
            }
            
            try{
                year = Integer.parseInt(this.txtYearReport.getText());
            }catch(NumberFormatException ex){
                ex.getStackTrace();
                JOptionPane.showMessageDialog(null, "The year is not correct!", "INPUT WARNING", JOptionPane.WARNING_MESSAGE);
                this.txtYearReport.requestFocus();
                return;
            }
            
            this.dayreport = LocalDate.of(year, month, day);
        }catch(DateTimeException ex){
            ex.getStackTrace();
            JOptionPane.showMessageDialog(null, "The report date is not correct!", "INPUT WARNING", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        switch(this.reportMode){
            case 0:
                this.generateYearReport();
                break;
            case 1:
                this.generateMonthReport();
                break;
            case 2:
                this.generateDayReport();
                break;
        }
        
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnGenerateActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void cbYearReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbYearReportActionPerformed
        // TODO add your handling code here:
        if(this.cbYearReport.isSelected()){
            this.txtYearReport.setEditable(true);
            
            this.reportMode = YEARREPORT_MODE;
        }else{
            this.txtYearReport.setEditable(false);
            this.txtMonthReport.setEditable(false);
            this.txtDayReport.setEditable(false);
            
            this.cbDayReport.setSelected(false);
            this.cbMonthReport.setSelected(false);
        }
    }//GEN-LAST:event_cbYearReportActionPerformed

    private void cbMonthReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMonthReportActionPerformed
        // TODO add your handling code here:
        if(this.cbMonthReport.isSelected()){
            this.cbYearReport.setSelected(true);
            
            this.txtMonthReport.setEditable(true);
            this.txtYearReport.setEditable(true);
            
            this.reportMode = MONTHREPORT_MODE;
        }else{
            this.txtMonthReport.setEditable(false);
            this.txtDayReport.setEditable(false);
            
            this.cbDayReport.setSelected(false);
        }
    }//GEN-LAST:event_cbMonthReportActionPerformed

    private void cbDayReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDayReportActionPerformed
        // TODO add your handling code here:
        if(this.cbDayReport.isSelected()){
            this.cbYearReport.setSelected(true);
            this.cbMonthReport.setSelected(true);
            
            this.txtDayReport.setEditable(true);
            this.txtMonthReport.setEditable(true);
            this.txtYearReport.setEditable(true);
            
            this.reportMode = DAYREPORT_MODE;
        }else{
            this.txtDayReport.setEditable(false);
            
            this.txtDayReport.setEditable(false);
        }
    }//GEN-LAST:event_cbDayReportActionPerformed

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
            java.util.logging.Logger.getLogger(DiaSalaryNoteReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiaSalaryNoteReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiaSalaryNoteReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiaSalaryNoteReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DiaSalaryNoteReport dialog = new DiaSalaryNoteReport(new FrAdminWorkspace(), true);
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
    private javax.swing.JButton btnGenerate;
    private javax.swing.ButtonGroup btngStyle;
    private javax.swing.JCheckBox cbDayReport;
    private javax.swing.JCheckBox cbMonthReport;
    private javax.swing.JCheckBox cbYearReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtDayReport;
    private javax.swing.JTextField txtMonthReport;
    private javax.swing.JTextField txtYearReport;
    // End of variables declaration//GEN-END:variables





// CUSTOM VARIABLE DECLARATION
    FrAdminWorkspace parent;
    LocalDate dayreport = LocalDate.now( ZoneId.of( "Asia/Ho_Chi_Minh" ) );
    
    static int YEARREPORT_MODE = 0;
    static int MONTHREPORT_MODE = 1;
    static int DAYREPORT_MODE = 2;
    int reportMode;
// END CUSTOM VARIABLE DECLARATION

    
    
    
    
// CUSTOM CODE
    private void initDefaultConfig() {
        // cấu hình ngày/tháng/năm cần report
        this.txtDayReport.setText(String.valueOf(this.dayreport.getDayOfMonth()));
        this.txtMonthReport.setText(String.valueOf(this.dayreport.getMonth().getValue()));
        this.txtYearReport.setText(String.valueOf(this.dayreport.getYear()));
        this.cbDayReport.setSelected(true);
        this.cbMonthReport.setSelected(true);
        this.cbYearReport.setSelected(true);
        this.txtDayReport.setEditable(true);
        this.txtMonthReport.setEditable(true);
        this.txtYearReport.setEditable(true);
        
        // mặc định report theo ngày
        this.reportMode = 1;
    }
    
    private void generateDayReport(){
        try{
            List<Map<String, ?>> dataSource = new ArrayList<Map<String, ?>>();
            
            this.createDayTableData(dataSource);
            
            // khởi tạo jasperreport datasource
            JRDataSource jrdata = new JRBeanCollectionDataSource(dataSource);
            String reportlink = "src/report/daysalaryreport.jrxml";
            
            // biên dịch tập tin jasperreport xml đã được thiết kết trước
            JasperReport report = JasperCompileManager.compileReport(reportlink);
            
            // nạp dữ liệu vào tập tin jasperreport xml
            JasperPrint filledReport = JasperFillManager.fillReport(report, null, jrdata);
            
            // xuất report trong frame
            new FrShowReport(new JRViewer(filledReport)).setVisible(true);
            
        }catch(JRException ex){
            Logger.getLogger(DiaEndofdayreport.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Somethings went wrong, can not generate the report file", "REPORT WARNNING", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void generateMonthReport(){
        try{
            List<Map<String, ?>> dataSource = new ArrayList<Map<String, ?>>();
            
            this.createMonthTableData(dataSource);
            
            // khởi tạo jasperreport datasource
            JRDataSource jrdata = new JRBeanCollectionDataSource(dataSource);
            String reportlink = "src/report/monthsalaryreport.jrxml";
            
            // biên dịch tập tin jasperreport xml đã được thiết kết trước
            JasperReport report = JasperCompileManager.compileReport(reportlink);
            
            // nạp dữ liệu vào tập tin jasperreport xml
            JasperPrint filledReport = JasperFillManager.fillReport(report, null, jrdata);
            
            // xuất report trong frame
            new FrShowReport(new JRViewer(filledReport)).setVisible(true);
            
        }catch(JRException ex){
            Logger.getLogger(DiaEndofdayreport.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Somethings went wrong, can not generate the report file", "REPORT WARNNING", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    private void generateYearReport(){
        try{
            List<Map<String, ?>> dataSource = new ArrayList<Map<String, ?>>();
            
            this.createYearTableData(dataSource);
            
            // khởi tạo jasperreport datasource
            JRDataSource jrdata = new JRBeanCollectionDataSource(dataSource);
            String reportlink = "src/report/yearsalaryreport.jrxml";
            
            // biên dịch tập tin jasperreport xml đã được thiết kết trước
            JasperReport report = JasperCompileManager.compileReport(reportlink);
            
            // nạp dữ liệu vào tập tin jasperreport xml
            JasperPrint filledReport = JasperFillManager.fillReport(report, null, jrdata);
            
            // xuất report trong frame
            new FrShowReport(new JRViewer(filledReport)).setVisible(true);
            
        }catch(JRException ex){
            Logger.getLogger(DiaEndofdayreport.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Somethings went wrong, can not generate the report file", "REPORT WARNNING", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    
    private void createDayTableData(List<Map<String, ?>> dataSource){
        ArrayList<EmpSchedule> daydata = (ArrayList<EmpSchedule>) EmpScheduleDAO.getlist_inday(java.sql.Date.valueOf(this.dayreport));
        
        
    }
    
    
    
    private void createMonthTableData(List<Map<String, ?>> dataSource){
        ArrayList<SalaryNote> monthdata = (ArrayList<SalaryNote>) SalaryNoteDAO.getlist_inmonth(this.dayreport.getMonth().getValue(), this.dayreport.getYear());
    
    
    }
    
    
    
    private void createYearTableData(List<Map<String, ?>> dataSource){
        HashMap<Employee, ArrayList<SalaryNote>> yeardata = (HashMap<Employee, ArrayList<SalaryNote>>) SalaryNoteDAO.getlist_inyear(this.dayreport.getYear());
        
        
    }
// END CUSTOM CODE
}

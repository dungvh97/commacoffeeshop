/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.sun.glass.events.KeyEvent;
import entities.FoodMaterial;

/**
 *
 * @author DELL
 */
public class DiaEditReceiptNoteDetails extends javax.swing.JDialog {

    /**
     * Creates new form DiaEditReceiptNoteDetails
     */
    public DiaEditReceiptNoteDetails(FrEmployeeWorkspace parent, int selectedrow, boolean modal) {
        super(parent, modal);
        this.parent = parent;
        this.selectedrow = selectedrow;
        
        this.setLocationRelativeTo(this.parent);
        this.setLocation(420, 230);
        this.setModal(true);
        initComponents();
        
        for(FoodMaterial fmitem : this.parent.menumaterial_list){
            if(fmitem.getFm_id().equals(this.parent.cur_invoice.getSecond().get(this.selectedrow).getFm_id())){
                this.lbFoodMaterialName.setText(fmitem.getName());
                break;
            }
        }
        this.txtPriceperunit.setText(String.valueOf(this.parent.cur_invoice.getSecond().get(this.selectedrow).getItem_price()));
        this.txtQuan.setText(String.valueOf(this.parent.cur_invoice.getSecond().get(this.selectedrow).getQuan()));
        this.txtNote.setText(this.parent.cur_invoice.getSecond().get(selectedrow).getNote());
        
        this.txtPriceperunit.select(0, this.txtPriceperunit.getText().length());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbFoodMaterialName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPriceperunit = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNote = new javax.swing.JTextArea();
        pnControl = new javax.swing.JPanel();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lbPriceperunitState = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtQuan = new javax.swing.JTextField();
        lbQuantityState = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Invoice's Item");
        setBackground(new java.awt.Color(153, 153, 153));

        lbFoodMaterialName.setBackground(new java.awt.Color(0, 0, 0));
        lbFoodMaterialName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbFoodMaterialName.setForeground(new java.awt.Color(0, 204, 0));
        lbFoodMaterialName.setOpaque(true);

        jLabel2.setText("Price per unit:");

        jLabel3.setText("Note:");

        txtPriceperunit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceperunitActionPerformed(evt);
            }
        });

        txtNote.setColumns(20);
        txtNote.setRows(5);
        jScrollPane1.setViewportView(txtNote);

        pnControl.setBackground(new java.awt.Color(102, 102, 102));
        pnControl.setLayout(new java.awt.GridLayout(1, 0));

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        btnOK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnOKKeyPressed(evt);
            }
        });
        pnControl.add(btnOK);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        pnControl.add(btnCancel);

        lbPriceperunitState.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbPriceperunitState.setForeground(new java.awt.Color(204, 0, 0));

        jLabel1.setText("Quantity:");

        txtQuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuanActionPerformed(evt);
            }
        });

        lbQuantityState.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbQuantityState.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbFoodMaterialName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtQuan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txtPriceperunit, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbPriceperunitState, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                            .addComponent(lbQuantityState, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbFoodMaterialName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPriceperunitState, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtPriceperunit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbQuantityState, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(pnControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:
        float priceperunit;
        int quan;
        try{
            priceperunit = Float.parseFloat(this.txtPriceperunit.getText().trim());
        }catch(NumberFormatException ex){
            ex.getStackTrace();
            this.lbPriceperunitState.setText("!");
            this.txtPriceperunit.requestFocus();
            return;
        }
        
        try{
            quan = Integer.parseInt(this.txtQuan.getText().trim());
        }catch(NumberFormatException ex){
            ex.getStackTrace();
            this.lbQuantityState.setText("!");
            this.txtQuan.requestFocus();
            return;
        }
        
        if(priceperunit < 0){
            this.lbPriceperunitState.setText("!");
            this.txtPriceperunit.requestFocus();
            return;
        }
        
        if(quan < 0){
            this.lbQuantityState.setText("!");
            this.txtQuan.requestFocus();
            return;
        }
        
        String note = this.txtNote.getText().trim();
        
        this.parent.cur_invoice.getSecond().get(this.selectedrow).setItem_price(priceperunit);
        this.parent.cur_invoice.getSecond().get(this.selectedrow).setQuan(quan);
        this.parent.cur_invoice.getSecond().get(this.selectedrow).setNote(note);
        
        this.parent.ShowCurrentInvoice();
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtPriceperunitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceperunitActionPerformed
        // TODO add your handling code here:
        this.txtQuan.requestFocus();
        this.txtQuan.selectAll();
    }//GEN-LAST:event_txtPriceperunitActionPerformed

    private void btnOKKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnOKKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            float priceperunit;
            int quan;
            try{
                priceperunit = Float.parseFloat(this.txtPriceperunit.getText().trim());
            }catch(NumberFormatException ex){
                ex.getStackTrace();
                this.lbPriceperunitState.setText("!");
                this.txtPriceperunit.requestFocus();
                return;
            }

            try{
                quan = Integer.parseInt(this.txtQuan.getText().trim());
            }catch(NumberFormatException ex){
                ex.getStackTrace();
                this.lbQuantityState.setText("!");
                this.txtQuan.requestFocus();
                return;
            }
            
            if(priceperunit < 0){
                this.lbPriceperunitState.setText("!");
                this.txtPriceperunit.requestFocus();
                return;
            }

            if(quan < 0){
                this.lbQuantityState.setText("!");
                this.txtQuan.requestFocus();
                return;
            }

            String note = this.txtNote.getText().trim();

            this.parent.cur_invoice.getSecond().get(this.selectedrow).setItem_price(priceperunit);
            this.parent.cur_invoice.getSecond().get(this.selectedrow).setQuan(quan);
            this.parent.cur_invoice.getSecond().get(this.selectedrow).setNote(note);

            this.parent.ShowCurrentInvoice();

            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            this.dispose();
            }
    }//GEN-LAST:event_btnOKKeyPressed

    private void txtQuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuanActionPerformed
        // TODO add your handling code here:
        this.btnOK.requestFocus();
    }//GEN-LAST:event_txtQuanActionPerformed

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
            java.util.logging.Logger.getLogger(DiaEditReceiptNoteDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiaEditReceiptNoteDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiaEditReceiptNoteDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiaEditReceiptNoteDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DiaEditReceiptNoteDetails dialog = new DiaEditReceiptNoteDetails(new FrEmployeeWorkspace(null), 0, true);
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
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbFoodMaterialName;
    private javax.swing.JLabel lbPriceperunitState;
    private javax.swing.JLabel lbQuantityState;
    private javax.swing.JPanel pnControl;
    private javax.swing.JTextArea txtNote;
    private javax.swing.JTextField txtPriceperunit;
    private javax.swing.JTextField txtQuan;
    // End of variables declaration//GEN-END:variables

    FrEmployeeWorkspace parent;
    int selectedrow;
}

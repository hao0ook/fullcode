/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FirstApp;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author LTTH
 */
public class Font2 extends javax.swing.JFrame {

    /**
     * Creates new form Font2
     */
    public Font2() {
        initComponents();
        LoadFontName();
        LoadFontStyle();
    }
    private void LoadFontName() {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontName = ge.getAvailableFontFamilyNames();
        lstName.setModel(new DefaultComboBoxModel<String>(fontName));
    }
    
    private void LoadFontStyle() {
        String[] fontStyle = {"Regular", "Italic", "Bold", "Bold & Italic"};
        cbxStyle.setModel(new DefaultComboBoxModel<String>(fontStyle));
    }
    
    private void Format() {
        String fontName = lstName.getSelectedValue() + "";
        int fontStyle = cbxStyle.getSelectedIndex();
        int fontSize = 0;
        fontSize = Integer.parseInt(spnSize.getValue() + "");
        txtDisplay.setFont(new Font(fontName, fontStyle, fontSize));
        
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstName = new javax.swing.JList<>();
        cbxStyle = new javax.swing.JComboBox<>();
        spnSize = new javax.swing.JSpinner();
        txtDisplay = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstName.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstName.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstNameValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstName);

        cbxStyle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxStyle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxStyleActionPerformed(evt);
            }
        });

        spnSize.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnSizeStateChanged(evt);
            }
        });

        txtDisplay.setText("Lương Thị Thanh Huyền");
        txtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisplayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(cbxStyle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(spnSize, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxStyle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnSize, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisplayActionPerformed
        // TODO add your handling code here:
        Format();
    }//GEN-LAST:event_txtDisplayActionPerformed

    private void spnSizeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnSizeStateChanged
        // TODO add your handling code here:
        Format();
    }//GEN-LAST:event_spnSizeStateChanged

    private void cbxStyleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxStyleActionPerformed
        // TODO add your handling code here:
        Format();
    }//GEN-LAST:event_cbxStyleActionPerformed

    private void lstNameValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstNameValueChanged
        // TODO add your handling code here:
        Format();
    }//GEN-LAST:event_lstNameValueChanged

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
            java.util.logging.Logger.getLogger(Font2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Font2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Font2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Font2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Font2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxStyle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstName;
    private javax.swing.JSpinner spnSize;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX2;

/**
 *
 * @author LENOVO
 */
import java.awt.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;

public class secondfont extends javax.swing.JFrame {
    firstfont f1;
    String text;
    Font font;
    Color textc;
    Color backgroundc;
    /**
     * Creates new form secondfont
     */
    public secondfont() {
        initComponents();
    }

    public secondfont(firstfont f1, String text, Font f, Color textColor, Color bgColor) {
        initComponents();
        this.f1 = f1;
        this.text = text;
        font = f;
        this.textc = textColor;
        backgroundc = bgColor;
        lblDisplay.setText(text);
        lblDisplay.setFont(font);
        lblDisplay.setForeground(textc);
        lblDisplay.setBackground(bgColor);
        LoadFontName();
        LoadFontStyle();
    }
    
     private void LoadFontName(){
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fortName = ge.getAvailableFontFamilyNames();
        cbxFontname.setModel(new DefaultComboBoxModel<String>(fortName));
    }
    
    private void LoadFontStyle(){
        String[] fortStyle = {"Regular", "Italic", "Bold", "Bold & Italic"};
        cbxFontstyle.setModel(new DefaultComboBoxModel<String>(fortStyle));
    }
    
    private void Format(){
        String FonName = cbxFontname.getSelectedItem()+"";
        int FonStyle = cbxFontstyle.getSelectedIndex();
        int FonSize = 0;
        try {
            FonSize = Integer.parseInt(txtFontsize.getText());
            FonSize = FonSize>50?50:FonSize;
            FonSize = FonSize<10?10:FonSize;
        } catch (Exception e){
            FonSize = 15;
        }
        lblDisplay.setFont(new Font(FonName, FonStyle, FonSize));
     }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cbxFontname = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbxFontstyle = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtFontsize = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnTextcolor = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnBackgroundcolor = new javax.swing.JButton();
        btnFinish = new javax.swing.JButton();
        lblDisplay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Font Name");

        cbxFontname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxFontname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFontnameActionPerformed(evt);
            }
        });

        jLabel3.setText("Font Style");

        cbxFontstyle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxFontstyle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFontstyleActionPerformed(evt);
            }
        });

        jLabel4.setText("Font Size");

        txtFontsize.setText("15");
        txtFontsize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFontsizeActionPerformed(evt);
            }
        });

        jLabel5.setText("Text Color");

        btnTextcolor.setText("Text color...");
        btnTextcolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTextcolorActionPerformed(evt);
            }
        });

        jLabel6.setText("Background Color");

        btnBackgroundcolor.setText("Background color...");
        btnBackgroundcolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackgroundcolorActionPerformed(evt);
            }
        });

        btnFinish.setText("Finish");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFinish)
                .addGap(169, 169, 169))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(cbxFontname, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxFontstyle, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFontsize)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(btnTextcolor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(btnBackgroundcolor))
                        .addGap(30, 30, 30)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxFontname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxFontstyle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFontsize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTextcolor)
                    .addComponent(btnBackgroundcolor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnFinish)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxFontnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFontnameActionPerformed
        // TODO add your handling code here:
        Format();
    }//GEN-LAST:event_cbxFontnameActionPerformed

    private void cbxFontstyleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFontstyleActionPerformed
        // TODO add your handling code here:
        Format();
    }//GEN-LAST:event_cbxFontstyleActionPerformed

    private void txtFontsizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFontsizeActionPerformed
        // TODO add your handling code here:
        Format();
    }//GEN-LAST:event_txtFontsizeActionPerformed

    private void btnTextcolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTextcolorActionPerformed
        // TODO add your handling code here:
        textc = JColorChooser.showDialog(this, "Select color for text", textc);
        Format();
    }//GEN-LAST:event_btnTextcolorActionPerformed

    private void btnBackgroundcolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackgroundcolorActionPerformed
        // TODO add your handling code here:
        backgroundc = JColorChooser.showDialog(this, "Select color for background", backgroundc);
        Format();
    }//GEN-LAST:event_btnBackgroundcolorActionPerformed

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
        // TODO add your handling code here:
        f1.Format(font, textc, backgroundc);
        this.dispose();
    }//GEN-LAST:event_btnFinishActionPerformed

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
            java.util.logging.Logger.getLogger(secondfont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(secondfont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(secondfont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(secondfont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new secondfont().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackgroundcolor;
    private javax.swing.JButton btnFinish;
    private javax.swing.JButton btnTextcolor;
    private javax.swing.JComboBox<String> cbxFontname;
    private javax.swing.JComboBox<String> cbxFontstyle;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblDisplay;
    private javax.swing.JTextField txtFontsize;
    // End of variables declaration//GEN-END:variables
}

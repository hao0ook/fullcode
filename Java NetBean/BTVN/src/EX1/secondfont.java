/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX1;

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
        LoadFontName();
        LoadFontStyle();
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
        sldFontsize.setValue(font.getSize());
    }
    
     private void LoadFontName(){
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fortName = ge.getAvailableFontFamilyNames();
        lstFontname.setModel(new DefaultComboBoxModel<String>(fortName));
    }
    
    private void LoadFontStyle(){
        String[] fortStyle = {"Regular", "Italic", "Bold", "Bold & Italic"};
        cbxFontstyle.setModel(new DefaultComboBoxModel<String>(fortStyle));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDisplay = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstFontname = new javax.swing.JList<>();
        cbxFontstyle = new javax.swing.JComboBox<>();
        sldFontsize = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnTextcolor = new javax.swing.JButton();
        btnBackgroundcolor = new javax.swing.JButton();
        btnFinish = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Font Name");

        jLabel3.setText("Font Style");

        jLabel4.setText("Font Size");

        lstFontname.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstFontname.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstFontnameValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstFontname);

        cbxFontstyle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxFontstyle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFontstyleActionPerformed(evt);
            }
        });

        sldFontsize.setMaximum(60);
        sldFontsize.setMinorTickSpacing(10);
        sldFontsize.setPaintLabels(true);
        sldFontsize.setPaintTicks(true);
        sldFontsize.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldFontsizeStateChanged(evt);
            }
        });

        jLabel5.setText("Text Color");

        jLabel6.setText("Background Color");

        btnTextcolor.setText("Change Text color...");
        btnTextcolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTextcolorActionPerformed(evt);
            }
        });

        btnBackgroundcolor.setText("Change Background color...");
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(cbxFontstyle, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(87, 87, 87))
                            .addComponent(sldFontsize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTextcolor)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(btnBackgroundcolor))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(btnFinish)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(cbxFontstyle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sldFontsize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTextcolor)
                    .addComponent(btnBackgroundcolor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnFinish)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void Format(){
        String FonName = lstFontname.getSelectedValue()+"";
        int FonStyle = cbxFontstyle.getSelectedIndex();
        int FonSize = 0;
        FonSize = Integer.parseInt(sldFontsize.getValue()+"");
        lblDisplay.setFont(new Font(FonName, FonStyle, FonSize));
     }
    
    private void lstFontnameValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstFontnameValueChanged
        // TODO add your handling code here:
        Format();
    }//GEN-LAST:event_lstFontnameValueChanged

    private void cbxFontstyleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFontstyleActionPerformed
        // TODO add your handling code here:
        Format();
    }//GEN-LAST:event_cbxFontstyleActionPerformed

    private void sldFontsizeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldFontsizeStateChanged
        // TODO add your handling code here:
        Format();
    }//GEN-LAST:event_sldFontsizeStateChanged

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
        Format();
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
    private javax.swing.JComboBox<String> cbxFontstyle;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDisplay;
    private javax.swing.JList<String> lstFontname;
    private javax.swing.JSlider sldFontsize;
    // End of variables declaration//GEN-END:variables
}

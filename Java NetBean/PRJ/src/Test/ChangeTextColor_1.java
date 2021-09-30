/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timer_changetextcolor_checkbox;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Timer;

/**
 *
 * @author ANHDUC
 */
public class ChangeTextColor extends javax.swing.JFrame {

    /**
     * Creates new form DemoFontChange
     */
    public ChangeTextColor() {
        initComponents();
        initColor();
        initTimer();
    }
    boolean canRun = false;
    Color []color = {Color.red,Color.blue,Color.green,Color.yellow,Color.pink,Color.orange};
    Timer t;
    ArrayList<Integer> ar = new ArrayList<>();
    int index = 0;
    
    //DefaultTableModel dftm = new DefaultTableModel();
    private void initColor() {
        if(!(cbxRed.isSelected()||cbxBlue.isSelected()||cbxGreen.isSelected()||
                cbxYellow.isSelected()||cbxPink.isSelected()||cbxOrange.isSelected())){
            ar.add(0);
        }
        if(cbxRed.isSelected()) ar.add(0);
        if(cbxBlue.isSelected()) ar.add(1);
        if(cbxGreen.isSelected()) ar.add(2);
        if(cbxYellow.isSelected()) ar.add(3);
        if(cbxPink.isSelected()) ar.add(4);
        if(cbxOrange.isSelected()) ar.add(5);
    }
    private void initTimer() {
        
        t = new Timer(500, (evt) -> {
            if (canRun) {
                lblDisplay.setForeground(color[ar.get(index)]);
                index++;
                if(index >= ar.size()) index = 0;
            }
        }); 
        t.start();
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
        spnSpeed = new javax.swing.JSpinner();
        btnReset = new javax.swing.JButton();
        btnPause = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbxRed = new javax.swing.JCheckBox();
        cbxBlue = new javax.swing.JCheckBox();
        cbxGreen = new javax.swing.JCheckBox();
        cbxYellow = new javax.swing.JCheckBox();
        cbxPink = new javax.swing.JCheckBox();
        cbxOrange = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDisplay.setText("Welcome ");
        lblDisplay.setOpaque(true);

        jLabel2.setText("Speed");

        spnSpeed.setModel(new javax.swing.SpinnerNumberModel(500, 0, 5000, 500));
        spnSpeed.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnSpeedStateChanged(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnPause.setText("Pause");
        btnPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauseActionPerformed(evt);
            }
        });

        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnStop.setText("Stop");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        jLabel1.setText("Color");

        cbxRed.setText("Red");

        cbxBlue.setText("Blue");

        cbxGreen.setText("Green");

        cbxYellow.setText("Yellow");

        cbxPink.setText("Pink");

        cbxOrange.setText("Orange");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(btnPause)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnReset))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(spnSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxBlue)
                            .addComponent(cbxRed)
                            .addComponent(cbxGreen)
                            .addComponent(cbxYellow)
                            .addComponent(cbxPink)
                            .addComponent(cbxOrange))
                        .addGap(60, 60, 60)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(spnSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbxRed))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxBlue)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxGreen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxYellow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxPink)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxOrange)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStart)
                    .addComponent(btnReset)
                    .addComponent(btnPause)
                    .addComponent(btnStop))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spnSpeedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnSpeedStateChanged
        // TODO add your handling code here:
        t.setDelay(Integer.parseInt(spnSpeed.getValue()+""));
    }//GEN-LAST:event_spnSpeedStateChanged

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        canRun = false;
        index = 0;
        lblDisplay.setForeground(Color.BLACK);
        btnStart.setEnabled(true);
        btnPause.setEnabled(false);
        btnStop.setEnabled(false);
        btnReset.setEnabled(false);
        initTimer();
        t.setDelay(Integer.parseInt(spnSpeed.getValue() + ""));
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
        canRun = false;
        btnStart.setEnabled(true);
        btnPause.setEnabled(false);
        btnStop.setEnabled(true);
        btnReset.setEnabled(false);
    }//GEN-LAST:event_btnPauseActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        canRun = true;
        btnStart.setEnabled(false);
        btnPause.setEnabled(true);
        btnStop.setEnabled(true);
        btnReset.setEnabled(false);
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        t.stop();
        canRun = true;
        btnStart.setEnabled(false);
        btnPause.setEnabled(false);
        btnStop.setEnabled(false);
        btnReset.setEnabled(true);
    }//GEN-LAST:event_btnStopActionPerformed

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
            java.util.logging.Logger.getLogger(ChangeTextColor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeTextColor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeTextColor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeTextColor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeTextColor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPause;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStop;
    private javax.swing.JCheckBox cbxBlue;
    private javax.swing.JCheckBox cbxGreen;
    private javax.swing.JCheckBox cbxOrange;
    private javax.swing.JCheckBox cbxPink;
    private javax.swing.JCheckBox cbxRed;
    private javax.swing.JCheckBox cbxYellow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblDisplay;
    private javax.swing.JSpinner spnSpeed;
    // End of variables declaration//GEN-END:variables
}

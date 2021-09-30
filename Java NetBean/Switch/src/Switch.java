
import com.sun.xml.internal.txw2.TXW;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import jdk.internal.util.xml.impl.Input;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PH
 */
public class Switch extends javax.swing.JFrame {

    /**
     * Creates new form Switch
     */
    public Switch() {
        initComponents();
        initLable();
        txtValueR.setEnabled(false);
    }

    private void initLable() {
        txtValueL.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                warn();
            }

            public void removeUpdate(DocumentEvent e) {
                warn();
            }

            public void insertUpdate(DocumentEvent e) {
                warn();
            }

            public void warn() {
                String inputS = txtDisplay.getText();
                String scl = txtValueL.getText();
                String scr = txtValueR.getText();
                StringBuffer inB = new StringBuffer(inputS);
                int lei = inputS.length();
                int lel = scl.length();
                int ler = scr.length();
                boolean check = false;
                for (int i = 0; i <= lei - lel; i++) {
                    //System.err.println(inB.substring(i, i + lel));
                    //System.out.println(scl);
                    if (inB.substring(i, i + lel).equals(scl)) {
                        check = true;

                    }

                }
                txtValueR.setEnabled(check);
            }
        });

        txtValueR.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                warn();
            }

            public void removeUpdate(DocumentEvent e) {
                warn();
            }

            public void insertUpdate(DocumentEvent e) {
                warn();
            }

            public void warn() {
                String inputS = txtDisplay.getText().trim();
                String scr = txtValueR.getText().trim();
                StringBuffer inB = new StringBuffer(inputS);
                int lei = inputS.length();
                int ler = scr.length();
                boolean check = false;
                for (int i = 0; i <= lei - ler; i++) {
                    //System.err.println(inB.substring(i, i + ler));
                    //System.out.println(scl);
                    if (inB.substring(i, i + ler).equals(scr)) {
                        check = true;

                    }

                }
                btnSwitch.setEnabled(check);
            }
        });
    }
        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtDisplay = new javax.swing.JTextArea();
        txtValueL = new javax.swing.JTextField();
        txtValueR = new javax.swing.JTextField();
        btnSwitch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtDisplay.setColumns(20);
        txtDisplay.setRows(5);
        jScrollPane1.setViewportView(txtDisplay);

        txtValueL.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtValueLFocusGained(evt);
            }
        });

        btnSwitch.setText("Switch");
        btnSwitch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSwitchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtValueL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtValueR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(btnSwitch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValueL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValueR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSwitch)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSwitchActionPerformed
        String inputS = txtDisplay.getText().trim();
        String scl = txtValueL.getText().trim();
        String scr = txtValueR.getText().trim();
        StringBuffer inB = new StringBuffer(inputS);
        int lei = inputS.length();
        int lel = scl.length();
        int ler = scr.length();
        for (int i = 0; i < lei; i++) {
            try {
                if (inB.substring(i, i + lel).equals(scl)) {
                    inB.replace(i, i + lel, scr);
                    //System.out.println("1");
                } else if (inB.substring(i, i + ler).equals(scr)) {
                    inB.replace(i, i + ler, scl);
                    //System.out.println("2");
                }
                //System.out.println("0");
            } catch (Exception e) {
                //System.out.println("3");
            }
        }
        //System.out.println("4");
        txtDisplay.setText(inB.toString());
    }//GEN-LAST:event_btnSwitchActionPerformed

    private void txtValueLFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValueLFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValueLFocusGained

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
            java.util.logging.Logger.getLogger(Switch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Switch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Switch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Switch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Switch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSwitch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDisplay;
    private javax.swing.JTextField txtValueL;
    private javax.swing.JTextField txtValueR;
    // End of variables declaration//GEN-END:variables

}

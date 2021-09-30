/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex;

import javax.swing.JOptionPane;

/**
 *
 * @author PH
 */
public class Ex1 extends javax.swing.JFrame {

    /**
     * Creates new form Ex1
     */
    public Ex1() {
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

        inputValue = new javax.swing.JTextField();
        textOutput = new javax.swing.JScrollPane();
        outputValue = new javax.swing.JTextArea();
        titleIput = new javax.swing.JLabel();
        outputTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        priNumRad = new javax.swing.JRadioButton();
        squaNumRad = new javax.swing.JRadioButton();
        symNumRad = new javax.swing.JRadioButton();
        genBt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        outputValue.setColumns(20);
        outputValue.setRows(5);
        textOutput.setViewportView(outputValue);

        titleIput.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        titleIput.setText("Input Value");

        outputTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        outputTitle.setText("Output Value");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Option");

        priNumRad.setText("Prime Number");
        priNumRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priNumRadActionPerformed(evt);
            }
        });

        squaNumRad.setText("Square Number");
        squaNumRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squaNumRadActionPerformed(evt);
            }
        });

        symNumRad.setText("Symmetry Number");
        symNumRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symNumRadActionPerformed(evt);
            }
        });

        genBt.setText("Generate");
        genBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genBt)
                    .addComponent(outputTitle)
                    .addComponent(jLabel1)
                    .addComponent(priNumRad)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(textOutput)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(titleIput)
                            .addGap(218, 218, 218))
                        .addComponent(inputValue, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(squaNumRad)
                    .addComponent(symNumRad))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(titleIput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(outputTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(priNumRad)
                .addGap(18, 18, 18)
                .addComponent(squaNumRad)
                .addGap(18, 18, 18)
                .addComponent(symNumRad)
                .addGap(18, 18, 18)
                .addComponent(genBt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void symNumRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_symNumRadActionPerformed
        if(symNumRad.isSelected()){
            squaNumRad.setSelected(false);
            priNumRad.setSelected(false);
        }
    }//GEN-LAST:event_symNumRadActionPerformed

    private void priNumRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priNumRadActionPerformed
        if(priNumRad.isSelected()){
            squaNumRad.setSelected(false);
            symNumRad.setSelected(false);
        }
    }//GEN-LAST:event_priNumRadActionPerformed

    private void squaNumRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squaNumRadActionPerformed
        if(squaNumRad.isSelected()){
            priNumRad.setSelected(false);
            symNumRad.setSelected(false);
        }
    }//GEN-LAST:event_squaNumRadActionPerformed

    private void genBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genBtActionPerformed
        if(priNumRad.isSelected()){
            genPreNum();
        }
        else if(squaNumRad.isSelected()){
            genSqua();
        }
        else if(symNumRad.isSelected()){
            genNumSym();
        }
    }//GEN-LAST:event_genBtActionPerformed
    private boolean checkInput(String string,int type){
        boolean check = false;
        try{
            int size = Integer.parseInt(string);
            if(size < 100 && type < 3)
                check = true;
            else if(size >= 1000 && size <= 9999 && type == 3){
                check = true;
            }
            else
                JOptionPane.showConfirmDialog(rootPane, "Pleas input a number < 100 or >= 1000 and <= 9999");
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(rootPane, "Pleas input a number");
        }
        return check;
    }
    private void genPreNum() {                                                
        String value = inputValue.getText();
        if(checkInput(value, 1)){
            int size = Integer.parseInt(value);
            int i = 1;
            int num =1;
            int countSize = 1;
            String  primeNumbers = "";
            while(countSize <= size){
                int counter=0;
                for(num =i; num>=1; num--)
                {
                    if(i%num==0)
                    {
                        counter = counter + 1;
                    }
                }
                if (counter ==2)
                {
                    primeNumbers = primeNumbers + i + " ";
                    countSize++;
                }
                i++;                
            }
            outputValue.setText(primeNumbers);
        }        
    }
    private void genSqua() {                                                 
        String value = inputValue.getText();
        if(checkInput(value, 2)){
            int size = Integer.parseInt(value);
            int countSize = 1;
            int i = 1;
            String squareNumbers = "";
            while(countSize <= size){              
                squareNumbers = squareNumbers + i*i + " ";
                countSize++;
                i++;
            }
            outputValue.setText(squareNumbers);
        }
    }
    private void genNumSym() {                                                
        String value = inputValue.getText();
        if(checkInput(value, 3)){
            String  symNumbers = "";
            int size = Integer.parseInt(value);            
            for(int i = 1000; i <= size; i++){
                int reversedInteger = 0, remainder;
                int num = i;
                int originalInteger = num;               
                while( num != 0 )
                {
                    remainder = num % 10;
                    reversedInteger = reversedInteger * 10 + remainder;
                    num  /= 10;                    
                }
                if (originalInteger == reversedInteger)
                    symNumbers = symNumbers + originalInteger + " ";
            }
            outputValue.setText(symNumbers);
        }
    }
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
            java.util.logging.Logger.getLogger(Ex1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ex1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ex1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ex1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ex1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton genBt;
    private javax.swing.JTextField inputValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel outputTitle;
    private javax.swing.JTextArea outputValue;
    private javax.swing.JRadioButton priNumRad;
    private javax.swing.JRadioButton squaNumRad;
    private javax.swing.JRadioButton symNumRad;
    private javax.swing.JScrollPane textOutput;
    private javax.swing.JLabel titleIput;
    // End of variables declaration//GEN-END:variables
}
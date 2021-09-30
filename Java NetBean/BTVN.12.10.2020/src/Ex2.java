
import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LTTH
 */
public class Ex2 extends javax.swing.JFrame {

    /**
     * Creates new form Ex2
     */
    public Ex2() {
        initComponents();
        initConnection();
    }

    Connection con;
    DefaultTableModel dftm = new DefaultTableModel();
    HashSet<String> hs;

    private void initConnection(){
        try{
            con = new DBContext().getConnection();
            System.out.println("Ket noi thanh cong");
        } catch (Exception e){
            System.out.println("Ket noi that bai" + e.getMessage());
        }
    }
    String[] title={"ID", "Full Name", "Gender", "DepartName", "GPA", "Address"};
    String [] SearchField = {"s.ID", "s.Name", "s.Gender", "d.DepartName", "s.GPA", "s.Address"};
    String ss = "select "+SearchField[0];
    {
    for(int i=1;i<SearchField.length;i++){
        ss = ss+", "+SearchField[i];
    }
    ss = ss+ " from StudentInfo s, DepartInfo d where s.DepartID=d.DepartID";
        System.out.println(ss);
    }
    
    private void Load(){
        Load(ss);
    }
    
    private void Load(String sql){
        dftm.setColumnIdentifiers(title);
        dftm.setRowCount(0);
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Vector vec;
            hs = new HashSet<String>();
            while(rs.next()){
                vec = new Vector();
                vec.add(rs.getString(1));
                hs.add(rs.getString(1));
                vec.add(rs.getString("Name"));
                vec.add(rs.getBoolean("Gender"));            
                vec.add(rs.getString(4));
                vec.add(rs.getFloat(5));
                vec.add(rs.getString(6));
                dftm.addRow(vec);
            }
            tblDisplay.setModel(dftm);
            int n = dftm.getRowCount();
            if(n==0) lblDisplay.setText("Khong co ban ghi");
            else lblDisplay.setText("Da tim thay "+n+" ban ghi");
        } catch(Exception e){
            System.out.println("Co loi" +e.getMessage());
        }
    } 
    
 private void Search(){
        ArrayList <Integer>ar = new ArrayList();
        if(rdbID.isSelected()) ar.add(0);
        if(rdbFullName.isSelected()) ar.add(1);
        if(rdbGender.isSelected()) ar.add(2);
        if(rdbDepartName.isSelected()) ar.add(0);
        if(rdbGPA.isSelected()) ar.add(0);
        if(rdbAddress.isSelected()) ar.add(0);

        int n = ar.size();
        if(n==0){}
        else{
            String sql = ss+" and ("+SearchField[ar.get(0)]+" like '%"+txtSearchIn.getText()+"%'";
            if(n>1)
                for(int i=1;i<n;i++)
                    sql = sql+" or "+SearchField[ar.get(0)]+" like '%"+txtSearchIn.getText()+"%'";
                sql=sql+")";
            System.out.println(sql);
            Load(sql);
        }
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
        tblDisplay = new javax.swing.JTable();
        btnLoad = new javax.swing.JButton();
        txtSearchIn = new javax.swing.JTextField();
        chkSearchAll = new javax.swing.JCheckBox();
        rdbID = new javax.swing.JRadioButton();
        rdbGender = new javax.swing.JRadioButton();
        rdbFullName = new javax.swing.JRadioButton();
        rdbDepartName = new javax.swing.JRadioButton();
        rdbGPA = new javax.swing.JRadioButton();
        rdbAddress = new javax.swing.JRadioButton();
        btnSearch = new javax.swing.JButton();
        lblDisplay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblDisplay);

        btnLoad.setText("Load");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        txtSearchIn.setText("n");

        chkSearchAll.setText("Search All");

        rdbID.setText("ID");

        rdbGender.setText("Gender");

        rdbFullName.setText("Full Name");

        rdbDepartName.setText("DepartName");

        rdbGPA.setText("GPA");

        rdbAddress.setText("Address");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rdbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtSearchIn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31)
                                    .addComponent(rdbID, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(chkSearchAll, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rdbFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(rdbDepartName)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdbAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
                            .addComponent(rdbGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSearch)
                                .addGap(18, 18, 18)
                                .addComponent(btnLoad))
                            .addComponent(lblDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearchIn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearch)
                        .addComponent(btnLoad))
                    .addComponent(rdbID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkSearchAll)
                        .addComponent(rdbFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(rdbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rdbDepartName)
                .addGap(18, 18, 18)
                .addComponent(rdbGPA)
                .addGap(18, 18, 18)
                .addComponent(rdbAddress)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        Load();        
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        Search();
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(Ex2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ex2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ex2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ex2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ex2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnSearch;
    private javax.swing.JCheckBox chkSearchAll;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDisplay;
    private javax.swing.JRadioButton rdbAddress;
    private javax.swing.JRadioButton rdbDepartName;
    private javax.swing.JRadioButton rdbFullName;
    private javax.swing.JRadioButton rdbGPA;
    private javax.swing.JRadioButton rdbGender;
    private javax.swing.JRadioButton rdbID;
    private javax.swing.JTable tblDisplay;
    private javax.swing.JTextField txtSearchIn;
    // End of variables declaration//GEN-END:variables
}


import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LTTH
 */
public class Ex1 extends javax.swing.JFrame {

    /**
     * Creates new form Ex1
     */
    public Ex1() {
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
        if(chkID.isSelected()) ar.add(0);
        if(chkFullName.isSelected()) ar.add(1);
        if(chkGender.isSelected()) ar.add(2);
        if(chkDepartName.isSelected()) ar.add(0);
        if(chkGPA.isSelected()) ar.add(0);
        if(chkAddress.isSelected()) ar.add(0);

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
        chkID = new javax.swing.JCheckBox();
        chkFullName = new javax.swing.JCheckBox();
        chkDepartName = new javax.swing.JCheckBox();
        chkGender = new javax.swing.JCheckBox();
        chkGPA = new javax.swing.JCheckBox();
        chkAddress = new javax.swing.JCheckBox();
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

        chkID.setText("ID");

        chkFullName.setText("Full Name");

        chkDepartName.setText("DepartName");

        chkGender.setText("Gender ");

        chkGPA.setText("GPA");

        chkAddress.setText("Address");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearchIn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chkID, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)
                        .addGap(18, 18, 18)
                        .addComponent(btnLoad)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkSearchAll)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkGender, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkFullName)
                                .addGap(18, 18, 18)
                                .addComponent(lblDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addComponent(chkDepartName)
                            .addComponent(chkAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchIn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkID)
                    .addComponent(btnSearch)
                    .addComponent(btnLoad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkSearchAll)
                    .addComponent(chkFullName)
                    .addComponent(lblDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chkGender, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chkDepartName)
                .addGap(18, 18, 18)
                .addComponent(chkGPA)
                .addGap(18, 18, 18)
                .addComponent(chkAddress)
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
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnSearch;
    private javax.swing.JCheckBox chkAddress;
    private javax.swing.JCheckBox chkDepartName;
    private javax.swing.JCheckBox chkFullName;
    private javax.swing.JCheckBox chkGPA;
    private javax.swing.JCheckBox chkGender;
    private javax.swing.JCheckBox chkID;
    private javax.swing.JCheckBox chkSearchAll;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDisplay;
    private javax.swing.JTable tblDisplay;
    private javax.swing.JTextField txtSearchIn;
    // End of variables declaration//GEN-END:variables
}

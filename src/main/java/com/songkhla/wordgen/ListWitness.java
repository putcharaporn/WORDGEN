/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.songkhla.wordgen;

import com.songkhla.wordgen.*;
import static com.songkhla.wordgen.CrimesCaseEdit.crimecaseid;
import static com.songkhla.wordgen.CrimesCaseEdit.jTextAccused;
import static com.songkhla.wordgen.ListAccused.txtCaseNO;
import static com.songkhla.wordgen.ListSuspect.jTableSuspect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JDialog;
import javax.swing.JFrame;
import org.json.simple.JSONObject;
import static com.songkhla.wordgen.ListWitness.jTableWitness;
import javax.swing.ImageIcon;
import java.awt.Font;
/**
 *
 * @author Computer
 */
public class ListWitness extends javax.swing.JDialog {

    /**
     * Creates new form ListAccused
     */
Connection con=null;
String typeC;
String noPerson;
    public ListWitness(JFrame parrent,JSONObject datain) {
                super(parrent,true);

        initComponents();
         ImageIcon img = new ImageIcon("D://Master//WD.png");
            setIconImage(img.getImage());
            setTitle("ระบบสำนวนอิเล็คทรอนิกส์ (CRIMES)");
               txtCaseNO.setVisible(false);

        txtCaseNO.setText(datain.get("CaseIdWit")+"");
         typeC=datain.get("TypeCaseW")+"";
         RefreshData();
      
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableWitness = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonDeleteAccured = new javax.swing.JButton();
        jButtonEditAccured = new javax.swing.JButton();
        txtCaseNO = new javax.swing.JLabel();
        jButtonAddAccused = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jTableWitness.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        jTableWitness.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ชื่อ-นามสกุล", "เลขบัตรประชน", "เลขคดี"
            }
        ));
        jTableWitness.setGridColor(new java.awt.Color(255, 255, 255));
        jTableWitness.getTableHeader().setFont(new Font("TH SarabunPSK", Font.BOLD, 20));
        jTableWitness.getTableHeader().setOpaque(false);
        jTableWitness.setRowHeight(25);
        jTableWitness.setRowMargin(2);
        jTableWitness.setSelectionBackground(new java.awt.Color(0, 153, 255));
        jScrollPane1.setViewportView(jTableWitness);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(4, 93, 179));

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ข้อมูลพยานและบุคคลอื่นๆ");

        jButtonDeleteAccured.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        jButtonDeleteAccured.setText("ลบ");
        jButtonDeleteAccured.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteAccuredActionPerformed(evt);
            }
        });

        jButtonEditAccured.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        jButtonEditAccured.setText("แก้ไข");
        jButtonEditAccured.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditAccuredActionPerformed(evt);
            }
        });

        txtCaseNO.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N

        jButtonAddAccused.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        jButtonAddAccused.setText("เพิ่ม");
        jButtonAddAccused.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddAccusedActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("D:\\Master\\home.png")); // NOI18N
        jButton3.setText("เมนูหลัก");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonAddAccused, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditAccured, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDeleteAccured, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCaseNO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(35, 35, 35))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddAccused)
                    .addComponent(jButtonEditAccured)
                    .addComponent(jButtonDeleteAccured)
                    .addComponent(txtCaseNO)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddAccusedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddAccusedActionPerformed
        // TODO add your handling code here:
            JFrame frame = new JFrame();
             JDialog dialog = new JDialog(frame);//frame is owner
             JFrame s = (JFrame)(dialog.getParent());               
             s.removeAll();
       if(typeC.equals("ชันสูตร")){        
       Identity_witnessForm idw=new Identity_witnessForm(s,null);
       idw.pack();
       idw.setLocationRelativeTo(null);
       idw.setVisible(true);   
       }
       else{         
         WitnessForm wf=new WitnessForm(s,null);
        wf.pack();                            
        wf.setLocationRelativeTo(null);     
        wf.setVisible(true);
       }

        RefreshData();
       
    }//GEN-LAST:event_jButtonAddAccusedActionPerformed

    private void jButtonEditAccuredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditAccuredActionPerformed
          JFrame frame = new JFrame();
             JDialog dialog = new JDialog(frame);//frame is owner
             JFrame f = (JFrame)(dialog.getParent());               
             f.removeAll();
          String crimecaseno = txtCaseNO.getText();
        if(jTableWitness.getSelectedRow()>=0){
           
            try{
                String PeopleRegistrationID = jTableWitness.getModel().getValueAt(jTableWitness.getSelectedRow(), 0)+"";            
                String sql = "select NoPerson,Age,Amphur,BirthDay,BloodGroup,ExpiredDate,FatherFullName,FullNamePerson,FullNamePersonEn,Gender,\n" +
                        "Height,Weight,HouseNumber,IssueDate,Moo,MotherFullName,Nationality,Occupation,OtherName,PassportNumber,PeopleRegistrationID,\n" +
                        "PhonePerson,Province,Race,Religion,Tambon,TypePerson,ZipCode,caseIdPerson from person where TypePerson='พยานและบุคคลอื่นๆ' and PeopleRegistrationID='"+PeopleRegistrationID+ "' and caseIdPerson='"+crimecaseno+"'";
                Connection con = ConnectDatabase.connect();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
//                System.out.println("dddddddddddddd:"+sql);
                if(rs.next()){
                    JSONObject data = new JSONObject();
                      data.put("NoPerson", rs.getString("NoPerson"));
                    data.put("PeopleRegistrationID", rs.getString("PeopleRegistrationID"));
                    data.put("caseIdPerson", rs.getString("caseIdPerson"));
                    data.put("Age", rs.getString("Age"));
                    data.put("Amphur", rs.getString("Amphur"));
                    data.put("BirthDay", rs.getString("BirthDay"));
                    data.put("BloodGroup", rs.getString("BloodGroup"));
                    data.put("ExpiredDate", rs.getString("ExpiredDate"));
                    data.put("FatherFullName", rs.getString("FatherFullName"));
                    data.put("FullNamePerson", rs.getString("FullNamePerson"));
                    data.put("FullNamePersonEn", rs.getString("FullNamePersonEn"));
                    data.put("Gender", rs.getString("Gender"));
                    data.put("Height", rs.getString("Height"));
                    data.put("Weight", rs.getString("Weight"));
                    data.put("HouseNumber", rs.getString("HouseNumber"));
                    data.put("IssueDate", rs.getString("IssueDate"));
                    data.put("Moo", rs.getString("Moo"));
                    data.put("MotherFullName", rs.getString("MotherFullName"));
                    data.put("Nationality", rs.getString("Nationality"));
                    data.put("Occupation", rs.getString("Occupation"));
                    data.put("PassportNumber", rs.getString("PassportNumber"));
                    data.put("PhonePerson", rs.getString("PhonePerson"));
                    data.put("Province", rs.getString("Province"));
                    data.put("Race", rs.getString("Race"));
                    data.put("Religion", rs.getString("Religion"));
                    data.put("Tambon", rs.getString("Tambon"));
                    data.put("ZipCode", rs.getString("ZipCode"));
                            WitnessForm wF=new WitnessForm(f,data);
                            wF.pack();
                            wF.setLocationRelativeTo(null);                            
                            wF.setVisible(true);    		
                }
                
                rs.close();
                stmt.close();
                RefreshData();
            }catch(Exception ex){
                ex.printStackTrace();
            }
            
        
       
        }else{

        }
                                              
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditAccuredActionPerformed

    private void jButtonDeleteAccuredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteAccuredActionPerformed
              if(jTableWitness.getSelectedRow()>=0){
                  
            try{
                String crimecaseno = jTableWitness.getModel().getValueAt(jTableWitness.getSelectedRow(), 0)+"";
                String PeopleRegistrationID = jTableWitness.getModel().getValueAt(jTableWitness.getSelectedRow(), 2)+"";
                String sql = "Delete from person WHERE PeopleRegistrationID='"+PeopleRegistrationID+ "' and  caseIdPerson='"+crimecaseno+"'";
                Connection con = ConnectDatabase.connect();
                Statement stmt = con.createStatement();
                stmt.executeUpdate(sql);
                

                System.out.println("SQL : "+sql);
                stmt.close();
                RefreshData();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeleteAccuredActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        MainMenuWord.closeAllDialogs();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ListWitness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListWitness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListWitness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListWitness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new ListAccused().setVisible(true);

  
            }
        });
    }
     public void RefreshData(){
        try{
              
        Connection con = ConnectDatabase.connect();
        Statement stmt = con.createStatement();
        String a=txtCaseNO.getText();
        String sql = "select Age,Amphur,BirthDay,BloodGroup,ExpiredDate,FatherFullName,FullNamePerson,FullNamePersonEn,Gender,\n" +
                     "Height,HouseNumber,IssueDate,Moo,MotherFullName,Nationality,Occupation,OtherName,PassportNumber,PeopleRegistrationID,\n" +
                     "PhonePerson,Province,Race,Religion,Tambon,TypePerson,Weight,ZipCode,caseIdPerson from person where TypePerson='พยานและบุคคลอื่นๆ' and caseIdPerson='"+a+"'"+getFilterCondition();
      
        ResultSet rs = stmt.executeQuery(sql);
          System.out.println("SQL : "+sql);
        Vector<Vector> tabledata = new Vector<Vector>();
        while(rs.next()){
            Vector<String> row = new Vector<String>();
            row.add(rs.getString("PeopleRegistrationID"));
            row.add(rs.getString("FullNamePerson"));
            row.add(rs.getString("Age"));
            row.add(rs.getString("Race"));
            row.add(rs.getString("Nationality"));
            row.add(rs.getString("Religion"));
            tabledata.add(row);
        }
        rs.close();
        stmt.close();
        Vector ColumnName = new Vector();
         ColumnName.add("เลขบัตรประชาชน");
        ColumnName.add("ชื่อ-นามสุกล");
        ColumnName.add("อายุ");
        ColumnName.add("เชื้อชาติ");
        ColumnName.add("สัญชาติ");
        ColumnName.add("ศาสนา");
         System.out.println("SQL : "+sql);
     
        jTableWitness.setModel(new javax.swing.table.DefaultTableModel(
            tabledata,
            ColumnName
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
                         
           if(jTableWitness.getRowCount()<=0){
//             int rows = jTableAccure.getRowCount();
            if(typeC.equals("อาญา")){
            CrimesCaseEdit.jTextWitness.setText(""); 
            }
            if(typeC.equals("จราจร")){
            TrafficEdit.jTextWitness.setText(""); 
            }
              if(typeC.equals("ชันสูตร")){
            IdentityFrom.jTextWitness.setText(""); 
            }
            }
    
        if(jTableWitness.getRowCount()==1){
//             int rows = jTableAccure.getRowCount();
            if(typeC.equals("อาญา")){
            CrimesCaseEdit.jTextWitness.setText(jTableWitness.getValueAt(0, 1).toString()); 
            }
            if(typeC.equals("จราจร")){
            TrafficEdit.jTextWitness.setText(jTableWitness.getValueAt(0, 1).toString()); 
            }
              if(typeC.equals("ชันสูตร")){
            IdentityFrom.jTextWitness.setText(jTableWitness.getValueAt(0, 1).toString()); 
            }
            }
        if(jTableWitness.getRowCount()>1){
            
            if(typeC.equals("อาญา")){
            CrimesCaseEdit.jTextWitness.setText(jTableWitness.getValueAt(0, 1).toString()+"และพวก"); 
            }
            if(typeC.equals("จราจร")){
            TrafficEdit.jTextWitness.setText(jTableWitness.getValueAt(0, 1).toString()+"และพวก"); 
            }
              if(typeC.equals("ชันสูตร")){
            IdentityFrom.jTextWitness.setText(jTableWitness.getValueAt(0, 1).toString()+"และพวก"); 
            }
            }
        
          int rows = jTableWitness.getRowCount();
                       CrimesCaseEdit.jLabelNumberWitness.setText(rows+"");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
      private String getFilterCondition(){
        HashMap<String,String> filter = new HashMap<String,String>();
        if(txtCaseNO.getText().trim().length()>0){
            filter.put("caseIdPerson", txtCaseNO.getText().trim());
        }
        
        String[] key = filter.keySet().toArray(new String[0]);
        String result="";
        for(int i=0;i<key.length;i++){
            if(i==0){
                result=" and ";
            }
            if(i==key.length-1){
                result+= " "+key[i]+" LIKE '%"+filter.get(key[i])+"%'";
            }else{
                result+= " "+key[i]+" LIKE "+filter.get(key[i])+" and TypePerson='ผู้กล่าวหา' ";
            }
            System.out.println(result);
        }
        
        return result;
    }
      public static String IdCase(){
         Connection c=null;
         c=ConnectDatabase.connect();
            String sqlId="Select max(CaseId) caseid from CrimeCase";
        int id=0;
        try {
            Statement s=c.createStatement();
            ResultSet rs=s.executeQuery(sqlId);
            
            if (rs.next()) {
                id=rs.getInt("caseid"); 
            }
            
            if(id==0){
                id=1;
            }
            else{
                id=id+1;
            }
             return String.valueOf(id);
        
        } catch (Exception e) {
            return null;
//            System.out.println(e);
        } 
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAddAccused;
    private javax.swing.JButton jButtonDeleteAccured;
    private javax.swing.JButton jButtonEditAccured;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTableWitness;
    public static javax.swing.JLabel txtCaseNO;
    // End of variables declaration//GEN-END:variables
}

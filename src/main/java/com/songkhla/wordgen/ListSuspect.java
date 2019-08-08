/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.songkhla.wordgen;

import com.songkhla.wordgen.*;
import static com.songkhla.wordgen.CrimesCaseEdit.crimecaseid;
import static com.songkhla.wordgen.CrimesCaseEdit.jTextAccused;
import static com.songkhla.wordgen.ListAccused.jTableAccure;
import static com.songkhla.wordgen.ListAccused.txtCaseNO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JDialog;
import javax.swing.JFrame;
import org.json.simple.JSONObject;
import static com.songkhla.wordgen.ListSuspect.jTableSuspect;
import javax.swing.ImageIcon;
import java.awt.Font;
/**
 *
 * @author Computer
 */
public class ListSuspect extends javax.swing.JDialog {

    /**
     * Creates new form ListAccused
     */
Connection con=null;
String typeC,cid;
    public ListSuspect(JFrame parrent,JSONObject datain) {
        super(parrent,true);
        initComponents(); 
         ImageIcon img = new ImageIcon("./Master/WD.png");
            setIconImage(img.getImage());
            setTitle("ระบบสำนวนอิเล็คทรอนิกส์ (CRIMES)");
         
            
                txtCaseNO.setVisible(false);
                jLabel2.setVisible(false);

       txtCaseNO.setText(datain.get("CaseIdSus")+"");    
       cid=datain.get("CaseIdSus")+"";
        typeC=datain.get("TypeCaseS")+"";
        jLabel2.setText(typeC);
        if(typeC.equals("Dead")){
        jLabel1.setText("ข้อมูลผู้ตาย");
        }
//        System.out.println("sfsd : "+typeC);
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
        jTableSuspect = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonDeleteAccured = new javax.swing.JButton();
        jButtonEditAccured = new javax.swing.JButton();
        txtCaseNO = new javax.swing.JLabel();
        jButtonAddAccused = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jTableSuspect.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        jTableSuspect.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ชื่อ-นามสกุล", "เลขบัตรประชน", "เลขคดี"
            }
        ));
        jTableSuspect.setGridColor(new java.awt.Color(255, 255, 255));
        jTableSuspect.getTableHeader().setFont(new Font("TH SarabunPSK", Font.BOLD, 20));
        jTableSuspect.getTableHeader().setOpaque(false);
        jTableSuspect.setRowHeight(25);
        jTableSuspect.setRowMargin(2);
        jTableSuspect.setSelectionBackground(new java.awt.Color(0, 153, 255));
        jScrollPane1.setViewportView(jTableSuspect);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(4, 93, 179));

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ข้อมูลผู้ต้องหา");

        jButtonDeleteAccured.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jButtonDeleteAccured.setText("ลบ");
        jButtonDeleteAccured.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteAccuredActionPerformed(evt);
            }
        });

        jButtonEditAccured.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jButtonEditAccured.setText("แก้ไข");
        jButtonEditAccured.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditAccuredActionPerformed(evt);
            }
        });

        txtCaseNO.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        txtCaseNO.setText("Ni");

        jButtonAddAccused.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jButtonAddAccused.setText("เพิ่ม");
        jButtonAddAccused.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddAccusedActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("./Master/home.png"));
        jButton2.setText("เมนูหลัก");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

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
                        .addComponent(txtCaseNO, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(36, 36, 36))))
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
                    .addComponent(txtCaseNO, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton2))
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
         if(typeC.equals("Dead")){        
       Identity_DeadForm idd=new Identity_DeadForm(s,null);
        idd.pack();
      idd.setLocationRelativeTo(null);       
       idd.setVisible(true);   
       }

       else{         
        SuspectForm susF=new SuspectForm(s,null);
        susF.pack();
      susF.setLocationRelativeTo(null);         
           susF.setVisible(true);
       }

        RefreshData();
       
    }//GEN-LAST:event_jButtonAddAccusedActionPerformed

    private void jButtonEditAccuredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditAccuredActionPerformed
          JFrame frame = new JFrame();
             JDialog dialog = new JDialog(frame);//frame is owner
             JFrame f = (JFrame)(dialog.getParent());               
             f.removeAll();
          String crimecaseno = txtCaseNO.getText();
        if(jTableSuspect.getSelectedRow()>=0){
           
            try{
                String Noperson = jTableSuspect.getModel().getValueAt(jTableSuspect.getSelectedRow(), 7)+"";            
                String sql = "select NoPerson,Identification,CurrentAddress,Age,Amphur,BirthDay,BloodGroup,ExpiredDate,FatherFullName,FullNamePerson,FullNamePersonEn,Gender,\n" +
                        "Height,Weight,HouseNumber,IssueDate,Moo,MotherFullName,Nationality,Occupation,OtherName,PassportNumber,PeopleRegistrationID,\n" +
                        "PhonePerson,OrderPerson,StatusSuspect,BailDate,StatusBail,RatePrison,CourtSuspect,ArrestDateTimeEnd,Province,Race,Religion,Tambon,TypePerson,"
                        + "ZipCode,caseIdPerson,ArrestDateTime,PlaceArrest,SusConfress,PlaceOfFoundBody,DeathLocation,BodyFoundDate,BodyFoundTime,DateOfDie,TimeOfDie\n"
                        + "from person where noperson='"+Noperson+ "' and caseIdPerson='"+crimecaseno+"' and TypePerson='ผู้ต้องหา'";
                Connection con = ConnectDatabase.connect();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                System.out.println("dddddddddddddd:"+sql);
                if(rs.next()){
                    JSONObject data = new JSONObject();
                      data.put("StatusSuspect", rs.getString("StatusSuspect"));
                      data.put("NoPerson", rs.getString("NoPerson"));
                    data.put("PeopleRegistrationID", rs.getString("PeopleRegistrationID"));
                    data.put("crimecaseno", rs.getString("caseIdPerson"));
                     data.put("Identification", rs.getString("Identification"));
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
                    data.put("OrderPerson", rs.getString("OrderPerson"));
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
                    data.put("CurrentAddress", rs.getString("CurrentAddress"));
                    data.put("ArrestDateTime", rs.getString("ArrestDateTime"));
                    data.put("ArrestDateTimeEnd", rs.getString("ArrestDateTimeEnd"));
                    data.put("StatusBail", rs.getString("StatusBail"));
                    data.put("RatePrison", rs.getString("RatePrison"));
                    data.put("CourtSuspect", rs.getString("CourtSuspect"));
                     data.put("BailDate", rs.getString("BailDate"));
                     data.put("ZipCode", rs.getString("ZipCode"));
                     data.put("SusConfress", rs.getString("SusConfress"));
                    data.put("PlaceArrest", rs.getString("PlaceArrest"));
                    data.put("caseIdPerson", rs.getString("caseIdPerson"));
                    data.put("PlaceOfFoundBody", rs.getString("PlaceOfFoundBody"));
                   data.put("DeathLocation", rs.getString("DeathLocation"));
                   data.put("BodyFoundDate", rs.getString("BodyFoundDate"));
                data.put("BodyFoundTime", rs.getString("BodyFoundTime"));
                   data.put("DateOfDie", rs.getString("DateOfDie"));
                   data.put("TimeOfDie", rs.getString("TimeOfDie"));
                            SuspectForm suspectF=new SuspectForm(f,data);
                             suspectF.pack();
                             suspectF.setLocationRelativeTo(null);
                            suspectF.setVisible(true);    		
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
              if(jTableSuspect.getSelectedRow()>=0){
            String aa=txtCaseNO.getText();      
            try{
//                String crimecaseno = jTableSuspect.getModel().getValueAt(jTableSuspect.getSelectedRow(), 0)+"";
                String Noperson = jTableSuspect.getModel().getValueAt(jTableSuspect.getSelectedRow(), 7)+"";
                String sql = "Delete from person WHERE Noperson='"+Noperson+ "' and  caseIdPerson='"+aa+"' and TypePerson='ผู้ต้องหา';\n"+
                             "Delete from Deliverysuspect WHERE delipersonid='"+Noperson+"';\n"+
                             "Delete from BailAsset WHERE BailPersonId='"+Noperson+"';";
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MainMenuWord.closeAllDialogs();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ListSuspect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListSuspect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListSuspect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListSuspect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
//         String type=null;
//         if(typeC.equals("อาญา")){
//            type="ผู้ต้องหา";
////             type="ผู้ตาย";
//            
//         }
//         else{
//             type="ผู้ตาย";
//            
//         }
        Connection con = ConnectDatabase.connect();
        Statement stmt = con.createStatement();
        String a=txtCaseNO.getText();
        String type=null;
        if(typeC.equals("Dead")){
            type="ผู้ตาย";
        }
        else{
            type="ผู้ต้องหา";
        }
        String sql = "select NoPerson,Age,Amphur,BirthDay,BloodGroup,ExpiredDate,FatherFullName,FullNamePerson,FullNamePersonEn,Gender,\n" +
                     "Height,HouseNumber,IssueDate,Moo,MotherFullName,Nationality,Occupation,OtherName,PassportNumber,PeopleRegistrationID,\n" +
                     "PhonePerson,OrderPerson,Province,Race,Religion,Tambon,TypePerson,Weight,ZipCode,caseIdPerson from person where TypePerson='"+type+"'"
                + " and caseIdPerson='"+a+"' order by OrderPerson ASC";
      
        ResultSet rs = stmt.executeQuery(sql);
          System.out.println("SQL : "+sql);
        Vector<Vector> tabledata = new Vector<Vector>();
        while(rs.next()){
            Vector<String> row = new Vector<String>();
            row.add(rs.getString("OrderPerson"));            
            row.add(rs.getString("PeopleRegistrationID"));
            row.add(rs.getString("FullNamePerson"));
            row.add(rs.getString("Age"));
            row.add(rs.getString("Race"));
            row.add(rs.getString("Nationality"));
            row.add(rs.getString("Religion"));
            row.add(rs.getString("NoPerson"));

            tabledata.add(row);
        }
        rs.close();
        stmt.close();
        Vector ColumnName = new Vector();
        
         if(typeC.equals("Dead")){
         ColumnName.add("ลำดับผู้ตาย");
         }
         else{
         ColumnName.add("ลำดับผู้ต้องหา");}
         ColumnName.add("เลขบัตรประชาชน");
        ColumnName.add("ชื่อ-นามสุกล");
        ColumnName.add("อายุ");
        ColumnName.add("เชื้อชาติ");
        ColumnName.add("สัญชาติ");
        ColumnName.add("ศาสนา");
        ColumnName.add("เลขคน");
         System.out.println("SQL : "+sql);
     
        jTableSuspect.setModel(new javax.swing.table.DefaultTableModel(
            tabledata,
            ColumnName
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, 
                java.lang.String.class, java.lang.String.class, java.lang.String.class,
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
         jTableSuspect.getColumnModel().getColumn(7).setWidth(0);
jTableSuspect.getColumnModel().getColumn(7).setMinWidth(0);
jTableSuspect.getColumnModel().getColumn(7).setMaxWidth(0); 
                             System.out.println("SQL : "+sql);
        
   
    if(jTableSuspect.getRowCount()==1){
//             int rows = jTableAccure.getRowCount();
            if(typeC.equals("อาญา")){
                 int rows = jTableSuspect.getRowCount();
             CrimesCaseEdit.jLabelNumberSus.setText(rows+"");
            CrimesCaseEdit.jTextSuspect.setText(jTableSuspect.getValueAt(0, 2).toString()); 
            }
            if(typeC.equals("จราจร")){
                 int rows = jTableSuspect.getRowCount();
             TrafficEdit.jLabelNumberSus.setText(rows+"");
            TrafficEdit.jTextSuspect.setText(jTableSuspect.getValueAt(0, 2).toString()); 
            }
              if(typeC.equals("Dead")){
                  int rows = jTableSuspect.getRowCount();
             IdentityEdit.jLabelNumberSus.setText(rows+"");
            IdentityEdit.jTextSuspect.setText(jTableSuspect.getValueAt(0, 2).toString()); 
            }
            }
      if(jTableSuspect.getRowCount()<=0){
//             int rows = jTableAccure.getRowCount();
            if(typeC.equals("อาญา")){
            CrimesCaseEdit.jTextSuspect.setText(""); 
            }
            if(typeC.equals("จราจร")){
            TrafficEdit.jTextSuspect.setText(""); 
            }
              if(typeC.equals("Dead")){
            IdentityEdit.jTextSuspect.setText(""); 
            }
            }
            if(jTableSuspect.getRowCount()>1){
            
            if(typeC.equals("อาญา")){
             int rows = jTableSuspect.getRowCount();
             CrimesCaseEdit.jLabelNumberSus.setText(rows+"");
            CrimesCaseEdit.jTextSuspect.setText(jTableSuspect.getValueAt(0, 2).toString()+"และพวก"); 
            }
            if(typeC.equals("จราจร")){
                int rows = jTableSuspect.getRowCount();
             TrafficEdit.jLabelNumberSus.setText(rows+"");
            TrafficEdit.jTextSuspect.setText(jTableSuspect.getValueAt(0, 2).toString()+"และพวก"); 
            }
              if(typeC.equals("Dead")){
                     int rows = jTableSuspect.getRowCount();
             IdentityEdit.jLabelNumberSus.setText(rows+"");
            IdentityEdit.jTextSuspect.setText(jTableSuspect.getValueAt(0, 2).toString()+"และพวก"); 
            }
            }
    
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
//      private String getFilterCondition(){
//        HashMap<String,String> filter = new HashMap<String,String>();
//        if(txtCaseNO.getText().trim().length()>0){
//            filter.put("caseIdPerson", txtCaseNO.getText().trim());
//        }
//        
//        String[] key = filter.keySet().toArray(new String[0]);
//        String result="";
//        for(int i=0;i<key.length;i++){
//            if(i==0){
//                result=" and ";
//            }
//            if(i==key.length-1){
//                result+= " "+key[i]+" LIKE '%"+filter.get(key[i])+"%'";
//            }else{
//                result+= " "+key[i]+" LIKE "+filter.get(key[i])+" and TypePerson='ผู้กล่าวหา' ";
//            }
//            System.out.println(result);
//        }
//        
//        return result;
//    }
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
    public static String Checknull(String input){
                    if(input==null||input==""||input=="null") { return ""; }
                    return input;
		}  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAddAccused;
    private javax.swing.JButton jButtonDeleteAccured;
    private javax.swing.JButton jButtonEditAccured;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTableSuspect;
    public static javax.swing.JLabel txtCaseNO;
    // End of variables declaration//GEN-END:variables
}

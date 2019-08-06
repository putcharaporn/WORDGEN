/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.songkhla.wordgen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;

/**
 *
 * @author Petpilin
 */
public class SueCrimesAdd extends javax.swing.JDialog {
    Connection con=null;
    PreparedStatement pst=null;
    DataCase dc =new DataCase();
    boolean isinsert;
    String caseid,personid;
    /**
     * Creates new form SueCrimesAdd
     */
    public SueCrimesAdd(JFrame parrent,JSONObject datain,JSONObject dataId) {
        super(parrent,true);
        initComponents();
         ImageIcon img = new ImageIcon("./Master/WD.png");
        setIconImage(img.getImage());
        setTitle("ระบบสำนวนอิเล็คทรอนิกส์ (CRIMES)");
        comboInvest();
         jLabel3.setVisible(false);
         jLabel2.setVisible(false); 
//        if(dataId !=null){
//         personid=dataId.get("SuePersonId")+"";
//         caseid=dataId.get("SueCaseId")+"";  }
//        else{
//         personid=dataId.get("SuePersonId")+"";
//         caseid=dataId.get("SueCaseId")+"";  }
//        
//        
//         
//    
//    jLabel3.setText(personid);
//         jLabel2.setText(caseid); 
        if(dataId !=null){
         personid=dataId.get("SuePersonId")+"";
         caseid=dataId.get("SueCaseId")+""; 
         jLabel3.setText(personid);
          jLabel2.setText(caseid);   
           SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
            Date date = new Date();
            dateFormat.format(date);
               SueDate.setDate(date);                
          SueStart.setDate(date);                
          SueEnd.setDate(date);  
        }
        else {
                 personid=dataId.get("SuePersonId")+"";
         caseid=dataId.get("SueCaseId")+""; 
         jLabel3.setText(personid);
          jLabel2.setText(caseid);   
           SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
            Date date = new Date();
            dateFormat.format(date);
               SueDate.setDate(date);                
          SueStart.setDate(date);                
          SueEnd.setDate(date);  
        
        
        }
            if(datain!=null){
             personid=dataId.get("SuePersonId")+"";
            caseid=dataId.get("SueCaseId")+""; 
            jLabel3.setText(personid);
             jLabel2.setText(caseid);  


            }
   
      if(datain!=null){
          try{
                 String sd=datain.get("SueDate")+"";
                 String ss=datain.get("SueStart")+"";
                 String se=datain.get("SueEnd")+"";
        
                 SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
                 Date sueD=dateFormat.parse(sd);
                 Date sueS=dateFormat.parse(ss);
                 Date sueE=dateFormat.parse(se);
                 jLabel3.setText(datain.get("SuePersonId")+"");
                 jLabel2.setText(datain.get("SueCaseId")+"");               
                 SueTimes.setText(datain.get("SueTimes")+"");
                 SueTotal.setText(datain.get("SueTotal")+"");   
                  SueDate.setDate(sueD);                
                 SueStart.setDate(sueS);                
                 SueEnd.setDate(sueE);    
//                 SueDate.setText(datain.get("SueDate")+"");                
//                 SueStart.setText(datain.get("SueStart")+"");                
//                 SueEnd.setText(datain.get("SueEnd")+"");                 
                 SueCause.setSelectedItem(datain.get("SueCause"));
                 jComboSueRequest.setSelectedItem(datain.get("SueRequest"));
          }
          catch (ParseException ex) {
                Logger.getLogger(CrimesCaseEdit.class.getName()).log(Level.SEVERE, null, ex);
            }
      }
      else{
      isinsert=true;
       
              
        
          jLabel3.setText(personid);
          jLabel2.setText(caseid);   
                  
      }
//         System.out.println("llllllll: "+sueTimes());
        
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        NoImprison = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        SueTotal = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        PoliceStationName = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        SueCause = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        StatusSueAndPutInJail = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jButtonSaveSue = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jComboSueRequest = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        SueDate = new com.toedter.calendar.JDateChooser();
        SueStart = new com.toedter.calendar.JDateChooser();
        SueEnd = new com.toedter.calendar.JDateChooser();
        SueTimes = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel3.setBackground(new java.awt.Color(77, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("เพิ่ม/แก้ไขการขออนุญาตผัดฟ้องฝากขัง");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel11.setText("ครั้งที่ผัดฟ้องฝากขัง");

        jLabel12.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel12.setText("เลขที่คำร้องผัดฟ้อง");

        NoImprison.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N

        jLabel13.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel13.setText("จำนวน");

        SueTotal.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        SueTotal.setText("6");

        jLabel14.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel14.setText("วันที่เริ่ม");

        jLabel16.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel16.setText("วัน");

        jLabel18.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel18.setText("สถานที่ควบคุมตัว");

        PoliceStationName.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N

        jLabel19.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel19.setText("เหตุผัดฟ้องฝากขัง");

        SueCause.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        SueCause.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "สอบพยานอีก 5 ปาก และรอผลการตรวจสอบพิมพ์มือผู้ต้องหา", "สอบพยานอีก 4 ปาก และรอผลการตรวจสอบพิมพ์มือผู้ต้องหา", "สอบพยานอีก 3 ปาก และรอผลการตรวจสอบพิมพ์มือผู้ต้องหา", "สอบพยานอีก 2 ปาก และรอผลการตรวจสอบพิมพ์มือผู้ต้องหา", "สอบพยานอีก 1 ปาก และรอผลการตรวจสอบพิมพ์มือผู้ต้องหา", "รอผลการตรวจสอบพิมพ์มือผู้ต้องหา" }));

        jLabel20.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel20.setText("สถานะการผัดฟ้อง");

        StatusSueAndPutInJail.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        StatusSueAndPutInJail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ควบคุมตัว", "ควบคุมตัว(กรณีเยาวชน)", "ขอควบคุมตัว", "ประกันตัว", "ขอประกันตัว", "ฝากขัง", "ผัดฟ้อง", "ผัดฟ้อง/ฝากขัง", "ส่งฟ้อง", "ปล่อยตัว", "ขอถอนประกันตัว", "ถอนประกันตัว" }));

        jLabel21.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel21.setText("วันที่สิ้นสุด");

        jButtonSaveSue.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jButtonSaveSue.setText("บันทึก");
        jButtonSaveSue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveSueActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jButton5.setText("ยกเลิก");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel2.setText("df");

        jLabel17.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel17.setText("วันฝาก");

        jLabel25.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel25.setText("ผู้ร้อง");

        jComboSueRequest.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N

        jLabel3.setText("rrr");

        SueDate.setDateFormatString("dd/mm/yyyy");

        SueStart.setDateFormatString("dd/mm/yyyy");

        SueEnd.setDateFormatString("dd/mm/yyyy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(80, 80, 80)
                        .addComponent(jComboSueRequest, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PoliceStationName))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13))
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SueTotal)
                                    .addComponent(SueStart, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel16))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel17))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(SueDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(SueEnd, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SueTimes, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                    .addComponent(NoImprison))
                                .addGap(289, 289, 289)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StatusSueAndPutInJail, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SueCause, 0, 555, Short.MAX_VALUE))))
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSaveSue, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SueTimes, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(NoImprison, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17))
                    .addComponent(SueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SueStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel21))
                    .addComponent(SueEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(SueTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(PoliceStationName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(SueCause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(StatusSueAndPutInJail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jComboSueRequest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSaveSue)
                    .addComponent(jButton5))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveSueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveSueActionPerformed
            // TODO add your handling code here:
        
        con=ConnectDatabase.connect();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/mm/yyyy");
        String sueDate=formatDate.format(SueDate.getDate());
        String sueStart=formatDate.format(SueStart.getDate());
        String sueEnd=formatDate.format(SueEnd.getDate());
    if(isinsert){
    
    String sql="INSERT INTO Sue (SueTimes,SueDate,SueStart,SueEnd,SueTotal,SueCause,\n"
                         + "SueRequest,SuePersonId,SueCaseId) VALUES (?,?,?,?,?,?,?,?,?)";
        try {

             
                
                pst=con.prepareStatement(sql);
                pst.setString(1,SueTimes.getText());
                pst.setString(2,sueDate);
                pst.setString(3,sueStart);
                pst.setString(4,sueEnd);
                pst.setString(5,SueTotal.getText());
                pst.setString(6,SueCause.getSelectedItem()+"");
                pst.setString(7,jComboSueRequest.getSelectedItem()+"");
                pst.setString(8,personid);
                pst.setString(9,caseid);

              
                pst.executeUpdate();
           JOptionPane.showMessageDialog(jPanel1,null,"Data Save",  JOptionPane.INFORMATION_MESSAGE);

                pst.close();
             }
         catch (Exception e) {
           JOptionPane.showMessageDialog(jPanel1, null, "Data Save", JOptionPane.INFORMATION_MESSAGE);

            System.out.println(e);
        }
}
           else{
    try{
                String sqlUpdate= "UPDATE Sue Set\n "
                + "SueTimes=?,"
                + "SueDate=?,"
                + "SueStart=?,"
                + "SueEnd=?,"
                + "SueTotal=?,"
                + "SueCause=?,"
                + "SueRequest=?"                   
                + "Where SuePersonId=? and SueCaseId=?";

                pst.setString(1,SueTimes.getText());
                pst.setString(2,sueDate);
                pst.setString(3,sueStart);
                pst.setString(4,sueEnd);
                pst.setString(5,SueTotal.getText());
                pst.setString(6,SueCause.getSelectedItem()+"");
                pst.setString(7,jComboSueRequest.getSelectedItem()+"");
                pst.setString(8,personid);
                pst.setString(9,caseid);

                pst.executeUpdate();
           JOptionPane.showMessageDialog(jPanel1, null, "Data Save", JOptionPane.INFORMATION_MESSAGE);

                System.out.println("SQL : "+sqlUpdate);
            
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(jPanel1,e,null, JOptionPane.INFORMATION_MESSAGE);
            System.out.println("SQL : "+pst);
        }
    
    }
        setVisible(false);
    }//GEN-LAST:event_jButtonSaveSueActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed
 
    /**
     * @param args the command line arguments
     */
//  public static String sueTimes(){
//         Connection con=null;
//         con=ConnectDatabase.connect();
//  
//            String sqlId="Select max(SueTimes) suetimes from Sue where SueCaseId="+personid;
//            
//        int id=0;
//        try {
//            Statement s=con.createStatement();
//            ResultSet rs=s.executeQuery(sqlId);
//            
//            if (rs.next()) {
//                id=rs.getInt("suetimes"); 
//            }
//            
//            if(id==0){
//                id=1;
//            }
//            else{
//                id=id+1;
//            }
//             return String.valueOf(id);
//        
//        } catch (Exception e) {
//            return null;
////            System.out.println(e);
//        } 
//    
//    }
     public void comboInvest(){
    
     try {

         Connection con2 = ConnectDatabase.connect();
	Statement st = con2.createStatement();
        	String c = "Select InvestName from InvestInformation";
        	ResultSet res = st.executeQuery(c);
	//Vector<Object> v=new Vector<Object>();
	
	while(res.next())
	{
	jComboSueRequest.addItem(res.getString("InvestName"));

	
	}
}
catch (Exception d) {  //System.out.println(d);  
} 
     }
   public static String IdPerson(){
         Connection con=null;
         con=ConnectDatabase.connect();
            String sqlId="Select max(NoPerson) noPerson from Person";
        int id=0;
        try {
            Statement s=con.createStatement();
            ResultSet rs=s.executeQuery(sqlId);
            
            if (rs.next()) {
                id=rs.getInt("noPerson"); 
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
            java.util.logging.Logger.getLogger(SueCrimesAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SueCrimesAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SueCrimesAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SueCrimesAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new SueCrimesAdd().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NoImprison;
    private javax.swing.JTextField PoliceStationName;
    private javax.swing.JComboBox<String> StatusSueAndPutInJail;
    private javax.swing.JComboBox<String> SueCause;
    private com.toedter.calendar.JDateChooser SueDate;
    private com.toedter.calendar.JDateChooser SueEnd;
    private com.toedter.calendar.JDateChooser SueStart;
    private javax.swing.JTextField SueTimes;
    private javax.swing.JTextField SueTotal;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonSaveSue;
    private javax.swing.JComboBox<String> jComboSueRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
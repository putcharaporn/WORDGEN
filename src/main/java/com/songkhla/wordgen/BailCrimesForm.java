/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.songkhla.wordgen;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Properties;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableCellRenderer;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import org.json.simple.JSONObject;
import org.xlsx4j.sml.Col;

/**
 *
 * @author Petpilin
 */
public class BailCrimesForm extends javax.swing.JFrame {
    Connection con=null;
    PreparedStatement pst=null;
    DataCase dc =new DataCase();
    JDatePickerImpl DateSearch;


    /**
     * Creates new form BailCrimesForm
     */
    public BailCrimesForm() {
        initComponents();
            ImageIcon img = new ImageIcon("D://Master//WD.png");
            setIconImage(img.getImage());
            setTitle("ระบบสำนวนอิเล็คทรอนิกส์ (CRIMES)");
        eventJStatusManage();
        RefreshData();
//        ShowData();
        UtilDateModel model = new UtilDateModel();
            model.setValue(Calendar.getInstance().getTime());
            Properties p = new Properties();
            p.put("text.today", "Today");
            p.put("text.month", "Month");
            p.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
         DateSearch = new JDatePickerImpl(datePanel,new DateLabelFormatter());
        DateSearch.setTextEditable(true);
        DateSearch.setBackground(Color.WHITE);
        jPanelDateSearch.setLayout(new FlowLayout());
        jPanelDateSearch.add(DateSearch);  
        
  
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBail = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        crimecaseno = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SuspectFullName = new javax.swing.JTextField();
        ChargeName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PlaceArrest = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ArrestDate = new javax.swing.JTextField();
        jCheckOnly = new javax.swing.JCheckBox();
        jComboStatus = new javax.swing.JComboBox<>();
        AddEditBail = new javax.swing.JButton();
        jPanelDateSearch = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1270, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(46, 156, 202));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ผู้ต้องหาประกันตัว");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(1173, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        jTableBail.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jTableBail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "เลขคดี", "คดี", "ผู้ต้องหา", "วันรับคำร้องทุกข์", "วันประกัน", "ครบ 1 เดือน", "ครบ 2 เดือน", "ครบ 3 เดือน", "ครบ 4 เดือน", "ครบ 5 เดือน", "ครบ 6 เดือน", "ครบ 1 ปี"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableBail.setGridColor(new java.awt.Color(0, 0, 0));
        jTableBail.setRowHeight(20);
        jTableBail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBailMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableBail);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        crimecaseno.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        crimecaseno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        crimecaseno.setBorder(null);
        crimecaseno.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        crimecaseno.setEnabled(false);

        jLabel30.setBackground(java.awt.SystemColor.activeCaptionBorder);
        jLabel30.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel30.setText("เลขคดีที่ ");

        jLabel5.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel5.setText("ชื่อผู้ต้องหา");

        SuspectFullName.setEditable(false);
        SuspectFullName.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        SuspectFullName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SuspectFullName.setBorder(null);

        ChargeName.setEditable(false);
        ChargeName.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        ChargeName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ChargeName.setBorder(null);

        jLabel6.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel6.setText("ข้อหา");

        jLabel7.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel7.setText("สถานที่จับกุม");

        PlaceArrest.setEditable(false);
        PlaceArrest.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        PlaceArrest.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PlaceArrest.setBorder(null);

        jLabel8.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel8.setText("วันที่จับกุม");

        ArrestDate.setEditable(false);
        ArrestDate.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        ArrestDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ArrestDate.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PlaceArrest))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(crimecaseno, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SuspectFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ArrestDate))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ChargeName)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crimecaseno)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SuspectFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChargeName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlaceArrest, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(ArrestDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jCheckOnly.setBackground(new java.awt.Color(255, 255, 255));
        jCheckOnly.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jCheckOnly.setText("เฉพาะคดีระหว่างสอบสวน");
        jCheckOnly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckOnlyActionPerformed(evt);
            }
        });

        jComboStatus.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jComboStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ประกัน", "แจ้งข้อหาปล่อยตัว", "แจ้งข้อหาฝากขัง", "ไม่ได้ตัว", "ไม่รู้ตัว", "ฟ้องวาจา", "ส่งฟื้นฟู", "อื่นๆ" }));
        jComboStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboStatusActionPerformed(evt);
            }
        });

        AddEditBail.setIcon(new javax.swing.ImageIcon("D:\\Master\\edit (1).png")); // NOI18N
        AddEditBail.setText("แก้ไข");
        AddEditBail.setPreferredSize(new java.awt.Dimension(79, 30));
        AddEditBail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEditBailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDateSearchLayout = new javax.swing.GroupLayout(jPanelDateSearch);
        jPanelDateSearch.setLayout(jPanelDateSearchLayout);
        jPanelDateSearchLayout.setHorizontalGroup(
            jPanelDateSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 257, Short.MAX_VALUE)
        );
        jPanelDateSearchLayout.setVerticalGroup(
            jPanelDateSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        jButton1.setText("ค้นหา");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AddEditBail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelDateSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(24, 24, 24)
                        .addComponent(jCheckOnly)
                        .addGap(18, 18, 18)
                        .addComponent(jComboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(104, 104, 104))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckOnly)
                            .addComponent(jComboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelDateSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddEditBail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1264, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckOnlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckOnlyActionPerformed
        // TODO add your handling code here:
        RefreshData();
    }//GEN-LAST:event_jCheckOnlyActionPerformed

    private void AddEditBailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEditBailActionPerformed
        // TODO add your handling code here:
        
          if(jTableBail.getSelectedRow()>=0){
            try{
                String crimecaseid = jTableBail.getModel().getValueAt(jTableBail.getSelectedRow(), 0)+"";
                String fullname = jTableBail.getModel().getValueAt(jTableBail.getSelectedRow(), 1)+"";

                String sql="select crimecasenoyear,NoPerson,crimecaseno,Investigator_Result,TypePerson,ArrestDateTimeEnd,BailDate,"
                        + "PeopleRegistrationID,PlaceArrest,ArrestDateTime,FullNamePerson,StatusSuspect,CaseId,CaseIdPerson,"
                        + "CaseAcceptDate,ChargeCode,ChargeName\n" +
                     "from Person\n" +
                     "left join CrimeCase on Person.CaseIdPerson=CrimeCase.CaseId\n"+
                     "left join Charge on CrimeCase.ChargeCodeCase=Charge.ChargeCode\n"+                  
                     "where TypePerson='ผู้ต้องหา' and crimecasenoyear='"+crimecaseid+"' and FullNamePerson='"+fullname+"'";
                Connection con = ConnectDatabase.connect();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                System.out.println("ExSql : "+sql);
                if(rs.next()){
                    JSONObject data = new JSONObject();
                    data.put("CaseId", rs.getString("CaseId"));
                    data.put("crimecaseno", rs.getString("crimecaseno"));
                    data.put("crimecasenoyear", rs.getString("crimecasenoyear"));
                    data.put("ChargeCode", rs.getString("ChargeCode"));
                    data.put("ChargeName", rs.getString("ChargeName"));
                    data.put("FullNamePerson", rs.getString("FullNamePerson"));
                    data.put("CaseIdPerson", rs.getString("CaseIdPerson"));
                    data.put("NoPerson", rs.getString("NoPerson"));
                                        data.put("PlaceArrest", rs.getString("PlaceArrest"));
                    data.put("ArrestDateTime", rs.getString("ArrestDateTime"));
                     data.put("ArrestDateTimeEnd", rs.getString("ArrestDateTimeEnd"));                   
                    data.put("BailDate", rs.getString("BailDate"));


                    BailCrimesAdd bca =new BailCrimesAdd(this,data);
                    bca.pack();
                    bca.setLocationRelativeTo(null);
                    bca.setVisible(true);
                }

                rs.close();
                stmt.close();
                RefreshData();
            }catch(Exception ex){
                ex.printStackTrace();

            }
        }else{

        }
    }//GEN-LAST:event_AddEditBailActionPerformed

    private void jTableBailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBailMouseClicked
        // TODO add your handling code here:
       
           try{
            String crimecaseid = jTableBail.getModel().getValueAt(jTableBail.getSelectedRow(), 0)+"";
            String fullname = jTableBail.getModel().getValueAt(jTableBail.getSelectedRow(), 1)+"";

            String  sql= "select crimecasenoyear,ChargeName,Investigator_Result,TypePerson,BailDate,"
                    + "PeopleRegistrationID,PlaceArrest,ArrestDateTime,FullNamePerson,StatusSuspect,CaseId,CaseIdPerson,"
                    + "CaseAcceptDate \n" +
            "from Person\n" +
            "left join CrimeCase on Person.CaseIdPerson=CrimeCase.CaseId "+
            "left join Charge on CrimeCase.ChargeCodeCase=Charge.ChargeCode "  +
            "where TypePerson='ผู้ต้องหา' and  crimecasenoyear='"+crimecaseid+"' and FullNamePerson='"+fullname+"'" ;
            Connection con = ConnectDatabase.connect();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("ExSql : "+sql);
            if(rs.next()){
                crimecaseno.setText(rs.getString("crimecasenoyear"));
                SuspectFullName.setText(rs.getString("FullNamePerson"));
                ChargeName.setText(rs.getString("ChargeName"));
                PlaceArrest.setText(rs.getString("PlaceArrest"));
                ArrestDate.setText(rs.getString("ArrestDateTime"));
            }

            rs.close();
            stmt.close();
            
        }catch(Exception ex){
            ex.printStackTrace();

        }
        
    }//GEN-LAST:event_jTableBailMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        RefreshData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboStatusActionPerformed
        // TODO add your handling code here:
        RefreshData();
    }//GEN-LAST:event_jComboStatusActionPerformed
 public void eventJStatusManage(){
//     String a= jComboStatus.getSelectedItem()+"";
//     if(a.equals("ประกัน"))
//     {AddEditBail.setVisible(true);}
//     else{AddEditBail.setVisible(false);}
        jComboStatus.addActionListener (new ActionListener () {
                public void actionPerformed(ActionEvent e) {

                }
            });
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
            java.util.logging.Logger.getLogger(BailCrimesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BailCrimesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BailCrimesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BailCrimesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BailCrimesForm().setVisible(true);
            }
        });
    }
    public void ShowData(){
     if(jTableBail.getSelectedRow()>=0){
            try{
                  String crimecaseid = jTableBail.getModel().getValueAt(jTableBail.getSelectedRow(), 0)+"";
            String fullname = jTableBail.getModel().getValueAt(jTableBail.getSelectedRow(), 1)+"";

            String  sql= "select crimecasenoyear,ChargeName,Investigator_Result,TypePerson,BailDate,"
                    + "PeopleRegistrationID,FullNamePerson,StatusSuspect,CaseId,CaseIdPerson,"
                    + "CaseAcceptDate \n" +
            "from Person\n" +
            "left join CrimeCase on Person.CaseIdPerson=CrimeCase.CaseId "+
            "left join Charge on CrimeCase.ChargeCodeCase=Charge.ChargeCode "  +
            "where TypePerson='ผู้ต้องหา' and  crimecasenoyear='"+crimecaseid+"' and FullNamePerson='"+fullname+"'" ;
            Connection con = ConnectDatabase.connect();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("ExSql : "+sql);
            if(rs.next()){
                crimecaseno.setText(rs.getString("crimecasenoyear"));
                SuspectFullName.setText(rs.getString("FullNamePerson"));
                ChargeName.setText(rs.getString("ChargeName"));

            }

            rs.close();
            stmt.close();
            RefreshData();
        }catch(Exception ex){
            ex.printStackTrace();

        }
        
     }
    
    }
    public void RefreshData(){
        try{
              
        Connection con = ConnectDatabase.connect();
        Statement stmt = con.createStatement();
//        String a=txtCaseNO.getText();
        String sql;
                sql= "select StatusBail,CaseId,crimecasenoyear,SueFirstDate,Investigator_Result,TypePerson,BailDate,PeopleRegistrationID,FullNamePerson,StatusSuspect,CaseIdPerson,CaseAcceptDate \n" +
                     "from Person\n" +
                     "left join CrimeCase on Person.CaseIdPerson=CrimeCase.CaseId "
                   + "where TypePerson='ผู้ต้องหา' and StatusBail='ประกัน' or StatusSuspect='"+jComboStatus.getSelectedItem()+"'";
      if(jCheckOnly.isSelected())
      {
      sql=sql+" and Investigator_Result='อยู่ระหว่างสอบสวน'";
      
      }
      
        ResultSet rs = stmt.executeQuery(sql);
          System.out.println("SQL : "+sql);
        Vector<Vector> tabledata = new Vector<Vector>();
        while(rs.next()){
            Vector<String> row = new Vector<String>();          
            row.add(rs.getString("crimecasenoyear"));
            row.add(rs.getString("FullNamePerson"));
            row.add(rs.getString("CaseAcceptDate"));
            
            String DateCal=null;
            if(jComboStatus.getSelectedItem().equals("ประกัน")&& rs.getString("BailDate") !=null){
            row.add(rs.getString("BailDate"));          
             DateCal=rs.getString("BailDate")+"";
            }
            else if(jComboStatus.getSelectedItem().equals("ผัดฟ้องฝากขัง")){
            row.add(rs.getString("SueFirstDate"));          
//             DateCal=rs.getString("BailDate")+"";
            }
//            else if(jComboStatus.getSelectedItem().equals("ส่งฟื้นฟู")){
//             row.add(rs.getString("RestoreDate"));          
//             DateCal=rs.getString("RestoreDate")+"";
//            }
            Calendar cal,cal2,cal3,cal4,cal5,cal6,cal7;
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date date = sdf.parse(DateCal);
            cal = Calendar.getInstance();
            cal.setTime(date);                      
            cal.add(Calendar.MONTH,1);
            String Date1=sdf.format(cal.getTime());
             cal2 = Calendar.getInstance();
            cal2.setTime(date);  
            cal2.add(Calendar.MONTH,2);
            String Date2=sdf.format(cal2.getTime());
             cal3 = Calendar.getInstance();
            cal3.setTime(date);  
            cal3.add(Calendar.MONTH,3);
            String Date3=sdf.format(cal3.getTime());
            cal4 = Calendar.getInstance();
            cal4.setTime(date); 
            cal4.add(Calendar.MONTH,4);
            String Date4=sdf.format(cal4.getTime());
            cal5 = Calendar.getInstance();
            cal5.setTime(date); 
            cal5.add(Calendar.MONTH,5);
            String Date5=sdf.format(cal5.getTime());
            cal6 = Calendar.getInstance();
            cal6.setTime(date); 
            cal6.add(Calendar.MONTH,6);
            String Date6=sdf.format(cal6.getTime());
            cal7 = Calendar.getInstance();
            cal7.setTime(date); 
           cal7.add(Calendar.YEAR,1);
            String Date12=sdf.format(cal7.getTime());

            row.add(Date1);
            row.add(Date2);
            row.add(Date3);
            row.add(Date4);
             row.add(Date5);
            row.add(Date6);
            row.add(Date12);
      
            tabledata.add(row);
        }
        rs.close();
        stmt.close();
        Vector ColumnName = new Vector(); 
        String StatusSus=jComboStatus.getSelectedItem()+"";        
         ColumnName.add("เลขคดี/ปี");    
         ColumnName.add("ผู้ต้องหา");
         ColumnName.add("วันรับคำร้องทุกข์");
         if(StatusSus.equals("ประกัน")){
           ColumnName.add("วันประกัน");
         }
        else if(StatusSus.equals("ส่งฟื้นฟู")){
           ColumnName.add("วันส่งฟื้นฟู");
         }
         else{
           ColumnName.add("วันส่งตัว");
         }
         ColumnName.add("ครบ 1 เดือน");
         ColumnName.add("ครบ 2 เดือน");
         ColumnName.add("ครบ 3 เดือน");
         ColumnName.add("ครบ 4 เดือน");
         ColumnName.add("ครบ 5 เดือน");
         ColumnName.add("ครบ 6 เดือน");
         ColumnName.add("ครบ 1 ปี");
//         ColumnName.add("ครบ 2 เดือน");
         

         System.out.println("SQL : "+sql);
     
        jTableBail.setModel(new javax.swing.table.DefaultTableModel(
            tabledata,
            ColumnName
        ) {
            
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class,
                java.lang.String.class, java.lang.String.class, java.lang.String.class,
                java.lang.String.class, java.lang.String.class, java.lang.String.class,
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
            
        });
                jTableBail.setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
                @Override
                public Component getTableCellRendererComponent(JTable table,Object value, boolean isSelected, boolean hasFocus, int row, int col) {             
                    super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);

            //        String status = (String)table.getModel().getValueAt(row, 4);
                       String s2=String.valueOf(value);  
                     int a=  CalculateDateBail(s2);
                    if(col==4 && a<=0||col==5 && a<=0||col==6 && a<=0||col==7 && a<=0||col==8 && a<=0||col==9 && a<=0||col==10 && a<=0){
                   
                        setBackground(Color.BLACK);
                        setForeground(Color.RED);
//                        setFont("TH sarabunPSK",th);
                    }
                    else if(col==4 && a>0||col==5 && a>0||col==6 && a>0||col==7 && a>0||col==8 && a>0||col==9 && a>0||col==10 && a>0){
                    setBackground(Color.WHITE);
                    setForeground(Color.BLUE);
                    
                    }

                    else {
                       
                        setBackground(Color.WHITE);
                        setForeground(Color.BLACK);
                    }  
                      
             
                    return this;
           
                }   
            });

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
       private String getFilterCondition(){
        HashMap<String,String> filter = new HashMap<String,String>();
        if(DateSearch.getJFormattedTextField().getText().trim().length()>0){
            filter.put("BailDate", DateSearch.getJFormattedTextField().getText().trim());
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
                result+= " "+key[i]+" LIKE '%"+filter.get(key[i])+"%' or ";
            }
            System.out.println(result);
        }
        
        return result;
    }

    public int CalculateDateBail(String DateCheck){
       int diffDays =0;   
       try{
     
               Locale lc = new Locale("th","TH");
           SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy",lc);
                        SimpleDateFormat  format = new SimpleDateFormat("dd/MM/yyyy",lc);  
                        String d2Day=dateFormat.format(new Date());
                        Date dateTo =null;
                        Date datebail=null;
                         dateTo=format.parse(d2Day);
                          datebail=format.parse(DateCheck);
                         System.out.println("DateNew : "+datebail);
                        System.out.println("DateToday : "+dateTo);
                            long diff = datebail.getTime() - dateTo.getTime();
                             diffDays = (int)(diff / (24 * 60 * 60 * 1000));                          
                             System.out.println("Time in Day: " + diffDays + " Days."); 
                    
       }catch(Exception e){
           e.printStackTrace();
       
       }
          return diffDays;               
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEditBail;
    private javax.swing.JTextField ArrestDate;
    private javax.swing.JTextField ChargeName;
    private javax.swing.JTextField PlaceArrest;
    private javax.swing.JTextField SuspectFullName;
    private javax.swing.JTextField crimecaseno;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckOnly;
    private javax.swing.JComboBox<String> jComboStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelDateSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBail;
    // End of variables declaration//GEN-END:variables
}

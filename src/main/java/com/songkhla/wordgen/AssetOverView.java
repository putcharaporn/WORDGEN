/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.songkhla.wordgen;

import static com.songkhla.wordgen.ListAccused.jTableAccure;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONObject;
import java.awt.Font;
import java.awt.Toolkit;

/**
 *
 * @author Matazz
 */
public class AssetOverView extends javax.swing.JDialog {

    String TypeCase,CaseId;
    ArrayList personname=new ArrayList();
    /** Creates new form Asset */
    public AssetOverView(JFrame parrent,JSONObject datain) {
        super(parrent,true);
        initComponents();
        ImageIcon img = new ImageIcon("./Master/WD.png");
            setIconImage(img.getImage());
            setTitle("ระบบสำนวนอิเล็คทรอนิกส์ (CRIMES)");
        EvidenceRecordNumber.setVisible(false);
        CaseId=datain.get("CaseId")+"";
        TypeCase=datain.get("TypeCase")+"";

        txtCaseno.setVisible(false);
//        JTable rowTable = new RowNumberTable(jTableAsset);
//        jScrollPane2.setRowHeaderView(rowTable);
//        jScrollPane2.setCorner(JScrollPane.UPPER_LEFT_CORNER,
//         rowTable.getTableHeader());
        
        txtCaseno.setText(CaseId);
        RefreshData();     
//        JScrollPane scrollPane = new JScrollPane(jTableAsset);
//jTableAsset.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//jTableAsset.setPreferredScrollableViewportSize(Toolkit.getDefaultToolkit().getScreenSize());

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtCaseno = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAsset = new javax.swing.JTable();
        EvidenceRecordNumber = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(4, 93, 179));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("รายการทรัพย์");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jLabel1.setText("สมุดยึดทรัพย์ของกลางลำดับที่");

        jButton1.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jButton1.setText("เพิ่ม");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jButton2.setText("ลบ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        jButton3.setText("แก้ไข");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtCaseno.setFont(new java.awt.Font("TH SarabunPSK", 1, 20)); // NOI18N
        txtCaseno.setText("เลขคดี");

        jTableAsset.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jTableAsset.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รายการ", "จำนวน", "เลขคดี"
            }
        ));
        jTableAsset.setGridColor(new java.awt.Color(255, 255, 255));
        jTableAsset.setRowHeight(25);
        jTableAsset.setRowMargin(2);
        jScrollPane2.setViewportView(jTableAsset);
        jTableAsset.getTableHeader().setFont(new Font("TH SarabunPSK", Font.BOLD, 20));
        jTableAsset.getTableHeader().setOpaque(false);
        jTableAsset.getAccessibleContext().setAccessibleDescription("");

        EvidenceRecordNumber.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44)
                        .addComponent(EvidenceRecordNumber)
                        .addGap(59, 59, 59)
                        .addComponent(txtCaseno)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(585, 585, 585))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCaseno)
                    .addComponent(EvidenceRecordNumber))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         JSONObject data2 = new JSONObject();
          
             data2.put("typecase", TypeCase);
        AssetNewEdit  assetAdd=new AssetNewEdit(null,null,data2);
        assetAdd.pack();
       assetAdd.setLocationRelativeTo(null); 
         assetAdd.setVisible(true);        
         RefreshData();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           if(jTableAsset.getSelectedRow()>=0){
            try{
                String crimecaseno = txtCaseno.getText();
//                String EvidenceRecordNumber = jTableAsset.getModel().getValueAt(jTableAsset.getSelectedRow(), 1)+"";
                String AssetId = jTableAsset.getModel().getValueAt(jTableAsset.getSelectedRow(), 4)+"";
                String sql = "Delete from Asset WHERE NoAsset='"+AssetId+"' and caseIdAsset='"+crimecaseno+"'";
                Connection con = ConnectDatabase.connect();
                Statement stmt = con.createStatement();
                stmt.executeUpdate(sql);
                System.out.println("SQL : "+sql);
                stmt.close();
                RefreshData();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }       

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed


        if(jTableAsset.getSelectedRow()>=0){
            try{
                String crimecaseno = txtCaseno.getText();
//                String EvidenceRecordNumber = jTableAsset.getModel().getValueAt(jTableAsset.getSelectedRow(), 1)+"";
                String AssetId = jTableAsset.getModel().getValueAt(jTableAsset.getSelectedRow(), 4)+"";
                String sql = "select * from Asset where NoAsset='"+AssetId+"' and caseIdAsset='"+crimecaseno+"'";
                Connection con = ConnectDatabase.connect();
                Statement stmt = con.createStatement();
               ResultSet rs = stmt.executeQuery(sql);
               JSONObject data2 = new JSONObject();         
             data2.put("typecase", TypeCase);
                       //  Convert CrimcaseEdit to JFrame   
//                    System.out.println("Delete : "+sql);
                if(rs.next()){
                    JSONObject data = new JSONObject(); 
                     data.put("NoAsset", rs.getString("NoAsset"));
                    data.put("StatusAsset", rs.getString("StatusAsset"));
                    data.put("OrderAsset", rs.getString("OrderAsset"));                    
                    data.put("EvidenceRecordNumber", rs.getString("EvidenceRecordNumber"));
                    data.put("crimecaseno", rs.getString("caseIdAsset"));
                    data.put("Name", rs.getString("Name"));
                      data.put("OccupantName", rs.getString("OccupantName"));
                    data.put("Amount", rs.getString("Amount"));
                    data.put("DateSequester", rs.getString("DateSequester"));
                    data.put("DefectMark", rs.getString("DefectMark"));
                    data.put("Value", rs.getString("Value"));
                       data.put("PlaceFoundExhibit", rs.getString("PlaceFoundExhibit"));
                    data.put("PointFoundCheck", rs.getString("PointFoundCheck"));
                
                      

                             //  Convert CrimcaseEdit to JFrame   
                       JFrame frame = new JFrame();
                     JDialog dialog = new JDialog(frame);//frame is owner
                    JFrame f = (JFrame)(dialog.getParent());
                     f.removeAll();
                            AssetNewEdit af=new AssetNewEdit(f,data,data2);
                            af.pack();
                             af.setLocationRelativeTo(null);
                            af.setVisible(true);    		
                }
              
                rs.close();
                stmt.close();
       //   RefreshData();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }else{

        }
        RefreshData();
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
            java.util.logging.Logger.getLogger(AssetOverView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssetOverView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssetOverView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssetOverView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new AssetOverView().setVisible(true);
                
            }
        });
    }
     public void RefreshData(){
        try{
        Connection con = ConnectDatabase.connect();
        Statement stmt = con.createStatement();
        
        String crimecaseno = txtCaseno.getText();
        String sql = "select NoAsset,EvidenceRecordNumber,Amount,DateSequester,DefectMark,"
                     + "PlaceFoundExhibit,Name,Remark,OccupantName,OrderAsset,PointFoundCheck,"
                     + "Value,StatusAsset from Asset where caseIdAsset='"+crimecaseno+"' and "+getFilterCondition();
            System.out.println(sql);
        ResultSet rs = stmt.executeQuery(sql);
        Vector<Vector> tabledata = new Vector<Vector>();
        while(rs.next()){
            Vector<String> row = new Vector<String>();
            row.add(rs.getString("StatusAsset"));
            row.add(rs.getString("Name"));
            row.add(rs.getString("Amount"));
            row.add(rs.getString("Value"));
            row.add(rs.getString("NoAsset"));
            tabledata.add(row);
        }
        rs.close();
        stmt.close();
        Vector ColumnName = new Vector();
        ColumnName.add("ประเภท");       
        ColumnName.add("ชื่อของกลาง");
        ColumnName.add("จำนวน");
        ColumnName.add("ราคา");
        ColumnName.add("NoAsset");
  
     
    
        jTableAsset.setModel(new javax.swing.table.DefaultTableModel(
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
        
                
        }catch(Exception ex){
            ex.printStackTrace();
        }
        jTableAsset.getColumnModel().getColumn(4).setWidth(0);
        jTableAsset.getColumnModel().getColumn(4).setMinWidth(0);
        jTableAsset.getColumnModel().getColumn(4).setMaxWidth(0); 
//        jTableAsset.getColumnModel().getColumn(1).setMinWidth(135);                
//        jTableAsset.getColumnModel().getColumn(2).setMinWidth(70);
//        jTableAsset.getColumnModel().getColumn(3).setMinWidth(125);


        String ArrayData="";
//        ArrayList listData = new ArrayList();
            int rowcount = jTableAsset.getModel().getRowCount();
        for(int i = 0;i<rowcount;i++){
        int id=i+1;
       String nameAs = (String)jTableAsset.getModel().getValueAt(i, 1);
         String number = (String)jTableAsset.getModel().getValueAt(i, 2);
            System.out.println("sssssssss :"+number);
          ArrayData = ArrayData+id+"."+ nameAs+" จำนวน "+number;
        if((nameAs != null)&&(!(nameAs.equalsIgnoreCase("")))){
        }
        
//            System.out.println(name);
      }
		
            if(TypeCase.equals("อาญา")){
            CrimesCaseEdit.ListAsset.setText(ArrayData);
            }
           else if(TypeCase.equals("จราจร")){
            TrafficEdit.ListAsset.setText(ArrayData);
            }
           else if(TypeCase.equals("ชันสูตร")){
            IdentityEdit.ListAsset.setText(ArrayData);
            }
      
    }
     
     
      private String getFilterCondition(){
        HashMap<String,String> filter = new HashMap<String,String>();
        if(txtCaseno.getText().trim().length()>0){
            filter.put("caseIdAsset", txtCaseno.getText().trim());
        }
        
        String[] key = filter.keySet().toArray(new String[0]);
        String result="";
        for(int i=0;i<key.length;i++){
            if(i==0){
                result="";
            }
            if(i==key.length-1){
                result+= " "+key[i]+" LIKE '%"+filter.get(key[i])+"%'";
            }else{
                result+= " "+key[i]+" LIKE "+filter.get(key[i])+"  and ";
            }
          //  System.out.println(result);
        }
        
        return result;
    }
      
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EvidenceRecordNumber;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTableAsset;
    public static javax.swing.JLabel txtCaseno;
    // End of variables declaration//GEN-END:variables

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking_sector;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sagnik Chakraborty
 */
public class AccountStatement extends javax.swing.JFrame {

    /**
     * Creates new form AccountStatement
     */
    
    String name = "";
    String AccNo = "";
    int flag = 0;
    String bnName = "";
    String formNo = "";
    
    public AccountStatement(String nm, String acc, int f, String bnm, String frmn) {
        initComponents();
        
        name = nm;
        AccNo = acc;
        flag = f;
        bnName = bnm;
        formNo = frmn;
        
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
            
            String balance = "BalanceInfo_"+AccNo;
            
            String query = "select * from "+balance+" order by date_d_w asc";
            
            PreparedStatement preparedStmt = conn.prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE , ResultSet.CONCUR_UPDATABLE);
            
            ResultSet rs = preparedStmt.executeQuery();
            
            while(rs.next() == true) 
            {  
                String date = rs.getString(2);
                String deposit = rs.getString(3);
                String withdraw = rs.getString(4);
                String Bal = rs.getString(5);
                String details = rs.getString(6);
                
                String tbData[] = {date, deposit, withdraw, Bal, details};
                
                DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
                
                tblModel.addRow(tbData);
            }
        }
        catch (Exception ea)
        {
            System.err.println("Got an exception!");
            System.err.println(ea.getMessage());
        }
        
        setVisible(true);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jL1 = new javax.swing.JLabel();
        jL2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jB1 = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jL1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL1.setText("SYNDICATE BANK");

        jL2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jL2.setText("Account Statement:-");

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATE", "DEPOSIT", "WITHDRAW", "BALANCE", "DETAILS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(400);
        }

        jB1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jB1.setText("SAVE");
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jB2.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jB2.setText("BACK");
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jB2)
                        .addGap(18, 18, 18)
                        .addComponent(jB1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jL2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jL1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1015, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL1)
                .addGap(18, 18, 18)
                .addComponent(jL2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB1)
                    .addComponent(jB2))
                .addContainerGap())
        );

        jScrollPane1.getAccessibleContext().setAccessibleParent(jScrollPane1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
        if(flag == 1)
        {
            new ProfileAtm(name,AccNo,bnName,formNo);
            dispose();
        }
        else if(flag == 2)
        {
            new ProfileNet(name,AccNo,bnName,formNo);
            dispose();
        }
    }//GEN-LAST:event_jB2ActionPerformed

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
        try
        {
            java.time.LocalDate ldate = java.time.LocalDate.now();
            java.time.LocalTime ltime = java.time.LocalTime.now();
            String date = ldate.toString() +"_"+ltime.toString().substring(0, 2)+"_"+ltime.toString().substring(3, 5)+"_"+ltime.toString().substring(6);
            
            String path = "D:\\Banking_documents\\AccountStatements";
            
            File theDir = new File(path);
            
            if (!theDir.exists())
            {
                theDir.mkdirs();
            }
            
            String fn = path+"\\AccountStatement_"+date+".pdf";
            
            Document document = new Document();
            
            PdfWriter.getInstance(document, new FileOutputStream(fn));
            
            document.open();
            
            String str = "\t\tSYNDICATE BANK\n\n"+"ACCOUNT STATEMENT\n\n";
            
            Paragraph para = new Paragraph(str);
            
            document.add(para);
            
            PdfPTable table = new PdfPTable(5);
            
            PdfPCell c1 = new PdfPCell(new Phrase("DATE"));
            table.addCell(c1);
            
            c1 = new PdfPCell(new Phrase("DEPOSIT"));
            table.addCell(c1);
            
            c1 = new PdfPCell(new Phrase("WITHDRAW"));
            table.addCell(c1);
            
            c1 = new PdfPCell(new Phrase("BALANCE"));
            table.addCell(c1);
            
            c1 = new PdfPCell(new Phrase("DETAILS"));
            table.addCell(c1);
            
            table.setHeaderRows(1);
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
            
            String balance = "BalanceInfo_"+AccNo;
            
            String query = "select * from "+balance+" order by date_d_w asc";
            
            PreparedStatement preparedStmt = conn.prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE , ResultSet.CONCUR_UPDATABLE);
            
            ResultSet rs = preparedStmt.executeQuery();
            
            while(rs.next() == true) 
            {  
                String date_d_w = rs.getString(2);
                String deposit = rs.getString(3);
                String withdraw = rs.getString(4);
                String Bal = rs.getString(5);
                String details = rs.getString(6);
                
                //String tbData[] = {date_d_w, deposit, withdraw, Bal, details};
                
                //DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
                
                //tblModel.addRow(tbData);
                
                table.addCell(date_d_w);
                table.addCell(deposit);
                table.addCell(withdraw);
                table.addCell(Bal);
                table.addCell(details);
            }
            
            document.add(table);
            
            document.close();
            
            JOptionPane.showMessageDialog(null, "AccountStatement Successfully Saved!!");
        }
        catch(Exception e)  
        {  
            e.printStackTrace();          
        }
    }//GEN-LAST:event_jB1ActionPerformed

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
            java.util.logging.Logger.getLogger(AccountStatement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountStatement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountStatement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountStatement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountStatement("","",0,"","");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB2;
    private javax.swing.JLabel jL1;
    private javax.swing.JLabel jL2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

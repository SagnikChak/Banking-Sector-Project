/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking_sector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Sagnik Chakraborty
 */
public class Withdrawal extends javax.swing.JFrame {

    /**
     * Creates new form Withdraw
     */
    
    String name = "";
    String AccNo = "";
    String bnName = "";
    String formNo = "";
    
    public Withdrawal(String nm, String acc, String bnm, String frmn) {
        initComponents();
        
        name = nm;
        AccNo = acc;
        bnName = bnm;
        formNo = frmn;
        
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
        jL3 = new javax.swing.JLabel();
        jTF1 = new javax.swing.JTextField();
        jL4 = new javax.swing.JLabel();
        jB1 = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jL1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jL1.setText("SYNDICATE BANK");

        jL2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jL2.setText("WITHDRAWAL TAB");

        jL3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jL3.setText("Enter Amount to be withdrawn:");

        jTF1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        jL4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jL4.setText("Rs.");

        jB1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jB1.setText("WITHDRAW");
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(jL1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jL2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jB2)
                        .addGap(18, 18, 18)
                        .addComponent(jB1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL1)
                .addGap(18, 18, 18)
                .addComponent(jL2)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL3)
                    .addComponent(jL4)
                    .addComponent(jTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB1)
                    .addComponent(jB2))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
        new ProfileAtm(name,AccNo,bnName,formNo);
        dispose();
    }//GEN-LAST:event_jB2ActionPerformed

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
            
            int amt = 0, bal=0;
            String Amount = "";
            amt = Integer.parseInt(jTF1.getText());
            
            String balance = "BalanceInfo_"+AccNo;
            
            String Bal = "";
            
            String query = "select * from "+balance+" order by date_d_w asc";
            
            PreparedStatement preparedStmt = conn.prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE , ResultSet.CONCUR_UPDATABLE);
            
            ResultSet rs = preparedStmt.executeQuery();
            
            if(rs.last() == true) 
            {  
                Bal = rs.getString(5);
            } 
            
            bal = Integer.parseInt(Bal);
            if(amt > 50000)
                JOptionPane.showMessageDialog(null, "Cannot Withdraw more than Rs. 50000 in one transaction!!");
            else
            {
                if(bal < amt)
                    JOptionPane.showMessageDialog(null, "Insufficient Balance!!");
                else
                {
                    bal -= amt;
                    Bal = Integer.toString(bal);
                    Amount = Integer.toString(amt);
                    
                    java.time.LocalDate ldate = java.time.LocalDate.now();
                    
                    java.time.LocalTime ltime = java.time.LocalTime.now();
                    String date = ldate.toString() +" "+ ltime.toString();
                    
                    query = "insert into "+balance+" (AccNo, date_d_w, Deposit, Withdraw, Balance, Details)" + " values (?, ?, ?, ?, ?, ?)";
                    
                    preparedStmt = conn.prepareStatement(query);
                    preparedStmt.setString(1, AccNo);
                    preparedStmt.setString(2, date);
                    preparedStmt.setString(3, "-");
                    preparedStmt.setString(4, Amount);
                    preparedStmt.setString(5, Bal);
                    preparedStmt.setString(6, "Self");
                    
                    preparedStmt.execute();
                    
                    JOptionPane.showMessageDialog(null, "Please collect your cash!!");
                    
                    new ProfileAtm(name,AccNo,bnName,formNo);
                    dispose();
                }
            }
        }
        catch (Exception ea)
        {
            System.err.println("Got an exception!");
            System.err.println(ea.getMessage());
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
            java.util.logging.Logger.getLogger(Withdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Withdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Withdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Withdrawal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Withdrawal("","","","");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB2;
    private javax.swing.JLabel jL1;
    private javax.swing.JLabel jL2;
    private javax.swing.JLabel jL3;
    private javax.swing.JLabel jL4;
    private javax.swing.JTextField jTF1;
    // End of variables declaration//GEN-END:variables
}
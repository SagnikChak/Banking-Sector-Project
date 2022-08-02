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
public class LoginCredential extends javax.swing.JFrame {

    /**
     * Creates new form LoginCredential
     */
    
    String name = "";
    String AccNo = "";
    String bnName = "";
    String formNo = "";
    
    public LoginCredential(String nm, String acc, String bnm, String frmn) {
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

        jPanel1 = new javax.swing.JPanel();
        jL1 = new javax.swing.JLabel();
        jL2 = new javax.swing.JLabel();
        jL3 = new javax.swing.JLabel();
        jB1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jL4 = new javax.swing.JLabel();
        jTF2 = new javax.swing.JTextField();
        jB2 = new javax.swing.JButton();
        jB3 = new javax.swing.JButton();
        jPF1 = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jL5 = new javax.swing.JLabel();
        jPF2 = new javax.swing.JPasswordField();
        jL6 = new javax.swing.JLabel();
        jPF3 = new javax.swing.JPasswordField();
        jB4 = new javax.swing.JButton();
        jB5 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jB6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jL1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jL1.setText("Login Credentials Alteration:-");

        jL2.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jL2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL2.setText("SYNDICATE BANK");

        jL3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jL3.setText("PASSWORD:");

        jB1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jB1.setText("CHECK");
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jL4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jL4.setText("CUSTOMER ID:");

        jTF2.setEditable(false);
        jTF2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        jB2.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jB2.setText("EDIT");
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });

        jB3.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jB3.setText("SAVE");
        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });

        jPF1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        jL5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jL5.setText("NEW PASSWORD:");

        jPF2.setEditable(false);
        jPF2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        jL6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jL6.setText("CONFIRM PASSWORD:");

        jPF3.setEditable(false);
        jPF3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        jB4.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jB4.setText("EDIT");
        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4ActionPerformed(evt);
            }
        });

        jB5.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jB5.setText("SAVE");
        jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB5ActionPerformed(evt);
            }
        });

        jB6.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jB6.setText("BACK");
        jB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jB5)
                                .addGap(131, 131, 131))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jB6)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jL1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jL3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPF1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jB1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jL4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jB2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jB3))
                                    .addComponent(jB4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jL5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPF2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jL6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPF3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 66, Short.MAX_VALUE))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jL2, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jL1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL3)
                    .addComponent(jB1)
                    .addComponent(jPF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL4)
                    .addComponent(jTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB2)
                    .addComponent(jB3))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jB4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL5)
                    .addComponent(jPF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL6)
                    .addComponent(jPF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jB5)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB6)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jL2)
                    .addContainerGap(463, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
        try
        {
            String pwd = new String(jPF1.getPassword());
            
            jPF1.setEditable(false);
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
            
            String query = "select * from AccountInfo where AccNo=?";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, AccNo);
            
            ResultSet rs = preparedStmt.executeQuery();  
            if (rs.next()) {  
                
                String pswd = rs.getString(6);
                if(pswd.equals(pwd))
                {
                    jTF2.setText(rs.getString(2));
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Wrong Password!!");
                    jPF1.setEditable(true);
                    jPF1.setText("");
                }
            }
        }
        catch (Exception ea)
        {
            System.err.println("Got an exception!");
            System.err.println(ea.getMessage());
        }
    }//GEN-LAST:event_jB1ActionPerformed

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
        jTF2.setEditable(true);
    }//GEN-LAST:event_jB2ActionPerformed

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB3ActionPerformed
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
            
            jTF2.setEditable(false);
            
            String query = "update AccountInfo set custid=? where AccNo=?";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, jTF2.getText());
            preparedStmt.setString(2, AccNo);
            
            preparedStmt.execute();
            
            JOptionPane.showMessageDialog(null, "Customer ID updated successfully!!");
        }
        catch (Exception ea)
        {
            System.err.println("Got an exception!");
            System.err.println(ea.getMessage());
        }
    }//GEN-LAST:event_jB3ActionPerformed

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB4ActionPerformed
            jPF2.setEditable(true);
            jPF3.setEditable(true);
    }//GEN-LAST:event_jB4ActionPerformed

    private void jB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB5ActionPerformed
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
            
            jPF2.setEditable(false);
            jPF3.setEditable(false);
            
            String pwd1 = new String(jPF2.getPassword());
            String pwd2 = new String(jPF3.getPassword());
            
            if(pwd1.equals(pwd2))
            {
                String query = "update AccountInfo set pswd=? where AccNo=?";
                PreparedStatement preparedStmt = conn.prepareStatement(query);
                preparedStmt.setString(1, pwd1);
                preparedStmt.setString(2, AccNo);
                
                preparedStmt.execute();
                
                JOptionPane.showMessageDialog(null, "Password updated successfully!!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Confirmation of Password Failed!!");
            }
        }
        catch (Exception ea)
        {
            System.err.println("Got an exception!");
            System.err.println(ea.getMessage());
        }
    }//GEN-LAST:event_jB5ActionPerformed

    private void jB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB6ActionPerformed
        new ProfileNet(name,AccNo,bnName,formNo);
        dispose();
    }//GEN-LAST:event_jB6ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginCredential.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginCredential.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginCredential.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginCredential.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginCredential("","","","");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB2;
    private javax.swing.JButton jB3;
    private javax.swing.JButton jB4;
    private javax.swing.JButton jB5;
    private javax.swing.JButton jB6;
    private javax.swing.JLabel jL1;
    private javax.swing.JLabel jL2;
    private javax.swing.JLabel jL3;
    private javax.swing.JLabel jL4;
    private javax.swing.JLabel jL5;
    private javax.swing.JLabel jL6;
    private javax.swing.JPasswordField jPF1;
    private javax.swing.JPasswordField jPF2;
    private javax.swing.JPasswordField jPF3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTF2;
    // End of variables declaration//GEN-END:variables
}

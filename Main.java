
import javafx.scene.paint.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author เมย�?
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setResizable(false);
        dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Dep = new javax.swing.JButton();
        Withdraw = new javax.swing.JButton();
        Tranfer = new javax.swing.JButton();
        Interest = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Open Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 127, -1));

        Dep.setText("Deposit");
        Dep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepActionPerformed(evt);
            }
        });
        getContentPane().add(Dep, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 81, 127, -1));

        Withdraw.setText("Withdraw");
        Withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawActionPerformed(evt);
            }
        });
        getContentPane().add(Withdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 131, 127, -1));

        Tranfer.setText("Tranfer");
        Tranfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TranferActionPerformed(evt);
            }
        });
        getContentPane().add(Tranfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 131, 127, -1));

        Interest.setText("Interest Calculation");
        Interest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InterestActionPerformed(evt);
            }
        });
        getContentPane().add(Interest, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jButton6.setText("Statement printout");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 150, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Simplicity Banking");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 170, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Name frame2 = new Name();
        frame2.setVisible(true); //go to CheckIn frame
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepActionPerformed

        Deposit frame2 = new Deposit();  
        frame2.setVisible(true); //go to CheckIn frame
        setVisible(false);
    }//GEN-LAST:event_DepActionPerformed

    private void WithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawActionPerformed

        Withdraw frame2 = new Withdraw();
        frame2.setVisible(true); //go to CheckIn frame
        setVisible(false);
    }//GEN-LAST:event_WithdrawActionPerformed

    private void TranferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TranferActionPerformed

        Tranfer frame2 = new Tranfer();    
        frame2.setVisible(true); //go to CheckIn frame
        setVisible(false);
    }//GEN-LAST:event_TranferActionPerformed

    private void InterestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InterestActionPerformed

        InterestCal frame2 = new InterestCal();
        frame2.setVisible(true); //go to CheckIn frame
        setVisible(false);
    }//GEN-LAST:event_InterestActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        statement frame2 = new statement();
        frame2.setVisible(true); //go to CheckIn frame
        setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        Main frame1 = new Main();
        frame1.setBackground(java.awt.Color.yellow);
        frame1.setSize(400, 400);
       
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dep;
    private javax.swing.JButton Interest;
    private javax.swing.JButton Tranfer;
    private javax.swing.JButton Withdraw;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

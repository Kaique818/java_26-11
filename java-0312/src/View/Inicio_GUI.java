/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laboratorio-Info
 */
public class Inicio_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Inicio_GUI
     */
    public Inicio_GUI() {
        initComponents();
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
        Atestado_btn = new javax.swing.JButton();
        Receituario_btn = new javax.swing.JButton();
        Compareciment_btn = new javax.swing.JButton();
        Sair_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        Atestado_btn.setText("ATESTADO");
        Atestado_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atestado_btnActionPerformed(evt);
            }
        });
        jPanel1.add(Atestado_btn);
        Atestado_btn.setBounds(44, 53, 300, 23);

        Receituario_btn.setText("RECEITOÁRIO");
        Receituario_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Receituario_btnActionPerformed(evt);
            }
        });
        jPanel1.add(Receituario_btn);
        Receituario_btn.setBounds(50, 110, 290, 23);

        Compareciment_btn.setText("COMPARECIMENTO");
        Compareciment_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Compareciment_btnActionPerformed(evt);
            }
        });
        jPanel1.add(Compareciment_btn);
        Compareciment_btn.setBounds(50, 170, 290, 23);

        Sair_btn.setText("SAIR");
        Sair_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sair_btnActionPerformed(evt);
            }
        });
        jPanel1.add(Sair_btn);
        Sair_btn.setBounds(283, 0, 110, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-3, 3, 400, 290);

        setSize(new java.awt.Dimension(400, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Atestado_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atestado_btnActionPerformed
        try {
            Controller.Atestado_DAO.imprime();
        } catch (Exception ex) {
            
        }
    }//GEN-LAST:event_Atestado_btnActionPerformed

    private void Receituario_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Receituario_btnActionPerformed
        try {
            Controller.Receituario_DAO.imprime();
        } catch (Exception ex) {
            
        }
    }//GEN-LAST:event_Receituario_btnActionPerformed

    private void Compareciment_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Compareciment_btnActionPerformed
      try {
            Controller.Comparecimento_DAO.imprime();
        } catch (Exception ex) {
            
        }
    }//GEN-LAST:event_Compareciment_btnActionPerformed

    private void Sair_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sair_btnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Sair_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atestado_btn;
    private javax.swing.JButton Compareciment_btn;
    private javax.swing.JButton Receituario_btn;
    private javax.swing.JButton Sair_btn;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

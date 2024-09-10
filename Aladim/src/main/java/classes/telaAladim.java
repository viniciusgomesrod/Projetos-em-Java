/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package classes;

/**
 *
 * @author viniciusgomesrodrigues
 */
public class telaAladim extends javax.swing.JFrame {

    /**
     * Creates new form telaAladim
     */
    public telaAladim() { //metodo construtor
        initComponents();
        lblFrase.setText("<html>Pensei em um número entre <strong>1 a 100</strong>. Adivinhe qual é?</html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblFrase = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtVal = new javax.swing.JSpinner();
        btnPalpite = new javax.swing.JButton();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aladim.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aladim2.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 180, 380, 370));

        lblFrase.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFrase.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblFrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 150, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/balao-pensamento.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 270, 170));

        txtVal.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        txtVal.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        getContentPane().add(txtVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 50, 30));

        btnPalpite.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        btnPalpite.setText("PALPITE");
        btnPalpite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPalpiteActionPerformed(evt);
            }
        });
        getContentPane().add(btnPalpite, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 120, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPalpiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalpiteActionPerformed
        // TODO add your handling code here:
        double numerosorteado = 100 + Math.random() * (101 - 1);
        int valor = (int) numerosorteado;
        System.out.println(valor);
        
        int n = Integer.parseInt(txtVal.getValue().toString());
        
        String f1 = "<html><strong>Acertou!</strong></html>";
        String f2 = "<html><strong>Errou!</strong> Eu pensei no número " + valor + "</html>";
        
        String resultado = (valor == n) ? f1 : f2;
        
        lblFrase.setText(resultado);
    }//GEN-LAST:event_btnPalpiteActionPerformed

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
            java.util.logging.Logger.getLogger(telaAladim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaAladim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaAladim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaAladim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaAladim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPalpite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblFrase;
    private javax.swing.JSpinner txtVal;
    // End of variables declaration//GEN-END:variables
}
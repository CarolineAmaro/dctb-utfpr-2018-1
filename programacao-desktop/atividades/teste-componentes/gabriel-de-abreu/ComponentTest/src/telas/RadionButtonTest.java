/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

/**
 *
 * @author gabriel
 */
public class RadionButtonTest extends javax.swing.JFrame {

    /**
     * Creates new form Screen4
     */
    public RadionButtonTest() {
        initComponents();
        buttonGroup1.add(Element1);
        buttonGroup1.add(Element2);
        buttonGroup1.add(Element3);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Element1 = new javax.swing.JRadioButton();
        Element2 = new javax.swing.JRadioButton();
        Element3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Element1.setText("Elemento 1");
        Element1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Element1ActionPerformed(evt);
            }
        });

        Element2.setText("Elemento 2");
        Element2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Element2ActionPerformed(evt);
            }
        });

        Element3.setText("Elemento 3");
        Element3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Element3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Clique em um elemento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Element1)
                    .addComponent(Element2)
                    .addComponent(Element3)
                    .addComponent(jLabel1))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(Element1)
                .addGap(18, 18, 18)
                .addComponent(Element2)
                .addGap(18, 18, 18)
                .addComponent(Element3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Element1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Element1ActionPerformed
        // TODO add your handling code here:
        jLabel1.setText("Elemento 1 está selecionado");
    }//GEN-LAST:event_Element1ActionPerformed

    private void Element2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Element2ActionPerformed
        // TODO add your handling code here:
        jLabel1.setText("Elemento 2 está selecionado");
    }//GEN-LAST:event_Element2ActionPerformed

    private void Element3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Element3ActionPerformed
        // TODO add your handling code here:
        jLabel1.setText("Elemento 3 está selecionado");
    }//GEN-LAST:event_Element3ActionPerformed

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
            java.util.logging.Logger.getLogger(RadionButtonTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RadionButtonTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RadionButtonTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RadionButtonTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RadionButtonTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Element1;
    private javax.swing.JRadioButton Element2;
    private javax.swing.JRadioButton Element3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
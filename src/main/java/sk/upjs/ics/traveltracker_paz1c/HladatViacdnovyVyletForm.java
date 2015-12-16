/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.traveltracker_paz1c;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Robert Link
 */
public class HladatViacdnovyVyletForm extends javax.swing.JDialog {

    private ViacdnovyVyletDao viacDnovyVyletDao = ViacdnovyVyletDaoFactory.INSTANCE.getViacdnovyVyletDao();
    private String hladaneSlovo;

    public HladatViacdnovyVyletForm(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    public HladatViacdnovyVyletForm(javax.swing.JDialog parent, boolean modal, String hladane) {
        super(parent, modal);
        initComponents();
        hladaneSlovo = hladane;
        setLocationRelativeTo(null);
        List<ViacdnovyVylet> hladaneVylety = viacDnovyVyletDao.Hladat(hladaneSlovo);
        if (hladaneVylety.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Žiaden vylet sa nenašiel :(");
            return;
        }
        hladaneList.setListData(hladaneVylety.toArray());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OKButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        hladaneList = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        OKButton.setText("OK");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        hladaneList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hladaneListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(hladaneList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 329, Short.MAX_VALUE)
                        .addComponent(OKButton))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OKButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_OKButtonActionPerformed

    private void hladaneListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hladaneListMouseClicked
        if (evt.getClickCount() == 2) {
            ViacdnovyVylet vylet = (ViacdnovyVylet) hladaneList.getSelectedValue();
            ZobrazitViacdnovyVyletForm zobraz = new ZobrazitViacdnovyVyletForm(this, true, vylet);
            zobraz.setVisible(true);
        }
    }//GEN-LAST:event_hladaneListMouseClicked

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
            java.util.logging.Logger.getLogger(HladatViacdnovyVyletForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HladatViacdnovyVyletForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HladatViacdnovyVyletForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HladatViacdnovyVyletForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HladatViacdnovyVyletForm dialog = new HladatViacdnovyVyletForm(new javax.swing.JDialog(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OKButton;
    private javax.swing.JList hladaneList;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

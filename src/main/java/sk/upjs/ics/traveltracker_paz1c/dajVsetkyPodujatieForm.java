
package sk.upjs.ics.traveltracker_paz1c;

import java.util.List;


public class dajVsetkyPodujatieForm extends javax.swing.JDialog {
     private KulturnePodujatieDao podujatie = KulturnePodujatieDaoFactory.INSTANCE.getKulturnePodujatieDao();
    private List<KulturnePodujatie> podujatia = podujatie.dajVsetky();
    VsetkyKultPodujatieModel model=new VsetkyKultPodujatieModel();

    public dajVsetkyPodujatieForm(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        dajVsetkyTable.setModel(model);
        
        int i = 0;
        for (KulturnePodujatie vylet: podujatia){
        
            dajVsetkyTable.setValueAt(vylet.getKrajina(), i, 0);
            dajVsetkyTable.setValueAt(vylet.getMesto(), i, 1);
            dajVsetkyTable.setValueAt(vylet.getNazov(), i, 2);
            dajVsetkyTable.setValueAt(vylet.getDatum(), i, 3);
         i++;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dajVsetkyTable = new javax.swing.JTable();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        dajVsetkyTable.setModel(this.model);
        dajVsetkyTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dajVsetkyTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dajVsetkyTable);

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(okButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(okButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dajVsetkyTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dajVsetkyTableMouseClicked
             if(evt.getClickCount() == 2){
        int row=dajVsetkyTable.getSelectedRow();
      
       KulturnePodujatie kulturnePodujatie=model.getPodujatie(row);
       ZobrazitPodujatieForm zobraz= new ZobrazitPodujatieForm(this, true,kulturnePodujatie);
       zobraz.setVisible(true);
        
    }
    }//GEN-LAST:event_dajVsetkyTableMouseClicked

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
       setVisible(false);
    }//GEN-LAST:event_okButtonActionPerformed

 
    
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
            java.util.logging.Logger.getLogger(dajVsetkyPodujatieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dajVsetkyPodujatieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dajVsetkyPodujatieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dajVsetkyPodujatieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dajVsetkyPodujatieForm dialog = new dajVsetkyPodujatieForm(new javax.swing.JDialog(), true);
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
    private javax.swing.JTable dajVsetkyTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables
}

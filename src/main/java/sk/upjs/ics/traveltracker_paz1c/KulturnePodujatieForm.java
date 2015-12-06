package sk.upjs.ics.traveltracker_paz1c;

import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class KulturnePodujatieForm extends javax.swing.JDialog {
    
     KulturnePodujatieDao kulturnePodujatieDao = KulturnePodujatieDaoFactory.INSTANCE.getKulturnePodujatieDao();

   
    public KulturnePodujatieForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        refresh();
    }

   

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        podujatiaTable = new javax.swing.JTable();
        stornoButton = new javax.swing.JButton();
        pridateButton = new javax.swing.JButton();
        upravitButton = new javax.swing.JButton();
        odstranitButton = new javax.swing.JButton();
        vsetkyButton = new javax.swing.JButton();
        hladatTextField = new javax.swing.JTextField();
        hladatButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        podujatiaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Krajina", "Mesto", "Nazov", "Datum"
            }
        ));
        podujatiaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                podujatiaTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(podujatiaTable);

        stornoButton.setText("Storno");
        stornoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stornoButtonActionPerformed(evt);
            }
        });

        pridateButton.setText("Pridať");
        pridateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridateButtonActionPerformed(evt);
            }
        });

        upravitButton.setText("Upraviť");
        upravitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upravitButtonActionPerformed(evt);
            }
        });

        odstranitButton.setText("Odstrániť");
        odstranitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odstranitButtonActionPerformed(evt);
            }
        });

        vsetkyButton.setText("Zobraz všetky");
        vsetkyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vsetkyButtonActionPerformed(evt);
            }
        });

        hladatButton.setText("Hľadať");
        hladatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hladatButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hladatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hladatButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(vsetkyButton)
                                .addGap(46, 46, 46)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(upravitButton)
                                .addGap(18, 18, 18)
                                .addComponent(odstranitButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(stornoButton)
                                .addGap(18, 18, 18)
                                .addComponent(pridateButton)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pridateButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(stornoButton)
                        .addComponent(hladatButton)
                        .addComponent(hladatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(upravitButton)
                            .addComponent(odstranitButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vsetkyButton)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stornoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stornoButtonActionPerformed
       setVisible(false);
    }//GEN-LAST:event_stornoButtonActionPerformed

    private void pridateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridateButtonActionPerformed
       PridatKulturnePodujatieForm pridat = new PridatKulturnePodujatieForm(this, true);
       pridat.setVisible(true);
       refresh();
    }//GEN-LAST:event_pridateButtonActionPerformed

    private void upravitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upravitButtonActionPerformed
       
        List<KulturnePodujatie> vsetkyKulturnePodujatia = kulturnePodujatieDao.dajVsetky();
        String krajina = (String) podujatiaTable.getValueAt(podujatiaTable.getSelectedRow(), 0);
        String Mesto = ((String) podujatiaTable.getValueAt(podujatiaTable.getSelectedRow(), 1));
        String Nazov = ((String) podujatiaTable.getValueAt(podujatiaTable.getSelectedRow(), 2));
        Date Datum = ((Date) podujatiaTable.getValueAt(podujatiaTable.getSelectedRow(), 3));
        
        for (KulturnePodujatie podujatie : vsetkyKulturnePodujatia){
            if (krajina.equals(podujatie.getKrajina()) && Mesto.equals(podujatie.getMesto()) 
                    && Nazov.equals(podujatie.getNazov()) && Datum.equals(podujatie.getDatum())){
                UpravitKultPodujatieForm upravit = new UpravitKultPodujatieForm(this, true, podujatie);
                upravit.setVisible(true);
            }
            
        }
        refresh();
        
    }//GEN-LAST:event_upravitButtonActionPerformed

    private void odstranitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odstranitButtonActionPerformed
        int cisloRiadku = podujatiaTable.getSelectedRow();
        
        if(cisloRiadku == -1){
            JOptionPane.showMessageDialog(this, "Nie je vybraný žiaden riadok!");
        }
        
        KulturnePodujatie podujatie = najdiPodujatie(cisloRiadku);
       
       if (podujatie == null){
           return; 
       }
        kulturnePodujatieDao.odstranit(podujatie);
            
        refresh();
    }//GEN-LAST:event_odstranitButtonActionPerformed

    private void vsetkyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vsetkyButtonActionPerformed
       dajVsetkyPodujatieForm zobraz = new dajVsetkyPodujatieForm(this, true);
        zobraz.setVisible(true); 
        //prerobit dajVsetkyPodujatieForm na dialogove!!!!
    }//GEN-LAST:event_vsetkyButtonActionPerformed

    private void hladatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hladatButtonActionPerformed
       
    }//GEN-LAST:event_hladatButtonActionPerformed

    private void podujatiaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_podujatiaTableMouseClicked
        if(evt.getClickCount()==2){
            List<KulturnePodujatie> vsetky = kulturnePodujatieDao.dajVsetky();
        }
    }//GEN-LAST:event_podujatiaTableMouseClicked

      public void refresh(){
       
       for(int j=0; j<10; j++){
           for (int k=0; k<4; k++){
               podujatiaTable.setValueAt(null, j, k);
           }
       }
        
        List<KulturnePodujatie> podujatia = kulturnePodujatieDao.dajVsetky();
        int i = 0;
        for (KulturnePodujatie podujatie: podujatia){
            if (i == 10){
                break;
            }
            podujatiaTable.setValueAt(podujatie.getKrajina(), i, 0);
            podujatiaTable.setValueAt(podujatie.getMesto(), i, 1);
            podujatiaTable.setValueAt(podujatie.getNazov(), i, 2);
            podujatiaTable.setValueAt(podujatie.getDatum(), i, 3);
            i++;
        }
      }
      
      public KulturnePodujatie najdiPodujatie (int cislo){
          
          List<KulturnePodujatie> vsetkyKulturnePodujatia = kulturnePodujatieDao.dajVsetky();
        String krajina = (String) podujatiaTable.getValueAt(cislo, 0);
        String Mesto = ((String) podujatiaTable.getValueAt(cislo, 1));
        String Nazov = ((String) podujatiaTable.getValueAt(cislo, 2));
        Date Datum = ((Date) podujatiaTable.getValueAt(cislo, 3));
        
        if(krajina == null){
            JOptionPane.showMessageDialog(this, "Nebolo vybrané žiadne podujatie!");
            return null;
        }
        
        KulturnePodujatie najdenePodujatie = null;
         for (KulturnePodujatie podujatie : vsetkyKulturnePodujatia){
            if (krajina.equals(podujatie.getKrajina()) && Mesto.equals(podujatie.getMesto()) 
                    && Nazov.equals(podujatie.getNazov()) && Datum.equals(podujatie.getDatum())){
                najdenePodujatie = podujatie;
            } // datum NULL v podmienke padne na NUll Pointer Exception!!!
            
        }
          return najdenePodujatie;
      }
    
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
            java.util.logging.Logger.getLogger(KulturnePodujatieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KulturnePodujatieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KulturnePodujatieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KulturnePodujatieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                KulturnePodujatieForm dialog = new KulturnePodujatieForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton hladatButton;
    private javax.swing.JTextField hladatTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton odstranitButton;
    private javax.swing.JTable podujatiaTable;
    private javax.swing.JButton pridateButton;
    private javax.swing.JButton stornoButton;
    private javax.swing.JButton upravitButton;
    private javax.swing.JButton vsetkyButton;
    // End of variables declaration//GEN-END:variables
}

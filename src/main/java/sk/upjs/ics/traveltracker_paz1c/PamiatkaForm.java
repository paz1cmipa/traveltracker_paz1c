
package sk.upjs.ics.traveltracker_paz1c;

import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;


public class PamiatkaForm extends javax.swing.JDialog {
    
    private PamiatkaDao pamiatkaDao = PamiatkaDaoFactory.INSTANCE.getPamiatkaDao();

    public PamiatkaForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        refresh();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        pamiatkyTable = new javax.swing.JTable();
        stornoButton = new javax.swing.JButton();
        pridatButton = new javax.swing.JButton();
        upravitButton = new javax.swing.JButton();
        odstranitButton = new javax.swing.JButton();
        vsetkyButton = new javax.swing.JButton();
        hladatTextField = new javax.swing.JTextField();
        hladatButton = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pamiatkyTable.setModel(new javax.swing.table.DefaultTableModel(
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
                "Krajina", "Mesto", "Pamiatka", "Dátum"
            }
        ));
        jScrollPane1.setViewportView(pamiatkyTable);

        stornoButton.setText("Storno");
        stornoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stornoButtonActionPerformed(evt);
            }
        });

        pridatButton.setText("Pridať");
        pridatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridatButtonActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hladatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hladatButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(upravitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(vsetkyButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(odstranitButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pridatButton)
                    .addComponent(stornoButton))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stornoButton)
                    .addComponent(upravitButton)
                    .addComponent(hladatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hladatButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pridatButton)
                    .addComponent(odstranitButton)
                    .addComponent(vsetkyButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stornoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stornoButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_stornoButtonActionPerformed

    private void pridatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridatButtonActionPerformed
       PridatPamiatkaForm pridat = new PridatPamiatkaForm(this, true);
       pridat.setVisible(true);
       refresh();
    }//GEN-LAST:event_pridatButtonActionPerformed

    private void upravitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upravitButtonActionPerformed
        List<Pamiatka> vsetkyPamiatky = pamiatkaDao.dajVsetky();
        String krajina = (String) pamiatkyTable.getValueAt(pamiatkyTable.getSelectedRow(), 0);
        String mesto = ((String) pamiatkyTable.getValueAt(pamiatkyTable.getSelectedRow(), 1));
        String pamiatkaNazov = ((String) pamiatkyTable.getValueAt(pamiatkyTable.getSelectedRow(), 2));
        Date datum = ((Date) pamiatkyTable.getValueAt(pamiatkyTable.getSelectedRow(), 3));
        
          for (Pamiatka pamiatka : vsetkyPamiatky){
            if (krajina.equals(pamiatka.getKrajina()) && mesto.equals(pamiatka.getMesto()) 
                    && pamiatkaNazov.equals(pamiatka.getPamiatka()) && datum.equals(pamiatka.getDatum())){
                UpravitPamiatkaForm upravit = new UpravitPamiatkaForm(this, true, pamiatka);
                upravit.setVisible(true);
            }
            
        }
        refresh();
    }//GEN-LAST:event_upravitButtonActionPerformed

    private void odstranitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odstranitButtonActionPerformed
           int cisloRiadku = pamiatkyTable.getSelectedRow();
        
        if(cisloRiadku == -1){
            JOptionPane.showMessageDialog(this, "Nie je vybraný žiaden riadok!");
        }
        
        Pamiatka pamiatka = najdiPamiatku(cisloRiadku);
       
       if (pamiatka == null){
           return; 
       }
        pamiatkaDao.odstranit(pamiatka);
            
        refresh();
    }//GEN-LAST:event_odstranitButtonActionPerformed

    private void vsetkyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vsetkyButtonActionPerformed
        dajVsetkyPamiatkyForm vsetky = new dajVsetkyPamiatkyForm(this, true);
        vsetky.setVisible(true);
    }//GEN-LAST:event_vsetkyButtonActionPerformed

    
    
       public Pamiatka najdiPamiatku (int cislo){
          
          List<Pamiatka> vsetkyPamiatky = pamiatkaDao.dajVsetky();
        String krajina = (String) pamiatkyTable.getValueAt(cislo, 0);
        String mesto = ((String) pamiatkyTable.getValueAt(cislo, 1));
        String nazov = ((String) pamiatkyTable.getValueAt(cislo, 2));
        Date datum = ((Date) pamiatkyTable.getValueAt(cislo, 3));
        
        if(krajina == null){
            JOptionPane.showMessageDialog(this, "Nebolo vybrané žiadne podujatie!");
            return null;
        }
        
             Pamiatka najdenaPamiatka = null;
         for (Pamiatka pamiatka : vsetkyPamiatky){
            if (krajina.equals(pamiatka.getKrajina()) && mesto.equals(pamiatka.getMesto()) 
                    && nazov.equals(pamiatka.getPamiatka()) && datum.equals(pamiatka.getDatum())){
                najdenaPamiatka = pamiatka;
            } // datum NULL v podmienke padne na NUll Pointer Exception!!!
            
        }
          return najdenaPamiatka;
      }
    
    
      public void refresh(){
       
       for(int j=0; j<10; j++){
           for (int k=0; k<4; k++){
               pamiatkyTable.setValueAt(null, j, k);
           }
       }
        
        List<Pamiatka> pamiatky = pamiatkaDao.dajVsetky();
        int i = 0;
        for (Pamiatka pamiatka: pamiatky){
            if (i == 10){
                break;
            }
            pamiatkyTable.setValueAt(pamiatka.getKrajina(), i, 0);
            pamiatkyTable.setValueAt(pamiatka.getMesto(), i, 1);
            pamiatkyTable.setValueAt(pamiatka.getPamiatka(), i, 2);
            pamiatkyTable.setValueAt(pamiatka.getDatum(), i, 3);
            i++;
        }
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
            java.util.logging.Logger.getLogger(PamiatkaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PamiatkaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PamiatkaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PamiatkaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PamiatkaForm dialog = new PamiatkaForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton odstranitButton;
    private javax.swing.JTable pamiatkyTable;
    private javax.swing.JButton pridatButton;
    private javax.swing.JButton stornoButton;
    private javax.swing.JButton upravitButton;
    private javax.swing.JButton vsetkyButton;
    // End of variables declaration//GEN-END:variables
}

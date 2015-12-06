/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.traveltracker_paz1c;

import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;


public class ViacdnovyVyletForm extends javax.swing.JDialog {

    ViacdnovyVyletDao vyletDao = ViacdnovyVyletDaoFactory.INSTANCE.getViacdnovyVyletDao();
    
    public ViacdnovyVyletForm(java.awt.Frame parent, boolean modal) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        vyletyTable = new javax.swing.JTable();
        stornoButton = new javax.swing.JButton();
        pridatButton = new javax.swing.JButton();
        upravitButton = new javax.swing.JButton();
        odstranitButton = new javax.swing.JButton();
        vsetkyButton = new javax.swing.JButton();
        hladatTextField = new javax.swing.JTextField();
        hladatButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        vyletyTable.setModel(new javax.swing.table.DefaultTableModel(
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
                "Krajina", "Mesto", "Odchod", "Príchod"
            }
        ));
        jScrollPane1.setViewportView(vyletyTable);

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

        vsetkyButton.setText("Zobraziť všetky");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(vsetkyButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(odstranitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pridatButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(hladatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hladatButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(upravitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(stornoButton)))
                .addContainerGap(15, Short.MAX_VALUE))
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
       PridatViacdnovyVyletForm pridat = new PridatViacdnovyVyletForm(this, true);
       pridat.setVisible(true);
    }//GEN-LAST:event_pridatButtonActionPerformed

    private void upravitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upravitButtonActionPerformed
        List<ViacdnovyVylet> vylety = vyletDao.dajVsetky();
        String krajina = (String) vyletyTable.getValueAt(vyletyTable.getSelectedRow(), 0);
        String mesto = ((String) vyletyTable.getValueAt(vyletyTable.getSelectedRow(), 1));
        Date odchod = ((Date) vyletyTable.getValueAt(vyletyTable.getSelectedRow(), 2));
        Date prichod = ((Date) vyletyTable.getValueAt(vyletyTable.getSelectedRow(), 3));
        
        for (ViacdnovyVylet vylet : vylety){
            if (krajina.equals(vylet.getKrajina()) && mesto.equals(vylet.getMesto()) 
                    && odchod.equals(vylet.getDatumOdchod()) && prichod.equals(vylet.getDatumPrichod())){
                UpravitViacdnovyVyeltForm upravit = new UpravitViacdnovyVyeltForm(this, true, vylet);
                upravit.setVisible(true);
            }
            
        }
        refresh();
    }//GEN-LAST:event_upravitButtonActionPerformed

    private void odstranitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odstranitButtonActionPerformed
         int cisloRiadku = vyletyTable.getSelectedRow();
        
        if(cisloRiadku == -1){
            JOptionPane.showMessageDialog(this, "Nie je vybraný žiaden riadok!");
        }
        
        ViacdnovyVylet vylet = najdiVylet(cisloRiadku);
       
       if (vylet == null){
           return; 
       }
        vyletDao.odstranit(vylet);
            
        refresh();
    }//GEN-LAST:event_odstranitButtonActionPerformed

    private void vsetkyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vsetkyButtonActionPerformed
        dajVsetkyVyletForm vsetky = new dajVsetkyVyletForm(this, true);
        vsetky.setVisible(true);
    }//GEN-LAST:event_vsetkyButtonActionPerformed

    
     public void refresh(){
       
       for(int j=0; j<10; j++){
           for (int k=0; k<4; k++){
               vyletyTable.setValueAt(null, j, k);
           }
       }
        
        List<ViacdnovyVylet> vylety = vyletDao.dajVsetky();
        int i = 0;
        for (ViacdnovyVylet vylet: vylety){
            
            if (i == 10){
                break;
            }
            vyletyTable.setValueAt(vylet.getKrajina(), i, 0);
            vyletyTable.setValueAt(vylet.getMesto(), i, 1);
            vyletyTable.setValueAt(vylet.getDatumPrichod(), i, 2);
            vyletyTable.setValueAt(vylet.getDatumOdchod(), i, 3);
            i++;
        }
      }
      
      public ViacdnovyVylet najdiVylet (int cislo){
          
        List<ViacdnovyVylet> vylety = vyletDao.dajVsetky();
        String krajina = (String) vyletyTable.getValueAt(cislo, 0);
        String mesto = ((String) vyletyTable.getValueAt(cislo, 1));
        Date odchod = ((Date) vyletyTable.getValueAt(cislo, 2));
        Date prichod = ((Date) vyletyTable.getValueAt(cislo, 3));
        
        if(krajina == null){
            JOptionPane.showMessageDialog(this, "Nebol vybraný žiaden výlet!");
            return null;
        }
        
        ViacdnovyVylet najdenyVylet = null;
         for (ViacdnovyVylet vylet : vylety){
            if (krajina.equals(vylet.getKrajina()) && mesto.equals(vylet.getMesto()) 
                    && odchod.equals(vylet.getDatumOdchod()) && prichod.equals(vylet.getDatumPrichod())){
                najdenyVylet = vylet;
            } // datum NULL v podmienke padne na NUll Pointer Exception!!!
            
        }
          return najdenyVylet;
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
            java.util.logging.Logger.getLogger(ViacdnovyVyletForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViacdnovyVyletForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViacdnovyVyletForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViacdnovyVyletForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViacdnovyVyletForm dialog = new ViacdnovyVyletForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton pridatButton;
    private javax.swing.JButton stornoButton;
    private javax.swing.JButton upravitButton;
    private javax.swing.JButton vsetkyButton;
    private javax.swing.JTable vyletyTable;
    // End of variables declaration//GEN-END:variables
}

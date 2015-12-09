package sk.upjs.ics.traveltracker_paz1c;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class PridatViacdnovyVyletForm extends javax.swing.JDialog {
    private ViacdnovyVylet vylet = new ViacdnovyVylet();
    private ViacdnovyVyletDao vyletDao = ViacdnovyVyletDaoFactory.INSTANCE.getViacdnovyVyletDao();
    private boolean boliPodrobnosti=false;
    public PridatViacdnovyVyletForm(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        krajinaComboBox.setEditable(true);
        krajinaComboBox.addActionListener(krajinaComboBox);
        AutoCompleteDecorator.decorate(krajinaComboBox);
        List<String> zoznamKrajin = dajVsetkyKrajiny();
        String krajina;
        krajinaComboBox.addItem(" ");
        for(int i=0; i<zoznamKrajin.size(); i++){
            krajina = zoznamKrajin.get(i);
            krajinaComboBox.addItem(krajina);
        }
        
        typComboBox.setEditable(true);
        typComboBox.addActionListener(typComboBox);
        AutoCompleteDecorator.decorate(typComboBox);
        typComboBox.addItem(" ");
        //pridat typy dovoleniek
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        krajinaLabel = new javax.swing.JLabel();
        krajinaComboBox = new javax.swing.JComboBox();
        odchodLabel = new javax.swing.JLabel();
        odchodDatePicker = new org.jdesktop.swingx.JXDatePicker();
        prichodLabel = new javax.swing.JLabel();
        prichodDatePicker = new org.jdesktop.swingx.JXDatePicker();
        mestoLabel = new javax.swing.JLabel();
        mestoTextField = new javax.swing.JTextField();
        typLabel = new javax.swing.JLabel();
        typComboBox = new javax.swing.JComboBox();
        ubytovanieLabel = new javax.swing.JLabel();
        ubytovanieTextField = new javax.swing.JTextField();
        navstivenieCheckBox = new javax.swing.JCheckBox();
        podrobnostiButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        stornoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        krajinaLabel.setText("Krajina:");

        odchodLabel.setText("Odchod:");

        prichodLabel.setText("Príchod:");

        mestoLabel.setText("Mesto:");

        typLabel.setText("Typ:");

        ubytovanieLabel.setText("Ubytovanie:");

        navstivenieCheckBox.setText("Navštívené");

        podrobnostiButton.setText("Podrobnosti...");
        podrobnostiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                podrobnostiButtonActionPerformed(evt);
            }
        });

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        stornoButton.setText("Storno");
        stornoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stornoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ubytovanieLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(odchodLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(odchodDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(prichodLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(prichodDatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(ubytovanieTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(typLabel)
                                .addGap(27, 27, 27)
                                .addComponent(typComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(navstivenieCheckBox)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(podrobnostiButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(stornoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(krajinaLabel)
                                        .addGap(8, 8, 8)
                                        .addComponent(krajinaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mestoLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mestoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(105, 105, 105))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(odchodLabel)
                    .addComponent(odchodDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prichodLabel)
                    .addComponent(prichodDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(krajinaLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(krajinaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mestoLabel)
                        .addComponent(mestoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ubytovanieLabel)
                .addGap(8, 8, 8)
                .addComponent(ubytovanieTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typLabel)
                    .addComponent(typComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(navstivenieCheckBox))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(podrobnostiButton)
                    .addComponent(stornoButton)
                    .addComponent(okButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      public List<String> dajVsetkyKrajiny()
       {
        String[] lokaly = Locale.getISOCountries();
        List<String> krajiny = new ArrayList<String>();
        for (String kodKrajiny: lokaly){
            Locale lokal = new Locale ("",kodKrajiny);
            krajiny.add(lokal.getDisplayCountry());
        }
        
        return krajiny;
      }
    
    private void stornoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stornoButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_stornoButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
       if(!boliPodrobnosti){
           
           
         if(mestoTextField.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(this, "Zadanie mesta je povinné");
           return;
          }
     
     
         if(odchodDatePicker.getDate()==null){
            JOptionPane.showMessageDialog(this, "Výber dátumu odchodu je povinný");
            return;
           }
         
         if(prichodDatePicker.getDate()==null){
            JOptionPane.showMessageDialog(this, "Výber dátumu prichodu je povinný");
            return;
           }
         
        vylet.setKrajina((String) krajinaComboBox.getSelectedItem());
        vylet.setDatumOdchod(odchodDatePicker.getDate());
        vylet.setDatumPrichod(prichodDatePicker.getDate());
        vylet.setMesto1(mestoTextField.getText());
        vylet.setUbytovanie(ubytovanieTextField.getText());
        vylet.setTyp((String)typComboBox.getSelectedItem());
        vylet.setNavstivene(navstivenieCheckBox.isSelected());
        
        vyletDao.pridat(vylet);
       }
       boliPodrobnosti=true;
        setVisible(false);
    }//GEN-LAST:event_okButtonActionPerformed

    private void podrobnostiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_podrobnostiButtonActionPerformed
          if(mestoTextField.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(this, "Zadanie mesta je povinné");
           return;
          }
     
     
         if(odchodDatePicker.getDate()==null){
            JOptionPane.showMessageDialog(this, "Výber dátumu odchodu je povinný");
            return;
           }
         
         if(prichodDatePicker.getDate()==null){
            JOptionPane.showMessageDialog(this, "Výber dátumu prichodu je povinný");
            return;
           }

        vylet.setKrajina((String) krajinaComboBox.getSelectedItem());
        vylet.setDatumOdchod(odchodDatePicker.getDate());
        vylet.setDatumPrichod(prichodDatePicker.getDate());
        vylet.setMesto1(mestoTextField.getText());
        vylet.setUbytovanie(ubytovanieTextField.getText());
        vylet.setTyp((String)typComboBox.getSelectedItem());
        vylet.setNavstivene(navstivenieCheckBox.isSelected());
        boliPodrobnosti=true;
        PridatPodrobnostiViacdVyletForm podrobnostiViacVylet = new PridatPodrobnostiViacdVyletForm(this, true,vylet);
        podrobnostiViacVylet.setVisible(true);
    }//GEN-LAST:event_podrobnostiButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PridatViacdnovyVyletForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PridatViacdnovyVyletForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PridatViacdnovyVyletForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PridatViacdnovyVyletForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PridatViacdnovyVyletForm dialog = new PridatViacdnovyVyletForm(new javax.swing.JDialog(), true);
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
    private javax.swing.JComboBox krajinaComboBox;
    private javax.swing.JLabel krajinaLabel;
    private javax.swing.JLabel mestoLabel;
    private javax.swing.JTextField mestoTextField;
    private javax.swing.JCheckBox navstivenieCheckBox;
    private org.jdesktop.swingx.JXDatePicker odchodDatePicker;
    private javax.swing.JLabel odchodLabel;
    private javax.swing.JButton okButton;
    private javax.swing.JButton podrobnostiButton;
    private org.jdesktop.swingx.JXDatePicker prichodDatePicker;
    private javax.swing.JLabel prichodLabel;
    private javax.swing.JButton stornoButton;
    private javax.swing.JComboBox typComboBox;
    private javax.swing.JLabel typLabel;
    private javax.swing.JLabel ubytovanieLabel;
    private javax.swing.JTextField ubytovanieTextField;
    // End of variables declaration//GEN-END:variables
}

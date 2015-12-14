package sk.upjs.ics.traveltracker_paz1c;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class PridatPamiatkaForm extends javax.swing.JDialog {
    private boolean boloZmenene = false;
   private Pamiatka pamiatka = new Pamiatka();
    private PamiatkaDao pamiatkaDao = PamiatkaDaoFactory.INSTANCE.getPamiatkaDao();
    boolean boliPOdrobnosti=false;
    public PridatPamiatkaForm(javax.swing.JDialog parent, boolean modal) {
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
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        krajinaLabel = new javax.swing.JLabel();
        krajinaComboBox = new javax.swing.JComboBox();
        mestoLabel = new javax.swing.JLabel();
        mestoTextField = new javax.swing.JTextField();
        pamiatkaLabel = new javax.swing.JLabel();
        pamiatkaTextField = new javax.swing.JTextField();
        datumLabel = new javax.swing.JLabel();
        datumDatePicker = new org.jdesktop.swingx.JXDatePicker();
        okButton = new javax.swing.JButton();
        stornoButton = new javax.swing.JButton();
        navstiveneCheckBox = new javax.swing.JCheckBox();
        podrobnostiButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        krajinaLabel.setText("Krajina:");

        krajinaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krajinaComboBoxActionPerformed(evt);
            }
        });

        mestoLabel.setText("Mesto:");

        pamiatkaLabel.setText("Pamiatka/Zaujímavosť:");

        datumLabel.setText("Dátum:");

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

        navstiveneCheckBox.setText("Navštívené");

        podrobnostiButton.setText("Podrobnosti...");
        podrobnostiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                podrobnostiButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mestoLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(datumLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pamiatkaLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(krajinaLabel)
                            .addComponent(podrobnostiButton))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(datumDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(navstiveneCheckBox))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(stornoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(pamiatkaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(krajinaComboBox, 0, 220, Short.MAX_VALUE)
                                    .addComponent(mestoTextField))))))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pamiatkaLabel)
                    .addComponent(pamiatkaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(krajinaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(krajinaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mestoLabel)
                    .addComponent(mestoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datumLabel)
                    .addComponent(datumDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(navstiveneCheckBox))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(stornoButton)
                    .addComponent(podrobnostiButton))
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

    private void krajinaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_krajinaComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_krajinaComboBoxActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
          if(pamiatkaTextField.getText().trim().isEmpty()){
             JOptionPane.showMessageDialog(this, "Zadanie pamiatky je povinné");
             return;
         }
         
         if(mestoTextField.getText().trim().isEmpty()){
             JOptionPane.showMessageDialog(this, "Zadanie mesta je povinné");
             return;
         }
            
         if(datumDatePicker.getDate()== null){
             JOptionPane.showMessageDialog(this, "Výber dátumu je povinný");
             return;
         }
         if(krajinaComboBox.getSelectedItem().toString().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Výber krajiny je povinný");
            return;
         
         }
        if(!boliPOdrobnosti){
     
       pamiatka.setPamiatka_zaujimavost(pamiatkaTextField.getText());
       pamiatka.setKrajina((String) krajinaComboBox.getSelectedItem());
       pamiatka.setMesto(mestoTextField.getText());
       pamiatka.setDatum(datumDatePicker.getDate());
       pamiatka.setNavstivene(navstiveneCheckBox.isSelected());
       
       pamiatkaDao.pridat(pamiatka);
        }
        
        String nazov = pamiatkaTextField.getText();
       String krajina = (String) krajinaComboBox.getSelectedItem();
       String mesto = mestoTextField.getText();
       Date datum = datumDatePicker.getDate();
       boolean navstivene = navstiveneCheckBox.isSelected();
              
       if(!nazov.equals(pamiatka.getPamiatka_zaujimavost())){
           pamiatka.setPamiatka_zaujimavost(nazov);
           boloZmenene = true;
       }
         if(!krajina.equals(pamiatka.getKrajina())){
           pamiatka.setKrajina(krajina);
           boloZmenene = true;
       }
         if(!mesto.equals(pamiatka.getMesto())){
           pamiatka.setMesto(mesto);
           boloZmenene = true;
       }
        pamiatka.setNavstivene(navstivene);
        if(!datum.equals(pamiatka.getDatum())){
           pamiatka.setDatum(datum);
           boloZmenene = true;
       }
        if (boloZmenene){
            pamiatkaDao.Upravit(pamiatka);
        }
       
       boloZmenene =false;
        
       boliPOdrobnosti=false;
       setVisible(false);
    }//GEN-LAST:event_okButtonActionPerformed

    private void podrobnostiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_podrobnostiButtonActionPerformed
      
         if(pamiatkaTextField.getText().trim().isEmpty()){
             JOptionPane.showMessageDialog(this, "Zadanie pamiatky je povinné");
             return;
         }
         
         if(mestoTextField.getText().trim().isEmpty()){
             JOptionPane.showMessageDialog(this, "Zadanie mesta je povinné");
             return;
         }
            
         if(datumDatePicker.getDate()== null){
             JOptionPane.showMessageDialog(this, "Výber dátumu je povinný");
             return;
         } 
        if(krajinaComboBox.getSelectedItem().toString().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Výber krajiny je povinný");
            return;
         
         }
        
       pamiatka.setPamiatka_zaujimavost(pamiatkaTextField.getText());
       pamiatka.setKrajina((String) krajinaComboBox.getSelectedItem());
       pamiatka.setMesto(mestoTextField.getText());
       pamiatka.setDatum(datumDatePicker.getDate());
       pamiatka.setNavstivene(navstiveneCheckBox.isSelected());
       boliPOdrobnosti=true;
       PridatPodrobnostiPamiatkaForm pridatPodrobnosti = new PridatPodrobnostiPamiatkaForm(this, true,pamiatka);
       pridatPodrobnosti.setVisible(true);
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
            java.util.logging.Logger.getLogger(PridatPamiatkaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PridatPamiatkaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PridatPamiatkaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PridatPamiatkaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PridatPamiatkaForm dialog = new PridatPamiatkaForm(new javax.swing.JDialog(), true);
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
    private org.jdesktop.swingx.JXDatePicker datumDatePicker;
    private javax.swing.JLabel datumLabel;
    private javax.swing.JComboBox krajinaComboBox;
    private javax.swing.JLabel krajinaLabel;
    private javax.swing.JLabel mestoLabel;
    private javax.swing.JTextField mestoTextField;
    private javax.swing.JCheckBox navstiveneCheckBox;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel pamiatkaLabel;
    private javax.swing.JTextField pamiatkaTextField;
    private javax.swing.JButton podrobnostiButton;
    private javax.swing.JButton stornoButton;
    // End of variables declaration//GEN-END:variables
}

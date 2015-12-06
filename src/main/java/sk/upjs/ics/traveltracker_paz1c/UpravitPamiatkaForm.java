
package sk.upjs.ics.traveltracker_paz1c;

import java.awt.Dialog;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;


public class UpravitPamiatkaForm extends javax.swing.JDialog {
    
   private Pamiatka pamiatkaZaujimavost = new Pamiatka();
    private PamiatkaDao pamiatkaDao = PamiatkaDaoFactory.INSTANCE.getPamiatkaDao();

    
    public UpravitPamiatkaForm(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    public UpravitPamiatkaForm(javax.swing.JDialog parent, boolean modal, Pamiatka pamiatka) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        
        pamiatkaZaujimavost = pamiatka;
        
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
        
        krajinaComboBox.setSelectedItem( pamiatkaZaujimavost.getKrajina());
        mestoTextField.setText(pamiatkaZaujimavost.getMesto());
        datumDatePicker.setDate(pamiatkaZaujimavost.getDatum());
        navstiveneCheckBox.setSelected(pamiatkaZaujimavost.isNavstivene());
        pamiatkaTextField.setText(pamiatkaZaujimavost.getPamiatka());
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pamiatkaLabel = new javax.swing.JLabel();
        pamiatkaTextField = new javax.swing.JTextField();
        krajinaLabel = new javax.swing.JLabel();
        krajinaComboBox = new javax.swing.JComboBox();
        mestoLabel = new javax.swing.JLabel();
        mestoTextField = new javax.swing.JTextField();
        datumLabel = new javax.swing.JLabel();
        datumDatePicker = new org.jdesktop.swingx.JXDatePicker();
        navstiveneCheckBox = new javax.swing.JCheckBox();
        podrobnostiButton = new javax.swing.JButton();
        upravitButton = new javax.swing.JButton();
        stornoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pamiatkaLabel.setText("Pamiatka/Zaujímavosť:");

        krajinaLabel.setText("Krajina:");

        mestoLabel.setText("Mesto:");

        datumLabel.setText("Dátum:");

        navstiveneCheckBox.setText("Navštívené");

        podrobnostiButton.setText("Podrobnosti...");
        podrobnostiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                podrobnostiButtonActionPerformed(evt);
            }
        });

        upravitButton.setText("Upraviť");
        upravitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upravitButtonActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pamiatkaLabel)
                            .addComponent(krajinaLabel)
                            .addComponent(mestoLabel)
                            .addComponent(datumLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(datumDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(navstiveneCheckBox))
                            .addComponent(pamiatkaTextField)
                            .addComponent(krajinaComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mestoTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(podrobnostiButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(upravitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(stornoButton)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pamiatkaLabel)
                    .addComponent(pamiatkaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(krajinaLabel)
                    .addComponent(krajinaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mestoLabel)
                    .addComponent(mestoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datumLabel)
                    .addComponent(datumDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(navstiveneCheckBox))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(podrobnostiButton)
                    .addComponent(upravitButton)
                    .addComponent(stornoButton))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
        public List<String> dajVsetkyKrajiny(){
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

    private void podrobnostiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_podrobnostiButtonActionPerformed
        UpravitPodrobnostiPamiatkaForm podrobnosti = new UpravitPodrobnostiPamiatkaForm(this, true, pamiatkaZaujimavost);
        podrobnosti.setVisible(true);
    }//GEN-LAST:event_podrobnostiButtonActionPerformed

    private void upravitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upravitButtonActionPerformed
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
        
        
        
       pamiatkaZaujimavost.setPamiatka(pamiatkaTextField.getText());
       pamiatkaZaujimavost.setKrajina((String)krajinaComboBox.getSelectedItem());
       pamiatkaZaujimavost.setMesto(mestoTextField.getText());
       pamiatkaZaujimavost.setDatum(datumDatePicker.getDate());
       pamiatkaZaujimavost.setNavstivene(navstiveneCheckBox.isSelected());
      
       
       pamiatkaDao.Upravit(pamiatkaZaujimavost);
       setVisible(false);
    }//GEN-LAST:event_upravitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UpravitPamiatkaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpravitPamiatkaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpravitPamiatkaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpravitPamiatkaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpravitPamiatkaForm dialog = new UpravitPamiatkaForm(new javax.swing.JDialog(), true);
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
    private javax.swing.JLabel pamiatkaLabel;
    private javax.swing.JTextField pamiatkaTextField;
    private javax.swing.JButton podrobnostiButton;
    private javax.swing.JButton stornoButton;
    private javax.swing.JButton upravitButton;
    // End of variables declaration//GEN-END:variables
}

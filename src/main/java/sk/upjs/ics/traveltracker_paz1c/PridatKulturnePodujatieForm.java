package sk.upjs.ics.traveltracker_paz1c;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class PridatKulturnePodujatieForm extends javax.swing.JDialog {
    private boolean boliPodrobnost=false;
    KulturnePodujatieDao kulturnePodujatieDao = KulturnePodujatieDaoFactory.INSTANCE.getKulturnePodujatieDao();
    KulturnePodujatie kulturnePodujatie = new KulturnePodujatie();
   
    public PridatKulturnePodujatieForm(javax.swing.JDialog parent, boolean modal) {
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

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        krajinaLabel = new javax.swing.JLabel();
        krajinaComboBox = new javax.swing.JComboBox();
        mestoLabel = new javax.swing.JLabel();
        mestoTextField = new javax.swing.JTextField();
        nazovLabel = new javax.swing.JLabel();
        nazovTextField = new javax.swing.JTextField();
        datumDatePicker = new org.jdesktop.swingx.JXDatePicker();
        datumLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        typTextField = new javax.swing.JTextField();
        stornoButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        podrobnostiButton = new javax.swing.JButton();
        navstiveneCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        krajinaLabel.setText("Krajina:");

        mestoLabel.setText("Mesto:");

        nazovLabel.setText("Názov:");

        datumLabel.setText("Dátum:");

        jLabel1.setText("Typ:");

        stornoButton.setText("Storno");
        stornoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stornoButtonActionPerformed(evt);
            }
        });

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        podrobnostiButton.setText("Podrobnosti...");
        podrobnostiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                podrobnostiButtonActionPerformed(evt);
            }
        });

        navstiveneCheckBox.setText("Navštívené");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(krajinaLabel)
                    .addComponent(mestoLabel)
                    .addComponent(nazovLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nazovTextField)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(krajinaComboBox, 0, 136, Short.MAX_VALUE)
                                    .addComponent(mestoTextField))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(datumLabel)
                                    .addComponent(jLabel1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(navstiveneCheckBox)
                                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(podrobnostiButton, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(datumDatePicker, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(typTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(stornoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nazovLabel)
                    .addComponent(nazovTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(krajinaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(krajinaLabel)
                    .addComponent(datumDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datumLabel))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mestoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mestoLabel)
                    .addComponent(typTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(podrobnostiButton)
                    .addComponent(navstiveneCheckBox, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stornoButton)
                    .addComponent(okButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stornoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stornoButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_stornoButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
       if(!boliPodrobnost){
        if(nazovTextField.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(this, "Zadanie názvu je povinné");
           return;
          }
     
        if(mestoTextField.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(this, "Zadanie mesta je povinné");
           return;
           }
     
         if(datumDatePicker.getDate()==null){
            JOptionPane.showMessageDialog(this, "Výber dátumu je povinný");
            return;
           }
         
         
       kulturnePodujatie.setNazov(nazovTextField.getText());
       kulturnePodujatie.setKrajina((String) krajinaComboBox.getSelectedItem());
       kulturnePodujatie.setMesto(mestoTextField.getText());
       kulturnePodujatie.setDatum(datumDatePicker.getDate());
       kulturnePodujatie.setTyp(typTextField.getText());
       kulturnePodujatie.setNavstivene(navstiveneCheckBox.isSelected());
 
       kulturnePodujatieDao.pridat(kulturnePodujatie);
       
       }
       boliPodrobnost=false;
       this.setVisible(false);
      
    }//GEN-LAST:event_okButtonActionPerformed

    private void podrobnostiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_podrobnostiButtonActionPerformed
        if(nazovTextField.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(this, "Zadanie názvu je povinné");
           return;
          }
     
        if(mestoTextField.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(this, "Zadanie mesta je povinné");
           return;
           }
     
         if(datumDatePicker.getDate()==null){
            JOptionPane.showMessageDialog(this, "Výber dátumu je povinný");
            return;
           }
       kulturnePodujatie.setNazov(nazovTextField.getText());
       kulturnePodujatie.setKrajina((String) krajinaComboBox.getSelectedItem());
       kulturnePodujatie.setMesto(mestoTextField.getText());
       kulturnePodujatie.setDatum(datumDatePicker.getDate());
       kulturnePodujatie.setTyp(typTextField.getText());
       kulturnePodujatie.setNavstivene(navstiveneCheckBox.isSelected());
       boliPodrobnost=true;
     
        PridatPodrobnostiKultPodForm pridatPodrobnosti = new PridatPodrobnostiKultPodForm(this, true,kulturnePodujatie);
        pridatPodrobnosti.setVisible(true);
   
    }//GEN-LAST:event_podrobnostiButtonActionPerformed

  
    
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
            java.util.logging.Logger.getLogger(PridatKulturnePodujatieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PridatKulturnePodujatieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PridatKulturnePodujatieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PridatKulturnePodujatieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PridatKulturnePodujatieForm dialog = new PridatKulturnePodujatieForm(new javax.swing.JDialog(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox krajinaComboBox;
    private javax.swing.JLabel krajinaLabel;
    private javax.swing.JLabel mestoLabel;
    private javax.swing.JTextField mestoTextField;
    private javax.swing.JCheckBox navstiveneCheckBox;
    private javax.swing.JLabel nazovLabel;
    private javax.swing.JTextField nazovTextField;
    private javax.swing.JButton okButton;
    private javax.swing.JButton podrobnostiButton;
    private javax.swing.JButton stornoButton;
    private javax.swing.JTextField typTextField;
    // End of variables declaration//GEN-END:variables
}

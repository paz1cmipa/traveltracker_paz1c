
package sk.upjs.ics.traveltracker_paz1c;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;


public class UpravitTuristikaForm extends javax.swing.JDialog {
    
   private Turistika turistika = new Turistika();
   private TuristikaDao turistikaDao = TuristikaDaoFactory.INSTANCE.getTuristikaDao();

    
    public UpravitTuristikaForm(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    UpravitTuristikaForm(javax.swing.JDialog parent, boolean modal, Turistika tura) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        turistika = tura;
        
        
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
        AutoCompleteDecorator.decorate(typComboBox);
        typComboBox.addItem(" ");
        typComboBox.addItem("Cyklo");
        typComboBox.addItem("Pešia");
        
        hodnotenieComboBox.setEditable(true);               
        hodnotenieComboBox.addActionListener(hodnotenieComboBox);
        hodnotenieComboBox.addItem(" ");
        for (int i=1; i<6; i++){
            hodnotenieComboBox.addItem(i);
        }
        
        krajinaComboBox.setSelectedItem(turistika.getKrajina());
        cielTextField.setText(turistika.getCiel());
        datumDatePicker.setDate(turistika.getDatum());
        hodnotenieComboBox.setSelectedItem(turistika.getHodnotenie());
        prejdeneCheckBox.setSelected(turistika.isPrejdene());
        poznamkyTextField.setText(turistika.getPoznamky());
        trasaTextField.setText(turistika.getTrasa());
        typComboBox.setSelectedItem(turistika.getTyp());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cielLabel = new javax.swing.JLabel();
        cielTextField = new javax.swing.JTextField();
        krajinaLabel = new javax.swing.JLabel();
        krajinaComboBox = new javax.swing.JComboBox();
        datumLabel = new javax.swing.JLabel();
        datumDatePicker = new org.jdesktop.swingx.JXDatePicker();
        trasaLabel = new javax.swing.JLabel();
        trasaTextField = new javax.swing.JTextField();
        poznamkyLabel = new javax.swing.JLabel();
        poznamkyTextField = new javax.swing.JTextField();
        typLabel = new javax.swing.JLabel();
        typComboBox = new javax.swing.JComboBox();
        hodnotenieLabel = new javax.swing.JLabel();
        hodnotenieComboBox = new javax.swing.JComboBox();
        prejdeneCheckBox = new javax.swing.JCheckBox();
        upravitButton = new javax.swing.JButton();
        stornoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cielLabel.setText("Cieľ:");

        krajinaLabel.setText("Krajina:");

        datumLabel.setText("Dátum:");

        trasaLabel.setText("Trasa:");

        poznamkyLabel.setText("Poznámky:");

        typLabel.setText("Typ:");

        hodnotenieLabel.setText("Hodnotenie:");

        prejdeneCheckBox.setText("Prejdené");

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
                        .addComponent(cielLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cielTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(krajinaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(krajinaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(datumLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(datumDatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(trasaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(trasaTextField))
                    .addComponent(poznamkyLabel)
                    .addComponent(poznamkyTextField)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(typLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(typComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(hodnotenieLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hodnotenieComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(prejdeneCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(upravitButton)
                        .addGap(18, 18, 18)
                        .addComponent(stornoButton)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cielLabel)
                    .addComponent(cielTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(krajinaLabel)
                    .addComponent(krajinaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datumLabel)
                    .addComponent(datumDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(trasaLabel)
                    .addComponent(trasaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(poznamkyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(poznamkyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typLabel)
                    .addComponent(typComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hodnotenieLabel)
                    .addComponent(hodnotenieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prejdeneCheckBox)
                    .addComponent(upravitButton)
                    .addComponent(stornoButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void upravitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upravitButtonActionPerformed
          if(cielTextField.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(this, "Zadanie ciela je povinné");
           return;
          }
     
     
         if(datumDatePicker.getDate()==null){
            JOptionPane.showMessageDialog(this, "Výber dátumu je povinný");
            return;
           }
                 
       turistika.setCiel(cielTextField.getText());
       turistika.setKrajina((String)krajinaComboBox.getSelectedItem());
       turistika.setTrasa(trasaTextField.getText());
       turistika.setDatum(datumDatePicker.getDate());
       turistika.setPrejdene(prejdeneCheckBox.isSelected());
       turistika.setPoznamky(poznamkyTextField.getText());
       turistika.setTyp((String)typComboBox.getSelectedItem());
       turistika.setHodnotenie((int)hodnotenieComboBox.getSelectedItem());
       
       turistikaDao.Upravit(turistika);
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
            java.util.logging.Logger.getLogger(UpravitTuristikaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpravitTuristikaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpravitTuristikaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpravitTuristikaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpravitTuristikaForm dialog = new UpravitTuristikaForm(new javax.swing.JDialog(), true);
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
    private javax.swing.JLabel cielLabel;
    private javax.swing.JTextField cielTextField;
    private org.jdesktop.swingx.JXDatePicker datumDatePicker;
    private javax.swing.JLabel datumLabel;
    private javax.swing.JComboBox hodnotenieComboBox;
    private javax.swing.JLabel hodnotenieLabel;
    private javax.swing.JComboBox krajinaComboBox;
    private javax.swing.JLabel krajinaLabel;
    private javax.swing.JLabel poznamkyLabel;
    private javax.swing.JTextField poznamkyTextField;
    private javax.swing.JCheckBox prejdeneCheckBox;
    private javax.swing.JButton stornoButton;
    private javax.swing.JLabel trasaLabel;
    private javax.swing.JTextField trasaTextField;
    private javax.swing.JComboBox typComboBox;
    private javax.swing.JLabel typLabel;
    private javax.swing.JButton upravitButton;
    // End of variables declaration//GEN-END:variables
}

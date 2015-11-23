package sk.upjs.ics.traveltracker_paz1c;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class PridatTuristikaForm extends javax.swing.JDialog {
    
        
    TuristikaDao turaDao = TuristikaDaoFactory.INSTANCE.getTuristikaDao();

    public PridatTuristikaForm(java.awt.Frame parent, boolean modal) {
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
        hodnotenieComboBox.setEditable(true);
        hodnotenieComboBox.addActionListener(hodnotenieComboBox);
        hodnotenieComboBox.addItem(" ");
        for(int i=1; i<6; i++){
            hodnotenieComboBox.addItem(i);
        }
        typComboBox.setEditable(true);
        AutoCompleteDecorator.decorate(typComboBox);
        typComboBox.addItem(" ");
        typComboBox.addItem("Cyklo");
        typComboBox.addItem("Pešia");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        krajinaLabel = new javax.swing.JLabel();
        krajinaComboBox = new javax.swing.JComboBox();
        cielLabel = new javax.swing.JLabel();
        cielTextField = new javax.swing.JTextField();
        datumLabel = new javax.swing.JLabel();
        datumDatePicker = new org.jdesktop.swingx.JXDatePicker();
        trasaLabel = new javax.swing.JLabel();
        trasaTextField = new javax.swing.JTextField();
        typLabel = new javax.swing.JLabel();
        typComboBox = new javax.swing.JComboBox();
        hodnotenieLabel = new javax.swing.JLabel();
        hodnotenieComboBox = new javax.swing.JComboBox();
        prejdeneCheckBox = new javax.swing.JCheckBox();
        poznamkyLabel = new javax.swing.JLabel();
        poznamkyTextField = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();
        stornoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        krajinaLabel.setText("Krajina:");

        cielLabel.setText("Cieľ:");

        datumLabel.setText("Dátum:");

        trasaLabel.setText("Trasa:");

        typLabel.setText("Typ:");

        hodnotenieLabel.setText("Hodnotenie:");

        prejdeneCheckBox.setText("Prejdené");

        poznamkyLabel.setText("Poznámky:");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(typLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(typComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(hodnotenieLabel)
                        .addGap(18, 18, 18)
                        .addComponent(hodnotenieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(krajinaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(krajinaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(datumLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(datumDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cielLabel)
                        .addGap(18, 18, 18)
                        .addComponent(cielTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(trasaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(trasaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(poznamkyLabel)
                    .addComponent(poznamkyTextField)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(prejdeneCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stornoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cielLabel)
                    .addComponent(cielTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(krajinaLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(krajinaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(datumLabel))
                    .addComponent(datumDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trasaLabel)
                    .addComponent(trasaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(poznamkyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(poznamkyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(typComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hodnotenieLabel)
                        .addComponent(hodnotenieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prejdeneCheckBox)
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
        Turistika tura = new Turistika();
        tura.setCiel(cielTextField.getText());
        tura.setKrajina((String)krajinaComboBox.getSelectedItem());
        tura.setDatum(datumDatePicker.getDate());
        tura.setHodnotenie(Integer.parseInt((String)hodnotenieComboBox.getSelectedItem()));
        tura.setTrasa(trasaTextField.getText());
        tura.setTyp((String)typComboBox.getSelectedItem());
        tura.setPrejdene(prejdeneCheckBox.isSelected());
        tura.setPoznamky(poznamkyTextField.getText());
        
        turaDao.pridat(tura);
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
            java.util.logging.Logger.getLogger(PridatTuristikaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PridatTuristikaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PridatTuristikaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PridatTuristikaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PridatTuristikaForm dialog = new PridatTuristikaForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton okButton;
    private javax.swing.JLabel poznamkyLabel;
    private javax.swing.JTextField poznamkyTextField;
    private javax.swing.JCheckBox prejdeneCheckBox;
    private javax.swing.JButton stornoButton;
    private javax.swing.JLabel trasaLabel;
    private javax.swing.JTextField trasaTextField;
    private javax.swing.JComboBox typComboBox;
    private javax.swing.JLabel typLabel;
    // End of variables declaration//GEN-END:variables
}

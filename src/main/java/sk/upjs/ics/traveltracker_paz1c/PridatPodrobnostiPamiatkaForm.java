
package sk.upjs.ics.traveltracker_paz1c;


public class PridatPodrobnostiPamiatkaForm extends javax.swing.JDialog {
    
    PamiatkaDao pamiatkaDao = PamiatkaDaoFactory.INSTANCE.getPamiatkaDao();
   
    public PridatPodrobnostiPamiatkaForm(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        hodnotenieComboBox.setEditable(true);
        hodnotenieComboBox.addActionListener(hodnotenieComboBox);
        hodnotenieComboBox.addItem(" ");
        for(int i=1; i<6; i++){
            hodnotenieComboBox.addItem(i);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vstupneLabel = new javax.swing.JLabel();
        vstupneTextField = new javax.swing.JTextField();
        otvaracieHodinyLabel = new javax.swing.JLabel();
        otvaracieHodinyTextField = new javax.swing.JTextField();
        hodnotenieLabel = new javax.swing.JLabel();
        hodnotenieComboBox = new javax.swing.JComboBox();
        poznamkyLabel = new javax.swing.JLabel();
        poznamkyTextField = new javax.swing.JTextField();
        navstiveneCheckBox = new javax.swing.JCheckBox();
        okButton = new javax.swing.JButton();
        stornoButton = new javax.swing.JButton();
        eurLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        vstupneLabel.setText("Vstupné:");

        otvaracieHodinyLabel.setText("Otváracie Hodiny:");

        hodnotenieLabel.setText("Hodnotenie:");

        poznamkyLabel.setText("Poznámky:");

        navstiveneCheckBox.setText("Navštívené");

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

        eurLabel.setText("eur;");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(vstupneLabel)
                        .addGap(18, 18, 18)
                        .addComponent(vstupneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(eurLabel)
                        .addGap(29, 29, 29)
                        .addComponent(otvaracieHodinyLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(otvaracieHodinyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(poznamkyLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(poznamkyTextField))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(hodnotenieLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(hodnotenieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(navstiveneCheckBox))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(stornoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vstupneLabel)
                    .addComponent(vstupneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eurLabel)
                    .addComponent(otvaracieHodinyLabel)
                    .addComponent(otvaracieHodinyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(poznamkyLabel)
                    .addComponent(poznamkyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hodnotenieLabel)
                    .addComponent(hodnotenieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(navstiveneCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stornoButton)
                    .addComponent(okButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stornoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stornoButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_stornoButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        Pamiatka pamiatka = new Pamiatka();
        pamiatka.setVstupne(Integer.parseInt(vstupneTextField.getText()));
        pamiatka.setOtvaracieHodiny(otvaracieHodinyTextField.getText());
        pamiatka.setPodrobnosti(poznamkyTextField.getText());
        pamiatka.setHodnotenie(Integer.parseInt((String)hodnotenieComboBox.getSelectedItem()));
        pamiatka.setNavstivene(navstiveneCheckBox.isSelected());
        
        pamiatkaDao.pridatPodrobnosti(pamiatka);
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
            java.util.logging.Logger.getLogger(PridatPodrobnostiPamiatkaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PridatPodrobnostiPamiatkaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PridatPodrobnostiPamiatkaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PridatPodrobnostiPamiatkaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PridatPodrobnostiPamiatkaForm dialog = new PridatPodrobnostiPamiatkaForm(new javax.swing.JDialog(), true);
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
    private javax.swing.JLabel eurLabel;
    private javax.swing.JComboBox hodnotenieComboBox;
    private javax.swing.JLabel hodnotenieLabel;
    private javax.swing.JCheckBox navstiveneCheckBox;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel otvaracieHodinyLabel;
    private javax.swing.JTextField otvaracieHodinyTextField;
    private javax.swing.JLabel poznamkyLabel;
    private javax.swing.JTextField poznamkyTextField;
    private javax.swing.JButton stornoButton;
    private javax.swing.JLabel vstupneLabel;
    private javax.swing.JTextField vstupneTextField;
    // End of variables declaration//GEN-END:variables
}

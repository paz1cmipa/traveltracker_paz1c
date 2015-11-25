package sk.upjs.ics.traveltracker_paz1c;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class PridatPodrobnostiViacdVyletForm extends javax.swing.JDialog {
    ViacdnovyVylet vylet=new ViacdnovyVylet();
    ViacdnovyVyletDao vyletDao = ViacdnovyVyletDaoFactory.INSTANCE.getViacdnovyVyletDao();
    
    public PridatPodrobnostiViacdVyletForm(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        hodnotenieComboBox.setEditable(true);
        hodnotenieComboBox.addActionListener(hodnotenieComboBox);
        AutoCompleteDecorator.decorate(hodnotenieComboBox);
        hodnotenieComboBox.addItem(" ");
        for(int i=1; i<6; i++){
            hodnotenieComboBox.addItem(i);
        }
    }

    PridatPodrobnostiViacdVyletForm(javax.swing.JDialog parent, boolean modal, ViacdnovyVylet vylet) {
        super(parent, modal);
        initComponents();
        hodnotenieComboBox.setEditable(true);
        hodnotenieComboBox.addActionListener(hodnotenieComboBox);
        AutoCompleteDecorator.decorate(hodnotenieComboBox);
        hodnotenieComboBox.addItem(" ");
        for(int i=1; i<6; i++){
            hodnotenieComboBox.addItem(i);
        }
        this.vylet=vylet;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        okButton = new javax.swing.JButton();
        stornoButton = new javax.swing.JButton();
        programLabel = new javax.swing.JLabel();
        hodnotenieLabel = new javax.swing.JLabel();
        hodnotenieComboBox = new javax.swing.JComboBox();
        navstivenieCheckBox = new javax.swing.JCheckBox();
        poznamkyLabel = new javax.swing.JLabel();
        poznamkyTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProgramTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        programLabel.setText("Program:");

        hodnotenieLabel.setText("Hodnotenie:");

        navstivenieCheckBox.setText("Navštívené");

        poznamkyLabel.setText("Poznámky:");

        ProgramTextArea.setColumns(20);
        ProgramTextArea.setRows(5);
        jScrollPane2.setViewportView(ProgramTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hodnotenieLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hodnotenieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(poznamkyLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(stornoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(navstivenieCheckBox)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(programLabel)
                                    .addComponent(poznamkyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 11, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(programLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(poznamkyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(poznamkyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(navstivenieCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stornoButton)
                            .addComponent(okButton)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hodnotenieLabel)
                        .addComponent(hodnotenieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stornoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stornoButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_stornoButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
   
        vylet.setProgram(ProgramTextArea.toString());//zmena lebo do listu sa nedalo pisat ppri spusteni //vytiahnut cely zoznam a dat to do Stringu;
                                                  // jednotlive body oddelit urcenym delimiterom;
        vylet.setPoznamky(poznamkyTextField.getText());
        vylet.setHodnotenie((int)hodnotenieComboBox.getSelectedItem());
        vylet.setNavstivene(navstivenieCheckBox.isSelected());
        vyletDao.pridat(vylet);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(PridatPodrobnostiViacdVyletForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PridatPodrobnostiViacdVyletForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PridatPodrobnostiViacdVyletForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PridatPodrobnostiViacdVyletForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PridatPodrobnostiViacdVyletForm dialog = new PridatPodrobnostiViacdVyletForm(new javax.swing.JDialog(), true);
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
    private javax.swing.JTextArea ProgramTextArea;
    private javax.swing.JComboBox hodnotenieComboBox;
    private javax.swing.JLabel hodnotenieLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox navstivenieCheckBox;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel poznamkyLabel;
    private javax.swing.JTextField poznamkyTextField;
    private javax.swing.JLabel programLabel;
    private javax.swing.JButton stornoButton;
    // End of variables declaration//GEN-END:variables
}

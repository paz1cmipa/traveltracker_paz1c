/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.traveltracker_paz1c;

/**
 *
 * @author Robert Link
 */
public class UpravitPodujatieForm extends javax.swing.JDialog {
    KulturnePodujatie kulturnePodujatie=new KulturnePodujatie();
    KulturnePodujatieDao kulturnePodujatieDao = KulturnePodujatieDaoFactory.INSTANCE.getKulturnePodujatieDao();

    
    public UpravitPodujatieForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
  public UpravitPodujatieForm(java.awt.Frame parent, boolean modal,KulturnePodujatie podujatie) {
        super(parent, modal);
        initComponents();
        
        kulturnePodujatie=podujatie;
        
        KrajinaTextField.setText(kulturnePodujatie.getKrajina());
        MestoTextField.setText(kulturnePodujatie.getMesto());
        NazovTextField.setText(kulturnePodujatie.getNazov());
        DatumDatePicker.setDate(kulturnePodujatie.getDatum());
        TypTextField.setText(kulturnePodujatie.getTyp());      
        NavstiveneCheckBox.setSelected(kulturnePodujatie.isNavstivene());
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UpravitButton = new javax.swing.JButton();
        StornoButton = new javax.swing.JButton();
        nazovLabel = new javax.swing.JLabel();
        KrajinaLabel = new javax.swing.JLabel();
        MestoLabel = new javax.swing.JLabel();
        DatumLabelä = new javax.swing.JLabel();
        TypLabel = new javax.swing.JLabel();
        NavstiveneCheckBox = new javax.swing.JCheckBox();
        DatumDatePicker = new org.jdesktop.swingx.JXDatePicker();
        NazovTextField = new javax.swing.JTextField();
        MestoTextField = new javax.swing.JTextField();
        TypTextField = new javax.swing.JTextField();
        KrajinaTextField = new javax.swing.JTextField();
        podrobnostiButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        UpravitButton.setText("Upraviť");
        UpravitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpravitButtonActionPerformed(evt);
            }
        });

        StornoButton.setText("Storno");
        StornoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StornoButtonActionPerformed(evt);
            }
        });

        nazovLabel.setText("Názov:");

        KrajinaLabel.setText("Krajina:");

        MestoLabel.setText("Mesto:");

        DatumLabelä.setText("Dátum:");

        TypLabel.setText("Typ:");

        NavstiveneCheckBox.setText("Navstivene");

        podrobnostiButton.setText("Podrobnosti");
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
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(podrobnostiButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(MestoLabel)
                            .addComponent(KrajinaLabel)
                            .addComponent(nazovLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NazovTextField)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(KrajinaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                            .addComponent(MestoTextField))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DatumLabelä)
                                            .addComponent(TypLabel)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NavstiveneCheckBox)
                                        .addGap(16, 16, 16))
                                    .addComponent(UpravitButton))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TypTextField)
                                    .addComponent(DatumDatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                    .addComponent(StornoButton))))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nazovLabel)
                    .addComponent(NazovTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KrajinaLabel)
                    .addComponent(KrajinaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DatumLabelä)
                    .addComponent(DatumDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TypLabel)
                    .addComponent(TypTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MestoLabel)
                    .addComponent(MestoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NavstiveneCheckBox)
                    .addComponent(podrobnostiButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpravitButton)
                    .addComponent(StornoButton))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StornoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StornoButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_StornoButtonActionPerformed

    private void UpravitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpravitButtonActionPerformed
       kulturnePodujatie.setNazov(NazovTextField.getText());
       kulturnePodujatie.setKrajina( KrajinaTextField.getText());
       kulturnePodujatie.setMesto(MestoTextField.getText());
       kulturnePodujatie.setDatum(DatumDatePicker.getDate());
       kulturnePodujatie.setTyp(TypTextField.getText());
       kulturnePodujatie.setNavstivene(NavstiveneCheckBox.isSelected());
      
       
       kulturnePodujatieDao.Upravit(kulturnePodujatie);
       setVisible(false);
    }//GEN-LAST:event_UpravitButtonActionPerformed

    private void podrobnostiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_podrobnostiButtonActionPerformed
       UpravitPodrobnostiPodujatieForm podrobnosti=new UpravitPodrobnostiPodujatieForm(this, true,kulturnePodujatie);
      podrobnosti.setVisible(true);
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
            java.util.logging.Logger.getLogger(UpravitPodujatieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpravitPodujatieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpravitPodujatieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpravitPodujatieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpravitPodujatieForm dialog = new UpravitPodujatieForm(new javax.swing.JFrame(), true);
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
    private org.jdesktop.swingx.JXDatePicker DatumDatePicker;
    private javax.swing.JLabel DatumLabelä;
    private javax.swing.JLabel KrajinaLabel;
    private javax.swing.JTextField KrajinaTextField;
    private javax.swing.JLabel MestoLabel;
    private javax.swing.JTextField MestoTextField;
    private javax.swing.JCheckBox NavstiveneCheckBox;
    private javax.swing.JTextField NazovTextField;
    private javax.swing.JButton StornoButton;
    private javax.swing.JLabel TypLabel;
    private javax.swing.JTextField TypTextField;
    private javax.swing.JButton UpravitButton;
    private javax.swing.JLabel nazovLabel;
    private javax.swing.JButton podrobnostiButton;
    // End of variables declaration//GEN-END:variables
}

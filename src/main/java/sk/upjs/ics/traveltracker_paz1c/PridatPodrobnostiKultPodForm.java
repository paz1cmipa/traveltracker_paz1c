
package sk.upjs.ics.traveltracker_paz1c;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class PridatPodrobnostiKultPodForm extends javax.swing.JDialog {
     
     private KulturnePodujatieDao kulturnePodujatieDao = KulturnePodujatieDaoFactory.INSTANCE.getKulturnePodujatieDao();
     private KulturnePodujatie kulturnePodujatie = new KulturnePodujatie();
    public PridatPodrobnostiKultPodForm(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        hodnotenieComboBox.setEditable(true);               
        hodnotenieComboBox.addActionListener(hodnotenieComboBox);
        hodnotenieComboBox.addItem(" ");
        for (int i=1; i<6; i++){
            hodnotenieComboBox.addItem(i);
        }
    }

    PridatPodrobnostiKultPodForm(javax.swing.JDialog parent, boolean modal, KulturnePodujatie kulturnePodujatie) {
       super(parent, modal);
       initComponents();
       setLocationRelativeTo(null);
        hodnotenieComboBox.setEditable(true);               
        hodnotenieComboBox.addActionListener(hodnotenieComboBox);
        hodnotenieComboBox.addItem(" ");
        for (int i=1; i<6; i++){
            hodnotenieComboBox.addItem(i);
        }
       this.kulturnePodujatie=kulturnePodujatie;
       
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vstupneLabel = new javax.swing.JLabel();
        vstupneTextField = new javax.swing.JTextField();
        eurLabel = new javax.swing.JLabel();
        miestoLabel = new javax.swing.JLabel();
        miestoTextField = new javax.swing.JTextField();
        zacinaLabel = new javax.swing.JLabel();
        zacinaTextField = new javax.swing.JTextField();
        hodnotenieLabel = new javax.swing.JLabel();
        hodnotenieComboBox = new javax.swing.JComboBox();
        navstiveneCheckBox = new javax.swing.JCheckBox();
        poznamkyLabel = new javax.swing.JLabel();
        poznamkyTextField = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();
        stornoButton = new javax.swing.JButton();
        formatCasLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        vstupneLabel.setText("Vstupné:");

        eurLabel.setText("eur;");

        miestoLabel.setText("Miesto:");

        zacinaLabel.setText("Začína o:");

        hodnotenieLabel.setText("Hodnotenie:");

        navstiveneCheckBox.setText("Navštívené");

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

        formatCasLabel.setText("(hh:mm:ss)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(vstupneLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vstupneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eurLabel)
                        .addGap(14, 14, 14)
                        .addComponent(zacinaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(zacinaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(miestoLabel)
                        .addGap(21, 21, 21)
                        .addComponent(miestoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(poznamkyLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(poznamkyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(hodnotenieLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hodnotenieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(okButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(navstiveneCheckBox)
                            .addComponent(stornoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formatCasLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vstupneLabel)
                    .addComponent(vstupneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eurLabel)
                    .addComponent(zacinaLabel)
                    .addComponent(zacinaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(formatCasLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(miestoLabel)
                    .addComponent(miestoTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(poznamkyLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(poznamkyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hodnotenieLabel)
                    .addComponent(hodnotenieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(navstiveneCheckBox))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stornoButton)
                    .addComponent(okButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stornoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stornoButtonActionPerformed
        this.setVisible(false);
        kulturnePodujatieDao.pridat(kulturnePodujatie);
    }//GEN-LAST:event_stornoButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
       if(vstupneTextField.getText().isEmpty()){
            kulturnePodujatie.setVstupne(0.0);
         } else {
            kulturnePodujatie.setVstupne(Double.valueOf(vstupneTextField.getText()));
        }
        //long cas = Long.parseLong(zacinaTextField.getText());
       // Time zaciatok = null;
       // zaciatok.setTime(cas);
       // 
       // String str = "08:03:10 pm";
       DateFormat formatter = new SimpleDateFormat("hh:mm:ss");
       Date date = null;
         try {
             date=formatter.parse(zacinaTextField.getText());
         } catch (ParseException ex) {
             //JOptionPane.showMessageDialog(this, "Čas zadajte vo formate hh:mm:ss.");
             Logger.getLogger(PridatPodrobnostiKultPodForm.class.getName()).log(Level.SEVERE, null, ex);
         }
        Time cas= new Time(date.getTime());
        kulturnePodujatie.setCasZaciatku(cas);
        kulturnePodujatie.setLokalizacia(miestoTextField.getText());
        kulturnePodujatie.setPoznamky(poznamkyTextField.getText());
        kulturnePodujatie.setNavstivene(navstiveneCheckBox.isSelected());
       
        kulturnePodujatie.setHodnotenie((int)hodnotenieComboBox.getSelectedItem());
        
        
        kulturnePodujatieDao.pridat(kulturnePodujatie);
        setVisible(false);
    }//GEN-LAST:event_okButtonActionPerformed

    /**
     * 
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
            java.util.logging.Logger.getLogger(PridatPodrobnostiKultPodForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PridatPodrobnostiKultPodForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PridatPodrobnostiKultPodForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PridatPodrobnostiKultPodForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PridatPodrobnostiKultPodForm dialog = new PridatPodrobnostiKultPodForm(new javax.swing.JDialog(), true);
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
    private javax.swing.JLabel formatCasLabel;
    private javax.swing.JComboBox hodnotenieComboBox;
    private javax.swing.JLabel hodnotenieLabel;
    private javax.swing.JLabel miestoLabel;
    private javax.swing.JTextField miestoTextField;
    private javax.swing.JCheckBox navstiveneCheckBox;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel poznamkyLabel;
    private javax.swing.JTextField poznamkyTextField;
    private javax.swing.JButton stornoButton;
    private javax.swing.JLabel vstupneLabel;
    private javax.swing.JTextField vstupneTextField;
    private javax.swing.JLabel zacinaLabel;
    private javax.swing.JTextField zacinaTextField;
    // End of variables declaration//GEN-END:variables
}

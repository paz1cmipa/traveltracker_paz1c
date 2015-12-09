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
public class ZobrazitViacdnovyVyletForm extends javax.swing.JDialog {
 
    private ViacdnovyVylet viacdnovyVylet = new ViacdnovyVylet();
  
    public ZobrazitViacdnovyVyletForm(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public ZobrazitViacdnovyVyletForm(javax.swing.JDialog parent, boolean modal,ViacdnovyVylet vylet) {
       super(parent, modal);
       initComponents();
       viacdnovyVylet=vylet;
       if(this.viacdnovyVylet.getKrajina()!=null){
         ZobrazKrajinaLabel.setText(this.viacdnovyVylet.getKrajina());
       }
        if(this.viacdnovyVylet.getMesto1()!=null){
         ZobrazMestolabel.setText(this.viacdnovyVylet.getMesto1());
        }
        if(this.viacdnovyVylet.getTyp()!=null){
            ZobrazTypLabel.setText(this.viacdnovyVylet.getTyp());
        }
        if(this.viacdnovyVylet.getUbytovanie()!=null){
          ZobrazUbytovnieLabel.setText(this.viacdnovyVylet.getUbytovanie());
         }
        if(this.viacdnovyVylet.getPoznamky()!=null){
         ZobrazPoznamkyLabel.setText(this.viacdnovyVylet.getPoznamky());
        
        }
        
          if(this.viacdnovyVylet.getProgram()!=null){
         ZobrazProgramLabel.setText(this.viacdnovyVylet.getProgram());
        
        }
        if(this.viacdnovyVylet.getDatumPrichod()!=null){
         ZobrazPrichodlabel.setText(this.viacdnovyVylet.getDatumPrichod().toString());
        }
        
        if(this.viacdnovyVylet.getDatumOdchod()!=null){
         ZobrazodchodLabel.setText(this.viacdnovyVylet.getDatumOdchod().toString());
        }
        ZobrazHodnotenieLabel.setText(Integer.toString(this.viacdnovyVylet.getHodnotenie()));
        
        if(this.viacdnovyVylet.isNavstivene()){
         NavstiveneCheckBox.isSelected();
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

        ZobrazMestolabel = new javax.swing.JLabel();
        DatumodchodLabel = new javax.swing.JLabel();
        ZobrazodchodLabel = new javax.swing.JLabel();
        datumPrichodLabel = new javax.swing.JLabel();
        ZobrazPrichodlabel = new javax.swing.JLabel();
        UbytovanieLabel = new javax.swing.JLabel();
        ZobrazUbytovnieLabel = new javax.swing.JLabel();
        Krajinalabel = new javax.swing.JLabel();
        ZobrazKrajinaLabel = new javax.swing.JLabel();
        MestoLabel = new javax.swing.JLabel();
        ZobrazPoznamkyLabel = new javax.swing.JLabel();
        ProgramLabel = new javax.swing.JLabel();
        ZobrazProgramLabel = new javax.swing.JLabel();
        TypLabel = new javax.swing.JLabel();
        ZobrazTypLabel = new javax.swing.JLabel();
        NavstiveneCheckBox = new javax.swing.JCheckBox();
        upravitButton = new javax.swing.JButton();
        Hodnotenielabel = new javax.swing.JLabel();
        ZobrazHodnotenieLabel = new javax.swing.JLabel();
        PoznámkzLabel = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ZobrazMestolabel.setText("nepoznačené");

        DatumodchodLabel.setText(" Odchod:");

        ZobrazodchodLabel.setText("nepoznačené");

        datumPrichodLabel.setText("Prichod:");

        ZobrazPrichodlabel.setText("nepoznačené");

        UbytovanieLabel.setText("Ubytovanie:");

        ZobrazUbytovnieLabel.setText("nepoznačené");

        Krajinalabel.setText("Krajina:");

        ZobrazKrajinaLabel.setText("nepoznačené");

        MestoLabel.setText("Mesto:");

        ZobrazPoznamkyLabel.setText("nepoznačené");

        ProgramLabel.setText("Program:");

        ZobrazProgramLabel.setText("nepoznačené");

        TypLabel.setText("Typ:");

        ZobrazTypLabel.setText("nepoznačené");

        NavstiveneCheckBox.setText("Navštívené");
        NavstiveneCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NavstiveneCheckBoxActionPerformed(evt);
            }
        });

        upravitButton.setText("Upraviť");
        upravitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upravitButtonActionPerformed(evt);
            }
        });

        Hodnotenielabel.setText("Hodnotenie:");

        ZobrazHodnotenieLabel.setText("nepoznačené");

        PoznámkzLabel.setText("Poznámky:");

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(UbytovanieLabel)
                                .addComponent(Krajinalabel, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(MestoLabel)
                            .addComponent(datumPrichodLabel)
                            .addComponent(DatumodchodLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ZobrazKrajinaLabel)
                            .addComponent(ZobrazMestolabel)
                            .addComponent(ZobrazodchodLabel)
                            .addComponent(ZobrazPrichodlabel)
                            .addComponent(ZobrazUbytovnieLabel)))
                    .addComponent(okButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(upravitButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PoznámkzLabel)
                                    .addComponent(ProgramLabel)
                                    .addComponent(TypLabel))
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Hodnotenielabel)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ZobrazTypLabel)
                            .addComponent(ZobrazProgramLabel)
                            .addComponent(ZobrazPoznamkyLabel)
                            .addComponent(ZobrazHodnotenieLabel)))
                    .addComponent(NavstiveneCheckBox))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Hodnotenielabel)
                            .addComponent(ZobrazHodnotenieLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PoznámkzLabel)
                            .addComponent(ZobrazPoznamkyLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProgramLabel)
                            .addComponent(ZobrazProgramLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TypLabel)
                            .addComponent(ZobrazTypLabel))
                        .addGap(18, 18, 18)
                        .addComponent(NavstiveneCheckBox)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(upravitButton)
                            .addComponent(okButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Krajinalabel)
                            .addComponent(ZobrazKrajinaLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MestoLabel)
                            .addComponent(ZobrazMestolabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DatumodchodLabel)
                            .addComponent(ZobrazodchodLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(datumPrichodLabel)
                            .addComponent(ZobrazPrichodlabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UbytovanieLabel)
                            .addComponent(ZobrazUbytovnieLabel))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NavstiveneCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NavstiveneCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NavstiveneCheckBoxActionPerformed

    private void upravitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upravitButtonActionPerformed
        UpravitViacdnovyVyeltForm upravitViacdnovyVylet = new UpravitViacdnovyVyeltForm(this, true, viacdnovyVylet);
        upravitViacdnovyVylet.setVisible(true);
    }//GEN-LAST:event_upravitButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
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
            java.util.logging.Logger.getLogger(ZobrazitViacdnovyVyletForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ZobrazitViacdnovyVyletForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ZobrazitViacdnovyVyletForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ZobrazitViacdnovyVyletForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ZobrazitViacdnovyVyletForm dialog = new ZobrazitViacdnovyVyletForm(new javax.swing.JDialog(), true);
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
    private javax.swing.JLabel DatumodchodLabel;
    private javax.swing.JLabel Hodnotenielabel;
    private javax.swing.JLabel Krajinalabel;
    private javax.swing.JLabel MestoLabel;
    private javax.swing.JCheckBox NavstiveneCheckBox;
    private javax.swing.JLabel PoznámkzLabel;
    private javax.swing.JLabel ProgramLabel;
    private javax.swing.JLabel TypLabel;
    private javax.swing.JLabel UbytovanieLabel;
    private javax.swing.JLabel ZobrazHodnotenieLabel;
    private javax.swing.JLabel ZobrazKrajinaLabel;
    private javax.swing.JLabel ZobrazMestolabel;
    private javax.swing.JLabel ZobrazPoznamkyLabel;
    private javax.swing.JLabel ZobrazPrichodlabel;
    private javax.swing.JLabel ZobrazProgramLabel;
    private javax.swing.JLabel ZobrazTypLabel;
    private javax.swing.JLabel ZobrazUbytovnieLabel;
    private javax.swing.JLabel ZobrazodchodLabel;
    private javax.swing.JLabel datumPrichodLabel;
    private javax.swing.JButton okButton;
    private javax.swing.JButton upravitButton;
    // End of variables declaration//GEN-END:variables
}

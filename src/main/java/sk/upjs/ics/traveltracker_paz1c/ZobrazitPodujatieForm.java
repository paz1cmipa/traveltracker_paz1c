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
public class ZobrazitPodujatieForm extends javax.swing.JFrame {

    KulturnePodujatie kulturnePodujatie= new KulturnePodujatie();
     
    public ZobrazitPodujatieForm() {
        initComponents();
    }
     public ZobrazitPodujatieForm(KulturnePodujatie kultPodujatie) {
        initComponents();
        kulturnePodujatie=kultPodujatie;
        
        if(kulturnePodujatie.getKrajina()!=null){
        ZobrazenakrajinaLabel.setText(kulturnePodujatie.getKrajina());
        }
        
        if(kulturnePodujatie.getMesto()!=null){
        ZobrazeneMestolabel.setText(kulturnePodujatie.getMesto());
        }
        
        if(kulturnePodujatie.getNazov()!=null){
        ZobrazenyNazovLabel.setText(kulturnePodujatie.getNazov());
        }
        
        if(kulturnePodujatie.getDatum().toString()!=null){
        ZobrazenyDatumLabel.setText(kulturnePodujatie.getDatum().toString());
        }
        
        if(Integer.toString(kulturnePodujatie.getHodnotenie())!=null){
        ZobrazeneHodnotenieLabel.setText(Integer.toString(kulturnePodujatie.getHodnotenie()));
        }
        
        if(kulturnePodujatie.getLokalizacia()!=null){
        ZobrazeneMiestoLabel.setText(kulturnePodujatie.getLokalizacia());
        }
        
        
        if(Integer.toString(kulturnePodujatie.getVstupne())!=null){
        ZobrazeneVstupneLabel.setText(Integer.toString(kulturnePodujatie.getVstupne()));
        }
        
        
        if(kulturnePodujatie.getCasZaciatku().toString()!=null){
        ZobrazenyCasLabel.setText(kulturnePodujatie.getCasZaciatku().toString());
        }
        
        if(kulturnePodujatie.getTyp()!=null){
        ZobrazenyTypLabel.setText(kulturnePodujatie.getTyp());
        }
        
        
        if(kulturnePodujatie.getPoznamky()!=null){
        ZobrazenePoznamkyLabel.setText(kulturnePodujatie.getPoznamky());
        }
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

        jLabel1 = new javax.swing.JLabel();
        KrajinaLabel = new javax.swing.JLabel();
        MestoLabel = new javax.swing.JLabel();
        NazovLabel = new javax.swing.JLabel();
        DatumLabel = new javax.swing.JLabel();
        casZaciatkuLabel = new javax.swing.JLabel();
        MiestoLabel = new javax.swing.JLabel();
        HodnotenieLabel = new javax.swing.JLabel();
        TypLabel = new javax.swing.JLabel();
        VstupneLabel = new javax.swing.JLabel();
        PoznamkyLabel = new javax.swing.JLabel();
        NavstiveneCheckBox = new javax.swing.JCheckBox();
        ZobrazenakrajinaLabel = new javax.swing.JLabel();
        ZobrazeneMestolabel = new javax.swing.JLabel();
        ZobrazenyNazovLabel = new javax.swing.JLabel();
        ZobrazenyDatumLabel = new javax.swing.JLabel();
        ZobrazenyCasLabel = new javax.swing.JLabel();
        ZobrazeneMiestoLabel = new javax.swing.JLabel();
        ZobrazeneHodnotenieLabel = new javax.swing.JLabel();
        ZobrazenyTypLabel = new javax.swing.JLabel();
        ZobrazeneVstupneLabel = new javax.swing.JLabel();
        ZobrazenePoznamkyLabel = new javax.swing.JLabel();
        UpravitButton = new javax.swing.JButton();
        OkButton = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        KrajinaLabel.setText("Krajina:");

        MestoLabel.setText("Mesto:");

        NazovLabel.setText("Názov:");

        DatumLabel.setText("Dátum:");

        casZaciatkuLabel.setText("Čas začiatku :");

        MiestoLabel.setText("Miesto:");

        HodnotenieLabel.setText("Hodnotenie:");

        TypLabel.setText("Typ:");

        VstupneLabel.setText("Vstupné:");

        PoznamkyLabel.setText("Poznámky:");

        NavstiveneCheckBox.setText("Navštívené");

        ZobrazenakrajinaLabel.setText("nepoznačené");

        ZobrazeneMestolabel.setText("nepoznačené");

        ZobrazenyNazovLabel.setText("nepoznačené");

        ZobrazenyDatumLabel.setText("nepoznačené");

        ZobrazenyCasLabel.setText("nepoznačené");

        ZobrazeneMiestoLabel.setText("nepoznačené");

        ZobrazeneHodnotenieLabel.setText("nepoznačené");

        ZobrazenyTypLabel.setText("nepoznačené");

        ZobrazeneVstupneLabel.setText("nepoznačené");

        ZobrazenePoznamkyLabel.setText("nepoznačené");

        UpravitButton.setText("Upraviť");
        UpravitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpravitButtonActionPerformed(evt);
            }
        });

        OkButton.setText("OK");
        OkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NavstiveneCheckBox)
                        .addGap(52, 52, 52)
                        .addComponent(OkButton)
                        .addGap(38, 38, 38)
                        .addComponent(UpravitButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(244, 244, 244)
                                    .addComponent(VstupneLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(casZaciatkuLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ZobrazenyCasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ZobrazeneVstupneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ZobrazeneMiestoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(HodnotenieLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ZobrazeneHodnotenieLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(MiestoLabel)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(PoznamkyLabel)
                                    .addGap(26, 26, 26)
                                    .addComponent(ZobrazenePoznamkyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(MestoLabel)
                                .addComponent(KrajinaLabel)
                                .addComponent(NazovLabel)
                                .addComponent(DatumLabel))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(ZobrazenyDatumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 2, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ZobrazenyNazovLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ZobrazeneMestolabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ZobrazenakrajinaLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TypLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ZobrazenyTypLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KrajinaLabel)
                    .addComponent(ZobrazenakrajinaLabel)
                    .addComponent(MiestoLabel)
                    .addComponent(ZobrazeneMiestoLabel))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MestoLabel)
                    .addComponent(ZobrazeneMestolabel)
                    .addComponent(casZaciatkuLabel)
                    .addComponent(ZobrazenyCasLabel))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DatumLabel)
                            .addComponent(ZobrazenyDatumLabel)
                            .addComponent(TypLabel)
                            .addComponent(ZobrazenyTypLabel)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NazovLabel)
                        .addComponent(ZobrazenyNazovLabel)
                        .addComponent(VstupneLabel)
                        .addComponent(ZobrazeneVstupneLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HodnotenieLabel)
                    .addComponent(ZobrazenePoznamkyLabel)
                    .addComponent(PoznamkyLabel)
                    .addComponent(ZobrazeneHodnotenieLabel))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NavstiveneCheckBox)
                    .addComponent(OkButton)
                    .addComponent(UpravitButton))
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_OkButtonActionPerformed

    private void UpravitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpravitButtonActionPerformed
       UpravitKultPodujatieForm kultura=new UpravitKultPodujatieForm(this, true,kulturnePodujatie);
       kultura.setVisible(true);
    }//GEN-LAST:event_UpravitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ZobrazitPodujatieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ZobrazitPodujatieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ZobrazitPodujatieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ZobrazitPodujatieForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZobrazitPodujatieForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DatumLabel;
    private javax.swing.JLabel HodnotenieLabel;
    private javax.swing.JLabel KrajinaLabel;
    private javax.swing.JLabel MestoLabel;
    private javax.swing.JLabel MiestoLabel;
    private javax.swing.JCheckBox NavstiveneCheckBox;
    private javax.swing.JLabel NazovLabel;
    private javax.swing.JButton OkButton;
    private javax.swing.JLabel PoznamkyLabel;
    private javax.swing.JLabel TypLabel;
    private javax.swing.JButton UpravitButton;
    private javax.swing.JLabel VstupneLabel;
    private javax.swing.JLabel ZobrazenakrajinaLabel;
    private javax.swing.JLabel ZobrazeneHodnotenieLabel;
    private javax.swing.JLabel ZobrazeneMestolabel;
    private javax.swing.JLabel ZobrazeneMiestoLabel;
    private javax.swing.JLabel ZobrazenePoznamkyLabel;
    private javax.swing.JLabel ZobrazeneVstupneLabel;
    private javax.swing.JLabel ZobrazenyCasLabel;
    private javax.swing.JLabel ZobrazenyDatumLabel;
    private javax.swing.JLabel ZobrazenyNazovLabel;
    private javax.swing.JLabel ZobrazenyTypLabel;
    private javax.swing.JLabel casZaciatkuLabel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

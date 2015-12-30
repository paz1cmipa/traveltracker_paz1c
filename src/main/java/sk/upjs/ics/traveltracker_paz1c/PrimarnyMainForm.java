package sk.upjs.ics.traveltracker_paz1c;

import java.util.List;

public class PrimarnyMainForm extends javax.swing.JFrame {
    
    private KulturnePodujatieDao podujatieDao = KulturnePodujatieDaoFactory.INSTANCE.getKulturnePodujatieDao();
    private PamiatkaDao pamiatkaDao = PamiatkaDaoFactory.INSTANCE.getPamiatkaDao();
    private TuristikaDao turistikaDao = TuristikaDaoFactory.INSTANCE.getTuristikaDao();
    private ViacdnovyVyletDao vyletDao = ViacdnovyVyletDaoFactory.INSTANCE.getViacdnovyVyletDao();

  
    public PrimarnyMainForm() {
        initComponents();
        pridatComboBox.addItem("Kultúrne podujatia");
        pridatComboBox.addItem("Pamiatky a zaujímavosti");
        pridatComboBox.addItem("Turistika");
        pridatComboBox.addItem("Viacdňový výlet");
        setLocationRelativeTo(null);
        refresh();
       
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        najblizsieUdalostiLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        najblizsieKultPodujatiaList = new javax.swing.JList();
        travelTrackerLabel = new javax.swing.JLabel();
        pridatComboBox = new javax.swing.JComboBox();
        kulturnePodujatiaLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        najblizsiePamiatkyList = new javax.swing.JList();
        najblizsieTuryLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        najblizsieTuryList = new javax.swing.JList();
        viacdnoveVyletyLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        najblizsieVyletyList = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        najblizsieUdalostiLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        najblizsieUdalostiLabel.setText("Najbližšie udalosti:");

        jScrollPane1.setViewportView(najblizsieKultPodujatiaList);

        travelTrackerLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        travelTrackerLabel.setText("Travel Tracker");

        pridatComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Výber" }));
        pridatComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridatComboBoxActionPerformed(evt);
            }
        });

        kulturnePodujatiaLabel.setText("Kultúrne podujatia:");

        jLabel1.setText("Pamiatky / Zaujímavosti:");

        jScrollPane2.setViewportView(najblizsiePamiatkyList);

        najblizsieTuryLabel.setText("Túry:");

        jScrollPane3.setViewportView(najblizsieTuryList);

        viacdnoveVyletyLabel.setText("Viacdňové výlety:");

        jScrollPane4.setViewportView(najblizsieVyletyList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kulturnePodujatiaLabel)
                            .addComponent(najblizsieUdalostiLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pridatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(najblizsieTuryLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viacdnoveVyletyLabel, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(travelTrackerLabel)
                .addGap(196, 196, 196))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(travelTrackerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(najblizsieUdalostiLabel)
                    .addComponent(pridatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kulturnePodujatiaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(najblizsieTuryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viacdnoveVyletyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pridatComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridatComboBoxActionPerformed
        String vyber = (String) pridatComboBox.getSelectedItem();
       // KulturnePodujatieForm sekundaryMainForm = new KulturnePodujatieForm((this), true, vyber);
        if ("Kultúrne podujatia".equals(vyber)){
            KulturnePodujatieForm kulturnePodujatie = new KulturnePodujatieForm(this, true);
            kulturnePodujatie.setVisible(true);
        }
        if ("Pamiatky a zaujímavosti".equals(vyber)){
            PamiatkaForm pamiatka = new PamiatkaForm(this,true);
            pamiatka.setVisible(true);
        }
        if ("Turistika".equals(vyber)){
            TuristikaForm turistika = new TuristikaForm(this, true);
            turistika.setVisible(true);
            
        }
        if ("Viacdňový výlet".equals(vyber)){
            ViacdnovyVyletForm viacdnovyVylet = new ViacdnovyVyletForm(this, true);
            viacdnovyVylet.setVisible(true);
          
        }
        refresh();
        pridatComboBox.setSelectedIndex(0);
    }//GEN-LAST:event_pridatComboBoxActionPerformed

   public void refresh(){
        List<KulturnePodujatie> vsetkyPodujatia = podujatieDao.dajVsetkySLimit();
        if(!vsetkyPodujatia.isEmpty()){
            if(vsetkyPodujatia.size()> 3){
        najblizsieKultPodujatiaList.setListData(vsetkyPodujatia.subList(0,3).toArray());
        }else{
            najblizsieKultPodujatiaList.setListData(vsetkyPodujatia.toArray());
        }
    }
        
        List<Pamiatka> vsetkyPamiatky = pamiatkaDao.dajVsetkySLimit();
        if(!vsetkyPamiatky.isEmpty()){
            if(vsetkyPamiatky.size()>3){
        najblizsiePamiatkyList.setListData(vsetkyPamiatky.subList(0,3).toArray());
            }else{
                najblizsiePamiatkyList.setListData(vsetkyPamiatky.toArray());
            }
        }
        
        List<Turistika> vsetkyTury = turistikaDao.dajVsetkySLimit();
        if(!vsetkyTury.isEmpty()){
            if(vsetkyTury.size()>3){
                najblizsieTuryList.setListData(vsetkyTury.subList(0,3).toArray());
            }else{
                najblizsieTuryList.setListData(vsetkyTury.toArray());
            }
        }
        
        List<ViacdnovyVylet> vsetkyVylety = vyletDao.dajVsetky();
        if(!vsetkyVylety.isEmpty()){
            if(vsetkyVylety.size()>3){
                najblizsieVyletyList.setListData(vsetkyVylety.subList(0,3).toArray());
            }else{
                najblizsieVyletyList.setListData(vsetkyVylety.toArray());
            }
        }
       
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
            java.util.logging.Logger.getLogger(PrimarnyMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrimarnyMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrimarnyMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrimarnyMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrimarnyMainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel kulturnePodujatiaLabel;
    private javax.swing.JList najblizsieKultPodujatiaList;
    private javax.swing.JList najblizsiePamiatkyList;
    private javax.swing.JLabel najblizsieTuryLabel;
    private javax.swing.JList najblizsieTuryList;
    private javax.swing.JLabel najblizsieUdalostiLabel;
    private javax.swing.JList najblizsieVyletyList;
    private javax.swing.JComboBox pridatComboBox;
    private javax.swing.JLabel travelTrackerLabel;
    private javax.swing.JLabel viacdnoveVyletyLabel;
    // End of variables declaration//GEN-END:variables
}

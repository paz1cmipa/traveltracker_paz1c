/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.traveltracker_paz1c;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Robert Link
 */
class VsetkyVyletyModel extends AbstractTableModel {

   private ViacdnovyVyletDao vyletDao = ViacdnovyVyletDaoFactory.INSTANCE.getViacdnovyVyletDao();
    private List<ViacdnovyVylet> vylety= vyletDao.dajVsetky();
    private static final String[] NAZVY_STLPCOV={"Krajina","Mesto","Odchod","Príchod"};
    private static final int STLPEC_ODCHOD = 3;
    private static final int STLPEC_PRICHOD = 2;
    private static final int STLPEC_MESTO = 1;
    private static final int STLPEC_KRAJINA = 0;  
    private static final int POCET_STLPCOV = 4;
  
  
  @Override
    public int getRowCount() {
       return vylety.size();
    }

    @Override
    public int getColumnCount() {
       return POCET_STLPCOV;
    }
  
    
    @Override
    public String getColumnName(int columnIndex) {
         return NAZVY_STLPCOV[columnIndex];               
    }

    @Override
    public Object getValueAt(int row, int column) {
        ViacdnovyVylet vylet=vylety.get(row);
            switch(column){
            case STLPEC_KRAJINA: return vylet.getKrajina();
            case STLPEC_MESTO: return vylet.getMesto1();
            case STLPEC_PRICHOD: return vylet.getDatumOdchod();
            case STLPEC_ODCHOD: return vylet.getDatumPrichod();
            default: return "??";
            }
        
    }
  
    public ViacdnovyVylet getVylet(int row){
        return vylety.get(row);
    
        
    }
}

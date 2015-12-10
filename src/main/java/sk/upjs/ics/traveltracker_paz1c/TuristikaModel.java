/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.traveltracker_paz1c;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Robert Link
 */
public class TuristikaModel extends AbstractTableModel{
   private TuristikaDao turaDao = TuristikaDaoFactory.INSTANCE.getTuristikaDao();
    private List<Turistika> tury= turaDao.dajVsetky();
    private static final String[] NAZVY_STLPCOV={"Krajina","Ciel","Datum"};
    private static final int STLPEC_DATUM = 2;
    private static final int STLPEC_CIEL = 1;
    private static final int STLPEC_KRAJINA = 0;
    private static final int POCET_STLPCOV = 3;
    private static final int POCET_RIADKOV=10;
    
    
    @Override
    public int getRowCount() {
     if(POCET_RIADKOV>tury.size()){
          return tury.size();
        }else{

       return POCET_RIADKOV;
        }
    }

    @Override
    public int getColumnCount() {
        return POCET_STLPCOV;
    }
    

    @Override
    public Object getValueAt(int row, int column) {
            Turistika tura= tury.get(row);
            switch(column){
            case STLPEC_KRAJINA: return tura.getKrajina();
            case STLPEC_CIEL: return tura.getCiel();
            case STLPEC_DATUM: return tura.getDatum();
            default: return "??";
            }
    }


    @Override
    public String getColumnName(int columnIndex) {
     return NAZVY_STLPCOV[columnIndex];
    }
    public Turistika getTura(int row){
    return tury.get(row);
    }
   public void odstranTuru(int row){
     turaDao.odstranit(tury.get(row));
     refresh();
    
    }

    public void refresh(){
    tury.clear();
    tury=turaDao.dajVsetky();
    
        
    fireTableDataChanged();

    }
    
}

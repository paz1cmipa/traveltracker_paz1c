
package sk.upjs.ics.traveltracker_paz1c;

import java.util.List;
import javax.swing.table.AbstractTableModel;


public class VsetkyTuryModel extends AbstractTableModel{
   private TuristikaDao turaDao = TuristikaDaoFactory.INSTANCE.getTuristikaDao();
    private List<Turistika> tury= turaDao.dajVsetky();
    private static final String[] NAZVY_STLPCOV={"Krajina","Ciel","Datum"};
    private static final int STLPEC_DATUM = 2;
    private static final int STLPEC_CIEL = 1;
    private static final int STLPEC_KRAJINA = 0;
    private static final int POCET_STLPCOV = 3;
    
    
    @Override
    public int getRowCount() {
        return tury.size();
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
    
}

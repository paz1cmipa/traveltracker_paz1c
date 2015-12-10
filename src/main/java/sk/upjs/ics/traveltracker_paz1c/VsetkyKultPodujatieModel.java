
package sk.upjs.ics.traveltracker_paz1c;

import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

class VsetkyKultPodujatieModel extends AbstractTableModel {
    private KulturnePodujatieDao podujatie = KulturnePodujatieDaoFactory.INSTANCE.getKulturnePodujatieDao();
    private List<KulturnePodujatie> podujatia= podujatie.dajVsetky();
    private static final int POCET_STLPCOV = 4;
    private static final String[] NAZVY_STLPCOV= {"Krajina","Mesto","Nazov","Datum"};
    private static final int STLPEC_DATUM = 3;
    private static final int STLPEC_NAZOV = 2;
    private static final int STLPEC_MESTO = 1;
    private static final int STLPEC_KRAJINA = 0;
    private static  int POCET_RIADKOV;
    
    public VsetkyKultPodujatieModel() {
        super();
        POCET_RIADKOV=podujatia.size();
    }
    
     /* public VsetkyKultPodujatieModel(int pocetRiadkov) {
        super();
        POCET_RIADKOV=pocetRiadkov;
    }*/
    
    
    @Override
    public int getRowCount() {
           return POCET_RIADKOV;
        
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
        KulturnePodujatie kultPodujatie=podujatia.get(row);
            switch(column){
            case STLPEC_KRAJINA: return kultPodujatie.getKrajina();
            case STLPEC_MESTO: return kultPodujatie.getMesto();
            case STLPEC_NAZOV: return kultPodujatie.getNazov();
            case STLPEC_DATUM: return kultPodujatie.getDatum();
            default: return "??";
            }
        
    }
    public KulturnePodujatie getPodujatie(int row){
        return podujatia.get(row);
    
        
    }
    
}

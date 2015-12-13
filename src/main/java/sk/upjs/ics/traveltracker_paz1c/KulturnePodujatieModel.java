
package sk.upjs.ics.traveltracker_paz1c;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;

public class KulturnePodujatieModel extends AbstractTableModel {
    
  
    
    private MySqlKulturnePodujatieDao podujatieDao = new MySqlKulturnePodujatieDao();
    private static final int POCET_RIADKOV = 10;
    private static final int POCET_STLPCOV = 4;
    private static final int STLPEC_KRAJINA = 0;
    private static final int STLPEC_MESTO = 1;
    private static final int STLPEC_NAZOV = 2;
    private static final int STLPEC_DATUM = 3;
    private static final String[] NAZVY_STLPCOV = {"Krajina", "Mesto", "Názov", "Dátum"};
    List<KulturnePodujatie> podujatia=podujatieDao.dajVsetky();

    @Override
    public int getRowCount() {
        if(POCET_RIADKOV>podujatia.size()){
          return podujatia.size();
        }else{

       return POCET_RIADKOV;
        }
    }

    @Override
    public int getColumnCount() {   
       return POCET_STLPCOV;
        
     
    }

    @Override
    public String getColumnName(int column) {
        return NAZVY_STLPCOV[column];
    }
    
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
           KulturnePodujatie kultPodujatie=this.podujatia.get(rowIndex);
            switch(columnIndex){
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
    public void odstranPodujatie(int row){
     podujatieDao.odstranit(podujatia.get(row));
     refresh();
    
    }

    public void refresh(){
    podujatia.clear();
    podujatia=podujatieDao.dajVsetky();
    
        
    fireTableDataChanged();

    }
    
    
  
}

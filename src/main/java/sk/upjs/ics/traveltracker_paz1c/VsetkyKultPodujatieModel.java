/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.traveltracker_paz1c;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Robert Link
 */
class VsetkyKultPodujatieModel extends AbstractTableModel {
    private MySqlKulturnePodujatieDao podujatie=new MySqlKulturnePodujatieDao();
    private List<KulturnePodujatie> podujatia= podujatie.dajVsetky();
    public VsetkyKultPodujatieModel() {
        super();
    }

    @Override
    public int getRowCount() {
       return podujatia.size();
    }

    @Override
    public int getColumnCount() {
       return 4;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        switch(columnIndex){
            case 0: return "Krajina";
            case 1: return  "Mesto";
            case 2: return "Nazov";
            case 3: return  "Datum";
            default: return "??";
         }
                    
    }

    @Override
    public Object getValueAt(int row, int column) {
        KulturnePodujatie kultPodujatie=podujatia.get(row);
            switch(column){
            case 0: return kultPodujatie.getKrajina();
            case 1: return kultPodujatie.getMesto();
            case 2: return kultPodujatie.getNazov();
            case 3: return kultPodujatie.getDatum();
            default: return "??";
            }
        
    }
    public KulturnePodujatie getPodujatie(int row){
        return podujatia.get(row);
    
        
    }
    
}

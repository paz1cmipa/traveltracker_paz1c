
package sk.upjs.ics.traveltracker_paz1c;

import javax.swing.table.AbstractTableModel;

public class KulturnePodujatieModel extends AbstractTableModel {
    
    private MySqlKulturnePodujatieDao podujatieDao = new MySqlKulturnePodujatieDao();
    private static final int POCET_RIADKOV = 10;
    private static final int POCET_STLPCOV = 4;
    private static final String[] NAZVY_STLPCOV = {"Krajina", "Mesto", "Názov", "Dátum"};
    

    @Override
    public int getRowCount() {
       return POCET_RIADKOV;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

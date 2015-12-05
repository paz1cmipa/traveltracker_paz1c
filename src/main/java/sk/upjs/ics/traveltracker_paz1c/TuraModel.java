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
public class TuraModel extends AbstractTableModel{
    private MySqlTuristikaDao turaDao=new MySqlTuristikaDao();
    private List<Turistika> tury= turaDao.dajVsetky();

    @Override
    public int getRowCount() {
        return tury.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int row, int column) {
            Turistika tura= tury.get(row);
            switch(column){
            case 0: return tura.getKrajina();
            case 1: return tura.getCiel();
            case 2: return tura.getDatum();
            default: return "??";
            }
    }

    @Override
    public String getColumnName(int columnIndex) {
           switch(columnIndex){
            case 0: return "Krajina";
            case 1: return  "Ciel";
            case 2: return  "Datum";
            default: return "??";
         }
    }
    public Turistika getTura(int row){
    return tury.get(row);
    }
    
}

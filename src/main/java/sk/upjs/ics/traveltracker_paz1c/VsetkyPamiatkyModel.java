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
public class VsetkyPamiatkyModel extends AbstractTableModel{
    
    private MySqlPamiatkaDao pamiatkaDao=new MySqlPamiatkaDao();
    private List<Pamiatka> pamiatky= pamiatkaDao.dajVsetky();

    @Override
    public int getRowCount() {
        return pamiatky.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int column) {
            Pamiatka pamiatka= pamiatky.get(row);
            switch(column){
            case 0: return pamiatka.getKrajina();
            case 1: return pamiatka.getMesto();
            case 2: return pamiatka.getPamiatka();
            case 3: return pamiatka.getDatum();
            default: return "??";
            }
    }

    @Override
    public String getColumnName(int columnIndex) {
           switch(columnIndex){
            case 0: return "Krajina";
            case 1: return  "Mesto";
            case 2: return "Pamiatka";
            case 3: return  "Datum";
            default: return "??";
         }
    }
    public Pamiatka getPamiatka(int row){
    Pamiatka pamiatka= pamiatky.get(row);
    return pamiatka;
    }


}

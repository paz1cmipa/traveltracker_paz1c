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
class VyletModel extends AbstractTableModel {

  private MySqlViacdnovyVyletDao vyletDao=new MySqlViacdnovyVyletDao();
    private List<ViacdnovyVylet> vylety= vyletDao.dajVsetky();

    @Override
    public int getRowCount() {
       return vylety.size();
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
            case 2: return "Datum prichodu";
            case 3: return  "Datum odchodu";
            default: return "??";
         }
                    
    }

    @Override
    public Object getValueAt(int row, int column) {
        ViacdnovyVylet vylet=vylety.get(row);
            switch(column){
            case 0: return vylet.getKrajina();
            case 1: return vylet.getMesto();
            case 2: return vylet.getDatumPrichod();
            case 3: return vylet.getDatumOdchod();
            default: return "??";
            }
        
    }
    public ViacdnovyVylet getVylet(int row){
        return vylety.get(row);
    
        
    }
}

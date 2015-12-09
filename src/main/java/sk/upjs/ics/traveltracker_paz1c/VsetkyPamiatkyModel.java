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
    
    private PamiatkaDao pamiatkaDao = PamiatkaDaoFactory.INSTANCE.getPamiatkaDao();
    private List<Pamiatka> pamiatky= pamiatkaDao.dajVsetky();
    private static final String[] NAZVY_STLPCOV= {"Krajina","Mesto","Pamiatka","Datum"};
    private static final int POCET_STLPCOV = 4;
    private static final int STLPEC_DATUM = 3;
    private static final int STLPEC_PAMIATKA = 2;
    private static final int STLPEC_MESTO = 1;
    private static final int STLPEC_KRAJINA = 0;
     
    @Override
    public int getRowCount() {
        return pamiatky.size();
    }

    @Override
    public int getColumnCount() {
        return POCET_STLPCOV;
    }
   

    @Override
    public Object getValueAt(int row, int column) {
            Pamiatka pamiatka= pamiatky.get(row);
            switch(column){
            case STLPEC_KRAJINA: return pamiatka.getKrajina();
            case STLPEC_MESTO: return pamiatka.getMesto();
            case  STLPEC_PAMIATKA: return pamiatka.getPamiatka_zaujimavost();
            case STLPEC_DATUM: return pamiatka.getDatum();
            default: return "??";
            }
    }


    @Override
    public String getColumnName(int columnIndex) {
        return NAZVY_STLPCOV[columnIndex];
    }
    public Pamiatka getPamiatka(int row){
    Pamiatka pamiatka= pamiatky.get(row);
    return pamiatka;
    }


}

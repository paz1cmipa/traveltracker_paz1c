
package sk.upjs.ics.traveltracker_paz1c;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class KulturnePodujatieCellRenderer extends DefaultTableCellRenderer{ 
    
    
    private boolean jeSplnena(KulturnePodujatie podujatie){
        return podujatie.isNavstivene();
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        KulturnePodujatie podujatie = (KulturnePodujatie) value;
        if(jeSplnena(podujatie) && !isSelected){
            component.setForeground(Color.green);
        }
        return component;
    }
}

package sk.upjs.ics.traveltracker_paz1c;

import java.util.List;

public interface PamiatkaDao {
    
    public void pridat(Pamiatka pamiatka);
    public void odstranit (Pamiatka pamiatka);
    public void Upravit (Pamiatka pamiatka);
    public List<Pamiatka> dajVsetky();
    public List<Pamiatka> Hladat(String s);
    
}

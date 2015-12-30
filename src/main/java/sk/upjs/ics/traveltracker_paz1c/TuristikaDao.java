package sk.upjs.ics.traveltracker_paz1c;

import java.util.List;

public interface TuristikaDao {
    
    public void pridat(Turistika tura);
    public void odstranit (Turistika tura);
    public void Upravit (Turistika tura);
    public List<Turistika> dajVsetky();
    public List<Turistika> Hladat(String s);

    public List<Turistika> dajVsetkySLimit();
    
}

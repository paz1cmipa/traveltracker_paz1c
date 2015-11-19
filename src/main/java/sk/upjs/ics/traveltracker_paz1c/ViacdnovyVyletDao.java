package sk.upjs.ics.traveltracker_paz1c;

import java.util.List;

public interface ViacdnovyVyletDao {
    
    public void pridat(ViacdnovyVylet viacdnovyVylet);
    public void odstranit (ViacdnovyVylet viacdnovyVylet);
    public void Upravit (ViacdnovyVylet viacdnovyVylet);
    public List<ViacdnovyVylet> dajVsetky();
    public List<ViacdnovyVylet> Hladat(String s);
    
}

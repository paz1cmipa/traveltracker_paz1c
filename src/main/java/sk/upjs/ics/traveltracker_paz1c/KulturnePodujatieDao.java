package sk.upjs.ics.traveltracker_paz1c;

import java.util.List;

public interface KulturnePodujatieDao {
    
    public void pridat(KulturnePodujatie kulturnePodujatie);
    public void pridatPodrobnosti(KulturnePodujatie kulturnePodujatie);
    public void odstranit (KulturnePodujatie kulturnePodujatie);
    public void Upravit (KulturnePodujatie kulturnePodujatie);
    public void upravitPodrobnosti (KulturnePodujatie kulturnePodujatie);
    public List<KulturnePodujatie> dajVsetky();
    public List<KulturnePodujatie> Hladat(String s);
    
}

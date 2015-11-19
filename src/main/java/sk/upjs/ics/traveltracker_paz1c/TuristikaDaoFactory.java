package sk.upjs.ics.traveltracker_paz1c;

public enum TuristikaDaoFactory {
    
    INSTANCE;
    
    public TuristikaDao getVyletDao(){
        return new MySqlTuristikaDao();
    }
    
}

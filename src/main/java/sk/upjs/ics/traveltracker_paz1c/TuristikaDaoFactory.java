package sk.upjs.ics.traveltracker_paz1c;

public enum TuristikaDaoFactory {
    
    INSTANCE;
    
    public TuristikaDao getTuristikaDao(){
        return new MySqlTuristikaDao();
    }
    
}

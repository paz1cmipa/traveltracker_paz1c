package sk.upjs.ics.traveltracker_paz1c;

public enum PamiatkaDaoFactory {
    
     INSTANCE;
    
    public PamiatkaDao getPamiatkaDao(){
        return new MySqlPamiatkaDao();
    }
    
}

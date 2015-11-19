package sk.upjs.ics.traveltracker_paz1c;

public enum ViacdnovyVyletDaoFactory {
    
     INSTANCE;
    
    public ViacdnovyVyletDao getVyletDao(){
        return new MySqlViacdnovyVyletDao();
    }
    
}

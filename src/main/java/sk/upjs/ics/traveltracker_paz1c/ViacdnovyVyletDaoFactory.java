package sk.upjs.ics.traveltracker_paz1c;

public enum ViacdnovyVyletDaoFactory {
    
     INSTANCE;
    
    public ViacdnovyVyletDao getViacdnovyVyletDao(){
        return new MySqlViacdnovyVyletDao();
    }
    
}

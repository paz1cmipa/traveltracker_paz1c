package sk.upjs.ics.traveltracker_paz1c;

public enum KulturnePodujatieDaoFactory {
   
     INSTANCE;
    
    public KulturnePodujatieDao getVyletDao(){
        return new MySqlKulturnePodujatieDao();
    }
    
}

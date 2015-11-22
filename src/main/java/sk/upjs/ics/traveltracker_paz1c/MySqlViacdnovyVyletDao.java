package sk.upjs.ics.traveltracker_paz1c;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class MySqlViacdnovyVyletDao implements ViacdnovyVyletDao{
    
       private JdbcTemplate jdbcTemplete;
        public MySqlViacdnovyVyletDao(){
        MysqlDataSource dataSource= new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost/traveltracker");
        dataSource.setUser("TravelTracker");
        dataSource.setPassword("TravelTracker");
        
        jdbcTemplete= new JdbcTemplate(dataSource);
      }

    @Override
    public void pridat(ViacdnovyVylet viacdnovyVylet) {
        String sql="Insert into viacDni values(?,?,?,?,?,?,?)";
        jdbcTemplete.update(sql, null, 
                viacdnovyVylet.getKrajina(),
                viacdnovyVylet.getDatumOdchod(),
                viacdnovyVylet.getDatumOdchod(),
                viacdnovyVylet.getTyp(),
                viacdnovyVylet.getMesto(),
                viacdnovyVylet.getUbytovanie());
        
    }
    
    
     @Override
    public void pridatPodrobnosti(ViacdnovyVylet viacdnovyVylet) {
        
    }

    @Override
    public void odstranit(ViacdnovyVylet viacdnovyVylet) {
         String sql="Delete from viacDni where id=? ";
         jdbcTemplete.update(sql, viacdnovyVylet.getId());
        
    }

    @Override
    public void Upravit(ViacdnovyVylet viacdnovyVylet) {
        String sql="UPDATE viacDni SET"
                + "'krajina' = ?," +
                  "'datumPrichod'= ?," +
                  "'datumOdchod'= ? ," +
                  "'typ'=? ,"
                + "'mesto'=?,"
                + "'ubytovanie'=?"
                + "where 'id'=?;";
         jdbcTemplete.update(sql,  
                viacdnovyVylet.getKrajina(),
                viacdnovyVylet.getDatumOdchod(),
                viacdnovyVylet.getDatumOdchod(),
                viacdnovyVylet.getTyp(),
                viacdnovyVylet.getMesto(),
                viacdnovyVylet.getUbytovanie(),
                viacdnovyVylet.getId());
        
    }

    @Override
    public void UpravitPodrobnosti(ViacdnovyVylet viacdnovyVylet) {
        
    }
    @Override
    public List<ViacdnovyVylet> dajVsetky() {
       String sql="Select * from viacDni V join viacDniInfo I on V.id=I.id";     
        BeanPropertyRowMapper<ViacdnovyVylet> mapper= BeanPropertyRowMapper.newInstance(ViacdnovyVylet.class);     
        return  jdbcTemplete.query(sql,mapper);
    }

    @Override
    public List<ViacdnovyVylet> Hladat(String s) {
        return null;
    }
    
}

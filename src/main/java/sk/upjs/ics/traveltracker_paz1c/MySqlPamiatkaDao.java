package sk.upjs.ics.traveltracker_paz1c;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class MySqlPamiatkaDao implements PamiatkaDao{
    
        private JdbcTemplate jdbcTemplete;
        public MySqlPamiatkaDao(){
        MysqlDataSource dataSource= new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost/traveltracker");
        dataSource.setUser("TravelTracker");
        dataSource.setPassword("TravelTracker");
        
        jdbcTemplete= new JdbcTemplate(dataSource);
      }

    @Override
    public void pridat(Pamiatka pamiatka) {
        String sql="Insert into pamiatka values(?,?,?,?,?)";
        jdbcTemplete.update(sql, null, 
                pamiatka.getKrajina(),
                pamiatka.getMesto(),
                pamiatka.getPamiatka(),
                pamiatka.getDatum());
        
    }

    @Override
    public void odstranit(Pamiatka pamiatka) {
         String sql="Delete from pamiatka where id=? ";
         jdbcTemplete.update(sql, pamiatka.getId());
        
    }

    @Override
    public void Upravit(Pamiatka pamiatka) {
         String sql="UPDATE pamiatka SET"
                + "'krajina' = ?," +
                  "'mesto'= ?," +
                  "'pamiatka_zaujimavost'= ? ," +
                  "'datum'=? "
                + "where 'id'=?;";
        jdbcTemplete.update(sql,
                pamiatka.getKrajina(),
                pamiatka.getMesto(),
                pamiatka.getPamiatka(),
                pamiatka.getDatum(),
                pamiatka.getId());
       
    }
    @Override
    public void UpravitPodrobnosti(Pamiatka pamiatka) {
       
    }

    @Override
    public List<Pamiatka> dajVsetky() {
      String sql="Select * from pamiatka P join pamiatkaInfo I on P.id=I.id";     
        BeanPropertyRowMapper<Pamiatka> mapper= BeanPropertyRowMapper.newInstance(Pamiatka.class);     
        return  jdbcTemplete.query(sql,mapper);
    }

    @Override
    public List<Pamiatka> Hladat(String s) {
       return null; 
    }

    @Override
    public void pridatPodrobnosti(Pamiatka pamiatka) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

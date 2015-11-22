package sk.upjs.ics.traveltracker_paz1c;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class MySqlTuristikaDao implements TuristikaDao{
    
      private JdbcTemplate jdbcTemplete;
        public MySqlTuristikaDao(){
        MysqlDataSource dataSource= new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost/traveltracker");
        dataSource.setUser("TravelTracker");
        dataSource.setPassword("TravelTracker");
        
        jdbcTemplete= new JdbcTemplate(dataSource);
      }

    @Override
    public void pridat(Turistika tura) {
         String sql="Insert into turistika values(?,?,?,?,?,?,?,?,?)";
        jdbcTemplete.update(sql, null, 
                tura.getKrajina(),
                tura.getCiel(),
                tura.getDatum(),
                tura.getTrasa(),
                tura.getTyp(),
                tura.isPrejdene(),
                tura.getHodnotenie(),
                tura.getPoznamky());
    }

    @Override
    public void odstranit(Turistika tura) {
         String sql="Delete from turistika where id=? ";
         jdbcTemplete.update(sql, tura.getId());
       
    }

    @Override
    public void Upravit(Turistika tura) {
        String sql="UPDATE turistika SET"
                + "'krajina' = ?," +
                  "'ciel'= ?," +
                  "'datum'= ? ," +
                  "'trasa'=? "
                + "'typ'=?,"
                + "'prejdene'=?"
                + "'hodnotenie'=?,"
                + "'poznamky'=? "
                + "where 'id'=?;";
        jdbcTemplete.update(sql, 
                tura.getKrajina(),
                tura.getCiel(),
                tura.getDatum(),
                tura.getTrasa(),
                tura.getTyp(),
                tura.isPrejdene(),
                tura.getHodnotenie(),
                tura.getPoznamky(),
                tura.getId());
       
    }
     

    @Override
    public List<Turistika> dajVsetky() {
      String sql="Select * from turistika";     
        BeanPropertyRowMapper<Turistika> mapper= BeanPropertyRowMapper.newInstance(Turistika.class);     
        return  jdbcTemplete.query(sql,mapper);
    }

    @Override
    public List<Turistika> Hladat(String s) {
        return null;
    }
    
}

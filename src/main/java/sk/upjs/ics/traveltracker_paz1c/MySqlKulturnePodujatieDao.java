package sk.upjs.ics.traveltracker_paz1c;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class MySqlKulturnePodujatieDao implements KulturnePodujatieDao{
      private JdbcTemplate jdbcTemplete;
      
      public MySqlKulturnePodujatieDao(){
        MysqlDataSource dataSource= new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost/traveltracker");
        dataSource.setUser("TravelTracker");
        dataSource.setPassword("TravelTracker");
        
        jdbcTemplete= new JdbcTemplate(dataSource);
      }
     
    @Override
    public void pridat(KulturnePodujatie kulturnePodujatie) {
        String sql="Insert into podujatie values(?,?,?,?,?,?)";
        jdbcTemplete.update(sql, null, 
                kulturnePodujatie.getKrajina(),
                kulturnePodujatie.getMesto(),
                kulturnePodujatie.getTyp(),
                kulturnePodujatie.getNazov(),
                kulturnePodujatie.getDatum());
        
    }

    @Override
    public void odstranit(KulturnePodujatie kulturnePodujatie) {
        String sql="Delete from podujatie where id=? ";
         jdbcTemplete.update(sql, kulturnePodujatie.getId());
        
    }

    @Override
    public void Upravit(KulturnePodujatie kulturnePodujatie) {
        String sql="UPDATE podujatie SET"
                + "'krajina' = ?," +
                  "'mesto'= ?," +
                  "'typ'= ? ," +
                  "'Nazov'=? ," +
                  "'datum'=? "
                + "where 'id'=?;";
        jdbcTemplete.update(sql,
                kulturnePodujatie.getKrajina(),
                kulturnePodujatie.getMesto(),
                kulturnePodujatie.getTyp(),
                kulturnePodujatie.getNazov(),
                kulturnePodujatie.getDatum(),
                kulturnePodujatie.getId());
        
        
    }
     @Override
    public void upravitPodrobnosti(KulturnePodujatie kulturnePodujatie){
            /* String sql="UPDATE podujatie SET"
                + "'vstupne' = ?," +
                  "'casZaciatku'= ?," +
                  "'hodnotenie'= ? ," +
                  "'navstivene'=? ," +
                  "'lokalizacia'=? ,"
                + "'poznamky'= ? "
                + "where 'id'=?;";
        jdbcTemplete.update(sql,
                kulturnePodujatie.getVstupne(),
                kulturnePodujatie.getCasZaciatku(),
                kulturnePodujatie.getHodnotenie(),
                kulturnePodujatie.isNavstivene(),
                kulturnePodujatie.getLokalizacia(),
                kulturnePodujatie.getPoznamky(),
                kulturnePodujatie.getId());*/
    
    }

    @Override
    public List<KulturnePodujatie> dajVsetky() {
        String sql="Select * from podujatie P join podujatiaInfo I on P.id=I.id";     
        BeanPropertyRowMapper<KulturnePodujatie> mapper= BeanPropertyRowMapper.newInstance(KulturnePodujatie.class);     
        return  jdbcTemplete.query(sql,mapper);
    }

    @Override
    public List<KulturnePodujatie> Hladat(String s) {
        return null;
    }

    @Override
    public void pridatPodrobnosti(KulturnePodujatie kulturnePodujatie) {
       /* String sql="Insert into podujatiaInfo values(?,?,?,?,?,?,?)";
        jdbcTemplete.update(sql, 
                kulturnePodujatie.getId(),
                kulturnePodujatie.getVstupne(),
                kulturnePodujatie.getCasZaciatku(),
                kulturnePodujatie.getHodnotenie(),
                kulturnePodujatie.isNavstivene(),
                kulturnePodujatie.getLokalizacia(),
                kulturnePodujatie.getPoznamky());*/
    }
    
}

package sk.upjs.ics.traveltracker_paz1c;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

public class MySqlPamiatkaDao implements PamiatkaDao{
    
     private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
        private JdbcTemplate jdbcTemplete;
        public MySqlPamiatkaDao(){
        MysqlDataSource dataSource= new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost/traveltracker");
        dataSource.setUser("TravelTracker");
        dataSource.setPassword("TravelTracker");
        
        jdbcTemplete= new JdbcTemplate(dataSource);
         this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(this.jdbcTemplete);
      }

    @Override
    public void pridat(Pamiatka pamiatka) {
    /*    String sql="Insert into pamiatka values(?,?,?,?,?)";
        jdbcTemplete.update(sql, null, 
                pamiatka.getKrajina(),
                pamiatka.getMesto(),
                pamiatka.getPamiatka(),
                pamiatka.getDatum());*/
      Map<String, Object> pridatHodnoty = new HashMap<String, Object>();
        pridatHodnoty.put("id", pamiatka.getId());
        pridatHodnoty.put("krajina",  pamiatka.getKrajina());
        pridatHodnoty.put("mesto",  pamiatka.getMesto());
        pridatHodnoty.put("pamiatka",  pamiatka.getPamiatka_zaujimavost());
        pridatHodnoty.put("datum", pamiatka.getDatum());
        
        String sql = "INSERT INTO pamiatka VALUES(:id, :krajina, :mesto, :pamiatka, :datum)";
        
        KeyHolder keyHolder = new GeneratedKeyHolder();
        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource(pridatHodnoty), keyHolder);
        int id = keyHolder.getKey().intValue();
        pamiatka.setId(id);
        
        pridatPodrobnosti(pamiatka);
        
    }

    @Override
    public void odstranit(Pamiatka pamiatka) {
         String sql1="Delete from pamiatkaInfo where id=? ";
         jdbcTemplete.update(sql1, pamiatka.getId());
         String sql="Delete from pamiatka where id=? ";
         jdbcTemplete.update(sql, pamiatka.getId());
        
    }

    @Override
    public void Upravit(Pamiatka pamiatka) {
      /* String sql="UPDATE pamiatka SET"
                + "'krajina' = ?," +
                  "'mesto'= ?," +
                  "'pamiatka'= ? ," +
                  "'datum'=? "
                + "where 'id'=?;";*/
        
        String sql = "update pamiatka set krajina = ?, mesto = ?, pamiatka_zaujimavost = ?, datum = ? where id = ?;";
        jdbcTemplete.update(sql,
                pamiatka.getKrajina(),
                pamiatka.getMesto(),
                pamiatka.getPamiatka_zaujimavost(),
                pamiatka.getDatum(),
                pamiatka.getId());
       
    }
    @Override
    public void UpravitPodrobnosti(Pamiatka pamiatka) {
             String sql="update pamiatkaInfo set vstupne=?, otvaracieHodiny=?, hodnotenie=?, navstivene=?, poznamky=? where id = ?;";
        jdbcTemplete.update(sql,
                pamiatka.getVstupne(),
                pamiatka.getOtvaracieHodiny(),
                pamiatka.getHodnotenie(),
                pamiatka.isNavstivene(),
                pamiatka.getPodrobnosti(),
                pamiatka.getId());
       
    }

    @Override
    public List<Pamiatka> dajVsetky() {
      String sql="Select * from pamiatka P join pamiatkaInfo I on P.id=I.id";     
        BeanPropertyRowMapper<Pamiatka> mapper= BeanPropertyRowMapper.newInstance(Pamiatka.class);     
        return  jdbcTemplete.query(sql,mapper);
    }

    @Override
    public List<Pamiatka> Hladat(String s) {
      List<Pamiatka> vysledok= new ArrayList<>();
      List<Pamiatka> zaznam= dajVsetky();
      for(Pamiatka pamiatka: zaznam){
       if(pamiatka.getKrajina().equals(s)){
           vysledok.add(pamiatka);
           continue;
        }
       if(pamiatka.getMesto().equals(s)){
           vysledok.add(pamiatka);
           continue;
        }
       if(pamiatka.getPamiatka_zaujimavost().equals(s)){
             vysledok.add(pamiatka);
             continue;
        }
       
     
       }
      return vysledok;
    }

    @Override
    public void pridatPodrobnosti(Pamiatka pamiatka) {
             String sql="Insert into pamiatkaInfo values(?,?,?,?,?,?)";
               jdbcTemplete.update(sql, 
                pamiatka.getId(),
                pamiatka.getVstupne(),
                pamiatka.getOtvaracieHodiny(),
                pamiatka.getHodnotenie(),
                pamiatka.isNavstivene(),
                pamiatka.getPodrobnosti());
       
    }
  
    
}

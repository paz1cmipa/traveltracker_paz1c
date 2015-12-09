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

public class MySqlViacdnovyVyletDao implements ViacdnovyVyletDao{
     private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
       private JdbcTemplate jdbcTemplete;
        public MySqlViacdnovyVyletDao(){
        MysqlDataSource dataSource= new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost/traveltracker");
        dataSource.setUser("TravelTracker");
        dataSource.setPassword("TravelTracker");
        
        jdbcTemplete= new JdbcTemplate(dataSource);
         this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(this.jdbcTemplete);
      }

    @Override
    public void pridat(ViacdnovyVylet viacdnovyVylet) {
       /* String sql="Insert into viacDni values(?,?,?,?,?,?,?)";
        jdbcTemplete.update(sql, null, 
                viacdnovyVylet.getKrajina(),
                viacdnovyVylet.getDatumOdchod(),
                viacdnovyVylet.getDatumOdchod(),
                viacdnovyVylet.getTyp(),
                viacdnovyVylet.getMesto(),
                viacdnovyVylet.getUbytovanie());*/
         Map<String, Object> pridatHodnoty = new HashMap<String, Object>();
        pridatHodnoty.put("id", viacdnovyVylet.getId());
        pridatHodnoty.put("krajina",viacdnovyVylet.getKrajina());
        pridatHodnoty.put("datumPrichod",viacdnovyVylet.getDatumPrichod());
        pridatHodnoty.put("datumOdchod",viacdnovyVylet.getDatumOdchod());
        pridatHodnoty.put("typ", viacdnovyVylet.getTyp());
        pridatHodnoty.put("mesto",viacdnovyVylet.getMesto1());
        pridatHodnoty.put("ubytovanie", viacdnovyVylet.getUbytovanie());
        
        String sql = "INSERT INTO viacDni VALUES(:id, :krajina,:datumPrichod, :datumOdchod, :typ, :mesto, :ubytovanie)";
        
        KeyHolder keyHolder = new GeneratedKeyHolder();
        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource(pridatHodnoty), keyHolder);
        int id = keyHolder.getKey().intValue();
        viacdnovyVylet.setId(id);
        
        pridatPodrobnosti(viacdnovyVylet);
        
    }
    
    
     @Override
    public void pridatPodrobnosti(ViacdnovyVylet viacdnovyVylet) {
             String sql="Insert into viacDniInfo values(?,?,?,?,?)";
                 jdbcTemplete.update(sql, 
                viacdnovyVylet.getId(),
                viacdnovyVylet.getProgram(),         
                 viacdnovyVylet.isNavstivene(),
                viacdnovyVylet.getHodnotenie(),
                viacdnovyVylet.getPoznamky());
    }

    

    @Override
    public void odstranit(ViacdnovyVylet viacdnovyVylet) {
        String sql1="Delete from viacDniInfo where id=? ";
         jdbcTemplete.update(sql1, viacdnovyVylet.getId());
         String sql="Delete from viacDni where id=? ";
         jdbcTemplete.update(sql, viacdnovyVylet.getId());
        
    }

    @Override
    public void UpravitPodrobnosti(ViacdnovyVylet viacdnovyVylet) {
       String sql="UPDATE viacDni SET"
                + "'program' = ?," +
                  "'navstivene'= ?," +
                  "'hodnotenie'= ? ," +
                  "'poznamky'=? ,"
                + "where 'id'=?;";
     
         jdbcTemplete.update(sql,  
                viacdnovyVylet.getProgram(),         
                 viacdnovyVylet.isNavstivene(),
                viacdnovyVylet.getHodnotenie(),
                viacdnovyVylet.getPoznamky(),
                viacdnovyVylet.getId());
        
    }

    @Override
    public void Upravit(ViacdnovyVylet viacdnovyVylet) {
      /*  String sql="UPDATE viacDniInfo SET"
                + "'krajina' = ?," +
                  "'datumPrichod'= ?," +
                  "'datumOdchod'= ? ," +
                  "'typ'=? ,"
                + "'mesto'=?,"
                + "'ubytovanie'=?"
                + "where 'id'=?;";*/
        
        String sql = "UPDATE viacdni SET krajina = ?, datumPrichod = ?, datumOdchod = ?, typ = ?, mesto1 = ?, ubytovanie = ? WHERE id = ?;";
         jdbcTemplete.update(sql,  
                viacdnovyVylet.getKrajina(),
                viacdnovyVylet.getDatumOdchod(),
                viacdnovyVylet.getDatumOdchod(),
                viacdnovyVylet.getTyp(),
                viacdnovyVylet.getMesto1(),
                viacdnovyVylet.getUbytovanie(),
                viacdnovyVylet.getId());
        
        
        
        
        
    }
    @Override
    public List<ViacdnovyVylet> dajVsetky() {
       String sql="Select * from viacDni V join viacDniInfo I on V.id=I.id";     
        BeanPropertyRowMapper<ViacdnovyVylet> mapper= BeanPropertyRowMapper.newInstance(ViacdnovyVylet.class);     
        return  jdbcTemplete.query(sql,mapper);
    }

    @Override
    public List<ViacdnovyVylet> Hladat(String s) {
        List<ViacdnovyVylet> vysledok= new ArrayList<>();
        List<ViacdnovyVylet> zaznam= dajVsetky();
        for(ViacdnovyVylet vylet:zaznam){
          if(vylet.getKrajina().equals(s)){
             vysledok.add(vylet);
             continue;
          
          }
          if(vylet.getMesto1().equals(s)){
             vysledok.add(vylet);
             continue;
           }
          
           if(vylet.getTyp().equals(s)){
             vysledok.add(vylet);
             continue;
           }
           
            if(vylet.getUbytovanie().equals(s)){
             vysledok.add(vylet);
             continue;
           }
        
        
        }
        
        return vysledok;
    }

}

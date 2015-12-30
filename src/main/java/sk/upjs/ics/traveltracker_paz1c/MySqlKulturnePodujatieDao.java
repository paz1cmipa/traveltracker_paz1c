package sk.upjs.ics.traveltracker_paz1c;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

public class MySqlKulturnePodujatieDao implements KulturnePodujatieDao {

    private JdbcTemplate jdbcTemplete;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public MySqlKulturnePodujatieDao() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost/traveltracker");
        dataSource.setUser("TravelTracker");
        dataSource.setPassword("TravelTracker");

        jdbcTemplete = new JdbcTemplate(dataSource);
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(this.jdbcTemplete);
    }

    @Override
    public void pridat(KulturnePodujatie kulturnePodujatie) {
        Map<String, Object> pridatHodnoty = new HashMap<String, Object>();
        pridatHodnoty.put("id", kulturnePodujatie.getId());
        pridatHodnoty.put("krajina", kulturnePodujatie.getKrajina());
        pridatHodnoty.put("mesto", kulturnePodujatie.getMesto());
        pridatHodnoty.put("typ", kulturnePodujatie.getTyp());
        pridatHodnoty.put("nazov", kulturnePodujatie.getNazov());
        pridatHodnoty.put("datum", kulturnePodujatie.getDatum());

        String sql = "INSERT INTO podujatie VALUES(:id, :krajina, :mesto, :typ, :nazov, :datum)";

        KeyHolder keyHolder = new GeneratedKeyHolder();
        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource(pridatHodnoty), keyHolder);
        int id = keyHolder.getKey().intValue();
        kulturnePodujatie.setId(id);

        pridatPodrobnosti(kulturnePodujatie);

        //String sql1="Insert into podujatiaInfo values(?,?,?,?,?,?,?)";
        //jdbcTemplete.update(sql1,kulturnePodujatie.getId(),null,null,null,
        // kulturnePodujatie.isNavstivene(),null,null);
    }

    @Override
    public void odstranit(KulturnePodujatie kulturnePodujatie) {
        String sql1 = "Delete from podujatiaInfo where id=? ";
        jdbcTemplete.update(sql1, kulturnePodujatie.getId());
        String sql = "Delete from podujatie where id=? ";
        jdbcTemplete.update(sql, kulturnePodujatie.getId());

    }

    @Override
    public void Upravit(KulturnePodujatie kulturnePodujatie) {
        /* String sql = "UPDATE `traveltracker`.`podujatie`" +
         " SET" +
         " `krajina` = ?," +
         " `mesto` = ?," +
         " `typ` = ?" +
         " `Nazov` = ?," +
         " `datum` = ?" +
         " WHERE `id` = ?;";*/
        String sql = "UPDATE `traveltracker`.`podujatie` SET `krajina` = ?, `mesto` = ?, `typ` = ?, `nazov` = ?, `datum` = ? WHERE `id` = ?;";
        jdbcTemplete.update(sql,
                kulturnePodujatie.getKrajina(),
                kulturnePodujatie.getMesto(),
                kulturnePodujatie.getTyp(),
                kulturnePodujatie.getNazov(),
                kulturnePodujatie.getDatum(),
                kulturnePodujatie.getId());
        upravitPodrobnosti(kulturnePodujatie);

    }

    @Override
    public void upravitPodrobnosti(KulturnePodujatie kulturnePodujatie) {
        String sql = "update podujatiaInfo set vstupne = ?, casZaciatku= ?, hodnotenie= ? , navstivene=? , lokalizacia=? , poznamky= ? where id=?;";
        jdbcTemplete.update(sql,
                kulturnePodujatie.getVstupne(),
                kulturnePodujatie.getCasZaciatku(),
                kulturnePodujatie.getHodnotenie(),
                kulturnePodujatie.isNavstivene(),
                kulturnePodujatie.getLokalizacia(),
                kulturnePodujatie.getPoznamky(),
                kulturnePodujatie.getId());

    }

    @Override
    public List<KulturnePodujatie> dajVsetky() {
        String sql = "Select * from podujatie P join podujatiaInfo I on P.id=I.id order by datum ASC";
        BeanPropertyRowMapper<KulturnePodujatie> mapper = BeanPropertyRowMapper.newInstance(KulturnePodujatie.class);
        return jdbcTemplete.query(sql, mapper);
    }

    @Override
    public List<KulturnePodujatie> Hladat(String s) {
       /* List<KulturnePodujatie> vysledok = new ArrayList<>();
        List<KulturnePodujatie> zaznam = dajVsetky();
        for (KulturnePodujatie podujatie : zaznam) {
            if (podujatie.getKrajina().equals(s)) {
                vysledok.add(podujatie);
                continue;
            }
            if (podujatie.getMesto().equals(s)) {
                vysledok.add(podujatie);
                continue;
            }
            if (podujatie.getNazov().equals(s)) {
                vysledok.add(podujatie);
                continue;
            }
            if (podujatie.getTyp().equals(s)) {
                vysledok.add(podujatie);
                continue;
            }

        }

        return vysledok;*/
        
        
        String sql="select * from podujatie where krajina like '%"+s+"%' or mesto like  '%"+s+"%' or typ like  '%"+s+"%' or Nazov like  '%"+s+"%'";
        BeanPropertyRowMapper<KulturnePodujatie> mapper = BeanPropertyRowMapper.newInstance(KulturnePodujatie.class);
        return jdbcTemplete.query(sql,mapper);
    }
    
    
     public List<KulturnePodujatie> dajVsetkySLimit() {
        String sql= "Select * from podujatie P join podujatiaInfo I on P.id=I.id where navstivene=0 and datum > now()  order by datum ASC limit 10";
        BeanPropertyRowMapper<KulturnePodujatie> mapper = BeanPropertyRowMapper.newInstance(KulturnePodujatie.class);
        return jdbcTemplete.query(sql,mapper);
     
     }

    @Override
    public void pridatPodrobnosti(KulturnePodujatie kulturnePodujatie) {
        String sql = "Insert into podujatiaInfo values(?,?,?,?,?,?,?)";
        jdbcTemplete.update(sql,
                kulturnePodujatie.getId(),
                kulturnePodujatie.getVstupne(),
                kulturnePodujatie.getCasZaciatku(),
                kulturnePodujatie.getHodnotenie(),
                kulturnePodujatie.isNavstivene(),
                kulturnePodujatie.getLokalizacia(),
                kulturnePodujatie.getPoznamky());
    }

}


package sk.upjs.ics.traveltracker_paz1c;

import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MySqlTuristikaDaoTest {
    
    Turistika tura = new Turistika();
        MySqlTuristikaDao instance = new MySqlTuristikaDao();
    
    public MySqlTuristikaDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of pridat method, of class MySqlTuristikaDao.
     */
    @Test
    public void testPridat() {
        System.out.println("pridat");
        
        tura.setKrajina("A");
        tura.setCiel("B");
        tura.setDatum(new Date());
        tura.setTrasa("C");
        tura.setTyp("D");
         List<Turistika> vsetkyTuryPred = instance.dajVsetky();
        instance.pridat(tura);
         List<Turistika> vsetkyTuryPo = instance.dajVsetky();
         assertEquals(vsetkyTuryPred.size()+1, vsetkyTuryPo.size());
         instance.odstranit(tura);
       
    }

    /**
     * Test of odstranit method, of class MySqlTuristikaDao.
     */
    @Test
    public void testOdstranit() {
        System.out.println("odstranit");
        instance.pridat(tura);
        List<Turistika> vsetkyTuryPred = instance.dajVsetky();
        instance.odstranit(tura);
        List<Turistika> vsetkyTuryPo = instance.dajVsetky();
        assertEquals(vsetkyTuryPred.size()-1, vsetkyTuryPo.size());
    }



    /**
     * Test of dajVsetky method, of class MySqlTuristikaDao.
     */
    @Test
    public void testDajVsetky() {
        System.out.println("dajVsetky");
        
        List<Turistika> result = instance.dajVsetky();
        assertEquals(3, result.size());
       
    }

  
    
}

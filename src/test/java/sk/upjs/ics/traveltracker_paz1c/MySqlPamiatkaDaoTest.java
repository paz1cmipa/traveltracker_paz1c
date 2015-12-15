
package sk.upjs.ics.traveltracker_paz1c;

import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MySqlPamiatkaDaoTest {
    
    Pamiatka pamiatka = null;
        MySqlPamiatkaDao instance = new MySqlPamiatkaDao();
    
    public MySqlPamiatkaDaoTest() {
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
     * Test of pridat method, of class MySqlPamiatkaDao.
     */
    @Test
    public void testPridat() {
        System.out.println("pridat");
        
        pamiatka.setKrajina("A");
        pamiatka.setMesto("B");
        pamiatka.setPamiatka_zaujimavost("C");
        pamiatka.setDatum(new Date());
         List<Pamiatka> vsetkyPamiatkyPred = instance.dajVsetky();
        instance.pridat(pamiatka);
         List<Pamiatka> vsetkyPamiatkyPo = instance.dajVsetky();
         assertEquals(vsetkyPamiatkyPred.size()+1, vsetkyPamiatkyPo.size());
        
    }

    /**
     * Test of odstranit method, of class MySqlPamiatkaDao.
     */
    @Test
    public void testOdstranit() {
        System.out.println("odstranit");
        instance.pridat(pamiatka);
          List<Pamiatka> vsetkyPamiatkyPred = instance.dajVsetky();
        instance.odstranit(pamiatka);
        List<Pamiatka> vsetkyPamiatkyPo = instance.dajVsetky();
        assertEquals(vsetkyPamiatkyPred.size()-1, vsetkyPamiatkyPo.size());
        
    }

 

  

    /**
     * Test of dajVsetky method, of class MySqlPamiatkaDao.
     */
    @Test
    public void testDajVsetky() {
        System.out.println("dajVsetky");
        instance.odstranit(pamiatka);
        List<Pamiatka> result = instance.dajVsetky();
        assertEquals(3, result);
        
    }

    
   
    
}

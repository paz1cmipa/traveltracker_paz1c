
package sk.upjs.ics.traveltracker_paz1c;

import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MySqlKulturnePodujatieDaoTest {
    
     KulturnePodujatie kulturnePodujatie = new KulturnePodujatie();
      MySqlKulturnePodujatieDao instance = new MySqlKulturnePodujatieDao();
    
    public MySqlKulturnePodujatieDaoTest() {
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
     * Test of pridat method, of class MySqlKulturnePodujatieDao.
     */
    @org.junit.Test
    public void testPridat() {
        System.out.println("pridat");
       
        kulturnePodujatie.setKrajina("A");
        kulturnePodujatie.setNazov("B");
        kulturnePodujatie.setMesto("C");
        kulturnePodujatie.setDatum(new Date());
       
        List<KulturnePodujatie> vsetkyPodujatiaPred = instance.dajVsetky();
        instance.pridat(kulturnePodujatie);
        List<KulturnePodujatie> vsetkyPodujatiaPo = instance.dajVsetky();
        assertEquals(vsetkyPodujatiaPred.size()+1, vsetkyPodujatiaPo.size());
        
    }

    /**
     * Test of odstranit method, of class MySqlKulturnePodujatieDao.
     */
    @org.junit.Test
    public void testOdstranit() {
        System.out.println("odstranit");
        instance.pridat(kulturnePodujatie);
        List<KulturnePodujatie> vsetkyPodujatiaPred = instance.dajVsetky();
        
        instance.odstranit(kulturnePodujatie);
        List<KulturnePodujatie> vsetkyPodujatiaPo = instance.dajVsetky();
        assertEquals(vsetkyPodujatiaPred.size()-1, vsetkyPodujatiaPo.size());
       
    }
  

    /**
     * Test of dajVsetky method, of class MySqlKulturnePodujatieDao.
     */
    @org.junit.Test
    public void testDajVsetky() {
        System.out.println("dajVsetky");
        List<KulturnePodujatie> expResult = null;
        List<KulturnePodujatie> result = instance.dajVsetky();
        assertEquals(expResult, result); 
        
       
    }

  

    
    
}

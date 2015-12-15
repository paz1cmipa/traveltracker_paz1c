
package sk.upjs.ics.traveltracker_paz1c;

import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MySqlViacdnovyVyletDaoTest {
    
     ViacdnovyVylet viacdnovyVylet = null;
        MySqlViacdnovyVyletDao instance = new MySqlViacdnovyVyletDao();
    
    public MySqlViacdnovyVyletDaoTest() {
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
     * Test of pridat method, of class MySqlViacdnovyVyletDao.
     */
    @Test
    public void testPridat() {
        System.out.println("pridat");
        
        viacdnovyVylet.setKrajina("A");
        viacdnovyVylet.setMesto1("B");
        viacdnovyVylet.setDatumOdchod(new Date());
        viacdnovyVylet.setDatumPrichod(new Date());
        viacdnovyVylet.setUbytovanie("C");
        viacdnovyVylet.setTyp("D");
        List<ViacdnovyVylet> vsetkyVyletyPred = instance.dajVsetky();
        instance.pridat(viacdnovyVylet);
        List<ViacdnovyVylet> vsetkyVyletyPo = instance.dajVsetky();
        assertEquals(vsetkyVyletyPred.size()+1, vsetkyVyletyPo.size());
      
    }

 

    /**
     * Test of odstranit method, of class MySqlViacdnovyVyletDao.
     */
    @Test
    public void testOdstranit() {
        System.out.println("odstranit");
        List<ViacdnovyVylet> vsetkyVyletyPred = instance.dajVsetky(); 
        instance.odstranit(viacdnovyVylet);
        List<ViacdnovyVylet> vsetkyVyletyPo = instance.dajVsetky();
        assertEquals(vsetkyVyletyPred.size()-1, vsetkyVyletyPo.size());
    }

   

    /**
     * Test of dajVsetky method, of class MySqlViacdnovyVyletDao.
     */
    @Test
    public void testDajVsetky() {
        System.out.println("dajVsetky");
        instance.odstranit(viacdnovyVylet);
        List<ViacdnovyVylet> result = instance.dajVsetky();
        assertEquals(3, result);
        
    }

    /**
     * Test of Hladat method, of class MySqlViacdnovyVyletDao.
     */
    @Test
    public void testHladat() {
        System.out.println("Hladat");
        String s = "";
        MySqlViacdnovyVyletDao instance = new MySqlViacdnovyVyletDao();
        List<ViacdnovyVylet> expResult = null;
        List<ViacdnovyVylet> result = instance.Hladat(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

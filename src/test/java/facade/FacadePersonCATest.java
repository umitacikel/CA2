package facade;

import Entity.PersonCA;
import java.util.HashMap;
import javax.persistence.Persistence;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;




public class FacadePersonCATest {
    
    
     FacadePersonCA fp;
    
    public FacadePersonCATest()
    {
        fp = new FacadePersonCA();
    }
    
    
     @Before
    public void setUp()
    {
        HashMap<String, Object> puproperties = new HashMap();
        puproperties.put("javax.persistence.sql-load-script-source", "scripts/ClearDB.sql");
        Persistence.generateSchema("caunit", puproperties);
        Persistence.generateSchema("caunit", null); 
        fp.setEmf(Persistence.createEntityManagerFactory( "caunit"));
        fp.addPerson(new PersonCA("Dan", "Mark"));
        fp.addPerson(new PersonCA("Kaj", "Olsen"));
        fp.addPerson(new PersonCA("Jens", "Madsen"));
        System.out.println("persons added");
    }
    
    
    @Test
    public void testGetPerson(){
    
     System.out.println("getPerson");
        PersonCA expResult = new PersonCA("Dan", "Mark");
        PersonCA result = fp.getPerson(1);
        assertEquals(expResult.getFirstName(), result.getFirstName());
    }
   
}

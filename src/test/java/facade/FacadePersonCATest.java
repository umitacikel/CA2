package facade;

import Entity.PersonCA;
import java.util.ArrayList;
import java.util.HashMap;
import javax.persistence.Persistence;
import org.eclipse.persistence.sdo.helper.extension.SDOUtil;
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
    public void addPerson()
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
    public void testGetAPeroson(){
        System.out.println("testGetPerson");
        System.out.println(fp.getPerson(1));
    }
    
    @Test
    public void testGetAll(){
        System.out.println("get all");
        ArrayList ae = new ArrayList();
        ae.add(fp.getPersons());
        System.out.println(ae);
    }
   
}

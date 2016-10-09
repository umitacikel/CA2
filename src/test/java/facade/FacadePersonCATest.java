package facade;

import Entity.HobbyCA;
import Entity.PersonCA;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.persistence.Persistence;
import org.junit.Before;
import org.junit.Test;




public class FacadePersonCATest {
    
    
     FacadePersonCA fp;
     FacadeHobbyCA hb;
    
    public FacadePersonCATest()
    {
        fp = new FacadePersonCA();
        hb = new FacadeHobbyCA();
    }
    
    
    
     @Before
    public void addPerson()
    {
        List<HobbyCA> hobbies = new ArrayList<>();
        
       
       hobbies.add(hb.addHobby(new HobbyCA("fitness", "fitness")));
//        hb.addHobby(new HobbyCA("fitness", "fitness"));


        
        HashMap<String, Object> puproperties = new HashMap();
        puproperties.put("javax.persistence.sql-load-script-source", "scripts/ClearDB.sql");
        Persistence.generateSchema("caunit", puproperties);
        Persistence.generateSchema("caunit", null); 
        fp.setEmf(Persistence.createEntityManagerFactory( "caunit"));
        hb.setEmf(Persistence.createEntityManagerFactory("caunit"));
        fp.addPerson(new PersonCA("Dan", "Mark", hobbies));
        fp.addPerson(new PersonCA("Kaj", "Olsen", hobbies));
        fp.addPerson(new PersonCA("Jens", "Madsen", hobbies));
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

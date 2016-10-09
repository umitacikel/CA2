/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import Entity.HobbyCA;
import java.util.HashMap;
import javax.persistence.Persistence;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author umita
 */
public class FacadeHobbyCATest {
     
     FacadePersonCA fp;
     FacadeHobbyCA hb;
    
    public FacadeHobbyCATest()
    {
        fp = new FacadePersonCA();
        hb = new FacadeHobbyCA();
    }
    @Before
    public void addPerson(){
    
        
        HashMap<String, Object> puproperties = new HashMap();
        puproperties.put("javax.persistence.sql-load-script-source", "scripts/ClearDB.sql");
        Persistence.generateSchema("caunit", puproperties);
        Persistence.generateSchema("caunit", null); 
        hb.setEmf(Persistence.createEntityManagerFactory( "caunit"));
        hb.addHobby(new HobbyCA("fit", "fit"));

    }
    @Test
    public void TestGetHobby(){
        System.out.println("get hobby");
        System.out.println(hb.getHobby("fit"));
    
    }
    
}

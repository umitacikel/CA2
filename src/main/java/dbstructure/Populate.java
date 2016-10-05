/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbstructure;

import Entity.HobbyCA;
import Entity.PersonCA;
import Entity.PhoneCA;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author umita
 */
public class Populate {
     public static void main(String[] args)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "caunit" );
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        PersonCA p = new PersonCA( "Dan", "Mark");
        em.persist(p);
        p = new PersonCA("Mark", "Benson");
        em.persist(p);
        p = new PersonCA("Ben", "Winter");
        em.persist(p);
        
        HobbyCA h = new HobbyCA("fodbold", "fodbold");
        em.persist(h);
         h = new HobbyCA("håndbold", "håndbold");
        em.persist(h);
         h = new HobbyCA("tennis", "tennis");
        em.persist(h);
        
        PhoneCA ph = new PhoneCA("6032243", "mobil");
        em.persist(ph);
        ph = new PhoneCA("6962243", "mobil");
        em.persist(ph);
        ph = new PhoneCA("124243", "mobil");
        em.persist(ph);
        
        em.getTransaction().commit();
        em.close();
    }
}

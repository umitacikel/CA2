


package facade;

import Entity.HobbyCA;
import Entity.PersonCA;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;




public class FacadePersonCA {
  EntityManagerFactory emf;
    
    public FacadePersonCA()
    {
    }

    public void setEmf(EntityManagerFactory emf)
    {
        this.emf = emf;
    }
    
    
    public FacadePersonCA(EntityManagerFactory emf)
    {
        this.emf = emf;
    }   
    
    
    public PersonCA getPerson(int id)
    {
        EntityManager em = emf.createEntityManager();
      
        PersonCA p = null;
        
        try
        {
            em.getTransaction().begin();
            p = em.find(PersonCA.class, id);
            em.getTransaction().commit();
            return p;
        }
        finally
        {
            em.close();
        }    
    }
  
    
    public List<PersonCA> getPersons()
    {
        EntityManager em = emf.createEntityManager();

        List<PersonCA> persons = null;
        
        try
        {
            em.getTransaction().begin();
            persons = em.createQuery("Select p from PersonCA p").getResultList();
            em.getTransaction().commit();
            return persons;
        }
        finally
        {
            em.close();
        }
    }
    
    
    
     public PersonCA addPerson(PersonCA p)
    {
        EntityManager em = emf.createEntityManager();
       
        try
        {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            return p;
        }
        finally
        {
            em.close();
        }
    }
     
    public ArrayList getPersonByInfo(int id){
     EntityManager em = emf.createEntityManager();
     
     PersonCA p;
     HobbyCA h;
     ArrayList ar = new ArrayList();
     
        try {
            em.getTransaction().begin();
            p = em.find(PersonCA.class, id);
            h = em.find(HobbyCA.class, id);
            
            
            if (p.equals(h)) {
                ar.add(p);
                ar.add(h);

                em.getTransaction().commit();
            }
        } finally {
            em.close();
        }
        return ar;
    }

    private HobbyCA HobbyCA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}


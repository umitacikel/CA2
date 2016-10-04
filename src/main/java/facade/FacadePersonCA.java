


package facade;

import Entity.PersonCA;
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
    
}

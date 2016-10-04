
package Entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class PersonCA {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;    
    private String firstName;
    private String lastName;
    
    
    
    @ManyToMany
    private List<HobbyCA> hobbyCAs;
    
    
        
    public PersonCA()
    {
    }

    public PersonCA(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
       
    }

    @Override
    public String toString()
    {
        return "Person{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + '}';
    }

    public int getId()
    {
        return id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }  
 
}


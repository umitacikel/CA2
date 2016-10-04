
package Entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class InfoEntityCA {
    
    @Id
    private int id;
    private String Email;
    
    
    @ManyToOne
   public PhoneCA phoneCA;
    
    @OneToMany(mappedBy = "infoEntityCA")
    private List<AdressCA> adressCAs;
   
    public InfoEntityCA(){}

    
    public InfoEntityCA(int id, String Email) {
        this.id = id;
        this.Email = Email;
    }


    @Override
    public String toString() {
        return "InfoEntityCA{" + "id=" + id + ", Email=" + Email + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
     public List<AdressCA> addInfoToAdress(AdressCA ac) {
        this.adressCAs.add(ac);
        return adressCAs;
    }
}

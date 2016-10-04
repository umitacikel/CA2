
package Entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;




@Entity
public class PhoneCA {
    @Id
    private String phoneNumber;
    private String phoneDesc;
    
    
    
    @OneToMany(mappedBy = "phoneCA")
    private List<InfoEntityCA> infoEntityCAs;
    @ManyToOne
    private InfoEntityCA infoEntityCA;
    
    public PhoneCA(){}
   

    public PhoneCA(String phoneNumber, String phoneDesc) {
        this.phoneNumber = phoneNumber;
        this.phoneDesc = phoneDesc;
    }

    @Override
    public String toString() {
        return "PhoneCA{" + "phoneNumber=" + phoneNumber + ", phoneDesc=" + phoneDesc + '}';
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneDesc() {
        return phoneDesc;
    }

    public void setPhoneDesc(String phoneDesc) {
        this.phoneDesc = phoneDesc;
    }
    
      public List<InfoEntityCA> addPhoneToInfo(InfoEntityCA inca) {
        this.infoEntityCAs.add(inca);
        return infoEntityCAs;
    }
}


package Entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;




@Entity
public class AdressCA {
    @Id
    private String adressStreet;
    private String adressInfo;
    
    @ManyToOne
    public InfoEntityCA infoEntityCA;
    
    
    @OneToMany(mappedBy = "adressCA")
    private List<CityInfoCA> cityInfoCAs;
 
    public AdressCA(){}
    
    
    public AdressCA(String adressStreet, String adressInfo) {
        this.adressStreet = adressStreet;
        this.adressInfo = adressInfo;
    }
    
   

    @Override
    public String toString() {
        return "AdressCA{" + "adressStreet=" + adressStreet + ", adressInfo=" + adressInfo + '}';
    }

    public String getAdressStreet() {
        return adressStreet;
    }

    public void setAdressStreet(String adressStreet) {
        this.adressStreet = adressStreet;
    }

    public String getAdressInfo() {
        return adressInfo;
    }

    public void setAdressInfo(String adressInfo) {
        this.adressInfo = adressInfo;
    }
    
    
        public List<CityInfoCA> addAdressToCity(CityInfoCA cia) {
        this.cityInfoCAs.add(cia);
        return cityInfoCAs;
    }
}

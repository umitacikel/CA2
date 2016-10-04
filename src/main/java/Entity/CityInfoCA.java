
package Entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;




@Entity
public class CityInfoCA {

    @Id    
    private int CityZipCode;
    private String cityCity;
    
    
    @ManyToOne
    public AdressCA adressCA;
   
    public CityInfoCA(){}
    
    public CityInfoCA(int CityZipCode, String cityCity) {
        this.CityZipCode = CityZipCode;
        this.cityCity = cityCity;
    }


    
    @Override
    public String toString() {
        return "CityInfoCA{" + "CityZipCode=" + CityZipCode + ", cityCity=" + cityCity + '}';
    }

    public int getCityZipCode() {
        return CityZipCode;
    }

    public void setCityZipCode(int CityZipCode) {
        this.CityZipCode = CityZipCode;
    }

    public String getCityCity() {
        return cityCity;
    }

    public void setCityCity(String cityCity) {
        this.cityCity = cityCity;
    }
}

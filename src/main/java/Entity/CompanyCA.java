
package Entity;

import javax.persistence.Entity;
import javax.persistence.Id;




@Entity
public class CompanyCA {
    
    
    @Id
    private String companyName;
    private String companyDesc;
    private int companyCvr;
    private int companyNumEmplo;
    private int companyMarktValue;
    
    
    public CompanyCA(){}

    public CompanyCA(String companyName, String companyDesc, int companyCvr, int companyNumEmplo, int companyMarktValue) {
        this.companyName = companyName;
        this.companyDesc = companyDesc;
        this.companyCvr = companyCvr;
        this.companyNumEmplo = companyNumEmplo;
        this.companyMarktValue = companyMarktValue;
    }


    @Override
    public String toString() {
        return "CompanyCA{" + "companyName=" + companyName + ", companyDesc=" + companyDesc + ", companyCvr=" + companyCvr + ", companyNumEmplo=" + companyNumEmplo + ", companyMarktValue=" + companyMarktValue + '}';
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyDesc() {
        return companyDesc;
    }

    public void setCompanyDesc(String companyDesc) {
        this.companyDesc = companyDesc;
    }

    public int getCompanyCvr() {
        return companyCvr;
    }

    public void setCompanyCvr(int companyCvr) {
        this.companyCvr = companyCvr;
    }

    public int getCompanyNumEmplo() {
        return companyNumEmplo;
    }

    public void setCompanyNumEmplo(int companyNumEmplo) {
        this.companyNumEmplo = companyNumEmplo;
    }

    public int getCompanyMarktValue() {
        return companyMarktValue;
    }

    public void setCompanyMarktValue(int companyMarktValue) {
        this.companyMarktValue = companyMarktValue;
    }
     
    
}

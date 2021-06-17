package hrmsSystem.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "employers")
public class Employers {

    @Id
    @GeneratedValue
    @Column(name = "employer_id")
    private int employerId;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "web_site_address")
    private String webSiteAddress;

    @Column(name = "phone_number")
    private String phoneNumber;
    public Employers() {

    }

    public Employers(int employerId, String companyName, String webSiteAddress, String phoneNumber) {
        this.employerId = employerId;
        this.companyName = companyName;
        this.webSiteAddress = webSiteAddress;
        this.phoneNumber = phoneNumber;
    }

    public Employers(int id, String email, String password, int employerId, String companyName, String webSiteAddress, String phoneNumber) {
        //super(id, email, password);
        this.employerId = employerId;
        this.companyName = companyName;
        this.webSiteAddress = webSiteAddress;
        this.phoneNumber = phoneNumber;
    }

    public int getEmployerId() {
        return employerId;
    }

    public void setEmployerId(int employerId) {
        this.employerId = employerId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWebSiteAddress() {
        return webSiteAddress;
    }

    public void setWebSiteAddress(String webSiteAddress) {
        this.webSiteAddress = webSiteAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

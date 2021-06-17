package hrmsSystem.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="system_personnel")

public class SystemPersonnel{

    @Id
    @GeneratedValue
    @Column(name = "personnel_id")
    private int personnelId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    public SystemPersonnel(){

    }

    public SystemPersonnel(int personnelId, String firstName, String lastName) {
        this.personnelId = personnelId;
        this.firstName = firstName;
        this.lastName = lastName;
    }



    public int getPersonnelId() {
        return personnelId;
    }

    public void setPersonnelId(int personnelId) {
        this.personnelId = personnelId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

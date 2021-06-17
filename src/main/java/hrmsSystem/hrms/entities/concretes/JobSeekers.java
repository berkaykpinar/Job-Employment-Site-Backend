package hrmsSystem.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "job_seekers")
public class JobSeekers {

    @Id
    @GeneratedValue
    @Column(name = "seeker_id")
    private int seekerId;

    @Column(name="first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "national_id")
    private String nationalIdd;

    @Column(name = "birth_date")
    private String birthDate;

    public JobSeekers(){

    }

    public JobSeekers(int seekerId, String firstName, String lastName, String nationalIdd, String birthDate) {
        this.seekerId = seekerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalIdd = nationalIdd;
        this.birthDate = birthDate;
    }


    public int getSeekerId() {
        return seekerId;
    }

    public void setSeekerId(int seekerId) {
        this.seekerId = seekerId;
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

    public String getNationalIdd() {
        return nationalIdd;
    }

    public void setNationalIdd(String nationalIdd) {
        this.nationalIdd = nationalIdd;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}

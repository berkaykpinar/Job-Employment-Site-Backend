package hrmsSystem.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "job_applications")
@AllArgsConstructor
@NoArgsConstructor
public class JobApplications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "application_Id")
    private int applicationId;

    @Column(name = "advertisement_Id")
    private int advertisementId;

    @Column(name = "jobSeeker_Id")
    private int jobSeekerId;

    @Column(name = "resume_Id")
    private int resumeId;

    @Column(name = "name")
    private String name;

    @Column(name = "lastName")
    private String lastName;

    @ManyToOne()
    @JoinColumn(name = "ad_id")
    private JobAdvertisement jobAdvertisement;


}

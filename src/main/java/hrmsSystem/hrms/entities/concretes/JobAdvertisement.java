package hrmsSystem.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_advertisement")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobApplications"})
public class JobAdvertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ad_id")
    private int adId;

//    @NotNull
//    @Column(name = "employer_id")
//    private int employerId;

    @NotNull
    @Column(name = "city")
    private String city;

    @NotNull
    @Column(name = "title")
    private String title;

    @NotNull
    @Column(name = "description")
    private String description;

    @NotNull
    @Column(name = "position_num")
    private int positionNum;

    @NotNull
    //@JsonFormat(pattern = "dd-MM-yyy")
    @Column(name = "deadline")
    private String deadline;

    @NotNull
    @Column(name = "is_active")
    private Boolean isActive;

    @NotNull
    @Column(name="is_approved")
    private Boolean isApproved;

    @NotNull
    @Column(name = "working_type")
    private String workingType;

    @NotNull
    @Column(name="working_style")
    private String workingStyle;


    @ManyToOne()
    @JoinColumn(name = "employer_id")
    private Employers employers;

    @OneToMany(mappedBy = "jobAdvertisement")
    private List<JobApplications> jobApplications;


}

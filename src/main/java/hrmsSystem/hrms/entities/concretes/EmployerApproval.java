package hrmsSystem.hrms.entities.concretes;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "employer_approval_process")
@AllArgsConstructor
@NoArgsConstructor
public class EmployerApproval {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "process_id")
    private int processID;

    @NotNull
    @Column(name = "ad_Id")
    private int adId;

    @NotNull
    @Column(name = "company_Id")
    private int employerID;


    @Column(name = "company_name")
    private String companyName;


    @Column(name = "personnel_name")
    private String personnelName;

    @NotNull
    @Column(name = "date")
    private String date;

    @NotNull
    @Column(name = "result")
    private boolean processResult;

    @ManyToOne
    @JoinColumn(name = "personnel_id")
    private SystemPersonnel systemPersonnel;
}

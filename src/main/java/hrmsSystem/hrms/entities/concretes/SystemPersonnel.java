package hrmsSystem.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name="system_personnel")
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "personnel_id",referencedColumnName = "id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employerApprovals"})
public class SystemPersonnel extends Users{

//    @Id
//    @GeneratedValue
//    @Column(name = "personnel_id")
//    private int personnelId;

    @NotNull
    @Column(name = "first_name")
    private String firstName;

    @NotNull
    @Column(name = "last_name")
    private String lastName;

    @OneToMany(mappedBy = "systemPersonnel")
    private List<EmployerApproval> employerApprovals;

}

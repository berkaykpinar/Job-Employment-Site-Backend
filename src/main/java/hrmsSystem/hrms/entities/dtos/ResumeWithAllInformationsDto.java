package hrmsSystem.hrms.entities.dtos;

import hrmsSystem.hrms.entities.concretes.Education;
import hrmsSystem.hrms.entities.concretes.Experiences;
import hrmsSystem.hrms.entities.concretes.Languages;
import hrmsSystem.hrms.entities.concretes.Skills;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResumeWithAllInformationsDto {

    private int resumeId;
    private int jobSeekerId;
    private String gitHubAddress;
    private String linkedinAddress;
    private String coverLetter;
    private List<Experiences> experiences;
    private List<Education> educations;
    private List<Languages> languages;
    private List<Skills> skills;


}

package hrmsSystem.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "favorites")
public class Favorites {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fav_id")
    private int favId;

    @Column(name = "favAdId")
    private int favAdId;

    @ManyToOne
    @JoinColumn(name = "seeker_id")
    private JobSeekers jobSeekers;
}

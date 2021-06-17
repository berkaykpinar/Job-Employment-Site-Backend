package hrmsSystem.hrms.entities.concretes;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "active_positions")
public class ActivePositions {

    @Id
    @GeneratedValue
    @Column(name = "position_id")
    private int positionId;

    @Column(name = "position_name")
    private String positionName;

    public ActivePositions(int positionId, String positionName) {
        this.positionId = positionId;
        this.positionName = positionName;
    }

    public ActivePositions() {
        System.out.println("OLUŞTU");

    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }
}

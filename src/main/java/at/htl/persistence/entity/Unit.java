package at.htl.persistence.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class Unit {
    @Id
    @SequenceGenerator(sequenceName = "Unit_Seq", name="Unit_Seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Unit_Seq")
    private Integer id;
    private Timestamp startTime;
    private Timestamp endTime;

    @ManyToMany
    private List<Lesson> lessons;

    //region Constructors
    public Unit() {
    }

    public Unit(Integer unitId, Timestamp startTime, Timestamp endTime) {
        this.id = unitId;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    //endregion

    //region Getters and Setters
    public Integer getId() {
        return id;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }
    //endregion
}

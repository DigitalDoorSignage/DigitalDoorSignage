package at.htl.persistence.entity;

import at.htl.persistence.dao.LessonDao;
import at.htl.rest.dto.RoomDto;
import at.htl.rest.dto.UnitDto;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@NamedQueries({
        @NamedQuery(name="Unit.getAll", query="select unit from Unit unit"),
        @NamedQuery(name="Unit.getById", query="select unit from Unit unit where unit.id = :id")
})
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

    public UnitDto toDto(){
        UnitDto dto = new UnitDto();
        dto.setId(id);
        dto.setStartTime(startTime);
        dto.setEndTime(endTime);
        return dto;
    }

    public void update(UnitDto unitDto) {
        this.endTime = unitDto.getEndTime();
        this.startTime = unitDto.getStartTime();
    }

    //region Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

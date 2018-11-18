package at.htl.persistence.entities;

import java.time.LocalDateTime;

public class Unit {
    private Integer id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    //region Constructors
    public Unit() {
    }

    public Unit(Integer unitId, LocalDateTime startTime, LocalDateTime endTime) {
        this.id = unitId;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    //endregion

    //region Getters and Setters
    public Integer getId() {
        return id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
    //endregion
}

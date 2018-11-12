package at.htl.entities;

import java.time.LocalDateTime;

public class Unit {
    private Integer unitId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    //region Constructors
    public Unit() {
    }

    public Unit(Integer unitId, LocalDateTime startTime, LocalDateTime endTime) {
        this.unitId = unitId;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    //endregion

    //region Getters and Setters
    public Integer getUnitId() {
        return unitId;
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

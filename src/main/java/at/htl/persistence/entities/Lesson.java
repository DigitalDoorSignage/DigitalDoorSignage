package at.htl.persistence.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Lesson {
    @Id
    private Integer lessonId;
    //private Room room;
    private Integer roomId;
    private Integer teacherId;

    //region Constructors
    public Lesson() {
    }

    public Lesson(Integer lessonId, Integer roomId, Integer teacherId) {
        this.lessonId = lessonId;
        this.roomId = roomId;
        this.teacherId = teacherId;
    }
    //endregion

    //region Getters and Setters
    public Integer getLessonId() {
        return lessonId;
    }

    public void setLessionId(Integer lessonId){
        this.lessonId = lessonId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
    //endregion
}

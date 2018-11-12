package at.htl.entities;

public class Lesson {
    private Integer lessonId;
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

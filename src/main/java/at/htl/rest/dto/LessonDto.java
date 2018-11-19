package at.htl.rest.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LessonDto {
    private Integer id;
    private Integer roomId;
    private Integer teacherId;
    private Integer subjectId;
    private Integer weekday;

    //region Constructors
    public LessonDto() {
    }

    public LessonDto(Integer id, Integer roomId, Integer teacherId, Integer subjectId, Integer weekday) {
        this.id = id;
        this.roomId = roomId;
        this.teacherId = teacherId;
        this.subjectId = subjectId;
        this.weekday = weekday;
    }
    //endregion

    //region Getter and Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getWeekday() {
        return weekday;
    }

    public void setWeekday(Integer weekday) {
        this.weekday = weekday;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }
    //endregion
}

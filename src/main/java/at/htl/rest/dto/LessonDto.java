package at.htl.rest.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LessonDto {
    private Integer id;
    private Integer roomId;
    private Integer teacherId;

    //region Constructors
    public LessonDto() {
    }

    public LessonDto(Integer id, Integer roomId, Integer teacherId) {
        this.id = id;
        this.roomId = roomId;
        this.teacherId = teacherId;
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
    //endregion
}

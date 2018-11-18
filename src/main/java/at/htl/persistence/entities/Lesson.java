package at.htl.persistence.entities;

import at.htl.rest.dto.LessonDto;

import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name="Lesson.findAll", query = "select lesson from Lesson lesson"),
        @NamedQuery(name="Lesson.findById", query = "select lesson from Lesson lesson where lesson.id = :lessonId")
})
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Lesson_Seq")
    @SequenceGenerator(name = "Lesson_Seq", sequenceName = "Lesson_Seq")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Room room;

    @ManyToOne(fetch = FetchType.LAZY)
    private Teacher teacher;

    public LessonDto toDto(){
        LessonDto dto = new LessonDto();
        dto.setId(id);
        if(teacher != null)
            dto.setTeacherId(teacher.getId());
        if(room != null)
            dto.setRoomId(room.getId());
        return dto;
    }

    //region Constructors
    public Lesson() {
    }

    public Lesson(Integer id, Room room, Teacher teacher) {
        this.id = id;
        this.room = room;
        this.teacher = teacher;
    }

    //endregion

    //region Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setLessionId(Integer lessonId){
        this.id = lessonId;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    //endregion
}

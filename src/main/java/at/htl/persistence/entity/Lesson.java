package at.htl.persistence.entity;

import at.htl.persistence.converter.WeekdayConverter;
import at.htl.persistence.dao.RoomDao;
import at.htl.persistence.dao.SubjectDao;
import at.htl.persistence.dao.TeacherDao;
import at.htl.rest.dto.LessonDto;
import at.htl.rest.util.Weekday;

import javax.persistence.*;
import java.util.List;

@Entity
@NamedQueries({
        @NamedQuery(name="Lesson.getAll", query = "select lesson from Lesson lesson"),
        @NamedQuery(name="Lesson.getById", query = "select lesson from Lesson lesson where lesson.id = :id")
})
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Lesson_Seq")
    @SequenceGenerator(name = "Lesson_Seq", sequenceName = "Lesson_Seq")
    private Integer id;

    @Convert(converter = WeekdayConverter.class)
    private Weekday weekday;

    @ManyToOne(fetch = FetchType.LAZY)
    private Room room;

    @ManyToOne(fetch = FetchType.LAZY)
    private Teacher teacher;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Unit> units;

    @ManyToOne(fetch = FetchType.LAZY)
    private Subject subject;

    public LessonDto toDto(){
        LessonDto dto = new LessonDto();
        dto.setId(id);
        if(subject != null)
            dto.setSubjectId(subject.getId());
        if(teacher != null)
            dto.setTeacherId(teacher.getId());
        if(room != null)
            dto.setRoomId(room.getId());
        if(weekday != null)
            dto.setWeekday(weekday.getValue());
        return dto;
    }

    public void update(LessonDto lessonDto, RoomDao roomDao, TeacherDao teacherDao, SubjectDao subjectDao) {
        if(lessonDto.getWeekday() != null)
            this.weekday = Weekday.from(lessonDto.getWeekday());
        if(lessonDto.getRoomId() != null)
            this.room = roomDao.getById(lessonDto.getRoomId());
        if(lessonDto.getTeacherId() != null)
            this.teacher = teacherDao.getById(lessonDto.getRoomId());
        if(lessonDto.getSubjectId() != null)
            this.subject = subjectDao.getById(lessonDto.getSubjectId());
    }

    //region Constructors
    public Lesson() {
    }

    public Lesson(Integer id, Weekday weekdayIndex, Room room, Teacher teacher, Subject subject) {
        this.id = id;
        this.weekday = weekdayIndex;
        this.room = room;
        this.teacher = teacher;
        this.subject = subject;
    }

    //endregion

    //region Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer lessonId){
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

    public Weekday getWeekday() {
        return weekday;
    }

    public void setWeekday(Weekday weekdayIndex) {
        this.weekday = weekdayIndex;
    }

    public List<Unit> getUnits() {
        return units;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    //endregion
}

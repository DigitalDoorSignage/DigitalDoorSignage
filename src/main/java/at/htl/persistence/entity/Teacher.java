package at.htl.persistence.entity;

import at.htl.rest.dto.TeacherDto;

import javax.persistence.*;
import java.util.List;

@Entity
@NamedQueries({
        @NamedQuery(name="Teacher.getAll", query = "select teacher from Teacher teacher"),
        @NamedQuery(name="Teacher.getById", query = "select teacher from Teacher teacher where teacher.id = :id")
})
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Teacher_Seq")
    @SequenceGenerator(name = "Teacher_Seq", sequenceName = "Teacher_Seq")
    private Integer id;
    private String lastName;
    private Boolean is_male;
    @OneToMany
    private List<Lesson> lessons;

    //region Constructors
    public Teacher() {
    }

    public Teacher(Integer id, String lastName) {
        this.id = id;
        this.lastName = lastName;
    }
    //endregion

    public TeacherDto toDto(){
        TeacherDto dto = new TeacherDto();
        dto.setId(id);
        if(lastName != null)
            dto.setLastName(lastName);
        if(is_male != null)
            dto.setIsMale(is_male);
        return dto;
    }

    public void update(TeacherDto teacherDto) {
        if(teacherDto.getLastName() != null)
            this.lastName = teacherDto.getLastName();
        if(teacherDto.getIsMale() != null)
            this.is_male = teacherDto.getIsMale();
    }

    //region Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    public Boolean getIs_male() {
        return is_male;
    }

    public void setIs_male(Boolean is_male) {
        this.is_male = is_male;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public List<Lesson> getLessons(){ return this.lessons;}
    //endregion
}

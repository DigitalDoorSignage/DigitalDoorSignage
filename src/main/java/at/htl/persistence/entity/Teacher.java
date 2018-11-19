package at.htl.persistence.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
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
    private String name;
    @OneToMany
    private List<Lesson> lessons;

    //region Constructors
    public Teacher() {
    }

    public Teacher(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    //endregion

    //region Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Lesson> getLessons(){ return this.lessons;}
    //endregion
}

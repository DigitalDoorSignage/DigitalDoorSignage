package at.htl.persistence.entities;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Entity
@XmlRootElement
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Lesson> getLessons(){ return this.lessons;}
    //endregion
}

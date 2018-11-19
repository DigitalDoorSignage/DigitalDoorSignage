package at.htl.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Subject {
    @Id
    @SequenceGenerator(name = "Subject_Seq", sequenceName = "Subject_Seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Subject_Seq")
    private Integer id;
    private String name;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Lesson> lessons;

    //region Constructors
    public Subject() {
    }

    public Subject(Integer subjectId, String name) {
        this.id = subjectId;
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

    public List<Lesson> getLessons() {
        return lessons;
    }
    //endregion
}

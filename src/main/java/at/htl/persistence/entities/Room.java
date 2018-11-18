package at.htl.persistence.entities;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Entity
@XmlRootElement
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Room_Seq")
    @SequenceGenerator(name = "Room_Seq", sequenceName = "Room_Seq")
    private Integer id;
    private String name;
    @OneToMany
    private List<Lesson> lessons;

    //region Constructors
    public Room() {
    }

    public Room(Integer id, String name) {
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

    public List<Lesson> getLessons() { return this.lessons; }
    //endregion
}

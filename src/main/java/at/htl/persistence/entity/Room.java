package at.htl.persistence.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Entity
@NamedQueries({
        @NamedQuery(name="Room.getAll", query="select room from Room room"),
        @NamedQuery(name="Room.getById", query="select room from Room room where room.id = :id")
})
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

    public void setId(Integer id){
        this.id = id;
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

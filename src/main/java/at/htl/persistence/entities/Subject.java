package at.htl.persistence.entities;

public class Subject {
    private Integer id;
    private String name;

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
    //endregion
}

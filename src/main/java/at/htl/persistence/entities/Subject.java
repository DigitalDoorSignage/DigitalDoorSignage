package at.htl.persistence.entities;

public class Subject {
    private Integer subjectId;
    private String name;

    //region Constructors
    public Subject() {
    }

    public Subject(Integer subjectId, String name) {
        this.subjectId = subjectId;
        this.name = name;
    }
    //endregion

    //region Getters and Setters
    public Integer getSubjectId() {
        return subjectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //endregion
}

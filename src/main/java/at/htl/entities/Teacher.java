package at.htl.entities;

public class Teacher {
    private Integer teacherId;
    private String name;

    //region Constructors
    public Teacher() {
    }

    public Teacher(Integer teacherId, String name) {
        this.teacherId = teacherId;
        this.name = name;
    }
    //endregion

    //region Getters and Setters
    public Integer getTeacherId() {
        return teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //endregion
}

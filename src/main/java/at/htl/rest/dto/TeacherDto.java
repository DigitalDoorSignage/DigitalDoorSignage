package at.htl.rest.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TeacherDto {
    private Integer id;
    private String lastName;
    private Boolean isMale;

    //region Constructors
    public TeacherDto() {
    }

    public TeacherDto(Integer id, String lastName, Boolean isMale) {
        this.id = id;
        this.lastName = lastName;
        this.isMale = isMale;
    }
    //endregion

    //region Getter and Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getIsMale() {
        return isMale;
    }

    public void setIsMale(Boolean isMale) {
        this.isMale = isMale;
    }
    //endregion
}

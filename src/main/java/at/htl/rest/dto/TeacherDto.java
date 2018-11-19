package at.htl.rest.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TeacherDto {
    private Integer id;
    private String last_name;
    private Boolean is_male;

    public TeacherDto(Integer id, String last_name, Boolean is_male) {
        this.id = id;
        this.last_name = last_name;
        this.is_male = is_male;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Boolean getIs_male() {
        return is_male;
    }

    public void setIs_male(Boolean is_male) {
        this.is_male = is_male;
    }
}

package at.htl.rest.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SubjectDto {
    private Integer id;
    private String name;

    public SubjectDto() {
    }

    public SubjectDto(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

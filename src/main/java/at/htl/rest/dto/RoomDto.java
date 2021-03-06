package at.htl.rest.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RoomDto {
    private Integer id;
    private String name;

    //region constructor
    public RoomDto() {
    }

    public RoomDto(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    //endregion

    //region Getter and Setter
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
    //endregion
}

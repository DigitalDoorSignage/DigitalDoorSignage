package at.htl.entities;

public class Room {
    private Integer roomId;
    private String name;

    //region Constructors
    public Room() {
    }

    public Room(Integer roomId, String name) {
        this.roomId = roomId;
        this.name = name;
    }
    //endregion

    //region Getters and Setters
    public Integer getRoomId() {
        return roomId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //endregion
}

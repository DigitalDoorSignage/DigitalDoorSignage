package at.htl.rest.endpoint;

import at.htl.persistence.dao.Dao;
import at.htl.persistence.dao.LessonDao;
import at.htl.persistence.dao.RoomDao;
import at.htl.persistence.dao.TeacherDao;
import at.htl.persistence.entity.Room;
import at.htl.rest.dto.RoomDto;

import javax.inject.Inject;

public class RoomEndpoint extends EntityEndpoint<Room, RoomDto> {

    @Inject
    RoomDao roomDao;

    @Override
    protected Dao<Room> getEntityDao() {
        return roomDao;
    }

    @Override
    protected Class<Room> getEntityClass() {
        return Room.class;
    }

    @Override
    protected RoomDto getDtoFromEntity(Room room) {
        return room.toDto();
    }

    @Override
    protected Room updateEntityWithDto(Room room, RoomDto roomDto) {
        room.update(roomDto);
        return room;
    }
}

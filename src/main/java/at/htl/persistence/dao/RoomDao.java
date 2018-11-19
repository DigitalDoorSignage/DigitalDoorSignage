package at.htl.persistence.dao;

import at.htl.persistence.entity.Room;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class RoomDao extends Dao<Room>{

    @PersistenceContext(name = "primaryPU")
    EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    @Override
    protected Class<Room> getEntityClass() {
        return Room.class;
    }
}

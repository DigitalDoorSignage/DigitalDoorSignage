package at.htl.persistence.dao;

import at.htl.persistence.entity.Lesson;
import at.htl.persistence.entity.Room;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Stateless
public class RoomDao {

    @PersistenceContext(name = "primaryPU")
    EntityManager em;

    @Transactional
    public void create(Room room) {
        em.persist(room);
        em.flush();
    }
    public List<Room> getAll(){
        return em
                .createNamedQuery("Room.getAll", Room.class)
                .getResultList();
    }
    public Room getById(Integer id){
        try {
            return em
                    .createNamedQuery("Room.getById", Room.class)
                    .setParameter("id", id)
                    .getSingleResult();
        } catch(NoResultException ex){
            return null;
        }
    }

}

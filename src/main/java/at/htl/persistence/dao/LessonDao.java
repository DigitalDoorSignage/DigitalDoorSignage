package at.htl.persistence.dao;

import at.htl.persistence.entity.Lesson;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Stateless
public class LessonDao{

    @PersistenceContext(name = "primaryPU")
    EntityManager em;

    public void create(Lesson lesson) {
        em.persist(lesson);
        if(lesson.getRoom() != null)
            em.persist(lesson.getRoom());
        if(lesson.getTeacher() != null)
            em.persist(lesson.getTeacher());
        em.flush();
    }

    public List<Lesson> getAll(){
        return em
                .createNamedQuery("Lesson.getAll", Lesson.class)
                .getResultList();
    }
    public Lesson getById(Integer id){
        try {
            return em
                    .createNamedQuery("Lesson.getById", Lesson.class)
                    .setParameter("id", id)
                    .getSingleResult();
        } catch(NoResultException ex){
            return null;
        }
    }

    public void update(Lesson lesson) {
        em.merge(lesson);
        em.flush();
    }

    public void delete(Integer id) {
        em.remove(getById(id));
        em.flush();
    }
}

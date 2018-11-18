package at.htl.persistence.dao;

import at.htl.persistence.entities.Lesson;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Stateless
public class LessonDao{

    @PersistenceContext(name = "primaryPU")
    EntityManager em;

    @Transactional
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
                .createNamedQuery("Lesson.findAll", Lesson.class)
                .getResultList();
    }
    public Lesson getById(Integer id){
        return em
                .createNamedQuery("Lesson.findById", Lesson.class)
                .getSingleResult();
    }

}

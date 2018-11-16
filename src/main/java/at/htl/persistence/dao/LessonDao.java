package at.htl.persistence.dao;

import at.htl.persistence.entities.Lesson;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

@Stateless
public class LessonDao {

    @PersistenceContext(name = "primaryPU", type = PersistenceContextType.EXTENDED)
    EntityManager em;

    public void create(Lesson lesson){
        this.em.persist(lesson);
    }
}

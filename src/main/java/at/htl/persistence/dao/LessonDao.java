package at.htl.persistence.dao;

import at.htl.persistence.entities.Lesson;

import javax.ejb.Stateless;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class LessonDao {
    @PersistenceContext(name = "dbPU")
    EntityManager em;
    public void create(Lesson lesson){
        this.em.persist(lesson);
    }
}

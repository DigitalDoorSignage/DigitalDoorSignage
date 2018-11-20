package at.htl.persistence.dao;

import at.htl.persistence.entity.Lesson;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class LessonDao extends Dao<Lesson>{

    @PersistenceContext(name = "primaryPU")
    EntityManager em;

    protected EntityManager getEntityManager(){
        return em;
    }

    protected Class<Lesson> getEntityClass(){
        return Lesson.class;
    }
}

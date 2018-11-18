package at.htl.persistence.dao;

import at.htl.persistence.entity.Lesson;
import at.htl.persistence.entity.Teacher;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Stateless
public class TeacherDao {

    @PersistenceContext(name = "primaryPU")
    EntityManager em;

    @Transactional
    public void create(Lesson lesson) {
        em.persist(lesson);
        em.flush();
    }
    public List<Teacher> getAll(){
        return em
                .createNamedQuery("Teacher.getAll", Teacher.class)
                .getResultList();
    }
    public Teacher getById(Integer id){
        try {
            return em
                    .createNamedQuery("Teacher.getById", Teacher.class)
                    .setParameter("id", id)
                    .getSingleResult();
        } catch(NoResultException ex){
            return null;
        }
    }

}

package at.htl.persistence.dao;

import at.htl.persistence.entity.Teacher;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class TeacherDao extends Dao<Teacher>{

    @PersistenceContext(name = "primaryPU")
    EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    @Override
    protected Class<Teacher> getEntityClass() {
        return Teacher.class;
    }
}

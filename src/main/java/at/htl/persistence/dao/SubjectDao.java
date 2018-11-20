package at.htl.persistence.dao;

import at.htl.persistence.entity.Subject;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class SubjectDao extends Dao<Subject> {

    @PersistenceContext(name = "primaryDb")
    private EntityManager em;


    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    @Override
    protected Class<Subject> getEntityClass() {
        return Subject.class;
    }
}

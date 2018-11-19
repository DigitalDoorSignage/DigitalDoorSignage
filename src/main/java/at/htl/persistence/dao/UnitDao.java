package at.htl.persistence.dao;

import at.htl.persistence.entity.Unit;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class UnitDao extends Dao<Unit> {

    @PersistenceContext(name = "primaryDb")
    private EntityManager em;


    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    @Override
    protected Class<Unit> getEntityClass() {
        return Unit.class;
    }
}

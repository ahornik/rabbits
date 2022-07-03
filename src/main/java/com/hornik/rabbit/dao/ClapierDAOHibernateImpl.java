package com.hornik.rabbit.dao;


import com.hornik.rabbit.entity.Clapier;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ClapierDAOHibernateImpl implements ClapierDAO{

    private EntityManager entityManager;

    @Autowired
    public ClapierDAOHibernateImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<Clapier> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Clapier> theQuery =
                currentSession.createQuery("from Clapier", Clapier.class);
        List<Clapier> clapiers = theQuery.getResultList();
        return clapiers;
    }

    @Override
    public Clapier findById(int theId) {
        // get the current hibernate Session
        Session currentSession = entityManager.unwrap((Session.class));

        Clapier theClapier;
        theClapier = currentSession.get(Clapier.class, theId);

        return theClapier;
    }


    @Override
    public void save(Clapier theClapier) {
        // get the current hibernate Session
        Session currentSession = entityManager.unwrap((Session.class));
        currentSession.saveOrUpdate(theClapier);

    }

    @Override
    public void deleteById(int theId) {
        Session currentSession = entityManager.unwrap((Session.class));
        Clapier theClapier;
        theClapier = currentSession.get(Clapier.class, theId);
        Query theQuery = currentSession.createQuery("delete from clapiers where id=:clapierId");
        theQuery.setParameter("clapierId", theId);
        theQuery.executeUpdate();
    }
}




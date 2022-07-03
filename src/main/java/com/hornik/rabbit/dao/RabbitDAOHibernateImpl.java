package com.hornik.rabbit.dao;

import com.hornik.rabbit.entity.Rabbit;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class RabbitDAOHibernateImpl implements RabbitDAO {

    private EntityManager entityManager;

    @Autowired
    public RabbitDAOHibernateImpl(EntityManager theEntityManager) {

        entityManager = theEntityManager;
    }


    @Override
    public List<Rabbit> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Rabbit> theQuery =
                currentSession.createQuery("from Rabbit", Rabbit.class);
        List<Rabbit> rabbits = theQuery.getResultList();
        return rabbits;
    }

    @Override
    public Rabbit findById(int theId) {
        // get the current hibernate Session
        Session currentSession = entityManager.unwrap((Session.class));
        //get the rabbit
        Rabbit theRabbit;
        theRabbit = currentSession.get(Rabbit.class, theId);

        // return the rabbit
        return theRabbit;
    }


    @Override
    public void save(Rabbit theRabbit) {
        // get the current hibernate Session
        Session currentSession = entityManager.unwrap((Session.class));
        currentSession.saveOrUpdate(theRabbit);

    }

    @Override
    public void deleteById(int theId) {
        Session currentSession = entityManager.unwrap((Session.class));
        //get the rabbit
        Rabbit theRabbit;
        theRabbit = currentSession.get(Rabbit.class, theId);
        Query theQuery = currentSession.createQuery("delete from rabbits where id=:rabbitId");
        theQuery.setParameter("rabbitId",theId);
        theQuery.executeUpdate();
    }
}


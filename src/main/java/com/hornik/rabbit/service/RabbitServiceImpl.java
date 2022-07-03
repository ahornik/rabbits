package com.hornik.rabbit.service;


import com.hornik.rabbit.dao.RabbitDAO;
import com.hornik.rabbit.entity.Rabbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RabbitServiceImpl implements RabbitService {

    private RabbitDAO rabbitDAO;

    @Autowired
    public RabbitServiceImpl(RabbitDAO theRabbitDAO) {
        rabbitDAO = theRabbitDAO;
    }

    @Override
    @Transactional
    public List<Rabbit> findAll() {
        return rabbitDAO.findAll();
    }

    @Override
    @Transactional
    public Rabbit findById(int theId) {
        return rabbitDAO.findById(theId);
    }

    @Override
    @Transactional
    public void save(Rabbit theRabbit) {
        rabbitDAO.save(theRabbit);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        rabbitDAO.deleteById(theId);
    }
}

package com.hornik.rabbit.service;


import com.hornik.rabbit.entity.Rabbit;

import java.util.List;

public interface RabbitService {

    public List<Rabbit> findAll();
    public Rabbit findById(int theId);
    public void save(Rabbit theRabbit);
    public void deleteById(int theId);
}

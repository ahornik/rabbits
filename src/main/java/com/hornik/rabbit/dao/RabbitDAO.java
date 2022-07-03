package com.hornik.rabbit.dao;

import com.hornik.rabbit.entity.Rabbit;

import java.util.List;

public interface RabbitDAO {
    public List<Rabbit> findAll();
    public Rabbit findById(int theId);
    public void save(Rabbit theEmployee);
    public void deleteById(int theId);
}

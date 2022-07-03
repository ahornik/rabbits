package com.hornik.rabbit.dao;

import com.hornik.rabbit.entity.Clapier;

import java.util.List;

public interface ClapierDAO {
    public List<Clapier> findAll();

    public Clapier findById(int theId);

    public void save(Clapier theEmployee);

    public void deleteById(int theId);
}



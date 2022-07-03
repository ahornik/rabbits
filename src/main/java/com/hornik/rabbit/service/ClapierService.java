package com.hornik.rabbit.service;

import com.hornik.rabbit.entity.Clapier;

import java.util.List;

public interface ClapierService {

    public List<Clapier> findAll();
    public Clapier findById(int theId);
    public void save(Clapier theClapier);
    public void deleteById(int theId);

}

package com.hornik.rabbit.service;

import com.hornik.rabbit.dao.ClapierDAO;
import com.hornik.rabbit.entity.Clapier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClapierServiceImpl implements ClapierService {
    private ClapierDAO clapierDAO;

    @Autowired
    public ClapierServiceImpl(ClapierDAO theClapierDAO) {
        clapierDAO = theClapierDAO;
    }

    @Override
    @Transactional
    public List<Clapier> findAll() {
        return clapierDAO.findAll();
    }

    @Override
    @Transactional
    public Clapier findById(int theId) {
        return clapierDAO.findById(theId);
    }

    @Override
    @Transactional
    public void save(Clapier theClapier) {
        clapierDAO.save(theClapier);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        clapierDAO.deleteById(theId);
    }

}

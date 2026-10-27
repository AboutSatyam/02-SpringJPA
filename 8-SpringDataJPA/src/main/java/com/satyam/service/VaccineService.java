package com.satyam.service;

import com.satyam.repo.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import view.View;

import java.util.List;

@Service
public class VaccineService implements IVaccineService {

    // @Autowired
    private IVaccineRepo repo;

    @Autowired
    public void setRepo(IVaccineRepo repo) {
        this.repo = repo;
    }


    @Override
    public <T extends View> List<T> fetchByCostLessThan(Double cost, Class<T> cls) {
        return repo.findByCostLessThan(cost, cls);
    }
}


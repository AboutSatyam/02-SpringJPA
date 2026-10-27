package com.satyam.service;

import com.satyam.repo.IVaccineRepo;
import com.satyam.view.IResultView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public List<IResultView> fetchByCost(Double cost) {

        return repo.findByCostLessThan(cost);
    }
}


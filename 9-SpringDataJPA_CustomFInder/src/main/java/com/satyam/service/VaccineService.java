package com.satyam.service;

import com.satyam.entity.Vaccine;
import com.satyam.repo.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class VaccineService implements IVaccineService {


    private IVaccineRepo repo;

    @Autowired
    public void setRepo(IVaccineRepo repo) {
        this.repo = repo;
    }


    @Override
    public List<Vaccine> fetchByCost(Double cost) {

        return repo.findByCost(cost);
    }

    @Override
    public List<Vaccine> fetchByCostLessThanEqual(Double cost) {
        return repo.findByCostLessThanEqual(cost);
    }

    @Override
    public List<Vaccine> fetchByCostBetween(Double startcost, Double endingcost) {
        return repo.findByCostBetween(startcost,endingcost);
    }

    @Override
    public List<Vaccine> fetchByVaccineCompanyEquals(String name) {
        return repo.findByVaccineCompanyEquals(name);
    }

    @Override
    public List<Vaccine> fetchByVaccineNameInAndCostBetween(Collection<String> names, Double startCost, Double endingCost) {
        return repo.findByVaccineNameInAndCostBetween(names,startCost,endingCost);
    }
}




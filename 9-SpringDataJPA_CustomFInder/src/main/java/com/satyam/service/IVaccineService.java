package com.satyam.service;

import com.satyam.entity.Vaccine;

import java.util.Collection;
import java.util.List;


public interface IVaccineService {

    public List<Vaccine> fetchByCost(Double cost);
    public List<Vaccine> fetchByCostLessThanEqual(Double cost);
    public List<Vaccine> fetchByCostBetween(Double startcost,Double endingcost);
    public List<Vaccine> fetchByVaccineCompanyEquals(String name);
    public List<Vaccine> fetchByVaccineNameInAndCostBetween(Collection<String> names, Double startCost, Double endingCost);


}

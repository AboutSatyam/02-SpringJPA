package com.satyam.service;

import com.satyam.entity.Vaccine;
import com.satyam.repo.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class VaccineService implements IVaccineService {


    private IVaccineRepo repo;

    @Autowired
    public void setRepo(IVaccineRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<Vaccine> fetchByVaccineCompany(String companyname) {
        return repo.searchByVaccineCompany(companyname);
    }

    @Override
    public List<Vaccine> fetchByVaccineCompany(String comp1, String comp2) {
        return repo.searchByVaccineCompany(comp1, comp2);
    }

    @Override
    public List<String> fetchByCost(Double startingRange, Double maxrange) {
        return repo.searchByCost(startingRange, maxrange);
    }

    @Override
    public int updatePriceByVaccineName(Double newPrice, String vaccineName) {
        return repo.updatePriceByVaccineName(newPrice, vaccineName);


    }

    @Override
    public int deletePriceByVaccineName(String vaccineName) {
        return repo.deletePriceByVaccineName(vaccineName);
    }

    @Override
    public int insertVaccineDetails(String vaccineName, String vaccineCompany, Double cost) {
        return repo.insertVaccineInfo(vaccineName, vaccineCompany, cost);
    }

    @Override
    public LocalDateTime getTheSystemDateAndTime() {
        return repo.getTheSystemDateAndTime();
    }


}





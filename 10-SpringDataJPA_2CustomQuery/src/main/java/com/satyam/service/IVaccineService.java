package com.satyam.service;


import com.satyam.entity.Vaccine;

import java.time.LocalDateTime;
import java.util.List;

public interface IVaccineService {

    public List<Vaccine> fetchByVaccineCompany(String companyname);

    public List<Vaccine> fetchByVaccineCompany(String comp1, String comp2);

    public List<String> fetchByCost(Double startingRange, Double maxrange);

    public int updatePriceByVaccineName(Double newPrice, String vaccineName);

    public int deletePriceByVaccineName(String vaccineName);

    public int insertVaccineDetails(String vaccineName, String vaccineCompany, Double cost);

    public LocalDateTime getTheSystemDateAndTime();


}

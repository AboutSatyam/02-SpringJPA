package com.satyam.service;

import com.satyam.entity.Vaccine;

import java.util.List;
import java.util.Optional;

public interface IVaccineService {

    public String registerVaccineInfo(Vaccine vaccine);

    public Iterable<Vaccine> registerMultipleVaccineInfo(Iterable<Vaccine> vaccine);

    public long vaccineCount();

    public Boolean checkVaccineAvailablity(Integer id);

    public Iterable<Vaccine> getAllVaccineInfo();

    public Iterable<Vaccine> getAllVaccine(Iterable<Integer> ids);

    public Optional<Vaccine> getVaccineById(Integer id);

    public String removeVaccineById(Integer id);

    public String removeVaccineByVaccine(Vaccine obj);

    public String removeAllVaccines(List<Integer> ids);

}

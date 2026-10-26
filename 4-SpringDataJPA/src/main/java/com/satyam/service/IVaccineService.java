package com.satyam.service;

import com.satyam.entity.Vaccine;

import java.util.Optional;

public interface IVaccineService {

    public String registerVaccineInfo(Vaccine vaccine);

    public Iterable<Vaccine> registerMultipleVaccineInfo(Iterable<Vaccine> vaccine);

    public long vaccineCount();

    public Boolean checkVaccineAvailabulity(Integer id);

    public Iterable<Vaccine> getAllVaccineInfo();

    public Iterable<Vaccine> getAllVaccine(Iterable<Integer> ids);

    public Optional<Vaccine> getVaccineById(Integer id);


}

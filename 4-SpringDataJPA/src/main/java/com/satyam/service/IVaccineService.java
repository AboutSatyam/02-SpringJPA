package com.satyam.service;

import com.satyam.entity.Vaccine;

public interface IVaccineService {

    public String registerVaccineInfo(Vaccine vaccine);

    public Iterable<Vaccine> registerMultipleVaccineInfo(Iterable<Vaccine> vaccine);

    public long vaccineCount();

    public Boolean checkVaccineAvailabulity(Integer id);
    public Iterable<Vaccine> getAllVaccineInfo();


}

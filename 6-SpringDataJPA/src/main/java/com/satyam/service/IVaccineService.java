package com.satyam.service;

import com.satyam.entity.Vaccine;

import java.util.List;

public interface IVaccineService {
    public Vaccine searchVaccineById(Integer id);

    public List<Vaccine> searchVaccineByGivenInfo(Vaccine vac);

    public String removeVaccineInfoByIds(Iterable<Integer> ids);

}

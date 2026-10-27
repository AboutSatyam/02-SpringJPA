package com.satyam.service;

import com.satyam.entity.Vaccine;

public interface IVaccineService {

    public Iterable<Vaccine> fetchDetailsBYSorting(Boolean status, String... properties);
}

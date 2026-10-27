package com.satyam.service;

import com.satyam.entity.Vaccine;

import java.util.List;

public interface IVaccineService {

    public Iterable<Vaccine> fetchDetailsBYSorting(Boolean status, String... properties);

    public List<Vaccine> fetchDetailsBYPagination(int pgNO, int pgSize, Boolean status, String... properties);

    public void fetchDetailsBYPagination(int pageSize);
}

package com.satyam.service;

import com.satyam.entity.Vaccine;
import com.satyam.repo.IVaccineRepo;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class VaccineService implements IVaccineService {


    private IVaccineRepo repo;

    public void setRepo(IVaccineRepo repo) {
        this.repo = repo;
    }

    @Override
    public Iterable<Vaccine> fetchDetailsBYSorting(Boolean status, String... properties) {

        Sort sort = Sort.by(status ? Sort.Direction.ASC : Sort.Direction.DESC, properties);
        return repo.findAll(sort);
    }
}

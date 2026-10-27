package com.satyam.repo;


import com.satyam.entity.Vaccine;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IVaccineRepo extends PagingAndSortingRepository<Vaccine, Integer> {

}

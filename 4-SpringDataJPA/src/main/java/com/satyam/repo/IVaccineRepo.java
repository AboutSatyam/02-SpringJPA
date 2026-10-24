package com.satyam.repo;


import com.satyam.entity.Vaccine;
import org.springframework.data.repository.CrudRepository;

public interface IVaccineRepo extends CrudRepository<Vaccine, Integer> {

}

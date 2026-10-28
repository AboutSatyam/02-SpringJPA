package com.satyam.repo;

import com.satyam.entity.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {
}
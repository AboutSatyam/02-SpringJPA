package com.satyam.repo;


import com.satyam.entity.Vaccine;
import com.satyam.view.IResultView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {


    List<IResultView> findByCostLessThan(Double cost);

}



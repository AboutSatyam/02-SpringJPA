package com.satyam.repo;


import com.satyam.entity.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;
import view.View;

import java.util.List;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {


    public <T extends View> List<T> findByCostLessThan(Double cost, Class<T> cls);

}



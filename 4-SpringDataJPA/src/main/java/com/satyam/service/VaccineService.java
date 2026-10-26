package com.satyam.service;

import com.satyam.entity.Vaccine;
import com.satyam.repo.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VaccineService implements IVaccineService {

    private IVaccineRepo repo;

    @Autowired
    public void setRepo(IVaccineRepo repo) {
        this.repo = repo;
    }

    @Override
    public String registerVaccineInfo(Vaccine vaccine) {

        // Vaccine vac = (Vaccine) repo.save(vaccine);

        Vaccine vac = repo.save(vaccine);
        return "Vaccine Info Regitered With Id " + vac.getId();
    }

    @Override
    public Iterable<Vaccine> registerMultipleVaccineInfo(Iterable<Vaccine> vaccine) {


        return repo.saveAll(vaccine);
    }

    @Override
    public long vaccineCount() {
        return repo.count();
    }

    @Override
    public Boolean checkVaccineAvailabulity(Integer id) {
        return repo.existsById(id);
    }

    @Override
    public Iterable<Vaccine> getAllVaccineInfo() {
        return repo.findAll();
    }

    @Override
    public Iterable<Vaccine> getAllVaccine(Iterable<Integer> ids) {
        return repo.findAllById(ids);

    }

    @Override
    public Optional<Vaccine> getVaccineById(Integer id) {
        return repo.findById(id);
    }
}

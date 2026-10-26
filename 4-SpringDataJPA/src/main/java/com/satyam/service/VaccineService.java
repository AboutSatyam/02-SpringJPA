package com.satyam.service;

import com.satyam.entity.Vaccine;
import com.satyam.repo.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
        return "Vaccine Info Registered With Id " + vac.getId();
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

    @Override
    public String removeVaccineById(Integer id) {


//        Optional<Vaccine> Optional = repo.findById(id);
//        if (Optional.isPresent()) {
//            System.out.println("Record With id " + id + "Is Deleted ");
//        }
        return "Record Not Found 404";
//
    }

    @Override
    public String removeVaccineByVaccine(Vaccine obj) {
        Integer id = obj.getId();
        Optional<Vaccine> Optional = repo.findById(id);
        if (Optional.isPresent()) {
            repo.deleteById(id);
            System.out.println("Record With id " + id + "Is Deleted ");
        }
        return "Record Not Found 404";
    }

    @Override
    public String removeAllVaccines(List<Integer> ids) {
        List<Vaccine> vaccines = (List<Vaccine>) repo.findAllById(ids);
        int count1 = ids.size();
        int count2 = vaccines.size();

        if (count1 == count2) {
            repo.deleteAllById(ids);
            return "Vaccine Info Deleted Of Given Id " + ids;
        }
        return "Failed TO Delete";
    }

}

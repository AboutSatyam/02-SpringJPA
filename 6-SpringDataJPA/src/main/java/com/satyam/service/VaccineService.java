package com.satyam.service;

import com.satyam.entity.Vaccine;
import com.satyam.repo.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineService implements IVaccineService {

    // @Autowired
    private IVaccineRepo repo;

    @Autowired
    public void setRepo(IVaccineRepo repo) {
        this.repo = repo;
    }


    @Override
    public Vaccine searchVaccineById(Integer id) {
        return repo.getReferenceById(id);
    }

    @Override
    public List<Vaccine> searchVaccineByGivenInfo(Vaccine vac) {

        Example<Vaccine> example = Example.of(vac);
        return repo.findAll(example);
    }

    @Override
    public String removeVaccineInfoByIds(Iterable<Integer> ids) {
        List<Vaccine> list = repo.findAllById(ids);
        if (list.size() != 0) {
            repo.deleteAllByIdInBatch(ids);
            return "Record Deleted FOR Given Ids :" + ids;

        }
        return "Unable To Delete ";
    }

    @Override
    public List<Vaccine> searchVaccineByGivenInfo(Vaccine vac, Boolean status, String... params) {

        Sort.by(status ? Sort.Direction.ASC : Sort.Direction.DESC, params);
        return List.of();
    }

}


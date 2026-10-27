package com.satyam.service;

import com.satyam.entity.Vaccine;
import com.satyam.repo.IVaccineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
    public Iterable<Vaccine> fetchDetailsBYSorting(Boolean status, String... properties) {
        //repo.findAll();
        Sort sort = Sort.by(status ? Sort.Direction.ASC : Sort.Direction.DESC, properties);
        return repo.findAll(sort);
    }

    @Override
    public List<Vaccine> fetchDetailsBYPagination(int pgNO, int pgSize, Boolean status, String... properties) {

        // Sort sort = Sort.by(status ? Sort.Direction.ASC : Sort.Direction.DESC, properties);
        PageRequest pagable = PageRequest.of(pgNO, pgSize,
                status ? Sort.Direction.ASC : Sort.Direction.DESC, properties);
        Page<Vaccine> page = repo.findAll(pagable);


        return page.getContent();
    }

    @Override
    public void fetchDetailsBYPagination(int pageSize) {
        long count = 11l;
        long pagecount = count / pageSize; // 4/2==> 2 ,12/3=> 4.

        pagecount = count % pageSize == 0 ? pagecount : ++pagecount;

//        if (count % pageSize != 0) {
//            pagecount++;
//        }
        for (int i = 0; i < pagecount; i++) {

            PageRequest pageable = PageRequest.of(i, pageSize);
            Page<Vaccine> page = repo.findAll(pageable);

            page.getContent().forEach(v -> System.out.println(v.getVaccineName() + "------ " + v.getVaccineCompany()));
            System.out.println("--------------------------------------------------------------------------------------------------------------------------");
        }


    }
}

package com.satyam;

import com.satyam.service.VaccineService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext con = SpringApplication.run(Application.class, args);
        VaccineService vacs = con.getBean(VaccineService.class);

//        vacs.fetchDetailsBYSorting(true, "vaccineName", "vaccineCompany")
//                .forEach(v -> System.out.println(v.getVaccineName() + "-------------- " + v.getVaccineCompany()));
//
//        vacs.fetchDetailsBYPagination(1, 3, true, "vaccineName", "vaccineCompany")
//                .forEach(v -> System.out.println(v.getVaccineName() + "-------------- " + v.getVaccineCompany()));
//
//        vacs.fetchDetailsBYPagination(3);










    }
}

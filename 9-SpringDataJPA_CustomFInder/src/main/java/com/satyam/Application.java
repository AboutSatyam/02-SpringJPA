package com.satyam;

import com.satyam.service.VaccineService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Collection;
import java.util.HashSet;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext con =
                SpringApplication.run(Application.class, args);

        VaccineService Con = con.getBean(VaccineService.class);


        Con.fetchByCostLessThanEqual(5600.0).forEach(v -> System.out.println(v));
       // Con.fetchByCostBetween(300.0, 500.0).forEach(v -> System.out.println(v));
        System.out.println("--------------------------------");
        // Con.fetchByVaccineCompanyEquals("Serum Institute of India").forEach(v -> System.out.println(v));
        System.out.println("--------------------------------");

        Collection<String> vaccinenames = new HashSet<>();
        vaccinenames.add("ZyCoV-D");
        vaccinenames.add("Pentavac");

          Con.fetchByVaccineNameInAndCostBetween(vaccinenames,200.0,400.0).forEach(v -> System.out.println(v));

    }
}
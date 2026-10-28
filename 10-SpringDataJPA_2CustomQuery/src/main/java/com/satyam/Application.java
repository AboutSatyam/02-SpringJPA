package com.satyam;

import com.satyam.service.VaccineService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext con =
                SpringApplication.run(Application.class, args);

        VaccineService Con = con.getBean(VaccineService.class);

        //   Con.fetchByVaccineCompany("Zydus Lifesciences", "Serum Institute of India ").forEach(v -> System.out.println(v));

//        Con.fetchByCost(200.0, 400.0)
//                .forEach(v -> System.out.println(v));


//        int rows = Con.updatePriceByVaccineName(200.0, "Corbevax");
//        if (rows != 0)
//            System.out.println("Updated Sucess");
//        else System.out.println("Failed to update Cost");
//    }

//        int rows = Con.deletePriceByVaccineName("Corbevax");
//        if (rows != 0)
//            System.out.println("Updated Sucess");
//        else System.out.println("Failed to update Cost");


//        int rows = Con.insertVaccineDetails("Corbevax","Satyam",999.0);
//        if (rows != 0)
//            System.out.println("Updated Sucess");
//        else System.out.println("Failed to update Cost");

        System.out.println("___________________________");
        System.out.println(Con.getTheSystemDateAndTime());
        System.out.println("___________________________");

    }
}
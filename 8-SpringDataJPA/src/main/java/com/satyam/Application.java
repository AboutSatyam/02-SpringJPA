package com.satyam;

import com.satyam.service.VaccineService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import view.ResultView2;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext con =
                SpringApplication.run(Application.class, args);

        VaccineService vacs = con.getBean(VaccineService.class);

        vacs.fetchByCostLessThan(540.56, ResultView2.class)
                .forEach(v -> System.out.println(
                        v.getVaccineName() + "___" + v.getCost()
                ));

        con.close();
    }
}
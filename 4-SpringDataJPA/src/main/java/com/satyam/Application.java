package com.satyam;

import com.satyam.entity.Vaccine;
import com.satyam.service.VaccineService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext con = SpringApplication.run(Application.class, args);
        VaccineService vacs = con.getBean(VaccineService.class);
//
//        String str = vacs.registerVaccineInfo(new Vaccine("Phizer", "Moderna", 232.32));
//        System.out.println(str);
//
//        List<Vaccine> vaccines = new ArrayList<Vaccine>();
//
//        vaccines.add(new Vaccine("Covaxin", "Bharat Biotech", 150.00));
//
//        vaccines.add(new Vaccine("Covishield", "Serum Institute of India", 300.00));
//        vaccines.add(new Vaccine("iNCOVACC", "Bharat Biotech", 800.00));
//        vaccines.add(new Vaccine("Corbevax", "Biological E", 250.00));
//        vaccines.add(new Vaccine("ZyCoV-D", "Zydus Lifesciences", 350.00));
//        vaccines.add(new Vaccine("Rotavac", "Bharat Biotech", 100.00));
//        vaccines.add(new Vaccine("Typbar-TCV", "Bharat Biotech", 1500.00));
//        vaccines.add(new Vaccine("Jeev", "Indian Immunologicals", 100.00));
//        vaccines.add(new Vaccine("Pentavac", "Serum Institute of India", 500.00));
//        vaccines.add(new Vaccine("Easyfive-TT", "Panacea Biotec", 450.00));
//        vaccines.add(new Vaccine("Shan5", "Shantha Biotechnics", 4x   00.00));
//        vaccines.add(new Vaccine("Hepatitis B Vaccine", "Indian Immunologicals", 200.00));
//        vaccines.add(new Vaccine("Polio Vaccine", "WHO", 783.40));
//
//        vacs.registerMultipleVaccineInfo(vaccines).forEach(v -> System.out.println(v));

        Long count = vacs.vaccineCount();
        System.out.println("Vaccine Available Is : " + count);

//        Scanner input = new Scanner(System.in);
//        System.out.println("Ente The Is Yoyu Want To Search The Vaccine Availability : ");
//        Integer id = input.nextInt();
//        int id = 4;
//
//
//        Boolean str = vacs.checkVaccineAvailabulity(id);
//
//        if (str)
//            System.out.println("Vaccine Available Id IS " + id);
//        else
//            System.out.println("Not Available Id " + id);


//        vacs.getAllVaccineInfo().forEach(v -> System.out.println(v));
//
//        List<Integer> ids = new ArrayList<>();
//        ids.add(2);
//        ids.add(3);
//
//        vacs.getAllVaccine(ids).forEach(v -> System.out.println(v));

        Integer id = 12;
//        vacs.getVaccineById(id);
//
        Optional<Vaccine> opt = vacs.getVaccineById(id);
        if (opt.isPresent()) {
            System.out.println("Present " + opt.get());
        } else
            System.out.println("Record is not present with this id " + id);
    }

}

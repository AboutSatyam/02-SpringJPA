package com.satyam.springdatajdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataJdbcApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext con = SpringApplication.run(SpringDataJdbcApplication.class, args);
//
//        EmpolyeeDao dao = con.getBean(EmpolyeeDao.class);
//        dao.input();
    }

}

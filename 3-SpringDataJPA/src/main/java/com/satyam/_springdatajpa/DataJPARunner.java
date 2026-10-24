package com.satyam._springdatajpa;

import com.satyam._springdatajpa.entity.Alien;
import com.satyam._springdatajpa.repo.IAlienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataJPARunner implements CommandLineRunner {


    @Autowired
    private IAlienRepo repo;


    @Override
    public void run(String... args) throws Exception {
        repo.save(new Alien(2, "Hit_Sharan", "Kunj"));
        System.out.println("Alien saved successfully!");
    }
}

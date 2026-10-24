package com.satyam._springdatajpa.repo;

import com.satyam._springdatajpa.entity.Alien;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlienRepo extends CrudRepository<Alien, Integer> {
}

package com.satyam.repo;

import com.satyam.entity.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {

    @Query("FROM Vaccine WHERE vaccineCompany=:company")
    public List<Vaccine> searchByVaccineCompany(@Param("company") String companyname);

    @Query("FROM Vaccine WHERE vaccineCompany IN (:comp1, :comp2)")
    public List<Vaccine> searchByVaccineCompany(String comp1, String comp2);

    @Query("SELECT  vaccineName,vaccineCompany FROM Vaccine WHERE cost BETWEEN :startingRange AND :maxrange")
    public List<String> searchByCost(Double startingRange, Double maxrange);

    @Transactional
    @Modifying
    @Query("UPDATE Vaccine SET cost=:newPrice WHERE vaccineName=:vaccineName")
    public int updatePriceByVaccineName(Double newPrice, String vaccineName);

    @Transactional
    @Modifying
    @Query("DELETE FROM Vaccine  WHERE vaccineName=:vaccineName")
    public int deletePriceByVaccineName(String vaccineName);

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO vaccine (vaccine_name, vaccine_company, cost) VALUES (?, ?, ?)",
            nativeQuery = true)
    public int insertVaccineInfo(String vaccineName, String vaccineCompany, Double cost);


    @Query(value = "SELECT NOW()", nativeQuery = true)
   public LocalDateTime getTheSystemDateAndTime();

}
package com.satyam.springdatajdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class EmpolyeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    //    private String sql = "INSERT INTO  EMPLOYEE(id ,name,city)VALUES (1,'Satyam,'Thane')";
    private String sql = "INSERT INTO  EMPLOYEE(id ,name,city)VALUES (?,?,?)";


//    public void input() {
//        jdbcTemplate.update(sql);
//        System.out.println("Input One");
//    }

    public void input(Employee emp) {
//        int id=emp.getId();
        jdbcTemplate.update(sql, emp.getId(), emp.getName(), emp.getCity());
        System.out.println("Input One");
    }
}

package com.satyam.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Customer {
    @Id
    private String id;
    private Integer custNo;
    private String name;
    private String city;


    public Customer() {
    }

    public Customer(String id, Integer custNo, String name, String city) {
        this.id = id;
        this.custNo = custNo;
        this.name = name;
        this.city = city;
    }
}


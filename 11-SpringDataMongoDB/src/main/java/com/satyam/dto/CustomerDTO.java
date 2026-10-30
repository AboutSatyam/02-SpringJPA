package com.satyam.dto;

import lombok.Data;

@Data
public class CustomerDTO {
    private String id;
    private Integer custNo;
    private String name;
    private String city;

    public CustomerDTO() {
    }

    public CustomerDTO(String id, Integer custNo, String name, String city) {
        this.id = id;
        this.custNo = custNo;
        this.name = name;
        this.city = city;
    }
}

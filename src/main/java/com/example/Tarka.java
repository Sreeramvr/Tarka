package com.example;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tarka {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sl_no;
    private String employee_name;


    // Getters and setters

    public Long getId() {
        return sl_no;
    }

    public void setId(Long id) {
        this.sl_no = id;
    }

    public String getName() {
        return employee_name;
    }

    public void setName(String name) {
        this.employee_name = name;
    }


}
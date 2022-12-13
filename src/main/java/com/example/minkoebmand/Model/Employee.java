package com.example.minkoebmand.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastname;
    private int phoneNumber;
    private String email;
    private Date dateOfBirth;

    public Employee() {}

    public Employee(String firstName, String lastname, int phoneNumber, String email, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }
}


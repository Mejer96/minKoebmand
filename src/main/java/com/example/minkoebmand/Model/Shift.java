package com.example.minkoebmand.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;

@Getter
@Setter
@Entity
// user task 1.3
public class Shift {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date;
    private String shiftStartTime;
    private String shiftEndTime;
    private int weekNumber;
    private String weekDay;
    @Transient
    private String employeeFirstName;
    @Transient
    private String employeeLastname;
    @ManyToOne
    private Employee employee;



    public Shift() {}

    public Shift(Date date, String shiftStartTime, String shiftEndTime, int weekNumber) {
        System.out.println(shiftEndTime);
        this.date = date;
        this.shiftStartTime = shiftStartTime;
        this.shiftEndTime = shiftEndTime;
        this.weekNumber = weekNumber;

    }
}

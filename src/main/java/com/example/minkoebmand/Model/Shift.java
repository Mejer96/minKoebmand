package com.example.minkoebmand.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;

@Getter
@Setter
@Entity
public class Shift {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date;
    private Time shiftStartTime;
    private Time shiftEndTime;
    private int weekNumber;
    @Transient
    private String employeeName;
    @ManyToOne
    private Employee employee;



    public Shift() {}

    public Shift(Date date, Time shiftStartTime, Time shiftEndTime, int weekNumber, String employeeName) {
        this.date = date;
        this.shiftStartTime = shiftStartTime;
        this.shiftEndTime = shiftEndTime;
        this.weekNumber = weekNumber;
        this.employeeName = employeeName;
    }
}

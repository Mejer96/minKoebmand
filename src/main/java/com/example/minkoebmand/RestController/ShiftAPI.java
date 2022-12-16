package com.example.minkoebmand.RestController;

import com.example.minkoebmand.Model.Employee;
import com.example.minkoebmand.Model.Shift;
import com.example.minkoebmand.Service.EmployeeService;
import com.example.minkoebmand.Service.ShiftService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;
import java.util.Set;

@RestController
// user task 2.3 and 1.2
public class ShiftAPI {
    private ShiftService shiftService;
    private EmployeeService employeeService;

    public ShiftAPI(ShiftService shiftService, EmployeeService employeeService) {
        this.shiftService = shiftService;
        this.employeeService = employeeService;
    }


    // user task 2.3
    @PostMapping("/get-shifts-by-week-api/{weekNumber}")
    public ResponseEntity<Set<Shift>> getShiftsByWeekFromRepository(@PathVariable("weekNumber") int weekNumber) {
        Set<Shift> shifts = shiftService.findShiftsByWeekNumber(weekNumber);
        return new ResponseEntity<>(shifts, HttpStatus.OK);
    }

    // user task 2.3
    @PostMapping("/get-shift-by-date-api/{date}")
    public ResponseEntity<Set<Shift>> getShiftsByDateFromRepository(@PathVariable("date") Date date) {
        Set<Shift> shifts = shiftService.findShiftsByDate(date);
        return new ResponseEntity<>(shifts, HttpStatus.OK);
    }


    // user task 1.2
    @PostMapping("/save-shift-api")
    public ResponseEntity<Shift> saveShiftToRepository(@RequestBody Shift shift) {
        Employee employee = employeeService.findByFirstNameAndLastname(shift.getEmployeeFirstName(), shift.getEmployeeLastname());
        shift.setEmployee(employee);
        int weekday = shiftService.getDayFromDateObject(shift.getDate());
        String weekdayString = shiftService.defineWeekdayByNumber(weekday);
        shift.setWeekDay(weekdayString);
        shiftService.save(shift);

        return new ResponseEntity<>(shift, HttpStatus.OK);
    }

}

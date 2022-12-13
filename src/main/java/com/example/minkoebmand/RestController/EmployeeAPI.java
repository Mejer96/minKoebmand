package com.example.minkoebmand.RestController;

import com.example.minkoebmand.Model.Employee;
import com.example.minkoebmand.Service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeAPI {
   private EmployeeService employeeService;

    public EmployeeAPI(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/get-employees-api")
    public ResponseEntity<ArrayList> getEmployeesFromRepository() {

        return new ResponseEntity<>(employeeService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/save-employee-api")
    public ResponseEntity<Employee> saveEmployeeToRepository(@RequestBody Employee employee) {
        employeeService.save(employee);

        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PostMapping("/update-employee-api")
    public void updateEmployeeRepository(@RequestBody Employee employee) {
        employeeService.
    }
}


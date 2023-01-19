package com.example.minkoebmand.RestController;

import com.example.minkoebmand.Model.Employee;
import com.example.minkoebmand.Service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Set;

// user tasks 5.2 and 4.2
@RestController
public class EmployeeAPI {
   private EmployeeService employeeService;

    public EmployeeAPI(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // user task 5.2
    @GetMapping("/show-employee/{id}/api")
    public ResponseEntity<Employee> getEmployeeByID(@PathVariable("id") long id) {
        Employee employee = null;
        if (employeeService.findById(id).isPresent()) {
            employee = employeeService.findById(id).get();
        }
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    // 5.2
    @CrossOrigin
    @GetMapping("/show-all-employees-api")
    public ResponseEntity<Set<Employee>> getAllEmployees() {
        Set<Employee> set = employeeService.findAll();
        return new ResponseEntity<>(set, HttpStatus.OK);
    }

    // user task 4.2
    @CrossOrigin
    @PostMapping("/save-employee-api")
    public ResponseEntity<Employee> saveEmployeeToRepository(@RequestBody Employee employee) {
        System.out.println("save-api");
        System.out.println(employee.getFirstName());
        employeeService.save(employee);

        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    // user task 5.2
    @CrossOrigin
    @PostMapping("/update-employee-api")
    public void updateEmployeeRepository(@RequestBody Employee employee) {

    }
}


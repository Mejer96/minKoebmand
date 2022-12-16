package com.example.minkoebmand.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class EmployeeController {

    // user task 5.2
    @GetMapping("/show-employee/{id}")
    public String requestShowEmployeePage(@PathVariable("id") long id) {
        return "modify-employee";
    }

    // user task 5.2
    @GetMapping("/show-all-employees")
    public String requestShowAllEmployeesPage() {
        return "employee-overview";
    }

    // user task 4.1
    @GetMapping("/create-employee")
    public String requestCreateEmployeePage() {
        return "create-employee";
    }
}

package com.example.minkoebmand.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping("/show-employee")
    public String requestShowEmployeePage() {
        return "show-employee";
    }

    @GetMapping("/show-all-employees")
    public String requestShowAllEmployeesPage() {
        return "show-all-employees";
    }

    @GetMapping("/create-employee")
    public String requestCreateEmployeePage() {
        return "create-employee";
    }




}

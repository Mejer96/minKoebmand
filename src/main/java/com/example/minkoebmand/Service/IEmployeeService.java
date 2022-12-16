package com.example.minkoebmand.Service;

import com.example.minkoebmand.Model.Employee;

// user task 4.3 and 5.2
public interface IEmployeeService extends ICRUDService<Employee, Long> {

    Employee findByFirstNameAndLastname(String firstName, String lastname);

}

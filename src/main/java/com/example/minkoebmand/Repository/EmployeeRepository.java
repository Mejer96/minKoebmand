package com.example.minkoebmand.Repository;

import com.example.minkoebmand.Model.Employee;
import org.springframework.data.repository.CrudRepository;

// user task 4.3
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    Employee findByFirstNameAndLastname(String firstName, String lastname);

}

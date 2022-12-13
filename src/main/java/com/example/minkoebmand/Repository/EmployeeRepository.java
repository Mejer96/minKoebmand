package com.example.minkoebmand.Repository;

import com.example.minkoebmand.Model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}

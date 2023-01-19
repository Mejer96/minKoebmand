package com.example.minkoebmand.Service;

import com.example.minkoebmand.Model.Employee;
import com.example.minkoebmand.Repository.EmployeeRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.*;

@Getter
@Setter
@Service
// user task 5.2, 4.2
public class EmployeeService implements IEmployeeService{
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // user task 5.2
    @Override
    public Employee findByFirstNameAndLastname(String firstName, String lastname) {

        return employeeRepository.findByFirstNameAndLastname(firstName, lastname);
    }

    // user task 5.2
    @Override
    public Set<Employee> findAll() {
        Set<Employee> set = new HashSet<>();
        employeeRepository.findAll().forEach(set::add);
        return set;
    }

    // user task 4.2
    @Override
    public Employee save(Employee object) {

        return employeeRepository.save(object);
    }

    // user task 5.2
    @Override
    public void delete(Employee object) {
        employeeRepository.delete(object);
    }

    // user task 5.2
    @Override
    public void deleteByID(Long aLong) {

    }

    // user task 5.2
    @Override
    public Optional<Employee> findById(Long aLong) {
        return employeeRepository.findById(aLong);
    }
}

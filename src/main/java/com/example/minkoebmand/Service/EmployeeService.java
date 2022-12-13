package com.example.minkoebmand.Service;

import com.example.minkoebmand.Model.Employee;
import com.example.minkoebmand.Repository.EmployeeRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Getter
@Setter
@Service
public class EmployeeService implements IEmployeeService{
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public ArrayList<Employee> findAll() {
        return null;
    }

    @Override
    public Employee save(Employee object) {
        return null;
    }

    @Override
    public void delete(Employee object) {

    }

    @Override
    public void deleteByID(Long aLong) {

    }

    @Override
    public Optional<Employee> findById() {
        return Optional.empty();
    }
}

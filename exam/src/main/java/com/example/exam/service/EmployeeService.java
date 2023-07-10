package com.example.exam.service;


import com.example.exam.model.Employee;
import com.example.exam.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee createEmployee(Employee employee) {
        // Perform any additional validation or business logic before saving
        return employeeRepository.save(employee);
    }

    public Iterable<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }
}

package com.example.exam.repository;


import com.example.exam.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    // Define custom queries or use default methods from CrudRepository
}

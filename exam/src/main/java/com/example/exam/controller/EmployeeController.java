package com.example.exam.controller;


import com.example.exam.model.Employee;
import com.example.exam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public ModelAndView showEmployees(Model model) {
        Iterable<Employee> employees = employeeService.findAllEmployees();
        model.addAttribute("employees", employees);
        return new ModelAndView("employees");
    }

    @PostMapping("/createEmployee")
    public String createEmployee(Employee employee) {
        employeeService.createEmployee(employee);
        return "redirect:/employees";
    }
}


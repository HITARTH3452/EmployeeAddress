package com.geekster.Emplote.controller;

import com.geekster.Emplote.models.Address;
import com.geekster.Emplote.models.Employee;
import com.geekster.Emplote.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("getAllEmployee")
    public Iterable<Employee> getAllEmployee(){
        return employeeService.getAll();
    }

    @GetMapping("getEmployeeById/{id}")
    public Employee getById(Long id){
        return employeeService.getById(id);
    }
    @PostMapping("addEmployee")
    public String addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @PutMapping("updateEmployee/{id}/{Employee}")
    public Employee updateEmployee(@PathVariable Long id, @PathVariable Employee employee){
        return employeeService.updateEmployee(id,employee);
    }

    @DeleteMapping("deleteEmployee/{id}")
    public String deleteById(@PathVariable Long id){
        return employeeService.deleteById(id);
    }

}

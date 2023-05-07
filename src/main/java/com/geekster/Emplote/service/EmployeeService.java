package com.geekster.Emplote.service;

import com.geekster.Emplote.EmployeeRepo.IEmloyeeRepo;
import com.geekster.Emplote.models.Address;
import com.geekster.Emplote.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    IEmloyeeRepo employeeRepo;
    public Iterable<Employee> getAll() {
       return employeeRepo.findAll();
    }

    public Employee getById(Long id) {
        return employeeRepo.findById(id).get();
    }

    public String addEmployee(Employee employee) {
        employeeRepo.save(employee);
        return "added";
    }

    public Employee updateEmployee(Long id, Employee employee) {
       employeeRepo.deleteById(id);
       employeeRepo.save(employee);
        Employee employee1 = employeeRepo.findById(id).get();
        return employee1;
    }

    public String deleteById(Long id) {
        employeeRepo.deleteById(id);
        return "deleted";
    }
}

package com.geekster.Emplote.EmployeeRepo;

import com.geekster.Emplote.models.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmloyeeRepo extends CrudRepository<Employee,Long>{


}

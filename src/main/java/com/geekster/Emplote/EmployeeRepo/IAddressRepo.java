package com.geekster.Emplote.EmployeeRepo;

import com.geekster.Emplote.models.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.kotlin.CoroutineCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends CrudRepository<Address,Long> {


}

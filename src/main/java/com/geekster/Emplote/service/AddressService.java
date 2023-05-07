package com.geekster.Emplote.service;

import com.geekster.Emplote.EmployeeRepo.IAddressRepo;
import com.geekster.Emplote.models.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;
    public Iterable<Address> getAll() {
         return addressRepo.findAll();
    }

    public Address getById(Long id) {
        Address byId = addressRepo.findById(id).get();
        return byId;
    }

    public String addAddress(List<Address> addresses) {
        addressRepo.saveAll(addresses);
        return "added";
    }

    public Address updateAddress(Long id, Address address) {
       addressRepo.deleteById(id);
       addressRepo.save(address);
        Address address1 = addressRepo.findById(id).get();
        return address1;
    }

    public String deleteById(Long id) {
        addressRepo.deleteById(id);
        return "deleted";
    }
}

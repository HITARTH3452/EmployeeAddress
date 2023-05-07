package com.geekster.Emplote.controller;

import com.geekster.Emplote.models.Address;
import com.geekster.Emplote.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/Address")
public class AddressController {

    @Autowired
    AddressService addressService;

   @GetMapping("/getAll")
    public Iterable<Address> getAll(){
      return addressService.getAll();
   }

   @GetMapping("getById/{id}")
    public Address getById(@PathVariable Long id){
       return addressService.getById(id);
   }

   @PostMapping("addAddress")
    public String addAddress(@RequestBody List<Address> addresses){
       return addressService.addAddress(addresses);
   }

   @PutMapping("updateAddress/{id}/{address}")
    public Address updateAddress(@PathVariable Long id, @PathVariable Address address){
       return addressService.updateAddress(id,address);
   }

   @DeleteMapping("deleteAddress/{id}")
    public String deleteById(@PathVariable Long id){
       return addressService.deleteById(id);
   }
}

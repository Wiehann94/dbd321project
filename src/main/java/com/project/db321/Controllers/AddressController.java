package com.project.db321.Controllers;

import com.project.db321.Entities.Address;
import com.project.db321.Repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200" , allowedHeaders = "*")
public class AddressController {

    @Autowired
    AddressRepository addressRepository;

    // Get all
    // Get by ID
    // Create New
    // Update old
    // Delete

    @GetMapping("/addresses")
    public List<Address> getAddresses(){
        return (List<Address>) addressRepository.findAll();
    }

    @GetMapping("/address/{id}")
    public Optional<Address> getAddress(@PathVariable String id){
        return addressRepository.findById(Long.valueOf(id));
    }

    @PostMapping("/address")
    public Address createAddress(Address address){
        return addressRepository.save(address);
    }

    @PutMapping("/address")
    public Address updateAddress(Address address){
        return addressRepository.save(address);
    }

    @DeleteMapping("/address/{id}")
    public void deleteAddress(@PathVariable String id) {
        addressRepository.deleteById(Long.valueOf(id));
    }
}

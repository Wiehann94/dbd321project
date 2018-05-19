package com.project.db321.Controllers;

import com.project.db321.Entities.Customer;
import com.project.db321.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200" , allowedHeaders = "*")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    // Get all
    // Get by ID
    // Create New
    // Update old
    // Delete

    @GetMapping("/customers")
    public List<Customer> getCustomers(){
        return (List<Customer>) customerRepository.findAll();
    }

    @GetMapping("/customer/{id}")
    public Optional<Customer> getCustomer(@PathVariable String id){
        return customerRepository.findById(Long.valueOf(id));
    }

    @PostMapping("/customer")
    public Customer createCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    @PutMapping("/customer")
    public Customer updatCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    @DeleteMapping("/customer/{id}")
    public boolean deleteCustomer(@PathVariable Long id) {
        customerRepository.deleteById(id);
        return true;
    }

}

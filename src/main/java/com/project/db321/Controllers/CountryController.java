package com.project.db321.Controllers;

import com.project.db321.Entities.Country;
import com.project.db321.Repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200" , allowedHeaders = "*")
public class CountryController {

    @Autowired
    CountryRepository countryRepository;

    // Get all
    // Get by ID
    // Create New
    // Update old
    // Delete

    @GetMapping("/countries")
    public List<Country> getCountries(){
        return (List<Country>) countryRepository.findAll();
    }

    @GetMapping("/country/{id}")
    public Optional<Country> getCountry(@PathVariable String id){
        return countryRepository.findById(Long.valueOf(id));
    }

    @PostMapping("/country")
    public Country createCountry(Country country){
        return countryRepository.save(country);
    }

    @PutMapping("/country")
    public Country updateCountry(Country country){
        return countryRepository.save(country);
    }

    @DeleteMapping("/country/{id}")
    public boolean deleteCountry(@PathVariable Long id) {
        countryRepository.deleteById(id);
        return true;
    }


}

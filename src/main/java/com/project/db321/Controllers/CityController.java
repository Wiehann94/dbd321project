package com.project.db321.Controllers;

import com.project.db321.Entities.City;
import com.project.db321.Repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200" , allowedHeaders = "*")
public class CityController {

    @Autowired
    CityRepository cityRepository;

    // Get all
    // Get by ID
    // Create New
    // Update old
    // Delete

    @GetMapping("/cities")
    public List<City> getCitiess(){
        return (List<City>) cityRepository.findAll();
    }

    @GetMapping("/city/{id}")
    public Optional<City> getCity(@PathVariable String id){
        return cityRepository.findById(Long.valueOf(id));
    }

    @PostMapping("/city")
    public City createCity(City city){
        return cityRepository.save(city);
    }

    @PutMapping("/city")
    public City updateCity(City city){
        return cityRepository.save(city);
    }

    @DeleteMapping("/city/{id}")
    public boolean deleteCity(@PathVariable Long id) {

        cityRepository.deleteById(id);
        return true;
    }


}

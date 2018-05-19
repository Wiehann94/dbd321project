package com.project.db321;

        import com.project.db321.Entities.Address;
        import com.project.db321.Entities.City;
        import com.project.db321.Entities.Country;
        import com.project.db321.Entities.Customer;
        import com.project.db321.Repositories.AddressRepository;
        import com.project.db321.Repositories.CityRepository;
        import com.project.db321.Repositories.CountryRepository;
        import com.project.db321.Repositories.CustomerRepository;
        import com.project.db321.generateData.dataGenerator;
        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.CommandLineRunner;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;

        import java.sql.Timestamp;

@SpringBootApplication
public class Db321Application implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(Db321Application.class);

    @Autowired
    AddressRepository addressRepository;
    @Autowired
    CityRepository cityRepository;
    @Autowired
    CountryRepository countryRepository;
    @Autowired
    CustomerRepository customerRepository;

    dataGenerator dataGenerator = new dataGenerator();

    public static void main(String[] args) {
        SpringApplication.run(Db321Application.class, args);
    }

    @Override
    public void run(String[] args) {
        Timestamp time = new Timestamp(System.currentTimeMillis());

        for (Long i=1L; i<=100L; i++) {
//            //country
//            //countryRepository.save(new Country(i,dataGenerator.countryNameGenerator(),time));
//
            countryRepository.save(new Country(i, "South Africa", time));
        }
            //            //city
//           // cityRepository.save(new City(i,"Pretoria :" + i, time, i));
//            //address
//            addressRepository.save(new Address( i, "60 green road :" + i, "Annlin" + i, 1820L + i, 011123600L+ i, time, i));
//            //cust
//
//            //customerRepository.save(new Customer(i, dataGenerator.customerFirstAndLastNames(), dataGenerator.customerFirstAndLastNames(),dataGenerator.emailGenerator().toString(), "F",i));
//            customerRepository.save(new Customer(i,"Wiehann :", "Vermaak :","W"+ i +"@email.com", "F",i));
//        }
//        for (Long i=1L; i<=10; i++) {
//
//            cityRepository.save(new City(i,"Pretoria :" + i, time, i));
//        }


//        for (Long i=1L; i<=10; i++){
//            countryRepository.save(new Country(i++,dataGenerator.countryNameGenerator(),time));
//
//           // cityRepository.save(new City(i,dataGenerator.cityNameGenerator(),time,i));
//
//        }
    }
}

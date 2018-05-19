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
        import org.hibernate.HibernateException;
        import org.junit.Test;
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

        for (Long i=1L; i<=10; i++) {
            try {
                countryRepository.save(new Country(dataGenerator.countryNameGenerator(),time));

                cityRepository.save(new City(dataGenerator.cityNameGenerator(),time,i));

                addressRepository.save(new Address(dataGenerator.cityNameGenerator(),
                        dataGenerator.suburbGenerator(),
                        dataGenerator.postalCodeGenerator(),i++,time,i));

            customerRepository.save(new Customer(dataGenerator.customerFirstGenerator(),
                    dataGenerator.customerLastNameGenerator(),dataGenerator.emailGenerator(),
                    dataGenerator.activeStatusGenerator(),i));


                LOGGER.info(i.toString());
            }
            catch(HibernateException e)
            {
                LOGGER.info(e.toString());
            }
        }
    }
    @Test
    public void testtest()
    {
        Timestamp time = new Timestamp(System.currentTimeMillis());
        for (Long i=1L; i<=10; i++) {


            System.out.println(new Address(dataGenerator.cityNameGenerator(),
                    dataGenerator.suburbGenerator(),
                    dataGenerator.postalCodeGenerator(), i++, time, i));

        }



    }
}

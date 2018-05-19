package com.project.db321.generateData;

import com.project.db321.Enums.*;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class dataGenerator {

    private static final Logger LOGGER = LoggerFactory.getLogger(dataGenerator.class);

    private static final countryNames[] countryNamesArray = countryNames.values();
    private static final customerNames[] customerNamesArray = customerNames.values();
    private static final lastNames[] lastNamesArray = lastNames.values();
    private static final active[] activeArray = active.values();
    private static final cityNames[] cityNamesArray = cityNames.values();
    private static final suburbs[] suburbNamesArray = suburbs.values();

    private static final int countrySIZE = countryNamesArray.length;
    private static final int customerNameSIZE = customerNamesArray.length;
    private static final int lastNameSIZE = lastNamesArray.length;
    private static final int activeSIZE = activeArray.length;
    private static final int cityNamesSIZE = cityNamesArray.length;
    private static final int suburbSIZE = suburbNamesArray.length;

    private static final Random RANDOM = new Random();


    public static countryNames getRandomCountry()  {
        return countryNamesArray[RANDOM.nextInt(countrySIZE)];
    }
    public static customerNames getRandomFirstName()  {
        return customerNamesArray[RANDOM.nextInt(customerNameSIZE)];
    }
    public static lastNames getRandomLastName()  {
        return lastNamesArray[RANDOM.nextInt(lastNameSIZE)];
    }
    public static active getActiveStatus(){ return  activeArray[RANDOM.nextInt(activeSIZE)];}
    public static cityNames getCityName(){ return  cityNamesArray[RANDOM.nextInt(cityNamesSIZE)];}
    public static suburbs getSuburbName(){ return  suburbNamesArray[RANDOM.nextInt(suburbSIZE)];}



    //TODO - Country
    public String countryNameGenerator() {
        return getRandomCountry().toString();
    }


    //TODO - Customer Details
    public String customerFirstGenerator() {
        return getRandomFirstName().toString();
    }
    public String customerLastNameGenerator(){
        return getRandomLastName().toString();
    }
    public String emailGenerator() {
        return customerFirstGenerator()+customerLastNameGenerator()+"@gmail.com";
    }
    public String activeStatusGenerator(){
        return getActiveStatus().toString();
    }

    //TODO - Address

    public Long postalCodeGenerator(){
        Random r = new Random();
        long  n = r.nextInt(10000) + 1;
        return n;
    }

    //TODO - City
    public String cityNameGenerator() {
        return getCityName().toString();
    }

    public String suburbGenerator(){ return getSuburbName().toString();}

    @Test
    public void postalCodeGenerator2(){

        Random r = new Random();
        long  n = r.nextInt(10000) + 1;
        System.out.println(n);

    }


}




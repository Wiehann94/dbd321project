package com.project.db321.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Country {

    @Id
    @GeneratedValue
    private Long country_Id;

    private String country_Name;
    private Timestamp last_Update;


    public Country(){

    }

    public Country(Long country_Id, String country_Name, Timestamp last_Update) {
        this.country_Id = country_Id;
        this.country_Name = country_Name;
        this.last_Update = last_Update;
    }

    public Country( String country_Name, Timestamp last_Update) {
        this.country_Name = country_Name;
        this.last_Update = last_Update;
    }

    public Long getCountry_Id() {
        return country_Id;
    }
    public void setCountry_Id(Long country_Id) {
        this.country_Id = country_Id;
    }

    public String getCountry_Name() {
        return country_Name;
    }
    public void setCountry_Name(String country_Name) {
        this.country_Name = country_Name;
    }

    public Timestamp getLast_Update() {
        return last_Update;
    }
    public void setLast_Update(Timestamp last_Update) {
        this.last_Update = last_Update;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(country_Id, country.country_Id) &&
                Objects.equals(country_Name, country.country_Name) &&
                Objects.equals(last_Update, country.last_Update);
    }

    @Override
    public int hashCode() {

        return Objects.hash(country_Id, country_Name, last_Update);
    }

    @Override
    public String toString() {
        return "Country{" +
                "country_Id=" + country_Id +
                ", country_Name='" + country_Name + '\'' +
                ", last_Update=" + last_Update +
                '}';
    }
}


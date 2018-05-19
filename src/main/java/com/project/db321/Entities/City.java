package com.project.db321.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class City {

    @Id
    @GeneratedValue
    private Long city_Id;

    private String city_Name;
    private Timestamp last_Update;
    private Long country_Id;

    public City() {

    }

    public City(Long city_Id, String city_Name, Timestamp last_Update, Long country_Id) {
        this.city_Id = city_Id;
        this.city_Name = city_Name;
        this.last_Update = last_Update;
        this.country_Id = country_Id;
    }

    public Long getCity_Id() {
        return city_Id;
    }
    public void setCity_Id(Long city_Id) {
        this.city_Id = city_Id;
    }

    public String getCity_Name() {
        return city_Name;
    }
    public void setCity_Name(String city_Name) {
        this.city_Name = city_Name;
    }

    public Timestamp getLast_Update() {
        return last_Update;
    }
    public void setLast_Update(Timestamp last_Update) {
        this.last_Update = last_Update;
    }

    public Long getCountry_Id() {
        return country_Id;
    }
    public void setCountry_Id(Long country_Id) {
        this.country_Id = country_Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(city_Id, city.city_Id) &&
                Objects.equals(city_Name, city.city_Name) &&
                Objects.equals(last_Update, city.last_Update) &&
                Objects.equals(country_Id, city.country_Id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(city_Id, city_Name, last_Update, country_Id);
    }

    @Override
    public String toString() {
        return "City{" +
                "city_Id=" + city_Id +
                ", city_Name='" + city_Name + '\'' +
                ", last_Update=" + last_Update +
                ", country_Id=" + country_Id +
                '}';
    }
}

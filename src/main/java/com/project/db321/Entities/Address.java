package com.project.db321.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Address {

    @Id
    @GeneratedValue
    private Long address_Id;

    private String address;
    private String Suburb;
    private Long postal_Code;
    private Long phone_No;
    private Timestamp last_Update;
    private Long city_Id;

    public Address( ){

    }

    public Address(Long address_Id, String address, String suburb, Long postal_Code, Long phoneNo, Timestamp last_Update, Long city_Id) {
        this.address_Id = address_Id;
        this.address = address;
        Suburb = suburb;
        this.postal_Code = postal_Code;
        this.phone_No = phoneNo;
        this.last_Update = last_Update;
        this.city_Id = city_Id;
    }

    public Address( String address, String suburb, Long postal_Code, Long phoneNo, Timestamp last_Update, Long city_Id) {
        this.address = address;
        Suburb = suburb;
        this.postal_Code = postal_Code;
        this.phone_No = phoneNo;
        this.last_Update = last_Update;
        this.city_Id = city_Id;
    }

    public Long getAddress_Id() {
        return address_Id;
    }
    public void setAddress_Id(Long address_Id) {
        this.address_Id = address_Id;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getSuburb() {
        return Suburb;
    }
    public void setSuburb(String suburb) {
        Suburb = suburb;
    }

    public Long getPostal_Code() {
        return postal_Code;
    }
    public void setPostal_Code(Long postal_Code) {
        this.postal_Code = postal_Code;
    }

    public Long getPhoneNo() {
        return phone_No;
    }
    public void setPhoneNo(Long phoneNo) {
        this.phone_No = phoneNo;
    }

    public Timestamp getLast_Update() {
        return last_Update;
    }
    public void setLast_Update(Timestamp last_Update) {
        this.last_Update = last_Update;
    }

    public Long getCity_Id() {
        return city_Id;
    }
    public void setCity_Id(Long city_Id) {
        this.city_Id = city_Id;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address_Id=" + address_Id +
                ", address='" + address + '\'' +
                ", Suburb='" + Suburb + '\'' +
                ", postal_Code=" + postal_Code +
                ", phoneNo=" + phone_No +
                ", last_Update=" + last_Update +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address1 = (Address) o;
        return Objects.equals(address_Id, address1.address_Id) &&
                Objects.equals(address, address1.address) &&
                Objects.equals(Suburb, address1.Suburb) &&
                Objects.equals(postal_Code, address1.postal_Code) &&
                Objects.equals(phone_No, address1.phone_No) &&
                Objects.equals(last_Update, address1.last_Update);
    }

    @Override
    public int hashCode() {

        return Objects.hash(address_Id, address, Suburb, postal_Code, phone_No, last_Update);
    }
}

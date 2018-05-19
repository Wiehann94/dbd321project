package com.project.db321.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Long customer_Id;

    private String first_Name;
    private String last_Name;
    private String email;
    private String active;
    private Long address_Id;

    public Customer() {

    }

    public Customer(Long customer_Id, String first_Name, String last_Name, String email, String active, Long address_Id) {
        this.customer_Id = customer_Id;
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.email = email;
        this.active = active;
        this.address_Id = address_Id;
    }

    public Long getCustomer_Id() {
        return customer_Id;
    }
    public void setCustomer_Id(Long customer_Id) {
        this.customer_Id = customer_Id;
    }

    public String getFirst_Name() {
        return first_Name;
    }
    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }
    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String isActive() {
        return active;
    }
    public void setActive(String active) {
        this.active = active;
    }

    public Long getAddress_Id() {
        return address_Id;
    }
    public void setAddress_Id(Long address_Id) {
        this.address_Id = address_Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return active == customer.active &&
                Objects.equals(customer_Id, customer.customer_Id) &&
                Objects.equals(first_Name, customer.first_Name) &&
                Objects.equals(last_Name, customer.last_Name) &&
                Objects.equals(email, customer.email) &&
                Objects.equals(address_Id, customer.address_Id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(customer_Id, first_Name, last_Name, email, active, address_Id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_Id=" + customer_Id +
                ", first_Name='" + first_Name + '\'' +
                ", last_Name='" + last_Name + '\'' +
                ", email='" + email + '\'' +
                ", active=" + active +
                ", address_Id=" + address_Id +
                '}';
    }
}


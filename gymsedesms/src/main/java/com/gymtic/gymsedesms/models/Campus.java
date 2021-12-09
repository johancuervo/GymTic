package com.gymtic.gymsedesms.models;

import org.springframework.data.annotation.Id;

public class Campus {
    @Id
    private String name;
    private String address;
    private String city;
    private  Integer capacity;

    public Campus(String name, String address, String city) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.capacity=capacity;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}


package com.vehicle.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serialNumber;

    private String name;

    private String brand;

    private String cc;

    private Integer tankCapacity;

    private Integer mileage;

    private Float price;

    public Vehicle() {
    }

    public Vehicle(Long serialNumber, String name, String brand, String cc, Integer tankCapacity, Integer mileage, Float price) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.brand = brand;
        this.cc = cc;
        this.tankCapacity = tankCapacity;
        this.mileage = mileage;
        this.price = price;
    }

    public Long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public Integer getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(Integer tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(serialNumber, vehicle.serialNumber) && Objects.equals(name, vehicle.name) && Objects.equals(brand, vehicle.brand) && Objects.equals(cc, vehicle.cc) && Objects.equals(tankCapacity, vehicle.tankCapacity) && Objects.equals(mileage, vehicle.mileage) && Objects.equals(price, vehicle.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, name, brand, cc, tankCapacity, mileage, price);
    }
}

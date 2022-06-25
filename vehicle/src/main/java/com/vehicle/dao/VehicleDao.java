package com.vehicle.dao;

import com.vehicle.model.Vehicle;
import com.vehicle.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class VehicleDao implements Dao<Vehicle> {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public List<Vehicle> getAll() {
        return vehicleRepository.findAll();
    }

    @Override
    public Optional<Vehicle> get(long id) {
        return vehicleRepository.findById(id);
    }

    @Override
    public Vehicle save(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle update(Vehicle vehicle) {
        Vehicle updatedVehicle = vehicleRepository.getReferenceById(vehicle.getSerialNumber());
        updatedVehicle.setBrand(vehicle.getBrand());
        updatedVehicle.setCc(vehicle.getCc());
        updatedVehicle.setMileage(vehicle.getMileage());
        updatedVehicle.setName(vehicle.getName());
        updatedVehicle.setTankCapacity(vehicle.getTankCapacity());
        return vehicleRepository.save(updatedVehicle);
    }

    @Override
    public void delete(long id) {
        vehicleRepository.deleteById(id);
    }
}

package com.vehicle.controller;

import com.vehicle.dao.VehicleDao;
import com.vehicle.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/vehicle")
public class VehicleController {

    @Autowired
    private VehicleDao vehicleDao;

    @GetMapping("/")
    public String home(){
        return "Vehicle Service";
    }

    @GetMapping("/all")
    public List<Vehicle> getAllVehicles(){
        return vehicleDao.getAll();
    }

    @GetMapping("/{vehicleId}")
    public Optional<Vehicle> getVehicleById(@PathVariable Long vehicleId){
        return vehicleDao.get(vehicleId);
    }

    @PostMapping("/create")
    public Vehicle createVehicle(@RequestBody Vehicle vehicle){
        return vehicleDao.save(vehicle);
    }

    @PostMapping("/update")
    public Vehicle updateVehicle(@RequestBody Vehicle vehicle){
        return vehicleDao.update(vehicle);
    }

    @DeleteMapping("/delete/{serialNumber}")
    public void deleteVehicle(@PathVariable Long serialNumber){
        vehicleDao.delete(serialNumber);
    }

}

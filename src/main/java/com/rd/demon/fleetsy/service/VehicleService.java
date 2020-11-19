package com.rd.demon.fleetsy.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Service;

import com.rd.demon.fleetsy.model.Vehicle;
import com.rd.demon.fleetsy.repositories.VehicleRepository;

@Service
public class VehicleService {

    private final VehicleRepository vehicleRepo;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepo = vehicleRepository;
    }

    public Optional<Vehicle> findById(Long vehicleId) {
        return vehicleRepo.findById(vehicleId);
    }

    public List<Object> findByOrganizationId(Long orgId) {
        return StreamSupport.stream(vehicleRepo.findByOrganizationId(orgId).spliterator(), false)
                .collect(Collectors.toList());
    }

}

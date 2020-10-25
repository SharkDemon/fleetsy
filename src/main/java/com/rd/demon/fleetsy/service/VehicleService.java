package com.rd.demon.fleetsy.service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Service;

import com.rd.demon.fleetsy.repositories.VehicleRepository;

@Service
public class VehicleService {

    private final VehicleRepository vehicleRepo;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepo = vehicleRepository;
    }

    public List<Object> findByOrganizationId(UUID orgId) {
        return StreamSupport.stream(vehicleRepo.findByOrganizationId(orgId).spliterator(), false)
                .collect(Collectors.toList());
    }

}

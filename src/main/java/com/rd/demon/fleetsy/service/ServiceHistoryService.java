package com.rd.demon.fleetsy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rd.demon.fleetsy.model.ServiceHistory;
import com.rd.demon.fleetsy.repositories.ServiceHistoryRepository;

@Service
public class ServiceHistoryService {

    @Autowired
    private ServiceHistoryRepository serviceHistoryRepo;

    public List<ServiceHistory> findByVehicleId(Long vehicleId) {
        return serviceHistoryRepo.findByVehicleId(vehicleId);
    }

}

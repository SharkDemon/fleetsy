package com.rd.demon.fleetsy.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.rd.demon.fleetsy.model.ServiceHistory;
import com.rd.demon.fleetsy.repositories.ServiceHistoryRepository;

@Service
public class ServiceHistoryService {

    private final ServiceHistoryRepository serviceHistoryRepo;

    public ServiceHistoryService(ServiceHistoryRepository serviceHistoryRepository) {
        this.serviceHistoryRepo = serviceHistoryRepository;
    }

    public List<ServiceHistory> findByVehicleId(UUID uuid) {
        return serviceHistoryRepo.findByVehicleId(uuid);
    }

}

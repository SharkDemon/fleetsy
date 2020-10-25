package com.rd.demon.fleetsy.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rd.demon.fleetsy.model.ServiceHistory;

@RepositoryRestResource(collectionResourceRel="serviceHistory", path="serviceHistories")
public interface ServiceHistoryRepository extends PagingAndSortingRepository<ServiceHistory, UUID> {

    @Query("SELECT sh FROM service_histories sh WHERE sh.vehicleId = :vehicleId ORDER BY sh.serviceDate DESC")
    List<ServiceHistory> findByVehicleId(UUID vehicleId);

}

package com.rd.demon.fleetsy.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rd.demon.fleetsy.model.Vehicle;

@RepositoryRestResource(collectionResourceRel="vehicle", path="vehicles")
public interface VehicleRepository extends PagingAndSortingRepository<Vehicle, UUID> {

    @Query("SELECT v FROM vehicles v WHERE v.organizationId = :orgId")
    List<Vehicle> findByOrganizationId(UUID orgId);

    Vehicle findByVin(@Param("vin") String vin);

}

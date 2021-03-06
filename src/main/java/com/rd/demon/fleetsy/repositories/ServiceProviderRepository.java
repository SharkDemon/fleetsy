package com.rd.demon.fleetsy.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rd.demon.fleetsy.model.ServiceProvider;

@RepositoryRestResource(collectionResourceRel="serviceProvider", path="serviceProviders")
public interface ServiceProviderRepository extends PagingAndSortingRepository<ServiceProvider, Long> {

    List findByName(@Param("name") String name);

}

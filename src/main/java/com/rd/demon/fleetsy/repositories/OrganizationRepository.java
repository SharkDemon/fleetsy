package com.rd.demon.fleetsy.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rd.demon.fleetsy.model.Organization;

@RepositoryRestResource(collectionResourceRel="organization", path="organizations")
public interface OrganizationRepository extends PagingAndSortingRepository<Organization, UUID> {

    List findByName(@Param("name") String name);

}

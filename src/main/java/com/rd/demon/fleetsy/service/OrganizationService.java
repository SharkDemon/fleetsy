package com.rd.demon.fleetsy.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.rd.demon.fleetsy.model.Organization;
import com.rd.demon.fleetsy.repositories.OrganizationRepository;

@Service
public class OrganizationService {

    private final OrganizationRepository orgRepo;

    private final Sort SORT_BY_NAME_ASC = Sort.by("name").ascending();

    public OrganizationService(OrganizationRepository organizationRepository) {
        this.orgRepo = organizationRepository;
    }

    public List<Object> findAll() {
        return StreamSupport.stream(orgRepo.findAll(SORT_BY_NAME_ASC).spliterator(), false)
                .collect(Collectors.toList());
    }

    public Optional<Organization> findById(Long id) {
        return orgRepo.findById(id);
    }

    public Organization save(Organization organization) {
        return orgRepo.save(organization);
    }

}

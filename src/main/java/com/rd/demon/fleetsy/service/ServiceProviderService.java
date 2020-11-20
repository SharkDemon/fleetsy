package com.rd.demon.fleetsy.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.rd.demon.fleetsy.repositories.ServiceProviderRepository;

@Service
public class ServiceProviderService {

    private final Sort SORT_BY_NAME_ASC = Sort.by("name").ascending();

    @Autowired
    private ServiceProviderRepository providerRepo;

    public List<Object> findAll() {
        return StreamSupport.stream(providerRepo.findAll(SORT_BY_NAME_ASC).spliterator(), false)
                .collect(Collectors.toList());
    }

}

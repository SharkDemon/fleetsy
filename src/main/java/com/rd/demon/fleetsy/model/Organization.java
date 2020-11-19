package com.rd.demon.fleetsy.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="organizations")
@Data
public class Organization {

    @Id @GeneratedValue
    private Long id;
    private UUID uuid;
    private String name;
    private String contact;
    private String email;
}

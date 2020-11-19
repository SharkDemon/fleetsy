package com.rd.demon.fleetsy.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="vehicles")
@Data
public class Vehicle {

    @Id @GeneratedValue
    private Long id;
    private UUID uuid;
    @Column(name="org_id")
    private Long organizationId;
    private String color;
    private String make;
    private String model;
    private String vin;
    private Integer mileage;

}

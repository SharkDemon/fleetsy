package com.rd.demon.fleetsy.model;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="service_histories")
@Data
public class ServiceHistory {

    @Id @GeneratedValue
    private UUID id;
    @Column(name="vehicle_id")
    private UUID vehicleId;
    @Column(name="service_provider_id")
    private UUID serviceProviderId;
    @Column(name="service_date")
    private LocalDateTime serviceDate;
    @Column(name="service_desc")
    private String serviceDesc;
    private Float cost;
    private Integer mileage;

    public java.util.Date getConvertedServiceDate() {
        Instant instant = serviceDate.toInstant(ZoneOffset.UTC);
        return Date.from(instant);
    }

}

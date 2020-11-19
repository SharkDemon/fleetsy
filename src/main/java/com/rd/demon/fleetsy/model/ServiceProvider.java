package com.rd.demon.fleetsy.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="service_providers")
@Data
public class ServiceProvider {

    @Id @GeneratedValue
    private Long id;
    private UUID uuid;
    private String name;
    private String phone;
    private String city;
    private String state;
    private String zip;

    public String getLocation() {
        return String.format("%s, %s %s", city, state, zip);
    }

    // for convenience building google map link, contrived for our data
    public String getLocationSearchFragment() {
        return String.format("%s+%s+%s", city.replace(" ", "+"), state.toUpperCase(), zip);
    }

}

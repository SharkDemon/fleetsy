package com.rd.demon.fleetsy.controller;

import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rd.demon.fleetsy.service.VehicleService;

@Controller
public class FleetController {

    private final VehicleService vehicleService;

    public FleetController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping("/fleet")
    public String showFleetForOrganization(@RequestParam("orgId") UUID orgId, Model model) {

        model.addAttribute("vehicles", vehicleService.findByOrganizationId(orgId));
        return "fleet";
    }

}

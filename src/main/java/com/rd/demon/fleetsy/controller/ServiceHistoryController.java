package com.rd.demon.fleetsy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.rd.demon.fleetsy.model.Organization;
import com.rd.demon.fleetsy.model.Vehicle;
import com.rd.demon.fleetsy.service.ServiceHistoryService;
import com.rd.demon.fleetsy.service.VehicleService;

@Controller
@SessionAttributes({"currentOrg", "currentVehicle"})
public class ServiceHistoryController extends BaseController {

    private final VehicleService vehicleService;
    private final ServiceHistoryService serviceHistoryService;

    public ServiceHistoryController(VehicleService vehicleService, ServiceHistoryService serviceHistoryService) {
        this.vehicleService = vehicleService;
        this.serviceHistoryService = serviceHistoryService;
    }

    @ModelAttribute("currentOrg")
    public Organization currentOrg() {
        return null;
    }
    @ModelAttribute("currentVehicle")
    public Vehicle currentVehicle() {
        return null;
    }

    @GetMapping("/vehicleServiceHistory")
    public String showServiceHistoryForVehicle(
            @RequestParam("vId") Long vehicleId,
            @ModelAttribute("currentOrg") Organization currentOrganization,
            @ModelAttribute("currentVehicle") Vehicle currentVehicle,
            Model model) {

        model.addAttribute("vehicle", vehicleService.findById(vehicleId).get());
        model.addAttribute("serviceHistories", serviceHistoryService.findByVehicleId(vehicleId));
        return "vehicleServiceHistory";
    }

}

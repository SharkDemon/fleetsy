package com.rd.demon.fleetsy.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rd.demon.fleetsy.service.ServiceProviderService;

@Controller
public class ServiceProviderController {

    private final ServiceProviderService providerService;

    public ServiceProviderController(ServiceProviderService serviceProviderService) {
        this.providerService = serviceProviderService;
    }

    @GetMapping("/service-providers")
    public String showServiceProviders(Model model, HttpSession session) {

        model.addAttribute("renderVehiclesLink", null != session.getAttribute("currentOrg"));
        model.addAttribute("serviceProviders", providerService.findAll());
        return "serviceProviders";
    }

}

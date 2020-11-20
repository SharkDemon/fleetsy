package com.rd.demon.fleetsy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.rd.demon.fleetsy.model.AppInfo;
import com.rd.demon.fleetsy.model.Organization;
import com.rd.demon.fleetsy.service.OrganizationService;
import com.rd.demon.fleetsy.service.ServiceHistoryService;
import com.rd.demon.fleetsy.service.ServiceProviderService;
import com.rd.demon.fleetsy.service.VehicleService;

@Controller
@SessionAttributes({"appInfo", "currentOrg"})
@PropertySource("classpath:main.properties")
public class BaseController {

    @Value("${app.title}")
    private String appTitle;
    @Value("${app.hackathon}")
    private String appHackathon;

    @Autowired
    protected OrganizationService orgService;
    @Autowired
    protected VehicleService vehicleService;
    @Autowired
    protected ServiceProviderService providerService;
    @Autowired
    protected ServiceHistoryService serviceHistoryService;

    @ModelAttribute("appInfo")
    public AppInfo applicationInfo() {
        return AppInfo.builder()
                .title(appTitle)
                .hackathon(appHackathon)
                .build();
    }

    @ModelAttribute("currentOrg")
    public Organization currentOrg() {
        return null;
    }

}

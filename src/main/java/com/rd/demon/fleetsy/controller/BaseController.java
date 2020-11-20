package com.rd.demon.fleetsy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.rd.demon.fleetsy.model.AppInfo;
import com.rd.demon.fleetsy.service.OrganizationService;
import com.rd.demon.fleetsy.service.ServiceHistoryService;
import com.rd.demon.fleetsy.service.ServiceProviderService;
import com.rd.demon.fleetsy.service.VehicleService;

@Controller
@SessionAttributes({"appInfo"})
public class BaseController {

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
                .title("Fleetsy")
                .hackathon("Demonhacks 2020")
                .build();
    }

}

package com.rd.demon.fleetsy.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.rd.demon.fleetsy.model.Organization;

@Controller
@SessionAttributes("currentOrg")
public class FleetController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(FleetController.class);

    @GetMapping("/fleet")
    public String showFleetForOrganization(
            @RequestParam(name="orgId") Optional<Long> orgId,
            @ModelAttribute("currentOrg") Organization currentOrganization,
            Model model) {

        if (orgId.isEmpty() && null == currentOrganization) {
            // there is no organization selected, so go to index
            return "index";
        } else if (orgId.isEmpty() && null != currentOrganization) {
            // just use org in session
            model.addAttribute("currentOrg", currentOrganization);
        } else if (orgId.isPresent() && null != currentOrganization && orgId.get().equals(currentOrganization.getId())) {
            // just use org in session
            model.addAttribute("currentOrg", currentOrganization);
        } else {
            // new org specified, so load it
            model.addAttribute("currentOrg", orgService.findById(orgId.get()).get());
        }

        model.addAttribute("vehicles", vehicleService.findByOrganizationId( ((Organization)model.getAttribute("currentOrg")).getId() ));
        return VIEW_FLEET;
    }

}

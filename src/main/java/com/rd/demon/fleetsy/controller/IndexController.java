package com.rd.demon.fleetsy.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rd.demon.fleetsy.service.OrganizationService;

@Controller
public class IndexController {

    private final OrganizationService orgService;

    public IndexController(OrganizationService organizationService) {
        this.orgService = organizationService;
    }

    @GetMapping("/")
    public String showIndex(
            HttpSession session,
            Model model) {

        session.removeAttribute("currentOrg");
        model.addAttribute("orgs", orgService.findAll());
        return "index";
    }

}

package com.rd.demon.fleetsy.controller;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.net.URI;

import javax.servlet.http.HttpServletRequest;

import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rd.demon.fleetsy.model.Organization;
import com.rd.demon.fleetsy.service.OrganizationService;

@RepositoryRestController
public class OrganizationController extends BaseController {

    private final OrganizationService organizationService;

    public OrganizationController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @RequestMapping(method=POST, value="/organizations")
    public @ResponseBody ResponseEntity<?> createOrganization(@RequestBody Organization org, HttpServletRequest req) {
        Organization createdOrg = organizationService.save(org);
        URI createdUri = URI.create(req.getRequestURL().toString() + "/" + createdOrg.getId());
        return ResponseEntity.created(createdUri).body(createdOrg);
    }

}

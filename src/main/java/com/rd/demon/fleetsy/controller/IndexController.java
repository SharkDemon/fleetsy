package com.rd.demon.fleetsy.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @GetMapping("/")
    public String showIndex(
            HttpSession session,
            Model model) {

        session.removeAttribute("currentOrg");
        model.addAttribute("orgs", orgService.findAll());
        return VIEW_INDEX;
    }

}

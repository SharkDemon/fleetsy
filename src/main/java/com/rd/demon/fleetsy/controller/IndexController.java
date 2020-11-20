package com.rd.demon.fleetsy.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController extends BaseController {

    @GetMapping("/")
    public String showIndex(
            HttpSession session,
            Model model) {

        session.removeAttribute("currentOrg");
        model.addAttribute("orgs", orgService.findAll());
        return "index";
    }

}

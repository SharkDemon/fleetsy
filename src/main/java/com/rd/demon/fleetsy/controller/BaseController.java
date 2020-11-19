package com.rd.demon.fleetsy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.rd.demon.fleetsy.model.AppInfo;

@Controller
@SessionAttributes({"appInfo"})
public class BaseController {

    @ModelAttribute("appInfo")
    public AppInfo applicationInfo() {
        return AppInfo.builder()
                .title("Fleetsy")
                .hackathon("Demonhacks 2020")
                .build();
    }


}

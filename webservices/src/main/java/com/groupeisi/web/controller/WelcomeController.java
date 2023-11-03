package com.groupeisi.web.controller;

import com.groupeisi.DepotServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @GetMapping("/welcome")
    public String welcome(){

        DepotServices depotServices = new DepotServices();
        return "welcome";
    }
    @GetMapping("/")
    public String index(){

        return "index";
    }
}

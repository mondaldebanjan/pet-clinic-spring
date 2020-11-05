package com.debanjan.petclinicspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"vets","/vets"})
    public String listVets(){
        return "vets/index";
    }
}

package de.livia.addierer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddiererController {

    @RequestMapping(value = "/addiere")
    public String addiere(){
        return "addiere";
    }
}

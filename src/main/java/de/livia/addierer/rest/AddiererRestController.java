package de.livia.addierer.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/rest")
public class AddiererRestController {

    Logger log = LoggerFactory.getLogger(this.getClass().getName());

    //http://localhost:8181/api/rest/addiere?summand1=3&summand2=4
    @RequestMapping(value = "/hello")
    public String hello(){
        return "Addierer-Service!";
    }

   /* //http://localhost:8181/api/rest/addiere?summand1=3&summand2=4
    @RequestMapping(value = "/addiere", method = RequestMethod.GET)
    public String addiere(@RequestParam(name = "summand1", required = true) String summand1
           , @RequestParam(name = "summand2", required = true) String summand2) {

        return summand1 + " + " + summand2;

    }*/

    //http://localhost:8181/api/rest/addiere?summand1=3&summand2=4
    @RequestMapping(value = "/addiere", method = RequestMethod.GET)
    public double addiere(@RequestParam(name = "summand1", required = true) double summand1
            , @RequestParam(name = "summand2", required = true) double summand2) {

        log.debug("addieren...");
        return summand1 + summand2;
    }

    }

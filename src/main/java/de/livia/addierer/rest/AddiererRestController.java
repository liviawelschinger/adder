package de.livia.addierer.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Handles requests (here total of two numbers) of a client and return the HTTP response
 */
@RestController
@RequestMapping(value = "/api/rest")
public class AddiererRestController {

    Logger log = LoggerFactory.getLogger(this.getClass().getName());

    //http://localhost:8181/api/rest/addiere?summand1=3&summand2=4
    // Annotation @RequestMApping: Map web requests to Spring Controller methods

    /**
     * Give the status that the Service works
     * @return status that the Service works
     */
    @RequestMapping(value = "/hello")
    public String hello(){
        return "Addierer-Service!";
    }


    //http://localhost:8181/api/rest/addiere?summand1=3&summand2=4

    /**
     * Totaling of two numbers
     * @param summand1 summand 1
     * @param summand2 summand 2
     * @return total
     */
    @RequestMapping(value = "/addiere", method = RequestMethod.GET)
    public double addiere(@RequestParam(name = "summand1", required = true) double summand1
            , @RequestParam(name = "summand2", required = true) double summand2) {

        log.debug("addieren...");
        return summand1 + summand2;
    }

    }

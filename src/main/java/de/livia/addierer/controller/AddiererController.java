package de.livia.addierer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Prepares the model map with data, contains the view object (addiere.html)
 */
@Controller
public class AddiererController {

    /*
        In the Spring framework, a Controller is a class which is responsible for preparing a model Map with data to be displayed by the view
        as well as choosing the right view itself. It can also directly write into response stream by using @ResponseBody annotation and complete the request.
        Read more: https://javarevisited.blogspot.com/2017/08/difference-between-restcontroller-and-controller-annotations-spring-mvc-rest.html#ixzz5pUmEv1Z2
     */

    /**
     * Maps the user's request to the service and return the view object "addiere.html"
     * @return
     */
    @RequestMapping(value = "/addiere")
    public String addiere(){
        return "addiere";
    }
}

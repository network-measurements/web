package com.klimalakamil.aurora.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Kamil Klimala on 2017-10-10.
 * klimalakamil@gmail.com
 */

@RestController
public class MeasurementsController {

    @RequestMapping(name = "/measurements", method = RequestMethod.GET)
    public String index(@RequestParam(required = false) String from, @RequestParam(required = false) String to) {
        return "";
    }

    @RequestMapping(name = "/measurements", method = RequestMethod.POST)
    public String create() {
        return "";
    }
}

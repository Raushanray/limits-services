package com.codewithraushan.microservices.limitsservices.controller;

import com.codewithraushan.microservices.limitsservices.bean.Limits;
import com.codewithraushan.microservices.limitsservices.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits retrievelimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
//        return new Limits(1,1000);
    }
}

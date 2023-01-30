package com.codewithraushan.microservices.limitsservices.controller;

import com.codewithraushan.microservices.limitsservices.bean.Limits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @GetMapping("/limits")
    public Limits retrievelimits(){
        return new Limits(1,1000);
    }
}

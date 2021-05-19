package com.celsoaquino.logisticsapi.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CostumerController {

    @GetMapping("/customers")
    public String findAll() {
        return "TEste";
    }
}

package com.devolpay.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Value("${example.greeting}")
    private String greeting;

    @GetMapping("/greeting")
    public String greeting() {
        return greeting;
    }

}

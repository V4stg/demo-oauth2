package com.example.demo;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoAPI {

    @RequestMapping("/user")
    public Principal user(Principal principal) {
        return principal;
    }
}

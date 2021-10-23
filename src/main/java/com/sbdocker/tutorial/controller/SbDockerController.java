package com.sbdocker.tutorial.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SbDockerController {

    @RequestMapping("/")
    public String dockerController() {
        return "Hello there";
    }
}

package com.seogapfinder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class SeoController {
    
    @GetMapping("/compare")
    public String getQuery(@RequestParam String linkOne, @RequestParam String linkTwo) {

        return "My domain: " + linkOne + '\n' + "Competitor: " + linkTwo;
    }


}

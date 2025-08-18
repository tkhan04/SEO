package com.seogapfinder.controller;

import java.io.IO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SeoController {

    @GetMapping("/compare")
    public ComparisonResponse getQuery(@RequestParam String linkOne, @RequestParam String linkTwo)
    {
        
        // append https:// if missing
        if (!linkOne.startsWith("https://")) {
            linkOne = "https://" + linkOne;
        }
        if (!linkTwo.startsWith("https://")) {
            linkTwo = "https://" + linkTwo;
        }

        return new ComparisonResponse(linkOne, linkTwo);
    }

    static class ComparisonResponse {
        private String myDomain;
        private String competitor;

        public ComparisonResponse(String myDomain, String competitor) {
            this.myDomain = myDomain;
            this.competitor = competitor;
        }

        public String getMyDomain() {
            return myDomain;
        }

        public String getCompetitor() {
            return competitor;
        }
    }

    public static void main(String[] args){
        //will have to attatch https// for now BUT will be fixed when actually fetching two links, as i add it myself
        String bruh = IOController.reader("https://www.wikipedia.org/");
        System.out.print(bruh);
    }
}

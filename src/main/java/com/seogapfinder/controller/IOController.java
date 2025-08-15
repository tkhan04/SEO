package com.seogapfinder.controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;;


public class IOController {
 
    public static String reader(String url){  

            String webContents = "Content can't be read. URL is invalid";

        try {
            Document document = Jsoup.connect(url).get();
            return document.toString();


        } catch (Exception e) {
            // TODO: handle exception
        }

        return webContents;
    }


    
}

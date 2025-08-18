package com.seogapfinder.controller;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;;


public class IOController {
 
    public static String reader(String url){  

            String webContents = "Content can't be read. URL is invalid";

        try {
            Document document = Jsoup.connect(url).get();
            webContents = document.title().trim()+'\n';
            webContents += document.text().trim();
            webContents = webContents.trim();

        } catch (IllegalArgumentException e) {
            
            webContents += "\n" + e.getMessage();

        }
        catch(IOException e ){
            webContents += "\n" + e.getMessage();
        }

        return webContents;
    }


    
}

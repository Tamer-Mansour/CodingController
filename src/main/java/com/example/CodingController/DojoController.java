package com.example.CodingController;

import org.springframework.web.bind.annotation.RequestMapping;

public class DojoController {
    @RequestMapping("/dojo")
    public String index(){
        return "The dojo is awesome!";
    }
    @RequestMapping("/burbank-dojo/")
    public String burbank(){
        return "Burbank Dojo is located in Southern California";
    }
    @RequestMapping("/san-jose/")
    public String san(){
        return "'SJ dojo is the headquarters";
    }
}

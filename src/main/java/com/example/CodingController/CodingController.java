package com.example.CodingController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class CodingController {
    @RequestMapping("/coding")
    public String index(){
        return "Hello Coding Dojo!";
    }
    @RequestMapping(value="/coding/python", method= RequestMethod.GET)
    public String python(){
        return "Python/Django was awesome!";
    }
    @RequestMapping("coding/java")
    public String java(){
        return "Java/Spring is better!";
    }
}

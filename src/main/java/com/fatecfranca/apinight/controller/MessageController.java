package com.fatecfranca.apinight.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/message/day/name")
    public String GoodMorning(@PathVariable String name){
        return "Good Morning!" + name;
    }
    
    @GetMapping("/message/afternoon")
    public String GoodAfternoon(@PathVariable String name){
        return "Good Afternoon!" + name;
    }

    @GetMapping("/message/nigh/name")
    public String GoodNight(@PathVariable String name){
        return "Good Night!" + name;
    }

}

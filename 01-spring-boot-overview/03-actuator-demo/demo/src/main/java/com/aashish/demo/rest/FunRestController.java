package com.aashish.demo.rest;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class FunRestController{
    //injecting custom properties
    @Value("${coach.name}")
    private String coachName;
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach: " + coachName;
    }

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    //new endpoint
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run hard 3k!";
    }

    //new endpoint
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day!";
    }
}

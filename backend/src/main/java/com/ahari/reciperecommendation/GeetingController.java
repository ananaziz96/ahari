package com.ahari.reciperecommendation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeetingController {
    @RequestMapping("/")
    public String getGreeting(){
        return "I like pizza";
    }
}

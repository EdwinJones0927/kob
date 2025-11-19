package com.kob.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {
    @GetMapping("/bots")
    public Map<String, String> test(){
        Map<String, String> m = new HashMap<>();
        m.put("name", "Edwin Jones");
        m.put("rating", "999999");
        return m;
    }
}

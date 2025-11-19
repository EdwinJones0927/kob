package com.kob.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {
    @GetMapping("/users")
    public List<String> test(){
        List<String> list = new ArrayList<>();
        list.add("Edwin");
        list.add("Jack");
        list.add("Tommy");
        return list;
    }
}

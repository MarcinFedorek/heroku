package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonAdder {

    private List<String> stringList = new ArrayList<>();

    @RequestMapping("/add")
    public void add(@RequestParam("name") String name) {
        stringList.add(name);
    }

    @RequestMapping("/get")
    public List<String> get(){
        return stringList;
    }




}

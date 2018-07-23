package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonAdder {


    @Autowired
    private PersonRepo personRepo;

    private List<String> stringList = new ArrayList<>();

    @RequestMapping("/add")
    public void add(@RequestParam("name") String name) {

        Person p = new Person();
        p.setName(name);
        stringList.add(name);
    }

    @RequestMapping("/get")
    public List<Person> get(){
        return personRepo.findAll();
    }




}

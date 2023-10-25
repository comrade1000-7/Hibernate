package com.example.demo.controller;

import com.example.demo.entity.Persons;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    //private final HiberRepository repository;

    @Autowired
    PersonRepository personRepository;

    public Controller(PersonRepository repository) {
        this.personRepository = repository;
    }

    @GetMapping("/persons/by-city")
    public List<Persons> getByCityOfLiving(@RequestParam String city) {
        return personRepository.findByCityOfLiving(city);
    }

    @GetMapping("/persons/by-age")
    public List<Persons> getByAgeLessThanOrderByAge(@RequestParam int age) {
        return personRepository.findByAgeLessThanOrderByAge(age);
    }

    @GetMapping("/persons/by-name-surname")
    public List<Persons> getByNameAndSurname(@RequestParam String name, String surname) {
        return personRepository.findByNameAndSurname(name, surname);
    }

}

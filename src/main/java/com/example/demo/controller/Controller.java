package com.example.demo.controller;

import com.example.demo.repository.HiberRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final HiberRepository repository;

    public Controller(HiberRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/persons/by-city")
    public ResponseEntity<?> getPersonByCity(@RequestParam String city) {
        return new ResponseEntity<>(repository.getPersonByCity(city), HttpStatus.OK);
    }

    @GetMapping("/hello")
    public ResponseEntity<?> getPersonByCity() {
        return new ResponseEntity<>("HELLO, WORLD", HttpStatus.OK);
    }

    @GetMapping("/city")
    public ResponseEntity<?> getCity() {
        //String response = String.valueOf(repository.getCity());
        return new ResponseEntity<>("response", HttpStatus.OK);
    }
}

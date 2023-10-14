package com.example.demo;

import com.example.demo.repository.Repository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<?> getPersonByCity(@RequestParam String city) {
        return new ResponseEntity<>(repository.getPersonByCity(city), HttpStatus.OK);
    }
}

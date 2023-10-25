package com.example.demo.repository;

import com.example.demo.entity.Persons;
import com.example.demo.entity.PrimaryKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Persons, PrimaryKey> {
    List<Persons> findByCityOfLiving(String city);

    List<Persons> findByAgeLessThanOrderByAge(int age);

    List<Persons> findByNameAndSurname(String name, String surname);
}

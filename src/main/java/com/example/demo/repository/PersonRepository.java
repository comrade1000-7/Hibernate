package com.example.demo.repository;

import com.example.demo.entity.Persons;
import com.example.demo.entity.PrimaryKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Persons, PrimaryKey> {
    @Query(value = "from Persons where cityOfLiving =?1")
    List<Persons> findByCityOfLiving(String city);

    @Query(value = "from Persons where age <= ?1")
    List<Persons> findByAgeLessThanOrderByAge(int age);

    @Query(value = "from Persons where name = ?1 and surname = ?2")
    List<Persons> findByNameAndSurname(String name, String surname);
}

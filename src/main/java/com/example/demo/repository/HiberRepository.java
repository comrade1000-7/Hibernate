package com.example.demo.repository;

import com.example.demo.entity.Persons;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class Repository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<?> getPersonByCity(String city) {
        Query query = entityManager.createQuery(
                "SELECT persons FROM Persons persons " +
                        "WHERE persons.cityOfLiving = :city", Persons.class);
        query.setParameter("city", city);
        return query.getResultList();
    }

    public List<?> getAll() {
        Query query = entityManager.createQuery(
                "SELECT persons.cityOfLiving FROM Persons persons " +
                        "WHERE persons.cityOfLiving = :city", Persons.class);
        //query.setParameter("city", city);
        return query.getResultList();
    }
}

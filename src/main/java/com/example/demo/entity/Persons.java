package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@IdClass(PrimaryKey.class)
@Table(name = "PERSONS", schema = "app")
public class Persons {

    @Id
    private String name;

    @Id
    private String surname;

    @Id
    private int age;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "city_of_living", nullable = false)
    private String cityOfLiving;
}

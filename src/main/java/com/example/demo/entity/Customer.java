package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "CUSTOMERS", schema = "app")
public class Customer {
    @Id
    private String id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private int age;

    @Column
    private String phoneNumber;

}

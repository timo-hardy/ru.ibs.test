package ru.ibs.test.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personId;
    private String surname;
    private String name;
    private String patronymic;
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDate dateOfBirth;
    private Department department;
}

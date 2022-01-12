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
    @ManyToOne
    @JoinColumn(name = "department_full_name_department")
    private Department department;
}

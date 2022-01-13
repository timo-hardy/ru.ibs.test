package ru.ibs.test.service;

import ru.ibs.test.model.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAll();

    void add(Person person);

    void delete(long id);

    List<Person> findByOrderBySurnameAsc();

    List<Person> findByOrderBySurnameDesc();

}

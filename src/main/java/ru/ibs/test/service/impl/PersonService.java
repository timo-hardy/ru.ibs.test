package ru.ibs.test.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.ibs.test.model.Person;
import ru.ibs.test.repository.PersonRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;

    public List<Person> findAll() {
       return personRepository.findAll();
    }

    public void add(Person person) {
        personRepository.save(person);
    }

    public void delete(long id) {
        personRepository.deleteById(id);
    }
}

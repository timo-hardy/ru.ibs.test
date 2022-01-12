package ru.ibs.test.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ibs.test.model.Person;
import ru.ibs.test.repository.PersonRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements ru.ibs.test.service.PersonService {
    private final PersonRepository personRepository;

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public void add(Person person) {
        personRepository.save(person);
    }

    @Override
    public void delete(long id) {
        personRepository.deleteById(id);
    }
}

package ru.ibs.test.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ibs.test.model.Person;
import ru.ibs.test.repository.PersonRepository;
import ru.ibs.test.service.PersonService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {
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

    @Override
    public List<Person> findByOrderBySurnameAsc() {
        return personRepository.findByOrderBySurnameAsc();
    }

    @Override
    public List<Person> findByOrderBySurnameDesc() {
        return personRepository.findByOrderBySurnameDesc();
    }
}

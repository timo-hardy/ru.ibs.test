package ru.ibs.test.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.ibs.test.model.Person;
import ru.ibs.test.service.PersonService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/person")
public class PersonController {
    private final PersonService personService;

    @GetMapping("/read")
    public List<Person> getAll() {
        return personService.findAll();
    }

    @GetMapping("/filterBySurnameAsc")
    public List<Person> filterSurnameAsc() {
        return personService.findByOrderBySurnameAsc();
    }

    @GetMapping("/filterBySurnameDesk")
    public List<Person> filterSurnameDesc() {
        return personService.findByOrderBySurnameDesc();
    }

    @RequestMapping("/create")
    public void create(@RequestBody Person person) {
        personService.add(person);
    }

    @DeleteMapping("/delete{id}")
    public void delete(@PathVariable long id) {
        personService.delete(id);
    }
}

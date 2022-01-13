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

    @RequestMapping("/create")
    public void create(@RequestBody Person person) {
        personService.add(person);
    }

    @DeleteMapping("/delete{id}")
    public void delete(@PathVariable long id) {
        personService.delete(id);
    }

    @GetMapping("/filterBySurnameAsc")
    public List<Person> filterSurnameAsc() {
        return personService.findByOrderBySurnameAsc();
    }

    @GetMapping("/filterBySurnameDesc")
    public List<Person> filterBySurnameDesc() {
        return personService.findByOrderBySurnameDesc();
    }

    @GetMapping("/filterByDateOfBirthAsc")
    public List<Person> filterByDateOfBirthAsc() {
        return personService.findByOrderByDateOfBirthAsc();
    }

    @GetMapping("/filterByDateOfBirthDesc")
    public List<Person> filterByDateOfBirthDesc() {
        return personService.findByOrderByDateOfBirthDesc();
    }

    @GetMapping("/filterByDepartmentAsc")
    public List<Person> filterByDepartmentAsc() {
        return personService.findByOrderByDepartmentAsc();
    }

    @GetMapping("/filterByDepartmentDesc")
    public List<Person> filterByDepartmentDesc() {
        return personService.findByOrderByDepartmentDesc();
    }
}

package ru.ibs.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ibs.test.model.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}

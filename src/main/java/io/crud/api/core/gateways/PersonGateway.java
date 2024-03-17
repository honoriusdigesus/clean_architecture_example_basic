package io.crud.api.core.gateways;

import io.crud.api.core.entity.Person;

import java.util.List;
import java.util.UUID;

public interface PersonGateway {
    String delete(UUID id);

    Person createPersona(Person person);

    Person findByName(String name);

    List<Person> getAllPersons();
}

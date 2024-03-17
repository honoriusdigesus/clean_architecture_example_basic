package io.crud.api.core.gateways;

import io.crud.api.core.entity.Person;

import java.util.List;

public interface PersonGateway {
    Person createPersona(Person person);

    Person findByName(String name);

    List<Person> getAllPersons();
}

package io.crud.api.core.usecases;

import io.crud.api.core.entity.Person;

import java.util.List;

public interface GetAllPersonsUseCases {
    List<Person> getAllPerson();
}

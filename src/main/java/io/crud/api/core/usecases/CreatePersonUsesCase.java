package io.crud.api.core.usecases;

import io.crud.api.core.entity.Person;

public interface CreatePersonUsesCase {
    Person execute(Person person);
}

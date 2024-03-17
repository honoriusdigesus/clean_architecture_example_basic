package io.crud.api.core.usecases;

import io.crud.api.core.entity.Person;
import org.springframework.stereotype.Component;

@Component
public interface CreatePersonUsesCase {
    Person execute(Person person);
}

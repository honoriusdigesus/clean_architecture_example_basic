package io.crud.api.infrastructure.mappers;

import io.crud.api.core.entity.Person;
import io.crud.api.infrastructure.dtos.PersonDTO;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {
    public PersonDTO personDTO(Person person){
        return new PersonDTO(person.name(), person.email(), person.password(), person.typePerson());
    }

    public Person toDomain(PersonDTO person){
        return new Person(null,person.name(), person.email(), person.password(), person.typePerson());
    }
}

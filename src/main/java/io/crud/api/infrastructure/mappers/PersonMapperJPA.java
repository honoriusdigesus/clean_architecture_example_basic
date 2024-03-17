package io.crud.api.infrastructure.mappers;

import io.crud.api.core.entity.Person;
import io.crud.api.infrastructure.persistence.PersonEntity;
import org.springframework.stereotype.Component;

@Component
public class PersonMapperJPA {
    public PersonEntity toEntity(Person person){
        return new PersonEntity(person.id(), person.name(), person.email(),person.password(),person.typePerson());
    }

    public Person toPerson(PersonEntity personEntity){
        return new Person(personEntity.getId(), personEntity.getName(), personEntity.getEmail(),personEntity.getPassword(),personEntity.getTypePerson());
    }
}

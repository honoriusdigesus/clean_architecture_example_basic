package io.crud.api.infrastructure.gateways;

import io.crud.api.core.entity.Person;
import io.crud.api.core.gateways.PersonGateway;
import io.crud.api.infrastructure.mappers.PersonMapperJPA;
import io.crud.api.infrastructure.persistence.PersonEntity;
import io.crud.api.infrastructure.persistence.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PersonRepositoryGateway implements PersonGateway {

    private final PersonRepository personRepository;
    private final PersonMapperJPA personMapperJPA;
    @Override
    public Person createPersona(Person person) {
        PersonEntity personEntity = personMapperJPA.toEntity(person);
        PersonEntity newPerson = personRepository.save(personEntity);
        return personMapperJPA.toPerson(newPerson);
    }
}

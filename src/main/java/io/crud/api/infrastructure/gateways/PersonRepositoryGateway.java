package io.crud.api.infrastructure.gateways;

import io.crud.api.core.entity.Person;
import io.crud.api.core.gateways.PersonGateway;
import io.crud.api.infrastructure.mappers.PersonMapperJPA;
import io.crud.api.infrastructure.persistence.PersonEntity;
import io.crud.api.infrastructure.persistence.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class PersonRepositoryGateway implements PersonGateway {

    private final PersonRepository personRepository;
    private final PersonMapperJPA personMapperJPA;

    @Override
    public String delete(UUID id) {
        personRepository.deleteById(id);
        return "User deleted successfully";
    }

    @Override
    public Person createPersona(Person person) {
        PersonEntity personEntity = personMapperJPA.toEntity(person);
        PersonEntity newPerson = personRepository.save(personEntity);
        return personMapperJPA.toPerson(newPerson);
    }

    @Override
    public Person findByName(String name) {
        PersonEntity personEntity = personRepository.findByName(name);
        if (personEntity == null){
            return null;
        }
        return personMapperJPA.toPerson(personEntity);
    }

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll()
                .stream()
                .map(personMapperJPA::toPerson)
                .collect(Collectors.toList());
    }
}

package io.crud.api.infrastructure.controllers;

import io.crud.api.core.entity.Person;
import io.crud.api.core.usecases.CreatePersonUseCase;
import io.crud.api.core.usecases.DeletePersonUseCase;
import io.crud.api.core.usecases.GetAllPersonsUseCases;
import io.crud.api.infrastructure.dtos.PersonDTO;
import io.crud.api.infrastructure.mappers.PersonMapper;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/users")
@AllArgsConstructor
public class PersonController {

    private final CreatePersonUseCase createPersonUsesCase;
    private final GetAllPersonsUseCases getAllPersonsUseCases;
    private final DeletePersonUseCase deletePersonUseCase;
    private final PersonMapper personMapper;

    @PostMapping
    public PersonDTO createPerson(@RequestBody PersonDTO personDTO) {
        Person person = createPersonUsesCase.execute(personMapper.toDomain(personDTO));
        return personMapper.personDTO(person);
    }

    @GetMapping
    public List<PersonDTO> getAllPersons() {
        List<Person> persons = getAllPersonsUseCases.getAllPerson();
        return getAllPersonsUseCases.getAllPerson().stream().map(personMapper::personDTO)
                .collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public String deletePerson(@PathVariable UUID id) {
        deletePersonUseCase.delete(id);
        return "User with ID: "+ id +" has been successfully deleted";
    }
}

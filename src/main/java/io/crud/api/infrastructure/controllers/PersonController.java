package io.crud.api.infrastructure.controllers;

import io.crud.api.core.entity.Person;
import io.crud.api.core.usecases.CreatePersonUsesCase;
import io.crud.api.infrastructure.dtos.PersonDTO;
import io.crud.api.infrastructure.mappers.PersonMapper;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users")
@AllArgsConstructor
public class PersonController {

    private final CreatePersonUsesCase createPersonUsesCase;
    private final PersonMapper personMapper;

    @PostMapping
    public PersonDTO createPerson(@RequestBody PersonDTO personDTO) {
        Person person = createPersonUsesCase.execute(personMapper.toDomain(personDTO));
        return personMapper.personDTO(person);
    }
}

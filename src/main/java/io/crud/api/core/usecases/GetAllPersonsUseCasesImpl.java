package io.crud.api.core.usecases;

import io.crud.api.core.entity.Person;
import io.crud.api.core.gateways.PersonGateway;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class GetAllPersonsUseCasesImpl implements GetAllPersonsUseCases{
    private final PersonGateway personGateway;
    @Override
    public List<Person> getAllPerson() {
        return personGateway.getAllPersons();
    }
}

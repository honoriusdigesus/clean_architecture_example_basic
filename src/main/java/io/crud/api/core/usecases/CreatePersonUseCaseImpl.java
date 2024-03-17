package io.crud.api.core.usecases;

import io.crud.api.core.entity.Person;
import io.crud.api.core.exceptions.BusinessException;
import io.crud.api.core.gateways.PersonGateway;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreatePersonUseCaseImpl implements CreatePersonUseCase {

    private final PersonGateway personGateway;

    @Override
    public Person execute(Person person) {
        Person personFound =  personGateway.findByName(person.name());
        if (personFound != null) {
            throw new BusinessException("The person " + person.name()+ " already exists");
        }
        return personGateway.createPersona(person);
    }
}

package io.crud.api.core.usecases;

import io.crud.api.core.entity.Person;
import io.crud.api.core.gateways.PersonGateway;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreatePersonUsesCaseImpl implements CreatePersonUsesCase {

    private final PersonGateway personGateway;

    @Override
    public Person execute(Person person) {
        return personGateway.createPersona(person);
    }
}

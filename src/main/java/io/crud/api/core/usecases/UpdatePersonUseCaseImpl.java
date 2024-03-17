package io.crud.api.core.usecases;

import io.crud.api.core.entity.Person;
import io.crud.api.core.exceptions.BusinessException;
import io.crud.api.core.gateways.PersonGateway;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UpdatePersonUseCaseImpl implements UpdatePersonUseCase{
    private final PersonGateway personGateway;
    @Override
    public String update(Person person) {
        personGateway.update(person);
        return "Person updated successfully";
    }
}

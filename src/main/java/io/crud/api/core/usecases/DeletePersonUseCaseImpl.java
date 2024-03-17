package io.crud.api.core.usecases;

import io.crud.api.core.gateways.PersonGateway;
import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
public class DeletePersonUseCaseImpl implements DeletePersonUseCase{

    private final PersonGateway personGateway;
    @Override
    public String delete(UUID id) {
        return personGateway.delete(id);
    }
}

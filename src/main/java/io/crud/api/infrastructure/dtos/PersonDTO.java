package io.crud.api.infrastructure.dtos;

import io.crud.api.core.enums.TypePerson;

import java.util.UUID;

public record PersonDTO(UUID id, String name, String email, String password, TypePerson typePerson) {
}

package io.crud.api.infrastructure.dtos;

import io.crud.api.core.enums.TypePerson;

public record PersonDTO(String name, String email, String password, TypePerson typePerson) {
}

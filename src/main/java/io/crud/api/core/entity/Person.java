package io.crud.api.core.entity;

import io.crud.api.core.enums.TypePerson;

import java.util.UUID;

public record Person(UUID id, String name, String email, String password, TypePerson typePerson) {
}

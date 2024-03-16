package io.crud.api.core.entity;

import io.crud.api.core.enums.TypePerson;

public record Person(String name, String email, String password, TypePerson typePerson) {
}

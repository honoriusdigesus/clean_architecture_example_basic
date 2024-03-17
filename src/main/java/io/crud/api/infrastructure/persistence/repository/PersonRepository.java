package io.crud.api.infrastructure.persistence.repository;

import io.crud.api.core.entity.Person;
import io.crud.api.infrastructure.persistence.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PersonRepository extends JpaRepository<PersonEntity, UUID> {

    PersonEntity findByName(String name);
}

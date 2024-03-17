package io.crud.api.infrastructure.persistence;

import io.crud.api.core.enums.TypePerson;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class PersonEntity {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private TypePerson typePerson;
}

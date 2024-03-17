package io.crud.api.infrastructure.configuration;

import io.crud.api.core.gateways.PersonGateway;
import io.crud.api.core.usecases.CreatePersonUsesCase;
import io.crud.api.core.usecases.CreatePersonUsesCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public CreatePersonUsesCase createPersonUsesCase(PersonGateway personGateway){
        return new CreatePersonUsesCaseImpl(personGateway);
    }
}


package io.crud.api.infrastructure.configuration;

import io.crud.api.core.gateways.PersonGateway;
import io.crud.api.core.usecases.CreatePersonUseCase;
import io.crud.api.core.usecases.CreatePersonUseCaseImpl;
import io.crud.api.core.usecases.GetAllPersonsUseCases;
import io.crud.api.core.usecases.GetAllPersonsUseCasesImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public CreatePersonUseCase createPersonUsesCase(PersonGateway personGateway){
        return new CreatePersonUseCaseImpl(personGateway);
    }

    @Bean
    public GetAllPersonsUseCases getAllPersonsUseCases(PersonGateway personGateway){
        return new GetAllPersonsUseCasesImpl(personGateway);
    }
}

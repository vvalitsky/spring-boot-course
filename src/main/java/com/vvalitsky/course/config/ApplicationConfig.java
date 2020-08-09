package com.vvalitsky.course.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Vladislav Valitsky at 09.08.2020
 */

@Configuration
public class ApplicationConfig {

    @Bean
    public ModelMapper objectMapper() {
        return new ModelMapper();
    }

}


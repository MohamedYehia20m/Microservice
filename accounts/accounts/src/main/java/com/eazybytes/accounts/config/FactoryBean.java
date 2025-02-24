package com.eazybytes.accounts.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBean {

    @Bean
    public ModelMapper factoryBean() {
        return new ModelMapper();
    }
}

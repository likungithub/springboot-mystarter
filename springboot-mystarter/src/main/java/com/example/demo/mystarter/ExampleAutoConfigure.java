package com.example.demo.mystarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(ExampleService.class)
@EnableConfigurationProperties(ExampleServiceProperties.class)
public class ExampleAutoConfigure {

    private final ExampleServiceProperties exampleServiceProperties;

    public ExampleAutoConfigure(ExampleServiceProperties exampleServiceProperties) {
        this.exampleServiceProperties = exampleServiceProperties;
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "example.service",value = "enabled",havingValue = "true")
    ExampleService exampleService(){
        return new ExampleService(exampleServiceProperties.getName(),exampleServiceProperties.getAge());
    }


}

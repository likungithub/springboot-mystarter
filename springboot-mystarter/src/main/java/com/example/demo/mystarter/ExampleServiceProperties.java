package com.example.demo.mystarter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("example.service")
public class ExampleServiceProperties {

    private String name;

    private String age;

}

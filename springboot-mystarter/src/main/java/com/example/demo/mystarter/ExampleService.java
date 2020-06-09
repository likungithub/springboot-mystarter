package com.example.demo.mystarter;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExampleService {

    private String name;

    private String age;

    public String swap(String word){
        return name + "---" + word + "--" + age;
    }


}

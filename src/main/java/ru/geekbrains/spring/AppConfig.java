package ru.geekbrains.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.geekbrains.spring.demo2.StdClass;

@Configuration
@ComponentScan(basePackages = {"ru.geekbrains.spring.demo2"})
public class AppConfig {
    @Bean
    public StdClass stdClass(){
        StdClass stdClass = new StdClass();
        stdClass.setValue(50);
        return stdClass;
    }
}

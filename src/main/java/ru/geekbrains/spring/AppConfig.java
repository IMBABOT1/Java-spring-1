package ru.geekbrains.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"ru.geekbrains.spring.demo2"})
public class AppConfig {
}

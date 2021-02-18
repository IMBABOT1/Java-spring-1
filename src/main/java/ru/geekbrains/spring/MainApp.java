package ru.geekbrains.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.geekbrains.spring.demo2.ItemService;

public class MainApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ItemService itemService = context.getBean("itemService", ItemService.class);
        System.out.println(itemService.findAll());
        context.close();
    }
}

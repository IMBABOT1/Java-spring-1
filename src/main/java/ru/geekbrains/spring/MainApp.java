package ru.geekbrains.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.geekbrains.spring.demo2.Box;
import ru.geekbrains.spring.demo2.ItemRepository;

public class MainApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ItemRepository itemRepository = context.getBean("itemRepository", ItemRepository.class);
        System.out.println(itemRepository.findAll());
        context.close();
    }
}

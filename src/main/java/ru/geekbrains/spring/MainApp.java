package ru.geekbrains.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.geekbrains.spring.demo2.Box;

public class MainApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Box box = context.getBean("box", Box.class);
        Box box1 = context.getBean("box", Box.class);
        System.out.println(box);
        System.out.println(box1);

        box1.setSize(100);

        System.out.println(box);
        System.out.println(box1);

        context.close();
    }
}

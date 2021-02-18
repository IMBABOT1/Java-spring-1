package ru.geekbrains.spring.demo2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
@Component
public class ItemRepository {
    private List<Item> items;

    @PostConstruct
    public void init(){
        items = new ArrayList<>(Arrays.asList(
                new Item(1l, "Bread", 25),
                new Item(2l, "Milk", 90),
                new Item(3l, "Cheese", 525)
        ));
    }

    public List<Item> findAll(){
        return Collections.unmodifiableList(items);
    }

    public void addItem(Item item){
        items.add(item);
    }
}

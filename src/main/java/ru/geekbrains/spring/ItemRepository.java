package ru.geekbrains.spring;

import ru.geekbrains.spring.demo2.Item;

import java.util.List;

public interface ItemRepository {
     Item findItemById(Long id);
     List<Item> findAll();
     void save(Item item);

}

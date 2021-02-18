package ru.geekbrains.spring.demo2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.geekbrains.spring.ItemRepository;

import java.util.List;

@Component
public class ItemService {


    private ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository inMemoryItemRepository){
        this.itemRepository = inMemoryItemRepository;
    }

    public void setItemRepository(ItemRepository inMemoryItemRepository) {
        this.itemRepository = inMemoryItemRepository;
    }

    public List<Item> findAll(){
        return itemRepository.findAll();
    }

    public void addItem(Item item){
        itemRepository.save(item);
    }

    public Item findItemById(Long id){
      return itemRepository.findItemById(id);
    }


}

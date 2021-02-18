package ru.geekbrains.spring.demo2;

public class Item {
    private Long id;
    private String title;
    private int price;

    public Item(){

    }

    public Item(long id, String title, int price){
        this.id = id;
        this.title = title;
        this.price = price;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Id: " + id + " Title: " + title + " " + "Price: " + price;
    }
}

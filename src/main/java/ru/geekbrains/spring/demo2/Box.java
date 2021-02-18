package ru.geekbrains.spring.demo2;

import org.springframework.stereotype.Component;

@Component
public class Box {
    private int size;

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public Box(){

    }

    public Box(int size){
        this.size = size;
    }


    @Override
    public String toString() {
        return "Box: " + size;
    }
}

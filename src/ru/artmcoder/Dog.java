package ru.artmcoder;

public class Dog extends Animal {
    public Dog(String color, int age) {
        super(color, age);
    }

    @Override
    public void breath() {
        System.out.println("Собака дышит лёгкими");
    }
}

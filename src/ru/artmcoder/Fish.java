package ru.artmcoder;

public class Fish extends Animal {
    public Fish(String color, int age) {
        super(color, age);
    }

    @Override
    public void breath() {
        System.out.println("Рыба дышит жабрами");
    }
}

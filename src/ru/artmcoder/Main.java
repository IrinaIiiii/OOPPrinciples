package ru.artmcoder;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Fish("Чёрный", 5);
        animal.info();
        animal.breath();
    }
}

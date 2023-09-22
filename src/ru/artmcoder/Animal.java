package ru.artmcoder;

public abstract class Animal {
    private String color;
    private int age;

    public Animal(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public void info() {
        System.out.println("Животное цвета: " + color + ". " + age + " лет");
    }

    public abstract void breath();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

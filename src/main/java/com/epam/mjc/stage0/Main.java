package com.epam.mjc.stage0;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal bird = new Bird();

        System.out.println(dog.getDescription());
        System.out.println(bird.getDescription());
    }
}

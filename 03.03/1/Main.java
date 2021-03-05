
package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Fado");
        dog.setColor("Brown");
        dog.setMakeSound("Hau Hau");


        Cat cat = new Cat();
        cat.setName("Puszek");
        cat.setColor("Black");
        cat.setMakeSound("Meow ");

        System.out.println(dog.Voice());
        System.out.println(cat.Voice());

    }
}
package com.rehan.Game.App;

public class InheritanceDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.makeSound();
        cat.sleep();

        Dog dog = new Dog();
        dog.makeSound();
        dog.eat();
        dog.sleep();
        dog.Run();
    }
}

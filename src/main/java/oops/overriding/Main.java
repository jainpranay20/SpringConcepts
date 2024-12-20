package oops.overriding;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        Animal animal = new Animal();
        animal.makeSound();
    }
}

abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
}

interface Swimmable {
    void swim();
}

interface Flyable {
    void fly();
}

class Duck extends Animal implements Flyable, Swimmable {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Vit boi");
    }

    @Override
    public void fly() {
        System.out.println("Vit bay");
    }
}

class Fish extends Animal implements Swimmable {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Ca boi");
    }
}

public class Bai3 {
    public static void main(String[] args) {
        Duck duck = new Duck("kien");
        duck.fly();
        duck.swim();
        Fish fish = new Fish("cong");
        fish.swim();
    }
}

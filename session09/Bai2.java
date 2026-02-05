class Animal {
    public void sound() {
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Gau gau");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meo meo");
    }
}

public class Bai2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();
    }
}

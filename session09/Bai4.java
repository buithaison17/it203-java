class Animal {
    public void say() {
        System.out.println("Hello");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Gau gau");
    }
}

public class Bai4 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.say();
        if (dog instanceof Dog) {
            Dog newDog = (Dog) dog;
            newDog.sound();
            newDog.say();
        }
    }
}

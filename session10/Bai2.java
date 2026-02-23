abstract class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void move();
}

class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    void move() {
        System.out.println("Di chuyen bang dong co");
    }
}

class Bicycle extends Vehicle {
    public Bicycle(String brand) {
        super(brand);
    }

    @Override
    void move() {
        System.out.println("Di chuyen bang suc nguoi");
    }
}

public class Bai2 {
    public static void main(String[] args) {
        Car car = new Car("vinfast");
        Bicycle bicyle = new Bicycle("vietnam");
        car.move();
        bicyle.move();
    }
}

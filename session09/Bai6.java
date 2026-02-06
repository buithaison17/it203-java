class Shape {
    public double calculateArea() {
        return 0;
    };
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width) {
        this.width = width;
        this.height = width;
    }

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }
}

public class Bai6 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2);
        Rectangle r2 = new Rectangle(2, 3);
        Circle c = new Circle(5);
        System.out.println(r1.calculateArea());
        System.out.println(r2.calculateArea());
        System.out.println(c.calculateArea());
    }
}

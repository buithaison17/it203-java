interface Shape {
    double getArea();

    double getPerimiter();
}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimiter() {
        return Math.PI * 2 * radius;
    }
}

class Rectangle implements Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimiter() {
        return (width + height) * 2;
    }
}

public class Bai1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        Circle circle = new Circle(5);
        System.out.println("Dien tich hinh chu nhat: " + rectangle.getArea());
        System.out.println("Chu vi hinh chu nhat: " + rectangle.getPerimiter());
        System.out.println("Dien chi hinh tron: " + circle.getArea());
        System.out.println("Chi vi hinh tron: " + circle.getPerimiter());
    }
}

abstract class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    abstract double calculateSalary();
}

class OfficeEmployee extends Employee {
    double baseSalary;

    public OfficeEmployee(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    @Override
    double calculateSalary() {
        return baseSalary;
    }
}

class ProductionEmployee extends Employee {
    int numOfProducts;
    double price;

    public ProductionEmployee(String name, int numOfProducts, double price) {
        super(name);
        this.numOfProducts = numOfProducts;
        this.price = price;
    }

    @Override
    double calculateSalary() {
        return numOfProducts * price;
    }
}

public class Bai5 {
    public static void main(String[] args) {
        OfficeEmployee oe = new OfficeEmployee("son", 1000);
        System.out.println(oe.calculateSalary());
        ProductionEmployee pe = new ProductionEmployee("son", 10, 5000);
        System.out.println(pe.calculateSalary());
    }

}
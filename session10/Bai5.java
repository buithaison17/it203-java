abstract class Employee {
    String name;
    double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary();
}

interface BonusCalculator {
    double getBonus();
}

class OfficeStaff extends Employee {
    public OfficeStaff(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateSalary() {
        return baseSalary * 2;
    }
}

class Manager extends Employee implements BonusCalculator {
    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateSalary() {
        return baseSalary * 4;
    }

    @Override
    public double getBonus() {
        return baseSalary + 2000000;
    }
}

public class Bai5 {
    public static void main(String[] args) {

    }
}

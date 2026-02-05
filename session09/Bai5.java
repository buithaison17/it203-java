class Employee {
    double hours;

    public Employee(double hours) {
        this.hours = hours;
    }

    public double calculateSalary() {
        return 0;
    }

}

class OfficeEmployee extends Employee {
    public OfficeEmployee(double hours) {
        super(hours);
    }

    @Override
    public double calculateSalary() {
        return 50000 * hours;
    }
}

class ProductionEmployee extends Employee {
    public ProductionEmployee(double hours) {
        super(hours);
    }

    @Override
    public double calculateSalary() {
        return 100000 * hours;
    }
}

public class Bai5 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new OfficeEmployee(3);
        employees[1] = new ProductionEmployee(5);
        employees[2] = new OfficeEmployee(4);

        double totalSalary = 0;

        for (Employee employee : employees) {
            totalSalary += employee.calculateSalary();
        }

        System.out.println(totalSalary);
    }
}

class Employee {
    String fullName;
    double salary;

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

}

class Manager extends Employee {
    String departure;

    public Manager(String fullName, double salary, String departure) {
        super(fullName, salary);
        this.departure = departure;
    }

    public void display() {
        System.out.println("Ten nhan vien: " + fullName);
        System.out.println("Luong: " + salary);
        System.out.println("Phong ban: " + departure);
    }
}

public class Bai3 {
    public static void main(String[] args) {
        Manager manager = new Manager("Son", 25000, "Giam doc");
        manager.display();
    }
}

class Employee {
    int id;
    String fullName;
    double salary;

    public Employee() {
    }

    public Employee(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Employee(int id, String fullName, double salary) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }

    public void getInfor() {
        System.out.println("Ma nhan vien: " + this.id);
        System.out.println("Ten nhan vien: " + this.fullName);
        System.out.println("Luong: " + this.salary);
    }

}

public class Bai4 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.getInfor();
        Employee e2 = new Employee(1, "Son");
        e2.getInfor();
        Employee e3 = new Employee(2, "Bui Son", 1000.123);
        e3.getInfor();
    }
}

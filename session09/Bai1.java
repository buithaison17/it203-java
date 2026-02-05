class Person {
    String fullName;
    int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void display() {
        System.out.printf("Ten sinh vien: %s\n", fullName);
        System.out.printf("Tuoi: %d", age);
    }
}

class Student extends Person {
    String studentId;
    double avg;

    public Student(String fullName, int age, String studentId, double avg) {
        super(fullName, age);
        this.studentId = studentId;
        this.avg = avg;
    }
}

public class Bai1 {
    public static void main(String[] args) {
        Student student = new Student("Son", 20, "SV01", 10);
        student.display();
    }
}
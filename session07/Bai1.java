class Student {
    String studentId;
    String studentName;
    public static int totalStudent = 0;

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        totalStudent++;
    }
}

public class Bai1 {
    public static void main(String[] args) {
        Student student = new Student("1", "Bui Thai Son");
        System.out.println(Student.totalStudent);
    }
}

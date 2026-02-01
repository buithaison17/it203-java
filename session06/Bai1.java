class Student {
    String studentId;
    String fullName;
    String birthday;
    float average;

    public Student(String studentId, String fullName, String birthday, float average) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.birthday = birthday;
        this.average = average;
    }

    public void getInfor() {
        System.out.println("Ma sinh vien: " + this.studentId);
        System.out.println("Ho ten: " + this.fullName);
        System.out.println("Nam sinh: " + this.birthday);
        System.out.println("Diem trung binh: " + this.average);
    }

}

public class Bai1 {
    public static void main(String[] args) {
        Student student1 = new Student("sonbui1", "Bui Thai Son", "2006", 10);
        Student student2 = new Student("sonbui2", "Son Bui", "2006", 9);
        student1.getInfor();
        System.out.println();
        student2.getInfor();
    }
}

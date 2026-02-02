class ClassRoom {
    String studentName;
    static double classFund = 0;

    public ClassRoom(String studentName, double money) {
        this.studentName = studentName;
        classFund += money;
    }
}

public class Bai4 {
    public static void main(String[] args) {
        ClassRoom room1 = new ClassRoom("Bui Thai Son", 1000000);
        ClassRoom room2 = new ClassRoom("Thai Son", 1000000);
        System.out.println(ClassRoom.classFund);
    }
}

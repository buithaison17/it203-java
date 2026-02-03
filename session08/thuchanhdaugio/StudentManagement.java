package thuchanhdaugio;

public class StudentManagement {
    private static Student[] students = new Student[1000];
    private static int length = 0;

    // Kiểm tra mảng rỗng
    public static boolean isEmpty() {
        if (length == 0) {
            return true;
        }
        return false;
    }

    // Thêm sinh viên
    public static void addStudent(Student student) {
        if (length == 1000) {
            System.out.println("\nThem sinh vien khong thanh cong\n");
            return;
        }
        students[length] = student;
        length++;
    }

    // In danh sách
    public static void printList() {
        if (isEmpty()) {
            System.out.println("\nDanh sach sinh vien trong\n");
            return;
        }

        System.out.println("\nDanh sach sinh vien");
        for (int i = 0; i < length; i++) {
            System.out.println(students[i].toString());
        }
        System.out.println();
    }

    // Tìm kiếm theo học lực
    public static void findByRank(String rank) {
        System.out.println("\nDanh sach sien vien: ");
        for (int i = 0; i < length; i++) {
            if (students[i].getRank().toLowerCase().equals(rank.toLowerCase())) {
                System.out.println(students[i].toString());
            }
        }
        System.out.println();
    }

    // Sắp xếp theo điểm giảm dần
    public static void sortByScoreDesc() {
        if (isEmpty()) {
            System.out.println("\nDanh sach sinh vien trong\n");
            return;
        }
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (students[j].getScore() < students[j + 1].getScore()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        System.out.println("\nSap xep thanh cong\n");
    }
}

package thuchanhdaugio;

import java.util.Scanner;

class Main {
    public static void addListStudent(Scanner sc) {
        // Nhập số lượng
        System.out.print("Nhap so luong sinh vien muon them: ");
        int n = Integer.parseInt(sc.nextLine());

        // Nhập dữ liệu
        for (int i = 0; i < n; i++) {
            // Nhập mã sinh viên
            String studentId;
            do {
                System.out.print("Nhap ma sinh vien: ");
                studentId = sc.nextLine();
                if (!studentId.startsWith("SV") || studentId.isBlank()) {
                    System.out.println("Ma sinh vien khong hop le");
                }
            } while (!studentId.startsWith("SV") || studentId.isBlank());
            // Nhập tên
            String studentName;
            do {
                System.out.print("Nhap ten sinh vien: ");
                studentName = sc.nextLine();
                if (studentName.isBlank()) {
                    System.out.println("Ten sinh vien khong hop le");
                }
            } while (studentName.isBlank());
            // Nhập điểm
            double score;
            do {
                System.out.print("Nhap diem: ");
                score = Double.parseDouble(sc.nextLine());
                if (score < 0 || score > 10) {
                    System.out.println("Diem khong hop le");
                }
            } while (score < 0 || score > 10);
            Student student = new Student(studentId, studentName, score);
            StudentManagement.addStudent(student);
        }
    }

    // Tìm kiếm theo học lực
    public static void findByRank(Scanner sc) {
        if (StudentManagement.isEmpty()) {
            System.out.println("\nDanh sach sinh vien trong\n");
            return;
        }
        System.out.print("Nhap hoc luc: ");
        String rank = sc.nextLine();
        StudentManagement.findByRank(rank);
    }

    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Hien thi danh sach sinh vien");
            System.out.println("3. Tim kiem sinh vien theo hoc luc");
            System.out.println("4. Sap xep theo hoc luc giam dan");
            System.out.println("5. Thoat");
            System.out.print("Nhap chuc nang: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    addListStudent(sc);
                    break;
                case 2:
                    StudentManagement.printList();
                    break;
                case 3:
                    findByRank(sc);
                    break;
                case 4:
                    StudentManagement.sortByScoreDesc();
                    break;
                case 5:
                    System.out.println("\nThoat thanh cong\n");
                    break;
                default:
                    System.out.println("\nChuc nang khong hop le\n");
                    break;
            }
        } while (choice != 5);
        sc.close();
    }
}
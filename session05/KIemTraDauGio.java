import java.util.Scanner;

public class KIemTraDauGio {
    // In danh sách mã
    public static void printList(String[] studentId, int index) {
        if (index == 0) {
            System.out.println("Khong co ma sinh vien nao");
            return;
        }
        System.out.println("--- Danh sach ma sinh vien ---");
        for (int i = 0; i < index; i++) {
            System.out.printf("%d: %s\n", i + 1, studentId[i]);
        }
    }

    // Kiểm tra mã sinh viên
    public static boolean validateStudentId(String id) {
        if (id.matches("B\\d{7}")) {
            return true;
        }
        return false;
    }

    // Thêm mã sinh viên mới
    public static void addStudentId(String[] studentId, int index, Scanner sc) {
        // Nhập mã sinh viên và kiểm tra
        String id;
        do {
            System.out.print("Nhap ma sinh vien: ");
            id = sc.nextLine();
            if (!validateStudentId(id)) {
                System.out.println("Ma sinh vien khong hop le. Vui long nhap lai");
            }
        } while (!validateStudentId(id));
        // Thêm mã sinh viên
        studentId[index] = id;
    }

    // Cập nhật mã sinh viên
    public static void updateStudentId(String[] studentId, int index, Scanner sc) {
        // Nhập và kiểm tra vị trí
        int indexEdit;
        if (index == 0) {
            System.out.println("Khong co ma sinh vien nao de chinh sua");
            return;
        }
        do {
            System.out.printf("Nhap vi tri can sua (0 -> %d): ", index - 1);
            indexEdit = Integer.parseInt(sc.nextLine());
            if (indexEdit > index - 1 || indexEdit < 0) {
                System.out.println("Vi tri khong hop le vui long thu lai");
            }
        } while (indexEdit > index - 1 || indexEdit < 0);
        // Nhập id và kiểm tra
        String id;
        do {
            System.out.print("Nhap ma sinh vien: ");
            id = sc.nextLine();
            if (!validateStudentId(id)) {
                System.out.println("Ma sinh vien khong hop le. Vui long nhap lai");
            }
        } while (!validateStudentId(id));
        // Gán lại giá trị
        studentId[indexEdit] = id;
        System.out.println("Sua ma sinh vien thanh cong");
    }

    // Xóa mã sinh viên
    public static void removeStudentId(String[] studentId, int index, Scanner sc) {
        if (index == 0) {
            System.out.println("Khong co ma sinh vien nao de xoa: ");
            return;
        }
        int indexDelete = -1;
        System.out.print("Nhap ma sinh vien muon xoa: ");
        String id = sc.nextLine();
        // Kiểm tra ID
        for (int i = 0; i < index; i++) {
            if (studentId[i].toLowerCase().equals(id.toLowerCase())) {
                indexDelete = i;
                break;
            }
        }
        if (indexDelete == -1) {
            System.out.println("Khong tim thay ma sinh vien");
            return;
        }
        // Xóa nếu tìm thấy
        for (int i = indexDelete; i < index - 1; i++) {
            studentId[i] = studentId[i + 1];
        }
        System.out.println("Xoa thanh cong");
    }

    // Tìm kiếm mã sinh viên
    public static void findStudentId(String[] studentId, int index, Scanner sc) {
        if (index == 0) {
            System.out.println("Danh sach ma sinh vien trong");
            return;
        }
        // Nhập dữ liệu
        System.out.print("Nhap ma sinh vien muon tim kiem: ");
        String id = sc.nextLine();
        // Tìm kiếm
        for (int i = 0; i < index; i++) {
            if (studentId[i].toLowerCase().contains(id.toLowerCase())) {
                System.out.println(studentId[i]);
            }
        }
    }

    public static void main(String[] args) {
        String[] studentId = new String[100];
        int index = 0;
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1: Hien thi danh sach MSSV");
            System.out.println("2: Them moi");
            System.out.println("3: Cap nhat");
            System.out.println("4: Xoa");
            System.out.println("5: Tim kiem");
            System.out.println("6: Thoat");
            System.out.print("Nhap chuc nang: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    printList(studentId, index);
                    break;
                case 2:
                    addStudentId(studentId, index, sc);
                    index++;
                    break;
                case 3:
                    updateStudentId(studentId, index, sc);
                    break;
                case 4:
                    removeStudentId(studentId, index, sc);
                    index--;
                    break;
                case 5:
                    findStudentId(studentId, index, sc);
                    break;
                case 6:
                    System.out.println("Thoat thanh cong");
                    break;
                default:
                    System.out.println("Chuc nang khong hop le");
                    break;
            }
        } while (choice != 6);
        sc.close();
    }
}

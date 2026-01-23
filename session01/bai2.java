import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int n; // Số ngày đi trễ
        int m; // Số lượng sách mượn
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so ngay di tre: ");
        n = s.nextInt();
        System.out.print("Nhap so luong sach muon: ");
        m = s.nextInt();
        // Tính tiền phạt
        double total = n * m * 5000;
        System.out.printf("Tien phat goc: %.2f VND\n", total);
        if (n > 7 && m >= 3) {
            total = total + (total * 0.2);
        }
        System.out.printf("Tien phat sau dieu chinh: %.2f VND\n", total);
        System.out.printf("Yeu cau khoa the: %s\n", total > 50000 ? "true" : "false");
        s.close();
    }
}

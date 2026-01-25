import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int n;
        int days = 0;
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sach tra muon: ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.printf("Nhap so ngay tre cuon thu %d: ", i + 1);
            days = sc.nextInt();
            total += days * 50000; 
        }
        System.out.println("Tong tin phat: " + total + " VND");
        sc.close();
    }
}

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int age;
        int numOfBooks;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tuoi cua ban: ");
        age = sc.nextInt();
        System.out.print("Nhap so sach dang muon: ");
        numOfBooks = sc.nextInt();
        if (age >= 18) {
            if (numOfBooks > 3) {
                System.out.println("Ket qua: Khong du dieu kien");
                System.out.println("- Ly do: Ban da muon toi da 3 cuon sach");
            } else {
                System.out.println("Ket qua: Du dieu kien muon sach quy hiem");
            }
        } else {
            System.out.println("Ket qua: Khong du dieu kien");
            System.out.println("- Ly do: Ban chua du 18 tuoi");
        }
        sc.close();
    }
}

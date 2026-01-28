import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma the: ");
        String cardId = sc.nextLine();
        if (!cardId.matches("^[A-Z]{2}.*")) {
            System.out.println("The phai bat dau bang 2 chu cai viet hoa");
        } else if (!cardId.matches("^[A-Z]{2}20\\d{2}.*")) {
            System.out.println("Nam khong hop le");
        } else if (!cardId.matches("^[A-Z]{2}20\\d{2}\\d{5}$")) {
            System.out.println("Duoi the phai la 5 chu so");
        } else {
            System.out.println("Ma the hop le");
        }
        sc.close();
    }
}

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        double price;
        float exchangeRate;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap gia sach (USD - kieu so thuc): ");
        price = scan.nextDouble();
        System.out.print("Gia chinh xac (so thuc): ");
        exchangeRate = scan.nextFloat();
        long total = (long) (price * exchangeRate);
        System.out.printf("Gia lam tron de thanh toan (long): %d\n", total);
        scan.close();
    }
}

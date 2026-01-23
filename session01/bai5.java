import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sach (4 chu so): ");
        number = sc.nextInt();
        int thousands = number / 1000;
        int hundreds = (number % 1000) / 100;
        int dozens = (number % 100) / 10;
        int units = number % 10;
        int sumOfFirstThreeNumber = (thousands + hundreds + dozens) % 10;
        System.out.println("Chu so kiem tra ki vong: " + sumOfFirstThreeNumber);
        if (sumOfFirstThreeNumber == units) {
            System.out.println("Ket qua kiem tra ma sach: Hop le");
        } else {
            System.out.println("Ket qua kiem tra ma sach: Sai ma");
        }
        sc.close();
    }
}
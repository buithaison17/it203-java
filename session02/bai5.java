import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        int points = 100;
        int days;
        Scanner sc = new Scanner(System.in);
        System.out.println("----- HE THONG DANH GIA DOC GIA -----");
        do {
            System.out.print("So ngay tre lan nay: ");
            days = sc.nextInt();
            if(days == 999) break;
            if (days > 0) {
                System.out.printf("Tra tre %d ngay: -%d diem\n\n", days, days * 2);
                points -= days * 2;
            } else {
                System.out.println("Tra dung han: +5 diem\n\n");
                points += 5;
            }
        } while (true);
        System.out.printf("\nTong diem uy tin: %d\n", points);
        if (points < 80) {
            System.out.println("Duoi 80: Doc gia can luu y");
        } else if (points <= 120) {
            System.out.println("Tu 80 - 120: Doc gia tieu chuan");
        } else {
            System.out.println("Tren 120: Doc gia than thiet");
        }
        sc.close();
    }
}

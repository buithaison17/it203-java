import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -1;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 7; i++) {
            if (i < 7) {
                System.out.printf("Nhap luot muon ngay thu %d: ", i + 1);
            } else {
                System.out.printf("Nhap luot muon ngay chu nhat: ");
            }
            int borrow = sc.nextInt();
            if (borrow == 0)
                continue;
            if (borrow > max)
                max = borrow;
            if (borrow < min)
                min = borrow;
            sum += borrow;
            count++;
        }
        if (count == 0) {
            System.out.println("Khong co ngay noa thu vien mo cua");
        } else {
            double avg = (double) sum / count;
            System.out.println("----- KET QUA THONG KE -----");
            System.out.printf("Luot muon cao nhat: %d\n", max);
            System.out.printf("Luot muon thap nhat: %d\n", min);
            System.out.printf("Trung binh luot muon/ngay: %.2f\n", avg);
        }
        sc.close();
    }
}

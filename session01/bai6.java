import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        int stt;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu tu: ");
        stt = sc.nextInt();
        int bookShelf = (stt - 1) / 25 + 1;
        int position = (stt - 1) % 25 + 1;
        String area = bookShelf >= 10 ? "Khu can" : "Khu vien";
        System.out.println("----- Thong tin dinh vi -----");
        System.out.printf("Sach so: %d\n", stt);
        System.out.printf("Dia chi: Ke %d - Vi tri %d\n", bookShelf, position);
        System.out.printf("Phan khu: %s\n", area);
        sc.close();
    }
}

import java.util.Scanner;

public class Bai2 {
    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toLowerCase().equals(search.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] books = { "Doraemon", "Lập trình C", "Lập trình Js", "Java cơ bản", "Java nâng cao" };
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sach muon tim kiem: ");
        String search = sc.nextLine();
        int index = searchBooks(books, search);
        if (index != -1) {
            System.out.printf("Tim thay sach %s tai vi tri %d", search, index);
        } else {
            System.out.println("Khong tim thay sach");
        }
        sc.close();
    }
}

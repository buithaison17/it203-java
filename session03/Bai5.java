import java.util.Scanner;

public class Bai5 {
    public static void deleteBook(int[] arr, int n, int bookId) {
        int index = -1;
        // Tìm vị trí cần xóa
        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId)
                index = i;
        }
        if (index == -1)
            return;
        // Tiến hành xóa
        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }

    public static void printBook(int[] arr, int n) {
        System.out.printf("Kho sach hien tai (%d cuon): ", n);
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] books = { 101, 102, 103, 104, 105 };
        int n = books.length;
        printBook(books, n);
        int bookId;
        do {
            System.out.print("\nNhap ma sach can xoa (0 de thoat): ");
            bookId = sc.nextInt();
            if (bookId == 0)
                break;
            deleteBook(books, n, bookId);
            n--;
            printBook(books, n);
        } while (bookId != 0);
        sc.close();
    }
}
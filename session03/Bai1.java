import java.util.Scanner;

public class Bai1 {
    public static int[] addBookToLibraries(int n) {
        Scanner sc = new Scanner(System.in);
        int[] books = new int[n];
        System.out.println("Nhap ma sach cho 5 cuon sach: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap ma sach thu %d: ", i + 1);
            books[i] = sc.nextInt();
        }
        sc.close();
        return books;
    }

    public static void displayLibraries(int[] arr) {
        System.out.println("Danh sach ma sach: ");
        for (int i = 0; i < arr.length; i++) {
            if (i <= arr.length - 2) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sach can quan ly: ");
        int n = sc.nextInt();
        int[] arr = addBookToLibraries(n);
        displayLibraries(arr);
        sc.close();
    }
}

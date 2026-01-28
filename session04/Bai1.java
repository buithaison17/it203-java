import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        String title;
        String author;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sach: ");
        title = sc.nextLine();
        System.out.print("Nhap ten tac gia: ");
        author = sc.nextLine();
        // Xóa khoảng trắng thừa
        title = title.trim().replaceAll("\\s+", " ");
        author = author.trim().replaceAll("\\s+", " ");
        // Viết hoa chữa cái đầu ở mỗi từ tên tác giả
        String[] words = author.split(" ");
        StringBuilder resultAuthor = new StringBuilder();
        for (String word : words) {
            resultAuthor.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }
        // Kết quả
        StringBuilder result = new StringBuilder();
        result.append(title.toUpperCase()).append(" - ").append(resultAuthor);
        System.out.println(result);
        sc.close();
    }
}

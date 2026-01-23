import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		String bookId = "";
		String bookName = "";
		int publishYear;
		double price;
		boolean isAvailable;
		Scanner s = new Scanner(System.in);
		System.out.print("Nhap ma sach: ");
		bookId = s.nextLine();
		System.out.print("Nhap ten sach: ");
		bookName = s.nextLine();
		System.out.print("Nhap nam xuat ban: ");
		publishYear = Integer.parseInt(s.nextLine());
		System.out.print("Nhap gia sach: ");
		price = Double.parseDouble(s.nextLine());
		System.out.print("Nhap trang thai sach (true/false): ");
		isAvailable = Boolean.parseBoolean(s.nextLine());
		System.out.println("---- Phieu thong tin ----");
		System.out.println("Ten sach: " + bookName);
		System.out.printf("Ma so %s | Tuoi tho: %d\n", bookId, (2026 - publishYear));
		System.out.printf("Gia ban: %.2f VND\n", price);
		System.out.printf("Tinh trang: %s\n", isAvailable ? "Con hang" : "Het hang");
		s.close();
	}
}
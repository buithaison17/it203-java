import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int id;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap ID sach moi (phai > 0): ");
            id = sc.nextInt();
            if(id > 0){
                System.out.printf("Xac nhan: ma sach %d da duoc ghi nhan", id);
            }
            else{
                System.out.println("ID sach khong hop le");
            }
        } while (id <= 0);
        sc.close();
    }
}

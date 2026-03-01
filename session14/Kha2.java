import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Kha2 {
    public static void main(String[] args) {
        Map<String, String> medicines = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        medicines.put("T01", "Paracetamol");
        medicines.put("T02", "Ibuprofen");
        medicines.put("T03", "Panadol");
        medicines.put("T04", "Thuoc ho");
        medicines.put("T05", "Thuoc cam");

        System.out.print("Nhap ID: ");
        String id = sc.nextLine();

        if (medicines.containsKey(id)) {
            System.out.println("Ten thuoc: " + medicines.get(id));
        } else {
            System.out.println("Thuoc khong ton tai");
        }

        sc.close();
    }
}

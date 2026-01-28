public class Bai2 {
    public static void main(String[] args) {
        String description = "Sach giao khoa Toan lop 12, Ke A1-102, tinh trang moi";
        // Kiểm tra xem chứa từ kệ
        if (description.toLowerCase().contains("ke")) {
            StringBuilder result = new StringBuilder();
            String[] words = description.split(", ");
            result.append(words[0])
                    .append(", Vi tri luu tru ")
                    .append(words[1].split(" ")[1])
                    .append(", ")
                    .append(words[2]);
            System.out.printf("Vi tri tim thay: %s\n", words[1].split(" ")[1]);
            System.out.println(result);
        }
    }
}

public class Bai3 {
    public static void main(String[] args) {
        String[] transactions = { "BK001-20/101", "BK005-21/01", "BK099-22/01" };
        // Dùng StringBuilder
        System.out.println("--- Bao cao muon sach ---");
        System.out.println("Ngay tao: 27/01/2026");
        long timeBuilderStart = System.nanoTime();
        StringBuilder reportBuilder = new StringBuilder();
        for (String string : transactions) {
            reportBuilder.append("Giao dich: ").append(string).append("\n");
        }
        long timeBuilderEnd = System.nanoTime();
        System.out.println(reportBuilder);
        System.out.println("Thoi gian thuc thi doi voi StringBuilder: " + (timeBuilderEnd - timeBuilderStart));
        // Dùng String
        String reportString = "";
        long timeStringStart = System.nanoTime();
        for (String string : transactions) {
            reportString += "Giao dich: " + string + "\n";
        }
        // System.out.println(reportString);
        long timeStringEnd = System.nanoTime();
        System.out.println("Thoi gian thuc thi doi voi String: " + (timeStringEnd - timeStringStart));
    }
}

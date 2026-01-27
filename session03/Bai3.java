public class Bai3 {
    public static void maxQuantityOfBooks(String[] names, int[] quantities) {
        int maxQuantity = quantities[0];
        for (int i = 1; i < quantities.length; i++) {
            if (maxQuantity < quantities[i]) {
                maxQuantity = quantities[i];
            }
        }
        System.out.printf("Sach co so luong nhieu nhat (%d): \n", maxQuantity);
        for (int i = 0; i < names.length; i++) {
            if (maxQuantity == quantities[i]) {
                System.out.println("- " + names[i]);
            }
        }
    }

    public static void main(String[] args) {
        String[] names = { "Doraemon", "Lập trình C", "Lập trình Js", "Java cơ bản", "Java nâng cao" };
        int[] quantities = { 10, 20, 30, 50, 50 };
        maxQuantityOfBooks(names, quantities);
    }
}

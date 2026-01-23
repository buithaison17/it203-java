public class bai3 {
    public static void main(String[] args) {
        String book1 = "Java Basic";
        String book2 = "Python Intro";
        String temp = book1;
        // temp sẽ lưu trữ địa chỉ tham chiếu của book1 trong stack
        book1 = book2;
        // book1 tham chiếu tới địa chỉ của book2 trong stack
        book2 = temp;
        // book2 tham chiếu tới địa chỉ của book1 trong stack
        // Heap không thay đổi
        System.out.println(book1);
        System.out.println(book2);
    }
}
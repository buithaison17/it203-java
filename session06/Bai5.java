class Book {
    String title;
    String author;
    String description;

    public Book(String title, String author, String description) {
        this.title = title;
        this.author = author;
        this.description = description;
    }
}

public class Bai5 {
    public static void main(String[] args) {
        Book book = new Book("Tu duy nguoc", "Son Bui", "Dinh cao tri tue");
        System.out.println(book.title);
    }
}
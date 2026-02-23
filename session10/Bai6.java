import java.util.Arrays;
import java.util.Comparator;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class Bai6 {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("iphone", 1200000);
        products[1] = new Product("laptop", 5000);
        products[2] = new Product("dong ho", 10000);

        // Dùng class ẩn anonymous
        Arrays.sort(products, new Comparator<Product>() {
            // Lambda không cho phép tạo biến nội bộ
            int count = 0;

            public int compare(Product p1, Product p2) {
                count++;
                return Double.compare(p1.price, p2.price);
            }
        });

        System.out.println("Sap xep theo gia tang ");
        for (Product product : products) {
            System.out.println(product.name);
        }

        // Dùng lambda expression
        Arrays.sort(products, (p1, p2) -> p1.name.compareTo(p2.name));

        System.out.println("Sap xep theo ten tu A-Z ");
        for (Product product : products) {
            System.out.println(product.name);
        }

        /* Dùng Class Anonymous khi cần dùng biến cục bố để lưu trữ trạng thái */
    }
}

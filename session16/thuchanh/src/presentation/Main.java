package src.presentation;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import src.models.ElectronicProduct;
import src.models.FoodProduct;
import src.models.Product;
import src.services.ProductRepository;

public class Main {
    public static void main(String[] args) {
        // Tạo Servive
        ProductRepository productRepository = new ProductRepository();

        // Khởi tạo các sản phẩm
        ElectronicProduct electronicProduct1 = new ElectronicProduct("1", "Tu lanh", 12000000, 12);
        ElectronicProduct electronicProduct2 = new ElectronicProduct("2", "May giat", 6000000, 6);
        ElectronicProduct electronicProduct3 = new ElectronicProduct("3", "Noi com", 2000000, 3);
        FoodProduct foodProduct1 = new FoodProduct("4", "Banh cay", 120000, 10);
        FoodProduct foodProduct2 = new FoodProduct("5", "Banh mi", 12000, 5);

        // Thêm sản phẩm
        productRepository.add(electronicProduct1);
        productRepository.add(electronicProduct2);
        productRepository.add(electronicProduct3);
        productRepository.add(foodProduct1);
        productRepository.add(foodProduct2);

        // In và tính tiền
        for (Product product : productRepository.findAll()) {
            product.display();
            System.out.println("Thanh tien: " + product.calculateFinalPrice());
        }

        System.out.println();

        // Tìm kiếm sản phẩm theo ID và hiển thị kết quả
        Product product1 = productRepository.findById("3");
        if (product1 != null) {
            product1.display();
        }
        Product product2 = productRepository.findById("6");
        if (product2 != null) {
            product2.display();
        }

        // Sắp xếp theo giá tăng dần
        Comparator<Product> comparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        };

        // Thống kê số lượng sản phẩm
        Map<String, Integer> statics = new HashMap<>();
        for (Product product : productRepository.findAll()) {
            if (product instanceof ElectronicProduct) {
                if (!statics.containsKey("ElectronicProduct")) {
                    statics.put("ElectronicProduct", 1);
                } else {
                    statics.put("ElectronicProduct", statics.get("ElectronicProduct") + 1);
                }
            } else if (product instanceof FoodProduct) {
                if (!statics.containsKey("FoodProduct")) {
                    statics.put("FoodProduct", 1);
                } else {
                    statics.put("FoodProduct", statics.get("FoodProduct") + 1);
                }
            }
        }
        // In kết quả
        System.out.println();
        for (Map.Entry<String, Integer> entry : statics.entrySet()) {
            System.out.printf("Loai %s co %d san pham\n", entry.getKey(), entry.getValue());
        }
    }
}

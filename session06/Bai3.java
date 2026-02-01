class Product {
    private String productId;
    private String productName;
    private float price;

    public Product(String productId, String productName, float price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public void setPrice(float price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Gia ban phai lon hon 0");
        }
    }

    public float getPrice() {
        return price;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void getInfor() {
        System.out.println("Ma san pham: " + this.productId);
        System.out.println("Ten san pham: " + this.productName);
        System.out.println("Gia san pham: " + this.price);
    }
}

public class Bai3 {
    public static void main(String[] args) {
        Product product = new Product("1", "Iphone 13", 12000000);
        product.setPrice(1);
        product.getInfor();
    }

}

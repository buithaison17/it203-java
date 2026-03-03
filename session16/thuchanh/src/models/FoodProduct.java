package src.models;

public class FoodProduct extends Product {
    private int discountPercent;

    public FoodProduct(String id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculateFinalPrice() {
        return this.getPrice() - (this.getPrice() * discountPercent / 100);
    }

    @Override
    public void display() {
        System.out.println("ID: " + this.getId() + " | Ten: " + this.getName() + " | Gia: " + this.getPrice()
                + " | Ma gia gia: " + discountPercent);
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }
}

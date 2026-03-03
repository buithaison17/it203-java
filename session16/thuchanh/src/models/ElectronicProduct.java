package src.models;

public class ElectronicProduct extends Product {
    private int warrantyMonths;

    public ElectronicProduct(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double calculateFinalPrice() {
        if (warrantyMonths > 12) {
            return this.getPrice() + 1000000;
        } else {
            return this.getPrice();
        }
    }

    @Override
    public void display() {
        System.out.println("ID: " + this.getId() + " | Ten: " + this.getName() + " | Gia: " + this.getPrice()
                + " | Thoi gian bao hanh: " + this.getWarrantyMonths());
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

}

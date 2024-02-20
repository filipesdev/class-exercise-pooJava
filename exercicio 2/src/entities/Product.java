package entities;

public class Product {

    public String productName;
    public double price;
    public int quantity;

    public Product() {}

    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;

    }

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public double totalValueInStock() {

        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return productName
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $"
                +  String.format("%.2f", totalValueInStock());
    }

}
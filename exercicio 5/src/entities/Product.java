package entities;

public class Product {

    private String productname;

    private double price;

    public Product(String productname, double price) {
        this.productname = productname;
        this.price = price;
    }

    public String getProductName() {
        return productname;
    }
    public void setProductName(String productname) {
        this.productname = productname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

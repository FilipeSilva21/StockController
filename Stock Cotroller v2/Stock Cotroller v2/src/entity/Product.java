package entity;

public class Product {
    private int Id;
    private String name;
    private int quantity;
    private double price;

    public Product (int Id, String name, int quantity, double price) {
        this.Id = Id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
}

package seminar_2.OnlineShop;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

// Геттеры и сеттеры
    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }
}

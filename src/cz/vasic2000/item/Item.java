package cz.vasic2000.item;

public class Item {
    int id;
    String name;
    int quantity;
    double price;
    String supplier;

    public Item() {
    }

    public Item(int id, String name, int quantity, double price, String supplier) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.supplier = supplier;
    }

    //   Геттеры
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getSupplier() {
        return supplier;
    }
}

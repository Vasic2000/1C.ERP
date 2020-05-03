package cz.vasic2000.item;

import cz.vasic2000.suppliers.Supplier;

public class Item {
    int id;
    String name;
    int quantity;

    double price;
    Supplier supplier;

    public Item() {
    }

    public Item(int id, String name, int quantity, double price, Supplier supplier) {
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

    public Supplier getSupplier() {
        return supplier;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

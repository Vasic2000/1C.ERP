package cz.vasic2000;

public class Item {
    int id;
    String name;
    int quantity;
    double price;
    String supplier;

    public Item(int id, String name, int quantity, double pricem, String supplier) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.supplier = supplier;
    }
}

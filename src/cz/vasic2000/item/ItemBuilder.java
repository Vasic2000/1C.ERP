package cz.vasic2000.item;

import cz.vasic2000.suppliers.Supplier;

public class ItemBuilder {
    private Item newItem;

    public ItemBuilder() {
        newItem = new Item();
    }

    public ItemBuilder withID(int id) {
        newItem.id = id;
        return this;
    }

    public ItemBuilder withName(String name) {
        newItem.name = name;
        return this;
    }

    public ItemBuilder withQuantity(int quantity) {
        newItem.quantity = quantity;
        return this;
    }

    public ItemBuilder withPrice(double price) {
        newItem.price = price;
        return this;
    }

    public ItemBuilder withSupplier(Supplier supplier) {
        newItem.supplier = supplier;
        return this;
    }

    public Item build() {
        return newItem;
    }
}

package cz.vasic2000.item;

public class itemBuilder {
    private Item newItem;

    public itemBuilder() {
        newItem = new Item();
    }

    public itemBuilder withID(int id) {
        newItem.id = id;
        return this;
    }

    public itemBuilder withName(String name) {
        newItem.name = name;
        return this;
    }

    public itemBuilder withQuantity(int quantity) {
        newItem.quantity = quantity;
        return this;
    }

    public itemBuilder withPrice(double price) {
        newItem.price = price;
        return this;
    }

    public itemBuilder withSupplier(String supplier) {
        newItem.supplier = supplier;
        return this;
    }

    public Item build() {
        return newItem;
    }
}

package cz.vasic2000;

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


    public static class Builder {
        private Item newItem;

        public Builder() {
            newItem = new Item();
        }

        public Builder withID(int id) {
            newItem.id = id;
            return this;
        }

        public Builder withName(String name) {
            newItem.name = name;
            return this;
        }

        public Builder withQuantity(int quantity) {
            newItem.quantity = quantity;
            return this;
        }

        public Builder withPrice(double price) {
            newItem.price = price;
            return this;
        }

        public Builder withSupplier(String supplier) {
            newItem.supplier = supplier;
            return this;
        }

        public Item build() {
            return newItem;
        }
    }
}

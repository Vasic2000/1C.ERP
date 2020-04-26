package cz.vasic2000;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<Item> stock = new ArrayList();

    public Stock() {
        stock.add(new Item.Builder().
                withID(1).
                withName("Valve DN15").
                withQuantity(50).
                withPrice(15.7).
                withSupplier("Valve company").
                build()
        );

        stock.add(new Item.Builder().
                withID(2).
                withName("Valve DN20").
                withQuantity(50).
                withPrice(20.1).
                withSupplier("Valve company").
                build()
        );

        stock.add(new Item.Builder().
                withID(3).
                withName("Valve DN25").
                withQuantity(10).
                withPrice(26.4).
                withSupplier("Valve company").
                build()
        );

        stock.add(new Item.Builder().
                withID(4).
                withName("Valve DN32").
                withQuantity(10).
                withPrice(42.2).
                withSupplier("Valve company").
                build()
        );

        stock.add(new Item.Builder().
                withID(5).
                withName("Valve DN40").
                withQuantity(0).
                withPrice(89.9).
                withSupplier("Valve company").
                build()
        );

        stock.add(new Item.Builder().
                withID(6).
                withName("Valve DN50").
                withQuantity(0).
                withPrice(127.9).
                withSupplier("Valve company").
                build()
        );

        stock.add(new Item(11, "Check valve DN15", 20, 13.11, "CheckValve company"));
        stock.add(new Item(12, "Check valve DN20", 20, 15.99, "CheckValve company"));
        stock.add(new Item(13, "Check valve DN25", 5, 18.99, "CheckValve company"));
        stock.add(new Item(14, "Check valve DN32", 5, 22.21, "CheckValve company"));
        stock.add(new Item(15, "Check valve DN40", 5, 80.98, "CheckValve company"));
        stock.add(new Item(16, "Check valve DN50", 0, 105.55, "CheckValve company"));

        stock.add(new Item(21, "Filter DN15", 25, 21.00, "Filters company"));
        stock.add(new Item(22, "Filter DN20", 20, 28.99, "Filters company"));
        stock.add(new Item(23, "Filter DN25", 5, 34.95, "Filters company"));
        stock.add(new Item(24, "Filter DN32", 5, 40.21, "Filters company"));
        stock.add(new Item(25, "Filter DN40", 0, 55.98, "Filters company"));
        stock.add(new Item(26, "Filter DN50", 0, 105.55, "Filters company"));
    }

    public boolean isOnStock(int id) {
        for(Item item : stock) {
            if(item.id == id) return true;
        }
        return false;
    }

    public int getQuantByID(int id) {
        for(Item item : stock) {
            if(item.id == id) return item.quantity;
        }
        return -1;
    }
}

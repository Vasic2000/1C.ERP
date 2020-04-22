package cz.vasic2000;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<Item> stock = new ArrayList();

    public Stock() {
        stock.add(new Item(1, "Valve DN15", 50, 12.0, "Valve company"));
        stock.add(new Item(2, "Valve DN20", 50, 20.1, "Valve company"));
        stock.add(new Item(3, "Valve DN25", 10, 26.4, "Valve company"));
        stock.add(new Item(4, "Valve DN32", 10, 51.1, "Valve company"));
        stock.add(new Item(5, "Valve DN40", 0, 101.1, "Valve company"));
        stock.add(new Item(6, "Valve DN50", 0, 155.9, "Valve company"));

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

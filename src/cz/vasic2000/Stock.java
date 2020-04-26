package cz.vasic2000;

import cz.vasic2000.item.Item;
import cz.vasic2000.item.ItemBuilder;
import cz.vasic2000.suppliers.CheckValveSupplier;
import cz.vasic2000.suppliers.FiltersSupplier;
import cz.vasic2000.suppliers.Supplier;
import cz.vasic2000.suppliers.ValveSupplier;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<Item> stock = new ArrayList();
    Supplier valveSupplier = new ValveSupplier();
    Supplier checkValveSupplier = new CheckValveSupplier();
    Supplier filterSupplier = new FiltersSupplier();

    public Stock() {
        stock.add(new ItemBuilder().
                withID(1).
                withName("Valve DN15").
                withQuantity(50).
                withPrice(15.7).
                withSupplier(valveSupplier).
                build()
        );

        stock.add(new ItemBuilder().
                withID(2).
                withName("Valve DN20").
                withQuantity(50).
                withPrice(20.1).
                withSupplier(valveSupplier).
                build()
        );

        stock.add(new ItemBuilder().
                withID(3).
                withName("Valve DN25").
                withQuantity(10).
                withPrice(26.4).
                withSupplier(valveSupplier).
                build()
        );

        stock.add(new ItemBuilder().
                withID(4).
                withName("Valve DN32").
                withQuantity(10).
                withPrice(42.2).
                withSupplier(valveSupplier).
                build()
        );

        stock.add(new ItemBuilder().
                withID(5).
                withName("Valve DN40").
                withQuantity(0).
                withPrice(89.9).
                withSupplier(valveSupplier).
                build()
        );

        stock.add(new ItemBuilder().
                withID(6).
                withName("Valve DN50").
                withQuantity(0).
                withPrice(127.9).
                withSupplier(valveSupplier).
                build()
        );

        stock.add(new Item(11, "Check valve DN15", 20, 13.11, checkValveSupplier));
        stock.add(new Item(12, "Check valve DN20", 20, 15.99, checkValveSupplier));
        stock.add(new Item(13, "Check valve DN25", 5, 18.99, checkValveSupplier));
        stock.add(new Item(14, "Check valve DN32", 5, 22.21, checkValveSupplier));
        stock.add(new Item(15, "Check valve DN40", 5, 80.98, checkValveSupplier));
        stock.add(new Item(16, "Check valve DN50", 0, 105.55, checkValveSupplier));

        stock.add(new Item(21, "Filter DN15", 25, 21.00, filterSupplier));
        stock.add(new Item(22, "Filter DN20", 20, 28.99, filterSupplier));
        stock.add(new Item(23, "Filter DN25", 5, 34.95, filterSupplier));
        stock.add(new Item(24, "Filter DN32", 5, 40.21, filterSupplier));
        stock.add(new Item(25, "Filter DN40", 0, 55.98, filterSupplier));
        stock.add(new Item(26, "Filter DN50", 0, 105.55, filterSupplier));
    }

    public boolean isOnStock(String name) {
        for(Item item : stock) {
            if ((item.getName().equals(name)) && (item.getQuantity() != 0)) return true;
        }
        return false;
    }

    public int getIDbyName(String name) {
        for(Item item : stock) {
            if(item.getName().equals(name)) return item.getId();
        }
        return -1;
    }

    public int getQuantByName(String name) {
        for(Item item : stock) {
            if(item.getName().equals(name)) return item.getQuantity();
        }
        return -1;
    }

    public Item returnItemByString(String name) {
        for(Item item : stock) {
            if(item.getName().equals(name)) return item;
        }
        return null;
    }
}

package cz.vasic2000;

import cz.vasic2000.item.Item;
import cz.vasic2000.item.ItemBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Stock implements Observer {
    private List<Item> stock = new ArrayList();

    public Stock(Simulation sim) {
            stock.add(new ItemBuilder().
                    withID(1).
                    withName("Valve DN15").
                    withQuantity(50).
                    withPrice(15.7).
                    withSupplier(sim.valveSupplier).
                    build()
            );

            stock.add(new ItemBuilder().
                    withID(2).
                    withName("Valve DN20").
                    withQuantity(50).
                    withPrice(20.1).
                    withSupplier(sim.valveSupplier).
                    build()
            );

            stock.add(new ItemBuilder().
                    withID(3).
                    withName("Valve DN25").
                    withQuantity(10).
                    withPrice(26.4).
                    withSupplier(sim.valveSupplier).
                    build()
            );

            stock.add(new ItemBuilder().
                    withID(4).
                    withName("Valve DN32").
                    withQuantity(10).
                    withPrice(42.2).
                    withSupplier(sim.valveSupplier).
                    build()
            );

            stock.add(new ItemBuilder().
                    withID(5).
                    withName("Valve DN40").
                    withQuantity(0).
                    withPrice(89.9).
                    withSupplier(sim.valveSupplier).
                    build()
            );

            stock.add(new ItemBuilder().
                    withID(6).
                    withName("Valve DN50").
                    withQuantity(0).
                    withPrice(127.9).
                    withSupplier(sim.valveSupplier).
                    build()
            );

            stock.add(new Item(11, "Check valve DN15", 20, 13.11, sim.checkValveSupplier));
            stock.add(new Item(12, "Check valve DN20", 20, 15.99, sim.checkValveSupplier));
            stock.add(new Item(13, "Check valve DN25", 5, 18.99, sim.checkValveSupplier));
            stock.add(new Item(14, "Check valve DN32", 5, 22.21, sim.checkValveSupplier));
            stock.add(new Item(15, "Check valve DN40", 5, 80.98, sim.checkValveSupplier));
            stock.add(new Item(16, "Check valve DN50", 0, 105.55, sim.checkValveSupplier));

            stock.add(new Item(21, "Filter DN15", 25, 0.00, sim.filterSupplier));
            stock.add(new Item(22, "Filter DN20", 20, 0.00, sim.filterSupplier));
            stock.add(new Item(23, "Filter DN25", 5, 0.00, sim.filterSupplier));
            stock.add(new Item(24, "Filter DN32", 5, 0.00, sim.filterSupplier));
            stock.add(new Item(25, "Filter DN40", 0, 0.00, sim.filterSupplier));
            stock.add(new Item(26, "Filter DN50", 0, 0.00, sim.filterSupplier));
    }

    public boolean isOnStock(String name) {
        for (Item item : stock) {
            if ((item.getName().equals(name)) && (item.getQuantity() != 0)) return true;
        }
        return false;
    }

    public int getIDbyName(String name) {
        for (Item item : stock) {
            if (item.getName().equals(name)) return item.getId();
        }
        return -1;
    }

    public int getQuantByName(String name) {
        for (Item item : stock) {
            if (item.getName().equals(name)) return item.getQuantity();
        }
        return -1;
    }

    public Item returnItemByString(String name) {
        for (Item item : stock) {
            if (item.getName().equals(name)) return item;
        }
        return null;
    }

    @Override
    public void handleEvent(Map<String, Double> products) {
        for(Map.Entry<String, Double> entrProd : products.entrySet())
            for(Item item : stock) {
                if(entrProd.getKey().equals(item.getName())) {
                    item.setPrice(entrProd.getValue());
                }
            }
    }
}
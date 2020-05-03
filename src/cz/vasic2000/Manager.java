package cz.vasic2000;
import cz.vasic2000.item.Item;
import cz.vasic2000.item.ItemBuilder;
import cz.vasic2000.suppliers.Supplier;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    Stock stock;

    public Manager(Stock st) {
        this.stock = st;
    }

    public Map<Item, Integer> makeOffer(Map<String, Integer> order) {
        Map<Item, Integer> offer = new HashMap<>();
        for (Map.Entry<String, Integer> entry : order.entrySet()) {
            if (stock.isOnStock(entry.getKey())) {
                offer.put(stock.returnItemByString(entry.getKey()), entry.getValue());
            } else {
                Supplier sp = stock.returnItemByString(entry.getKey()).getSupplier();
                offer.put(new ItemBuilder().
                                withID(stock.getIDbyName(entry.getKey())).
                                withName(entry.getKey()).
                                withQuantity(entry.getValue()).
                                withPrice(sp.getPriceByName(entry.getKey())).
                                withSupplier(sp).
                                build(),
                        entry.getValue());
            }
        }
        return offer;
    }
}

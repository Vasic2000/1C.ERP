package cz.vasic2000.suppliers;

import java.util.Map;
import java.util.HashMap;

public class FiltersSupplier implements Supplier{
    Map<String, Double> filters = new HashMap<>();

    public FiltersSupplier() {
        filters.put("Filter DN15", 21.00);
        filters.put("Filter DN20", 28.99);
        filters.put("Filter DN25", 34.95);
        filters.put("Filter DN32", 40.21);
        filters.put("Filter DN40", 55.98);
        filters.put("Filter DN50", 105.55);
    }

    @Override
    public Double getPriceByName(String name) {
        for(Map.Entry entry : filters.entrySet()) {
           if(entry.getKey().equals(name))
               return (Double) entry.getValue();
        }
        return null;
    }
}

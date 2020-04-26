package cz.vasic2000.suppliers;

import java.util.HashMap;
import java.util.Map;

public class CheckValveSupplier implements Supplier {
    Map<String, Double> checkValves = new HashMap<>();

    public CheckValveSupplier() {
        checkValves.put("Check valve DN15", 21.00);
        checkValves.put("Check valve DN20", 28.99);
        checkValves.put("Check valve DN25", 34.95);
        checkValves.put("Check valve DN32", 40.21);
        checkValves.put("Check valve DN40", 55.98);
        checkValves.put("Check valve DN50", 105.55);
    }

    @Override
    public Double getPriceByName(String name) {
        for(Map.Entry entry : checkValves.entrySet()) {
            if(entry.getKey().equals(name))
                return (Double) entry.getValue();
        }
        return null;
    }
}

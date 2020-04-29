package cz.vasic2000.suppliers;

import java.util.HashMap;
import java.util.Map;

public class ValveSupplier implements Supplier {
    Map<String, Double> valves = new HashMap<>();

    public ValveSupplier() {
        valves.put("Valve DN15", 21.00);
        valves.put("Valve DN20", 28.99);
        valves.put("Valve DN25", 34.95);
        valves.put("Valve DN32", 40.21);
        valves.put("Valve DN40", 55.98);
        valves.put("Valve DN50", 105.55);
    }

    @Override
    public Double getPriceByName(String name) {
        for(Map.Entry entry : valves.entrySet()) {
            if(entry.getKey().equals(name))
                return (Double) entry.getValue();
        }
        return null;
    }
}

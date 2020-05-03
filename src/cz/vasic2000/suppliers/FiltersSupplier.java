package cz.vasic2000.suppliers;

import cz.vasic2000.Observed;
import cz.vasic2000.Observer;
import cz.vasic2000.Simulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FiltersSupplier implements Supplier, Observed {
    Map<String, Double> filters = new HashMap<>();
    List<Observer> observers = new ArrayList<>();

    public FiltersSupplier(Simulation sm) {
        addObserver(sm.getStock());
        filters.put("Filter DN15", 21.00);
        filters.put("Filter DN20", 28.99);
        filters.put("Filter DN25", 34.95);
        filters.put("Filter DN32", 40.21);
        filters.put("Filter DN40", 55.98);
        filters.put("Filter DN50", 105.55);
        notifyObserver();
        removeObserver(sm.getStock());
    }

    @Override
    public Double getPriceByName(String name) {
        for(Map.Entry entry : filters.entrySet()) {
           if(entry.getKey().equals(name))
               return (Double) entry.getValue();
        }
        return null;
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer obs : observers) {
            obs.handleEvent(filters);
        }
    }
}

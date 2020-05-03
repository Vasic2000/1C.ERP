package cz.vasic2000;

import cz.vasic2000.item.Item;
import cz.vasic2000.suppliers.CheckValveSupplier;
import cz.vasic2000.suppliers.FiltersSupplier;
import cz.vasic2000.suppliers.Supplier;
import cz.vasic2000.suppliers.ValveSupplier;

import java.util.Map;

public class Simulation {
    Supplier valveSupplier;
    Supplier checkValveSupplier;
    Supplier filterSupplier;
    Stock stock;

    //    Main точка входа
    public static void main(String[] args) {
        Simulation sm = new Simulation();
        sm.stock = new Stock(sm);
        sm.valveSupplier = new ValveSupplier();
        sm.checkValveSupplier = new CheckValveSupplier();
        sm.filterSupplier = new FiltersSupplier(sm);
        Manager manager = new Manager(sm.stock);

        //        Проверка работоспособности начало
        System.out.println(sm.stock.isOnStock("Valve DN15"));
        System.out.println(sm.stock.getQuantByName("Valve DN15"));
        System.out.println(sm.stock.isOnStock("Valve DN50"));
        //        Проверка работоспособности конец

        Request request = new Request();
        Map<String, Integer> order = request.makeRequest();
        Map<Item, Integer> offer = manager.makeOffer(order);

        //        Проверка работоспособности начало
        for(Map.Entry<Item, Integer> entry : offer.entrySet()) {
            System.out.println(entry.getKey().getName()
                    + " : " + entry.getValue()
                    + " = " +  entry.getKey().getPrice()*entry.getValue());
        }
        //        Проверка работоспособности конец
    }

    public Stock getStock() {
        return stock;
    }
}

package cz.vasic2000;

import cz.vasic2000.item.Item;

import java.util.Map;

public class Simulation {
    //    Main точка входа
    public static void main(String[] args) {
        Stock stok = new Stock();
        Manager manager = new Manager();

        //        Проверка работоспособности начало
        System.out.println(stok.isOnStock("Valve DN15"));
        System.out.println(stok.getQuantByName("Valve DN15"));
        System.out.println(stok.isOnStock("Valve DN50"));
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
}

package cz.vasic2000;

public class Simulation {
    Request request;
    Stock stok;
    Manager manager;
    Offer offer;

    //    Main точка входа
    public static void main(String[] args) {
        Simulation simulation = new Simulation();

        //        Проверка работоспособности начало
        System.out.println(simulation.stok.isOnStock(1));
        System.out.println(simulation.stok.getQuantByID(1));
        System.out.println(simulation.stok.isOnStock(5));

        System.out.println(simulation.stok.isOnStock(15));
        System.out.println(simulation.stok.getQuantByID(15));
        //        Проверка работоспособности конец

        Request request = new Request();
        request.makeRequest();


    }

//    Конструктор
    public Simulation() {
        this.stok = new Stock();
        this.manager = new Manager();
        this.offer = manager.makeOffer(request);
     }
}

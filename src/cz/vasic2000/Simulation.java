package cz.vasic2000;

import javax.swing.*;

import static javax.swing.JOptionPane.YES_OPTION;

public class Simulation {
    Request request;
    Stock stok;
    Manager manager;
    Offer offer;

//    Main точка входа
    public static void main(String[] args) {
        Simulation simulation = new Simulation();
        System.out.println(simulation.stok.isOnStock(21));
        System.out.println(simulation.stok.getQuantByID(21));
    }

//    Конструктор
    public Simulation() {
        this.stok = new Stock();
        this.request = makeRequest();
        this.manager = new Manager();
        this.offer = manager.makeOffer(request);
     }

    private static Request makeRequest() {
        String[] items = {"Valve", "Check valve", "Filter"};
        String[] DN = {"DN15", "DN20", "DN25", "DN32", "DN40", "DN50"};

        do {
            String str1, str2;
            int quantity;
            boolean error;

            str1 = (String) JOptionPane.showInputDialog(null, "Выберите", "Заказ",
                    JOptionPane.QUESTION_MESSAGE, null, items, items[0]);
            str2 = (String) JOptionPane.showInputDialog(null, "Размер?", "Заказ",
                    JOptionPane.QUESTION_MESSAGE, null, DN, DN[0]);
            do {
                try {
                    quantity = Integer.parseInt((String) JOptionPane.showInputDialog(null, "Сколько?", "Заказ",
                            JOptionPane.QUESTION_MESSAGE, null, null, "1"));
                    error = false;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Нужно целое число", "Заказ", JOptionPane.WARNING_MESSAGE);
                    error = true;
                }
            } while (error);
        } while (JOptionPane.showConfirmDialog(null, "Заказать что-то ещё?")==YES_OPTION);

        return null;
    }

}

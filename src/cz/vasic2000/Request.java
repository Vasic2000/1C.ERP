package cz.vasic2000;

import javax.swing.*;
import java.util.HashMap;

import static javax.swing.JOptionPane.YES_OPTION;

public class Request {
    HashMap<String, Integer> request = new HashMap<String, Integer>();

    public Request makeRequest() {
        String[] items = {"Valve", "Check valve", "Filter"};
        String[] DN = {"DN15", "DN20", "DN25", "DN32", "DN40", "DN50"};

        Request request = new Request();

        do {
            String str1, str2;
            int quantity = 0;
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
            request.add(str1 + " " + str2, quantity);
        } while (JOptionPane.showConfirmDialog(null, "Заказать что-то ещё?")==YES_OPTION);

        return request;
    }

    public void add(String name, Integer quantity) {
        request.put(name, quantity);
    }
}

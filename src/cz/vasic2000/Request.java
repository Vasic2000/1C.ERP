package cz.vasic2000;

import java.util.Map;
import java.util.HashMap;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;

public class Request {

    public Map<String, Integer> makeRequest() {
        String[] items = {"Valve", "Check valve", "Filter"};
        String[] DN = {"DN15", "DN20", "DN25", "DN32", "DN40", "DN50"};

        Map<String, Integer> request = new HashMap<>();

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
            request.put(str1 + " " + str2, quantity);
        } while (JOptionPane.showConfirmDialog(null, "Заказать что-то ещё?")==YES_OPTION);
        return request;
    }
}

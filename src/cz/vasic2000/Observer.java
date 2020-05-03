package cz.vasic2000;

import java.util.Map;

public interface Observer {
    void handleEvent(Map<String, Double> products);
}

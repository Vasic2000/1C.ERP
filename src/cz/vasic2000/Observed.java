package cz.vasic2000;

public interface Observed {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}

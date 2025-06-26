package observer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject extends Subject {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(String message) throws IOException {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

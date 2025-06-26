package observer;

public class ConsoleObserver extends Observer {

    @Override
    public void update(String message) {
        System.out.println(message);
    }
}

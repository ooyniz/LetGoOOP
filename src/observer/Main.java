package observer;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Subject concreteSubject = new ConcreteSubject();
        Observer consoleObserver = new ConsoleObserver();
        Observer fileObserver = new FileObserver();

        concreteSubject.registerObserver(consoleObserver);
        concreteSubject.registerObserver(fileObserver);
        Message message = new Message();
        for(int i=0; i<10; i++){
            concreteSubject.notify(message.getMessage());
        }
    }
}

package observer;

import java.io.IOException;

public abstract class Observer {

    public abstract void update(String message) throws IOException;
}

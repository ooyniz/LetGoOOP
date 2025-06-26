package observer;

import java.io.FileWriter;
import java.io.IOException;

public class FileObserver extends Observer {

    @Override
    public void update(String message) throws IOException {
        FileWriter fileWriter = new FileWriter("observer.txt", true);
        fileWriter.write(message);
        fileWriter.write("\n");
        fileWriter.close();
    }
}

package UI.Timer;

import UI.App;

import java.io.FileNotFoundException;

public class MyTask {
    public void perform() throws FileNotFoundException {
        App.createLogFile();
    }
}

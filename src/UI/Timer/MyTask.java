package UI.Timer;

import UI.App;

import java.io.FileNotFoundException;

public class MyTask {
    public void perform(String van, String naar) throws FileNotFoundException {
        App.createLogFile(van,naar);
    }
}

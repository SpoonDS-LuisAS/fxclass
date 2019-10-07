package UI.Timer;

import UI.App;

import java.io.FileNotFoundException;

public class MyTask {
    public void perform() throws FileNotFoundException {
        //System.out.println("\t MyTask performed by thread" + Thread.currentThread().getName());
        App.createLogFile();
    }
}

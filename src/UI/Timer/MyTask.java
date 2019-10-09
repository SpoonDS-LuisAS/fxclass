package UI.Timer;

import UI.App;

import java.io.FileNotFoundException;

public class MyTask {
    public void perform(String currencyFrom, String currencyTo) throws FileNotFoundException {
        App.createLogFile(currencyFrom,currencyTo);
    }
}

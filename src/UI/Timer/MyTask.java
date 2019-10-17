package UI.Timer;

import UI.App;

import java.io.FileNotFoundException;

public class MyTask {
        public void perform(String[] args){
            String currencyFrom = args[0];
            String currencyTo = args[1];
            String path_To_log = args[2];

            try {
                App.createLogFile(currencyFrom,currencyTo,path_To_log);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
}


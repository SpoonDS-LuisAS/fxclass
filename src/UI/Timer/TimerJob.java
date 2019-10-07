package UI.Timer;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.TimerTask;

public class TimerJob extends TimerTask {
    public void run(){
        LocalDateTime localTime = LocalDateTime.now();
        System.out.println(localTime.toString());

        MyTask task = new MyTask();
        try {
            task.perform();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

package UI.Timer;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.TimerTask;

public class TimerJob extends TimerTask {
    public void run(){
        LocalDateTime locaTime = LocalDateTime.now();
        System.out.println("Run TimerJob at " + locaTime.toString());

        MyTask task = new MyTask();
        try {
            task.perform();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

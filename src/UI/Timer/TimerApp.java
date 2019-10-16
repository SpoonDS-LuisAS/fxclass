package UI.Timer;

import java.io.FileNotFoundException;

public class TimerApp {

    //delayMS is the wait time between launching the timer and the start of the program.
    //periodMS is the wait between between the running of each instance.

    private static final int delayMs = 1000;
    private static final int periodMs = 5000;

    public static void main(String[] args) {
//        args[0]="EUR";
//        args[1]="USD";
//        args[2]="test.log";
Runnable runnable = new Runnable() {
    @Override
    public void run() {
        while(true) {
            UI.Timer.MyTask task = new UI.Timer.MyTask(args);
            try {
                task.perform();
                Thread.sleep(5000);
            } catch (FileNotFoundException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
};

Thread thread = new Thread(runnable);
thread.start();

//        Timer timer = new Timer();
//        timer.schedule(new TimerJob(args), delayMs, periodMs);
    }
}
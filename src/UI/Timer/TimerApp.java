package UI.Timer;

import java.util.Timer;
import java.util.TimerTask;

public class TimerApp {

    //delayMS is the wait time between launching the timer and the start of the program.
    //periodMS is the wait between between the running of each instance.

    private static final int delayMs = 1000;
    private static final int periodMs = 2000;

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        TimerTask task = new TimerJob();

        Timer timer = new Timer();
        timer.schedule(task, delayMs, periodMs);
    }
}

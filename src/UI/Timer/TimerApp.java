package UI.Timer;

import java.util.Timer;
import java.util.TimerTask;

public class TimerApp {
    private static final int periodMs = 2000;
    private static final int delayMs = 1000;

    public static void main(String[] args) {
        System.out.println("TimerApp main thread " + Thread.currentThread().getName());
        TimerTask task = new TimerJob();

        Timer timer = new Timer();
        timer.schedule(task, delayMs, periodMs);
    }
}

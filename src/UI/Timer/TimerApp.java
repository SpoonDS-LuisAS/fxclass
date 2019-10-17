package UI.Timer;

import java.util.Timer;
import java.util.TimerTask;

public class TimerApp {

    //delayMS is the wait time between launching the timer and the start of the program.
    //periodMS is the wait between between the running of each instance.

    private static final int delayMs = 1000;
    

    public static void main(String[] args) {
    //periodMS is the wait between between the running of each instance. (*1000 to change the value to seconds)
        int periodMs = (Integer.parseInt(args[3])*1000);


        TimerTask task = new TimerJob(args);

        Timer timer = new Timer();
        timer.schedule(task, delayMs, periodMs);

        System.out.println("Program is running");

    }
}
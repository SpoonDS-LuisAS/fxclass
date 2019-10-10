package UI.Timer;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.TimerTask;

public class TimerJob extends TimerTask {
    public void run(){


        //Parameters for scanners, read a file from a PWD.
        //Takes the values from the text files (Seperated by a new line)
//        File file = new File("/Users/luisarendsanchez/Desktop/logTest/FOREX.txt");
//        Scanner sc = null;
//        try {
//            sc = new Scanner(file);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        String currencyFrom = sc.nextLine();
//        String currencyTo = sc.nextLine();


//          Parameters for scanners, where the value's are being red as a full word.
//
        File file = new File("/Users/luisarendsanchez/Desktop/logTest/FOREX.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String currencies = sc.nextLine().trim();
        if(currencies.length() != 6){
            throw new IllegalArgumentException("Length currency name is three next to each other without spaces (EURGBP)");
        }

        String currencyFrom = currencies.substring(0,2);
        String currencyTo = currencies.substring(3,6);



        LocalDateTime localTime = LocalDateTime.now();
        System.out.println(localTime.toString());

        MyTask task = new MyTask();
        try {
            task.perform(currencyFrom,currencyTo);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
